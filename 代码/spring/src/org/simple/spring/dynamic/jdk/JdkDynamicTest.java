package org.simple.spring.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * 1. 创建接口
 * 2. 创建接口实现类
 * 3. 创建InvocationHandler代理处理器.通过实现接口InvocationHandler中的invoke方法对代理的对象需要进行
 *     增强处理的方法进行增强处理。
 *     public Object invoke(Object proxy, Method method, Object[] args)；
 *          proxy:被代理的对象。
 *          Method:代理的方法。
 *          args:方法参数。
 * 4. 使用jdk的Proxy类创建接口的代理类对象，实现该接口的类的对象的所有方法都会进入代理处理器InvocationHandler中
 *    invoke方法。
 *    static Object newProxyInstance(ClassLoader loader,Class<?> interfaces,InvocationHandler h);
 *          loader：类加载器
 *          interfaces: 接口数组
 *          h: 代理处理器
 */
public class JdkDynamicTest {

    public static void main(String[] args) {
        //创建接口实现类对象(被代理对象)
        UserDaoImpl userDao=new UserDaoImpl();
        //以被代理的对象创建一个代理处理器，在代理处理器中对代理对象的方法增强处理
        MyInvocationHandler invocationHandler=new MyInvocationHandler(userDao);
        //使用JDK的Proxy类创建接口的代理对象，该代理对象拥有和被代理对象相同的功能，代理对象的所有方法都会进入代理处理器的invoke方法
        UserDao proxy= (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),new Class[]{UserDao.class},invocationHandler);
        proxy.add(1,2);
        proxy.update("userId");
        proxy.sub(3,9);
    }

}
