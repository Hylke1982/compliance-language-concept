package com.example.compliance.definition;

import com.example.compliance.Control;

public class SampleDefinition {

    @Control(name = "CTRL-1")
    public void control1(){
        System.out.println("I am executing the validation of control-1");
    }


    @Control(name = "CTRL-3")
    public void control3Failing(){
        throw new RuntimeException("Failing control 3");
    }

}
