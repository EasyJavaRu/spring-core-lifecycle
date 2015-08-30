package ru.easyjava.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration("/applicationContext.groovy")
@RunWith(SpringJUnit4ClassRunner.class)
public class LifecycleIT {

    @Inject
    private ApplicationContext context;

    @Test
    public void testWithAnnotation() {
        Dependency dep = context.getBean(DependencyInitWithAnnotation.class);

        assertThat(dep.callService(), is("I'm a service"));
    }

    @Test
    public void testWithInterface() {
        Dependency dep = context.getBean(DependencyInitWithInterface.class);

        assertThat(dep.callService(), is("I'm a service"));
    }

    @Test
    public void testWithConfig() {
        Dependency dep = context.getBean(DependencyWithConfig.class);

        assertThat(dep.callService(), is("I'm a service"));
    }
}
