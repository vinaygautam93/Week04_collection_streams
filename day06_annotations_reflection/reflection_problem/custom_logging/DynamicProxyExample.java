package com.day06_annotations_reflection.reflection_problem.custom_logging;

import java.lang.reflect.*;

// Step 1: Define an interface
interface Greeting {
    void sayHello();
}

// Step 2: Implement the interface
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, Vinay! 👋");
    }
}

// Step 3: Create a Dynamic Proxy Handler
class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LOG: Calling method - " + method.getName());
        return method.invoke(target, args);
    }
}

// Step 4: Use Proxy to log method calls
public class DynamicProxyExample {
    public static void main(String[] args) {
        // Create an instance of GreetingImpl
        Greeting realObj = new GreetingImpl();

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(realObj)
        );

        // Call the method via proxy
        proxyInstance.sayHello();
    }
}
