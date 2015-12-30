package proxy.imp;

import java.lang.reflect.Method;

public interface AOPMethod{
	//实例方法执行前执行的方法
	void after(Object proxy, Method method, Object[] args);
	//实例方法执行后执行的方法
	void before(Object proxy, Method method, Object[] args);
}