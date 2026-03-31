# language: es

Característica: Cálculo del Índice de Masa Corporal de un usuario
  Como estudiante de Ingeniería de la Salud
  Quiero calcular el Índice de Masa Corporal de un usuario
  Para evaluar la adecuación del peso de una persona en relación con su altura

  Antecedentes:
    Dado la calculadora de salud está iniciada

  Escenario: Cálculo del BMI con datos válidos
    Dado el peso introducido es 75,0
    Y la altura introducida es 150,0
    Cuando ejecuto la operación de BMI
    Entonces el bmi debe ser 33,33
    Y el resultado debe ser "Obese Class I"

  Escenario: Cálculo del BMI de 97kg y 1.75m
    Dado el peso introducido es 97,0
    Y la altura introducida es 175,0
    Cuando ejecuto la operación de BMI
    Entonces el bmi debe ser 31,67
    Y el resultado debe ser "Obese Class I"

  Escenario: Cálculo del BMI de 70kg y 1.90m
    Dado el peso introducido es 70,0
    Y la altura introducida es 190,0
    Cuando ejecuto la operación de BMI
    Entonces el bmi debe ser 19,39
    Y el resultado debe ser "Normal"
  
  @Error
  Escenario: Intento de cálculo de BMI con números negativos
    Dado el peso introducido es -70,0
    Y la altura introducida es -190,0
    Cuando ejecuto la operación de BMI
    Entonces el sistema debe lanzar una excepción

  @Error
  Escenario: Intento de cálculo de BMI con número fuera del rango establecido para el peso
    Dado el peso introducido es 800,0
    Y la altura introducida es 190,0
    Cuando ejecuto la operación de BMI
    Entonces el sistema debe lanzar una excepción

  @Error
  Escenario: Intento de cálculo de BMI con número fuera del rango establecido para la altura
    Dado el peso introducido es 75,0
    Y la altura introducida es 25,0
    Cuando ejecuto la operación de BMI
    Entonces el sistema debe lanzar una excepción

  Esquema del escenario: Verificación de cálculos exitosos múltiples
    Dado el peso introducido es <weight>
    Y la altura introducida es <height>
    Cuando ejecuto la operación de BMI
    Entonces el bmi debe ser <bmi>
    Y el resultado debe ser "<resultado>"

    Ejemplos:
      |  weight   |    height      |  bmi  |    resultado     | 
      |   75      |      150       | 33,33 |   Obese Class I  |
      |   97      |      175       | 31,67 |   Obese Class I  |
      |   70      |      190       | 19,39 |      Normal      |
      |   60      |      199       | 15,15 |  Severe Thinness |
      |   100     |      200       | 25,00 |    Overweight    |
