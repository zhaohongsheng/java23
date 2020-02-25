package com.zhs.java23.proxy.l03;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxyHello implements MethodInterceptor{
	
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
        //创建加强器,用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类(即:为下面生成的代理类指定父类)
        enhancer.setSuperclass(this.target.getClass());
        //设置回调:对于代理类上所有方法的调用,都会调用CallBack,而CallBack则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        return enhancer.create();
	}

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		   System.out.println("-----预处理-------");
		   method.invoke(target, args);
	        proxy.invokeSuper(obj, args);//调用业务类(父类中的方法)
	        System.out.println("-----调用后操作-----");

		return null;
	}
	




}
