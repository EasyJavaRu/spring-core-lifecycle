package ru.easyjava.spring;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.util.logging.Logger;

@Service
public class DependencyInitWithAnnotation implements Dependency {
    private final static Logger LOGGER = Logger.getLogger(DependencyInitWithAnnotation.class.getName());

    @Inject
    private SomeService service;

    public DependencyInitWithAnnotation() {
        LOGGER.info("I'm a constructor");
        if (service == null) {
            LOGGER.info("service is NOT set in the constructor");
        } else {
            LOGGER.info("service is set in the constructor");
        }
    }

    @PostConstruct
    public void init() {
        LOGGER.info("I'm init function");
        if (service == null) {
            LOGGER.info("service is NOT set in init function");
        } else {
            LOGGER.info("service is set in init function");
        }
    }

    @PreDestroy
    public void destroy() {
        LOGGER.info("I'm destroy function. I have nothing to do");
    }

    @Override
    public String callService() {
        return service.act();
    }
}
