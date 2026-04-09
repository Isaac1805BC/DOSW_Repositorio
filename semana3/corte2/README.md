# Análisis de Requerimientos: Plataforma de Entrenadores Pokémon

## 1. a 4. Identificación, Clasificación, Redacción y Priorización

En esta sección agrupamos los primeros 4 puntos del ejercicio.
* **Justificación de la Clasificación:** Un **Requerimiento Funcional (RF)** es algo que el sistema *hace* o permite realizar al usuario (acciones, flujos de trabajo, manipulación de datos). Un **Requerimiento No Funcional (RNF)** define *cómo* el sistema hace las cosas (calidad, rendimiento, seguridad, arquitectura).

### Requerimientos Funcionales (RF)

**RF-01: Registro de Usuarios (Supuesto)**
*   **Redacción:** El sistema debe permitir a los usuarios registrarse ingresando un nombre de entrenador, una dirección de correo electrónico válida y una contraseña.
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Es la vía de entrada a la plataforma. Sin este paso, no hay modelo de negocio que sostenga.

**RF-02: Autenticación de Cuentas (Supuesto)**
*   **Redacción:** El sistema debe permitir a los usuarios iniciar sesión mediante sus credenciales (correo y contraseña).
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Obligatorio para asegurar perfiles de usuario independientes.

**RF-03: Asignación Inicial de Pokémon (Supuesto)**
*   **Redacción:** El sistema debe proveer y asignar a cada usuario un catálogo inicial (o Pokémon de inicio) al momento de ser registrado en el sistema.
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* El usuario no puede interactuar con el *Core* del juego sin "piezas" que configurar.

**RF-04: Gestión y Creación de Equipos**
*   **Redacción:** El sistema debe permitir al usuario crear, editar, eliminar y visualizar equipos conformados por un máximo de seis (6) Pokémon.
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Explícito en el enunciado ("creación de equipos"). Dependencia crítica para jugar.

**RF-05: Modulo de Emparejamiento (Matchmaking)**
*   **Redacción:** El sistema debe asignar automáticamente a un rival conectado en línea para iniciar el combate, basándose en la proximidad de nivel o puntaje de liga.
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Es el puente técnico para lograr la modalidad "contra otros jugadores en línea".

**RF-06: Motor y Lógica de Combates**
*   **Redacción:** El sistema debe procesar la lógica de batalla en línea validando turnos (o tiempo real), ejecución de ataques, cálculo matemático de daños y finalización del evento con un ganador.
*   **Tipo:** Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Vital para el valor de negocio; es la funcionalidad de mayor criticidad para el cliente.

**RF-07: Historial de Batallas**
*   **Redacción:** El sistema debe registrar y mostrar a cada usuario un historial detallado de sus últimas 50 batallas (fecha, rival, resultado y puntos obtenidos).
*   **Tipo:** Funcional.
*   **Prioridad:** **Media.** *Criterio:* Si bien el cliente lo pide para solucionar falta de claridad, lanzar una primera versión del motor de combate sin grandes historiales es posible (Valor de negocio iterativo).

**RF-08: Progreso y Liga Competitiva**
*   **Redacción:** El sistema debe calcular el puntaje global del entrenador tras finalizar cada combate y mostrar su posicionamiento en un ránking general de la liga competitiva.
*   **Tipo:** Funcional.
*   **Prioridad:** **Media.** *Criterio:* Depende completamente a que el sistema de combates esté operativo y balanceado de manera exitosa para ser útil.

**RF-09: Interacción entre Jugadores (Ej. Chat o Emotes)**
*   **Redacción:** El sistema debe proveer de un canal de mensajería rápida predeterminada (emotes) para la interacción de los rivales durante la ventana de emparejamiento y combate.
*   **Tipo:** Funcional.
*   **Prioridad:** **Baja.** *Criterio:* Genera valor de experiencia comunitaria, pero se puede omitir en un MVP técnico sin interrumpir el flujo básico.

---

### Requerimientos No Funcionales (RNF)

**RNF-01: Concurrencia y Rendimiento**
*   **Redacción:** El servidor de combate (Matchmaking/Sockets) debe soportar un mínimo de 10,000 conexiones concurrentes manteniendo un tiempo de latencia (ping) por petición que no supere los 150 milisegundos.
*   **Tipo:** No Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Soluciona explícitamente la mayor preocupación expresada por el cliente sobre soportar "múltiples usuarios".

**RNF-02: Experiencia de Usuario y Tiempos de Respuesta Visuales**
*   **Redacción:** La interfaz gráfica visual del combate no debe demorar más de 1 segundo en reflejar en la pantalla (UI) la animación del ataque tras ejecutarse la acción lógica en el servidor.
*   **Tipo:** No Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Atañe a "La experiencia del usuario durante los combates". Si es lenta o tosca, los jugadores la abandonan.

**RNF-03: Seguridad (Cifrado e Integridad)**
*   **Redacción:** El sistema debe cifrar siempre las credenciales en bases de datos con un algoritmo unidireccional (Ej. bcrypt / SHA-256) y mantener todas las conexiones mediante protocolo TLS 1.2 o superior (HTTPS/WSS).
*   **Tipo:** No Funcional.
*   **Prioridad:** **Alta.** *Criterio:* Preocupación puntual y explícita del cliente. A nivel ético y normativo, no es negociable construir sistemas públicos inseguros.

**RNF-04: Extensibilidad Arquitectónica (Futuros módulos)**
*   **Redacción:** La arquitectura backend del sistema debe diseñarse mediante microservicios o patrones de diseño modular, para aislar el *Core* y acoplar torneos y recompensas en el futuro sin refactorizar el núcleo.
*   **Tipo:** No Funcional.
*   **Prioridad:** **Media.** *Criterio:* Facilita un plan de expansión mencionado por el cliente hacia torneos y modos sin definir.

***

## 5. Identificación de dependencias y bloqueos

**Dependencias técnicas y de flujo:**
*   El cálculo del Posicionamiento en la Liga (**RF-08**) y el Historial (**RF-07**) **dependen** de que El Motor de Combate finalice con éxito cada acción y reporte un ganador/perdedor (**RF-06**).
*   El Motor de Combates (**RF-06**) **depende** estrictamente de un correcto emparejamiento (**RF-05**) y de que los usuarios logren crear equipos con sus inventarios (**RF-04**). Todo requiere de auteticación (**RF-02**).
*   El **RNF-01** (Concurrencia baja latencia) es un cuello de botella logístico: sin él se cae todo el **RF-06** de Combate en línea por desincronización de clientes.

**Bloqueos e Impedimentos en la implementación:**
*   **Legalidad y Propiedad Intelectual (Bloqueante Extremo):** La mención del término "Pokémon" requiere de manera obligatoria que la empresa tenga las licencias oficiales de Nintendo / Game Freak. Sin esto, ninguna plataforma tecnológica podrá llevarse al plano público u obtendrá demandas legales. Si es un homenaje/inspiración genérico sin nombre de marca, el cliente debe especificarlo para omitir imágenes con CopyRight.
*   **Vacío del Sistema Lógico:** Sin un documento de Diseño de Juego (GDD) o especificaciones de estadísticas (salud, ataque, tipos elementales), **es imposible programar el backend matemático de combates.** Esto bloquearía todo el desarrollo en la semana de implementación y frenaría los equipos.
*   **Infraestructura de Red:** Si no se asigna un presupuesto sólido para usar infraestructura de sockets elástica (p. ej. Servidores Dedicados en AWS o Azure), será técnicamente imposible resolver y garantizar el requisito RNF-01 (Usuarios concurrentes en batallas online) y los tiempos bajarían.

***

## 6. Matriz de trazabilidad

| ID | Tipo (Func. / No Func.) | Caso de Uso / Módulo Asociado | Posible Prueba o Validación (QA) |
| :--- | :--- | :--- | :--- |
| **RF-01** | Funcional | Módulo Usuario (Registro) | Validar inserción de datos correctos e intentar registrar correo con formato incorrecto y observar rechazo. |
| **RF-04** | Funcional | Módulo Inventario (Equipos) | Intentar guardar un equipo con un 7mo integrante; validar que el sistema aplique restricción límite. |
| **RF-06** | Funcional | Módulo Core (Motor Combate) | Inyectar 2 usuarios en memoria, simular disminución de HP y comprobar el fin de la batalla al llegar a 0 de HP. |
| **RF-08** | Funcional | Módulo Social (Ranking) | Obtener los puntos iniciales, ganar 1 batalla y constatar que el rango aumentó en +1X puntos. |
| **RNF-01** | No Funcional | Arquitectura de Red (Concurrencia) | Prueba de estrés/carga usando herramientas como JMeter imitando a 10.000 clientes concurrentes pidiendo datos. |
| **RNF-03** | No Funcional | Seguridad | Interceptar los datagramas con un WireShark (Packet Sniffer) o leer la DB en crudo constatando que es inentendible. |

***

## 7. Análisis de ambigüedades

Identificación de aspectos que exigen validaciones inmediatas con el cliente o "Stakeholders" antes de tirar la primera línea de código:

1.  **Ambigüedad: _"Interacción entre jugadores"_**
    *   **¿Por qué está incompleto?** Es demasiado general. No define si la empresa espera un simple sistema de envío de iconos felices/tristes (emotes preconfigurados), un chat de sala abierto (que requeriría filtros de moderación y palabras soeces) o, peor aún, comunicación de Voz IP.
    *   *Validación con el usuario:* "¿Qué nivel de interacción es esperado para la V1 en relación presupuesto-riesgo social de la comunidad?"
2.  **Ambigüedad: _"Gestión y de la obtención de los Pokémon"_**
    *   **¿Por qué está incompleto?** Indica "gestionar sus Pokémon", pero no explica cómo se consiguen. ¿El jugador tiene todos desbloqueados desde inicio para competir (estilo "Showdown")?, ¿Existe una economía en el juego de compra por Monedas Virtuales?, ¿Hay que capturarlos antes?
    *   *Validación con el usuario:* "¿Cómo se alimenta inicialmente el inventario de entidades con las que combate el usuario?"
3.  **Ambigüedad: _"Experiencia del usuario durante el combate"_**
    *   **¿Por qué está incompleto?** "Mejorar la experiencia" no es un criterio medible. Puede significar desde "queremos música orquestal inmersiva y que los muñecos reaccionen al daño" hasta "solo queremos que no haya Lag en los clics o emparejamiento rápido". No está expresado en métricas, por lo que ningún QA puede decir si "La experiencia lograda es satisfactoria" a las expectativas.
    *   *Validación con el usuario:* "Necesitamos levantar criterios de aceptación tangibles. ¿Nos referimos a velocidad, estilo visual, facilidad para entender el historial del daño recibido?"
