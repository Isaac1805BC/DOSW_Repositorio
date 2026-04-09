package dosw.bitacora.Corte2.semana1.analiticas.service;

import dosw.bitacora.Corte2.semana1.analiticas.model.Grade;
import dosw.bitacora.Corte2.semana1.analiticas.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyticsService {

        /**
         * Obtener todos los estudiantes del equipo rosado
         */
        public List<Student> getRosadoTeamStudents(List<Student> students) {
                return students.stream()
                                .filter(s -> "ROSADO".equalsIgnoreCase(s.getTeam()))
                                .collect(Collectors.toList());
        }

        /**
         * Obtener todos los nombres de estudiantes ordenados alfabeticamente
         */
        public List<String> getStudentNamesAlphabetically(List<Student> students) {
                return students.stream()
                                .map(Student::getName)
                                .sorted()
                                .collect(Collectors.toList());
        }

        /**
         * Calcular el promedio general de todos los score existentes en el sistema
         */
        public double calculateGeneralAverage(List<Student> students) {
                return students.stream()
                                .flatMap(s -> s.getGrades().stream())
                                .mapToDouble(Grade::getScore)
                                .average()
                                .orElse(0.0);
        }

        /**
         * Retornar por estudiante el promedio por materia
         */
        public Map<String, Map<String, Double>> getAveragePerSubjectPerStudent(List<Student> students) {
                return students.stream()
                                .collect(Collectors.toMap(
                                                Student::getName,
                                                s -> s.getGrades().stream()
                                                                .collect(Collectors.groupingBy(
                                                                                Grade::getSubject,
                                                                                Collectors.averagingDouble(
                                                                                                Grade::getScore)))));
        }

        /**
         * Retornar el estudiante cuyo promedio general sea el mas alto del curso
         */
        public Optional<Student> getHighestAverageStudent(List<Student> students) {
                return students.stream()
                                .max(Comparator.comparingDouble(s -> s.getGrades().stream()
                                                .mapToDouble(Grade::getScore)
                                                .average()
                                                .orElse(0.0)));
        }

        /**
         * Retornar las materias reprobadas por equipo
         */
        public Map<String, Long> getFailedSubjectsByTeam(List<Student> students) {
                return students.stream()
                                .collect(Collectors.groupingBy(
                                                Student::getTeam,
                                                Collectors.flatMapping(
                                                                s -> s.getGrades().stream().filter(g -> !g.isPassed()),
                                                                Collectors.counting())));
        }

        /**
         * Top 3 estudiantes con mas materias aprobadas
         */
        public List<Student> getTop3StudentsWithMostPassedSubjects(List<Student> students) {
                return students.stream()
                                .sorted((s1, s2) -> Long.compare(
                                                s2.getGrades().stream().filter(Grade::isPassed).count(),
                                                s1.getGrades().stream().filter(Grade::isPassed).count()))
                                .limit(3)
                                .collect(Collectors.toList());
        }

        /**
         * Agrupar estudiantes por estado academico
         */
        public Map<String, List<Student>> groupStudentsByPerformance(List<Student> students) {
                return students.stream()
                                .collect(Collectors.groupingBy(s -> {
                                        double avg = s.getGrades().stream()
                                                        .mapToDouble(Grade::getScore)
                                                        .average()
                                                        .orElse(0.0);
                                        if (avg >= 4.5)
                                                return "ALTO RENDIMIENTO";
                                        if (avg >= 3.5)
                                                return "REGULAR";
                                        return "RIESGO";
                                }));
        }

        /**
         * Obtener la materia con mas reprobaciones
         */
        public Optional<String> getSubjectWithMostFailures(List<Student> students) {
                return students.stream()
                                .flatMap(s -> s.getGrades().stream())
                                .filter(g -> !g.isPassed())
                                .collect(Collectors.groupingBy(Grade::getSubject, Collectors.counting()))
                                .entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey);
        }

        /**
         * Análisis complejo para el equipo ROSADO
         */
        public LinkedHashMap<String, Double> getRosadoTeamComplexAnalytics(List<Student> students) {
                return students.stream()
                                .filter(s -> "ROSADO".equalsIgnoreCase(s.getTeam()))
                                .flatMap(s -> s.getGrades().stream())
                                .filter(Grade::isPassed)
                                .collect(Collectors.groupingBy(
                                                Grade::getSubject,
                                                Collectors.averagingDouble(Grade::getScore)))
                                .entrySet().stream()
                                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                                .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1,
                                                LinkedHashMap::new));
        }
}
