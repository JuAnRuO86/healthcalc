package healthcalc.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BMIFullSteps {
    private HealthCalc healthcalc;
    private double weight;
    private double height;
    private double bmi;
    private String resultado;
    private boolean exceptionThrown;

    @Given("La calculadora de salud está iniciada")
    public void la_calculadora_de_salud_está_iniciada() {
        healthcalc = new HealthCalcImpl();
    }
    @Given("El peso introducido en kg es {double1}")
    public void el_peso_introducido_es(double double1) {
        weight = double1;

    }
      @Given("La altura introducida en centímetros es {double1}")
    public void la_altura_introducida_es(double double1) {
        height = double1;

    }

    @When("Ejecuto la operación de BMI")
    public void ejecuto_la_operación_de_BMI() {
        try {
            bmi = healthcalc.bmi(weight, height/100);
            resultado = healthcalc.bmiClassification(bmi);
            exceptionThrown = false;
        } catch (Exception e) {
            exceptionThrown = true;
        }
    }

    @Then("El BMI debe ser {double}")
    public void el_bmi_debe_ser(double double1) {
        assertEquals(double1, bmi);
    }

    @Then("El resultado debe ser {String}")
    public void el_resultado_debe_ser(String String1) {
        assertEquals(String1, resultado);
    }

    @Then("El sistema debe lanzar una excepción")
    public void el_sistema_debe_lanzar_una_excepción() {
        assertEquals(true, exceptionThrown);
    }

}

