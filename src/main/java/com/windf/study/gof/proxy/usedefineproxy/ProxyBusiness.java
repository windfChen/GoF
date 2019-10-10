package com.windf.study.gof.proxy.usedefineproxy;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyBusiness implements InvocationHandler {

    private Object target;

    /**
     * 可以给任意对象的任意方法做代理，但是需要接口
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        try {
            return UserdefineProxy.newProxyInstance(target.getClass().getInterfaces(), this);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.before();

        Object ret =  method.invoke(target, args);

        this.after();

        return ret;
    }

    private void before() {
        System.out.println("工作之前，代理先做一些其他事前业务");
    }

    private void after() {
        System.out.println("工作之后，代理在做一些其他事后的业务");
    }
}
