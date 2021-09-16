package com.github.giovanicaf.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("HelloDelegate")
public class HelloDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws RuntimeException {

        String var = (String) delegateExecution.getVariable("nome");

        delegateExecution.setVariable("nome", "Hello" + " " + var);
    }
}
