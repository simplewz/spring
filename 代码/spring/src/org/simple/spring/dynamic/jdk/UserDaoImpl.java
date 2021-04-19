package org.simple.spring.dynamic.jdk;

/**
 * 代理接口实现类
 */
public class UserDaoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }

    @Override
    public void sub(int a, int b) {
        System.out.printf("%d - %d = %d \r\n",a,b,a-b);
    }
}
