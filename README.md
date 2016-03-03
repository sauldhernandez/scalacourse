# Taller Final

## Instrucciones

Este taller está evaluado sobre treinta (30) puntos. A continuación se describe el enunciado del taller y las tareas
que se deben realizar en el mismo. Cada tarea tiene un puntaje asignado y las tareas completadas con éxito sumarán a su
puntuación final.

Entre las tareas existen tareas dependendientes, por lo cual ciertas tareas deben ser completadas antes de poder comenzar
otras.

Para su facilidad, este proyecto contiene el _scaffolding_ necesario para crear una aplicación con Zordon. Pueden usarlo
para la elaboración de las tareas requeridas en el taller.

No está permitido conversar con sus compañeros durante el taller, o comunicarse con ellos por cualquier otro medio.

Está permitido consultar la documentación de las herramientas y buscar en internet respuestas.

Disponen de dos (2) horas para desarrollar las tareas solicitadas.

### Entrega

Deben hacer fork de este repositorio, y hacer push con el resultado del taller antes de la hora de finalización del mismo.
Por favor verifiquen en Github que en efecto se subieron todos los archivos necesarios.

## Enunciado

Se requiere un servicio REST que permita hacer seguimiento simple de proyectos. En este sistema, se debe poder crear proyectos,
tareas, asignar las tareas a usuarios y obtener porcentajes de completitud basados en la cantidad de tareas finalizadas
de un proyecto. Específicamente, las necesidades son:

### Proyectos
- Crear proyecto
- Modificar proyecto
- Eliminar proyecto
- Obtener porcentaje de completitud del proyecto

### Tareas
- Crear tarea en proyecto
- Modificar tarea en proyecto
- Eliminar tarea
- Asignar tarea a usuario
- Marcar tarea como completada
- Desmarcar tarea como completada

### Usuario
- Obtener todas las tareas de un usuario en un proyecto

Los proyectos deben tener la siguiente información:

- Nombre del proyecto
- Nombre del líder
- Fecha de inicio
- Fecha de finalización
- Tareas asociadas

Las tareas deben tener la siguiente información:

- Nombre de la tarea
- Usuario asignado (si lo hubiese)
- Indicador si la tarea está completada o no

Los datos de los proyectos deben ser almacenados en persistencia clave/valor (e.g. Redis).

## Tareas

Todas las tareas de implementación abajo descritas requieren una desarrollo completo. Los datos deben ser guardados/leídos
desde Redis donde sea necesario.

Las implementaciones deben ser desarrolladas utilizando Zordon.

1. Diseñar un servicio REST que cumpla los casos de uso requeridos en Swagger (7 puntos)
2. Implementar creación, modificación y eliminación de proyectos (5 puntos)
3. Implementar creación, modificación y eliminación de tareas (5 puntos)
4. Implementar marcar/desmarcar tarea como finalizada (2 puntos)
5. Implementar asignación de usuario a tarea (2 puntos) 
6. Implementar obtención de porcentaje de completitud de proyecto (4 puntos)
7. Implementar obtención de las tareas de un usuario en un proyecto (4 puntos)