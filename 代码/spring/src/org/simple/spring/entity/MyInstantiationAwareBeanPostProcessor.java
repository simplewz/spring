package org.simple.spring.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessor() {
        super();
        System.out.println("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
    }


    //接口方法，实例化Bean之前调用
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
        System.out.println("beanClass ="+beanClass+"   beanName="+beanName);
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    //接口方法、设置某个属性时调用
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor调用postProcessPropertyValues方法");
        System.out.println("pvs ="+pvs+"   bean="+ bean+"   beanName="+beanName);
        return super.postProcessProperties(pvs, bean, beanName);
    }

    //接口方法，实例化Bean之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
        System.out.println("bean ="+bean+"   beanName="+beanName);
        return super.postProcessAfterInitialization(bean, beanName);
    }
}
