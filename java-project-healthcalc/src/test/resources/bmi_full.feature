
Feature: Cálculo del Índice de Masa Corporal de un usuario
  Como estudiante de Ingeniería de la Salud
  Quiero calcular el Índice de Masa Corporal de un usuario
  Para evaluar la adecuación del peso de una persona en relación con su altura

  Background:
    Given La calculadora de salud está iniciada

  @EdgeCase
  Scenario: Cálculo del BMI de 75kg y 1.50m
    Given El peso introducido en kg es 75
    Given La altura introducida en centímetros es 150
    When Ejecuto la operación de BMI
    Then El BMI debe ser 33,33
    Then El resultado debe ser Obese Class I

  @EdgeCase
  Scenario: Cálculo del BMI de 97kg y 1.75m
    Given El peso introducido en kg es 97
    Given La altura introducida en centímetros es 175
    When Ejecuto la operación de BMI
    Then El BMI debe ser 31,67
    Then El resultado debe ser Obese Class I

  @EdgeCase
  Scenario: Cálculo del BMI de 70kg y 1.90m
    Given El peso introducido en kg es 70
    Given La altura introducida en centímetros es 190
    When Ejecuto la operación de BMI
    Then El BMI debe ser 19,39
    Then El resultado debe ser Normal

  @ErrorHandling
  Scenario Outline: Intento de cálculo de BMI con números negativos
    Given El peso introducido en kg es -70
    Given La altura introducida en centímetros es -190
    When Ejecuto la operación de BMI
    Then El sistema debe lanzar una excepción

    Examples:
      | numero |
      | -1     |
      | -2     |
      | -5     |
      | -10    |
      | -50    |

  @ErrorHandling
  Scenario Outline: Intento de cálculo de BMI con número fuera del rango establecido para el peso
    Given El peso introducido en kg es 800
    Given La altura introducida en centímetros es 190
    When Ejecuto la operación de BMI
    Then El sistema debe lanzar una excepción

    Examples:
      | numero |
      | 701     |
      | 750     |
      | 800     |

  @ErrorHandling
  Scenario Outline: Intento de cálculo de BMI con número fuera del rango establecido para la altura
    Given El peso introducido en kg es 75
    Given La altura introducida en centímetros es 25
    When Ejecuto la operación de BMI
    Then El sistema debe lanzar una excepción

    Examples:
      | numero |
      | 20     |
      | 29     |
      | 301     |
      | 350     |
      | 400     |

  Scenario Outline: Verificación de cálculos exitosos múltiples
    Given el peso de entrada es <weight>
    Given la altura de entrada es <height>
    When ejecuto la operación de BMI
    Then el BMI debe ser <bmi>
    Then el resultado debe ser <resultado>

    Examples:
      | weight(kg)|   height(cm)   |  BMI  |    resultado     | 
      |   75      |      150       | 33,33 |   Obese Class I  |
      |   97      |      175       | 31,67 |   Obese Class I  |
      |   70      |      190       | 19,39 |      Normal      |
      |   60      |      199       | 15,15 |  Severe Thinness |
      |   100     |      200       | 25,00 |    Overweight    |
