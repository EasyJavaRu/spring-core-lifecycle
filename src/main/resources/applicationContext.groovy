import ru.easyjava.spring.DependencyWithConfig

beans {
    xmlns([ctx:'http://www.springframework.org/schema/context'])
    ctx.'component-scan'('base-package':"ru.easyjava.spring")

    dependencyWithConfig(DependencyWithConfig) { bean ->
        bean.initMethod = 'init'
        bean.destroyMethod = 'destroy'
    }
}