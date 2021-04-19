package org.simple.spring.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理处理器
 */
public class MyInvocationHandler implements InvocationHandler {

    //需要被代理的对象
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在这里可以对不同的方法进行各种不同的处理，如可以进行日志记录
        System.out.println(method.getName()+"执行之前...,传入参数:"+ Arrays.asList(args));
        Object result = method.invoke(object,args);
        System.out.println(method.getName()+"执行完成,返回值为:"+result);
        return result;
    }
}
