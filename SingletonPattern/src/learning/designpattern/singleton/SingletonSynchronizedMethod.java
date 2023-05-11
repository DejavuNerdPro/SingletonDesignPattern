package learning.designpattern.singleton;

public class SingletonSynchronizedMethod {

	private static SingletonSynchronizedMethod instance;

	private SingletonSynchronizedMethod(){}

	public static synchronized SingletonSynchronizedMethod getInstatnce(){

		if(instance==null){
			instance=new SingletonSynchronizedMethod();
		}
		return instance;
	}


}
