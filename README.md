首先，SpringBoot 在启动时会去依赖的starter包中寻找 resources/META-INF/spring.factories 文件，然后根据文件中配置的Jar包去扫描项目所依赖的Jar包，这类似于 Java 的 SPI 机制。

第二步，根据 spring.factories配置加载AutoConfigure类。

最后，根据 @Conditional注解的条件，进行自动配置并将Bean注入Spring Context 上下文当中。

我们也可以使用@ImportAutoConfiguration({MyServiceAutoConfiguration.class}) 指定自动配置哪些类。

最后一步，在resources/META-INF/下创建spring.factories文件，并添加如下内容：
``
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.example.autocinfigure.StarterAutoConfigure
``

```
@ConditionalOnBean:当容器中有指定的Bean的条件下         

@ConditionalOnClass：当类路径下有指定的类的条件下       
   
@ConditionalOnExpression:基于SpEL表达式作为判断条件        

@ConditionalOnJava:基于JVM版本作为判断条件  

@ConditionalOnJndi:在JNDI存在的条件下查找指定的位置  

@ConditionalOnMissingBean:当容器中没有指定Bean的情况下  

@ConditionalOnMissingClass:当类路径下没有指定的类的条件下  

@ConditionalOnNotWebApplication:当前项目不是Web项目的条件下  

@ConditionalOnProperty:指定的属性是否有指定的值  

@ConditionalOnResource:类路径下是否有指定的资源  

@ConditionalOnSingleCandidate:当指定的Bean在容器中只有一个，或者在有多个Bean的情况下，用来指定首选的Bean @ConditionalOnWebApplication:当前项目是Web项目的条件下  
```
