package ru.easyjava.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@ContextConfiguration("/NamedBeanContext.groovy")
@RunWith(SpringJUnit4ClassRunner.class)
public class NamedBeanIT {
    @Inject
    private ApplicationContext context;

    @Test
    public void testBeanNames() {
        context.getBeansOfType(NamedBean.class).keySet().forEach(name -> System.out.println("Bean name in context is: " + name));
        context.getBeansOfType(NamedBean.class).values().forEach(bean -> System.out.println("Bean name is: " + bean.getName()));
    }
}
