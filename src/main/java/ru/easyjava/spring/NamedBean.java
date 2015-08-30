package ru.easyjava.spring;

import org.springframework.beans.factory.BeanNameAware;

public class NamedBean implements BeanNameAware {
    String name;

    public final String getName() {
        return name;
    }

    @Override
    public final void setBeanName(final String s) {
        this.name = s;
    }
}
