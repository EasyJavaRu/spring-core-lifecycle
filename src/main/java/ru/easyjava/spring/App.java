package ru.easyjava.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class App {
    /**
     * Do not construct me.
     */
    private App() { };

    /**
     * Application entry point.
     * @param args Array of command line arguments.
     */
    public static void main(final String[] args) {
        AbstractApplicationContext context =
                new GenericGroovyApplicationContext("/applicationContext.groovy");
        System.out.println("Destroy the context");
        context.close();
    }
}
