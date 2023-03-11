package org.mattpayne.learning.sm2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;


@SpringBootApplication
public class Sm2Application implements CommandLineRunner {
    @Autowired
    StateMachine<String, String> stateMachine;

    public static void main(final String[] args) {
        SpringApplication.run(Sm2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       stateMachine.start();
       stateMachine.sendEvent("E1");
       stateMachine.sendEvent("E2");
       State<String, String> currentState = stateMachine.getState();
       System.out.println("Current state: " + currentState.getId());
    }
}
