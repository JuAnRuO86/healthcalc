# lenguaje: es

Característica: Cálculo del Requerimiento Energético Estimado (EER)

  Como usuario de la calculadora de salud
  Quiero conocer mi requerimiento energético estimado diario
  Para saber cuántas calorías debo consumir según mis características

  Antecedentes:
    Dado que la calculadora de salud está operativa

  @PrioridadAlta
  Escenario: Cálculo correcto del EER con datos válidos

    Dado que introduzco mi sexo "masculino"
    Y introduzco mi edad "25"
    Y introduzco mi peso "70"
    Y introduzco mi altura "175"
    Y selecciono un nivel de actividad "moderado"
    Cuando solicito calcular el requerimiento energético estimado
    Entonces el sistema muestra las calorías diarias recomendadas

  @Error
  Escenario: Intento de cálculo con datos incompletos

    Dado que no he introducido todos los datos requeridos
    Cuando solicito calcular el requerimiento energético estimado
    Entonces el sistema muestra un mensaje de error indicando datos incompletos

  @Error
  Escenario: Datos introducidos fuera de rango

    Dado que introduzco una edad "-5"
    Cuando solicito calcular el requerimiento energético estimado
    Entonces el sistema informa que los datos no son válidos

  @Calculo @Regresion
  Esquema del escenario: Cálculo del EER según características del usuario

    Dado que introduzco mi sexo "<sexo>"
    Y introduzco mi edad "<edad>"
    Y introduzco mi peso "<peso>"
    Y introduzco mi altura "<altura>"
    Y selecciono el nivel de actividad "<actividad>"
    Cuando solicito calcular el requerimiento energético estimado
    Entonces el sistema calcula el EER correctamente

    Ejemplos:
      | sexo      | edad | peso | altura | actividad  |
      | masculino | 25   | 70   | 175    | sedentario |
      | masculino | 25   | 70   | 175    | moderado   |
      | femenino  | 30   | 60   | 165    | activo     |
      | femenino  | 45   | 65   | 160    | sedentario |