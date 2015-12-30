package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import proxy.imp.AOPMethod;

public class AOPHandle implements InvocationHandler{
	//保存对象
	private AOPMethod method;
	private Object o;
	public AOPHandle(Object o,AOPMethod method) {
		this.o=o;
		this.method=method;
	}
	/**
	 * 这个方法会自动调用,Java动态代理机制
	 * 会传入下面是个参数
	 * @param Object proxy	代理对象的接口,不同于对象
	 * @param Method method	被调用方法
	 * @param Object[] args	方法参数
	 * 不能使用invoke时使用proxy作为反射参数时,因为代理对象的接口,不同于对象
	 * 这种代理机制是面向接口，而不是面向类的
	 **/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret=null;
		//修改的地方在这里哦
		this.method.before(proxy, method, args);
		ret=method.invoke(o, args);
		//修改的地方在这里哦
		this.method.after(proxy, method, args);
		return ret;
	}
}
