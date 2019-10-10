//package com.windf.study.gof.proxy.cglibdynamicproxy;
//
//import java.lang.reflect.Method;
//
//public class ProxyBusiness implements MethodInterceptor {
//
//    public Object getInstance(Object target) {
//        Enhancer enhancer = new Enhacer();
//        enhancer.setSuperClass(target.getClass());
//        enhancer.setCallback(this);
//        return enhancer.create();
//    }
//
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        before();
//        Object obj = methodProxy.invokeSuper(o,objects);
//        after();
//        return obj;
//    }
//
//    private void before() {
//        System.out.println("工作之前，代理先做一些其他事前业务");
//    }
//
//    private void after() {
//        System.out.println("工作之后，代理在做一些其他事后的业务");
//    }
//}
