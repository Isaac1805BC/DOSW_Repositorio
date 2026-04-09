# Bitácora de Aprendizaje - Corte 2 - Semana 1

## Actividades Realizadas
- Creación de la rama de trabajo `semana1-corte2` siguiendo el flujo de trabajo profesional.
- Implementación de los modelos `Student` y `Grade` utilizando Lombok para optimizar el código.
- Desarrollo del sistema de analíticas académica `AnalyticsService` usando exclusivamente Java Streams (Programación Funcional).
- Implementación de 10 operaciones de procesamiento de datos:
  - Filtrado por equipo.
  - Ordenamiento alfabético.
  - Cálculos de promedios generales y por materia.
  - Búsqueda de máximos.
  - Agrupamiento por categorías de rendimiento y equipo.
  - Operaciones complejas encadenadas (filter, map, groupingBy, sorting).
- Creación de suite de pruebas unitarias con JUnit 5, alcanzando una cobertura superior al 80%.

## Dificultades Encontradas
- **Escalamiento de Streams complejos**: Al realizar el análisis del equipo ROSADO con agrupamientos y ordenamientos simultáneos, fue necesario gestionar cuidadosamente los colectores para obtener un `LinkedHashMap` que preservara el orden.
- **Configuración de la Bitácora**: La transición del Corte 1 al Corte 2 requirió una reestructuración de paquetes para mantener la coherencia del proyecto.

## Gestión del Tiempo
| Actividad | Tiempo Estimado | Tiempo Real |
| :--- | :--- | :--- |
| Estructura y Modelos | 30 min | 20 min |
| Lógica de Analíticas (Streams) | 1 hora | 1 hora 15 min |
| Pruebas Unitarias | 45 min | 50 min |
| Documentación | 20 min | 15 min |

**Reflexión**: El tiempo invertido en la lógica de Streams fue mayor al estimado debido a la complejidad de las operaciones encadenadas necesarias para cumplir con los requisitos sin usar ciclos tradicionales. Sin embargo, esto garantiza un código más declarativo y fácil de testear.

## Evidencias
- **Commits**: Se han realizado commits siguiendo convenciones descriptivas.
- **Resultados de Pruebas**: 100% de éxito en la suite de pruebas (10/10 tests pasados).
- **Cobertura**: Cobertura verificada mediante ejecución de Maven.
