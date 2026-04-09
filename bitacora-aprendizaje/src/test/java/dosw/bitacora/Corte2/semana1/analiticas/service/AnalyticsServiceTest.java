package dosw.bitacora.Corte2.semana1.analiticas.service;

import dosw.bitacora.Corte2.semana1.analiticas.model.Grade;
import dosw.bitacora.Corte2.semana1.analiticas.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsServiceTest {

    private AnalyticsService service;
    private List<Student> students;

    @BeforeEach
    void setUp() {
        service = new AnalyticsService();
        
        // Mock Data
        List<Grade> grades1 = Arrays.asList(
                new Grade("DOSW", 5.0, LocalDate.now(), true),
                new Grade("BD", 4.0, LocalDate.now(), true)
        );
        List<Grade> grades2 = Arrays.asList(
                new Grade("DOSW", 3.0, LocalDate.now(), true),
                new Grade("BD", 2.0, LocalDate.now(), false)
        );
        List<Grade> grades3 = Arrays.asList(
                new Grade("DOSW", 4.5, LocalDate.now(), true),
                new Grade("REDES", 3.0, LocalDate.now(), true)
        );

        students = Arrays.asList(
                new Student("1", "Isaac", "ROSADO", grades1),
                new Student("2", "Ana", "AZUL", grades2),
                new Student("3", "Carlos", "ROSADO", grades3)
        );
    }

    @Test
    void testGetRosadoTeamStudents() {
        List<Student> rosado = service.getRosadoTeamStudents(students);
        assertEquals(2, rosado.size());
        assertTrue(rosado.stream().allMatch(s -> s.getTeam().equals("ROSADO")));
    }

    @Test
    void testGetStudentNamesAlphabetically() {
        List<String> names = service.getStudentNamesAlphabetically(students);
        assertEquals(Arrays.asList("Ana", "Carlos", "Isaac"), names);
    }

    @Test
    void testCalculateGeneralAverage() {
        double avg = service.calculateGeneralAverage(students);
        // Scores: 5, 4, 3, 2, 4.5, 3 -> Sum: 21.5 / 6 = 3.5833
        assertEquals(3.5833, avg, 0.001);
    }

    @Test
    void testGetAveragePerSubjectPerStudent() {
        Map<String, Map<String, Double>> report = service.getAveragePerSubjectPerStudent(students);
        assertEquals(3, report.size());
        assertEquals(5.0, report.get("Isaac").get("DOSW"));
        assertEquals(2.0, report.get("Ana").get("BD"));
    }

    @Test
    void testGetHighestAverageStudent() {
        Optional<Student> top = service.getHighestAverageStudent(students);
        assertTrue(top.isPresent());
        assertEquals("Isaac", top.get().getName());
    }

    @Test
    void testGetFailedSubjectsByTeam() {
        Map<String, Long> failed = service.getFailedSubjectsByTeam(students);
        assertEquals(1, failed.get("AZUL"));
        assertEquals(0L, failed.getOrDefault("ROSADO", 0L));
    }

    @Test
    void testGetTop3StudentsWithMostPassedSubjects() {
        List<Student> top = service.getTop3StudentsWithMostPassedSubjects(students);
        assertEquals(3, top.size());
        assertEquals("Isaac", top.get(0).getName()); // 2 passed
        assertEquals("Carlos", top.get(1).getName()); // 2 passed
        assertEquals("Ana", top.get(2).getName()); // 1 passed
    }

    @Test
    void testGroupStudentsByPerformance() {
        Map<String, List<Student>> groups = service.groupStudentsByPerformance(students);
        // Isaac: 4.5 (ALTO), Ana: 2.5 (RIESGO), Carlos: 3.75 (REGULAR)
        assertEquals(1, groups.get("ALTO RENDIMIENTO").size());
        assertEquals(1, groups.get("REGULAR").size());
        assertEquals(1, groups.get("RIESGO").size());
    }

    @Test
    void testGetSubjectWithMostFailures() {
        Optional<String> subject = service.getSubjectWithMostFailures(students);
        assertTrue(subject.isPresent());
        assertEquals("BD", subject.get());
    }

    @Test
    void testGetRosadoTeamComplexAnalytics() {
        LinkedHashMap<String, Double> result = service.getRosadoTeamComplexAnalytics(students);
        // Rosado: Isaac (DOSW:5, BD:4), Carlos (DOSW:4.5, REDES:3)
        // Averages: DOSW: (5+4.5)/2 = 4.75, BD: 4.0, REDES: 3.0
        // Sorted: DOSW, BD, REDES
        Iterator<String> it = result.keySet().iterator();
        assertEquals("DOSW", it.next());
        assertEquals("BD", it.next());
        assertEquals("REDES", it.next());
        assertEquals(4.75, result.get("DOSW"));
    }
}
