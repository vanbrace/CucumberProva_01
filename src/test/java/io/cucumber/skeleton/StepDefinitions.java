package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {


    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour( int hours ){
        System.out.println("ciao iolanda WHEN");
        Belly belly = new Belly();
        belly.eat(hours);
        //throw new io.cucumber.java.PendingException();
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("ciao iolanda THEN");
        Belly belly = new Belly();

        //throw new io.cucumber.java.PendingException();
    }
}
