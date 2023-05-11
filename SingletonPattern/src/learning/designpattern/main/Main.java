package learning.designpattern.main;

import learnig.designpattern.singleton_using_enum.SingletonEnumImplementation;
import learning.designpattern.singleton.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Singleton(Lazy Loading) :");

		Singleton instance=Singleton.getInstance();
		System.out.println(instance);

		System.out.println("Eager Loading :");

		SingletonEager eagerSingleton=SingletonEager.getInstance();
		System.out.println(eagerSingleton);

		System.out.println("Synchronized(Thread Safe) : ");

		SingletonSynchronized singletonSynchronized=SingletonSynchronized.getInstance();
		System.out.println(singletonSynchronized);

		System.out.println("Synchronized Method(Thread Safe Method) : ");

		SingletonSynchronizedMethod singletonSynchronizedMethod=SingletonSynchronizedMethod.getInstatnce();
		System.out.println(singletonSynchronizedMethod);

		System.out.println("Enumeration : ");

		SingletonEnumImplementation.INSTANCE.setName("Singleton Design Pattern");
		System.out.println(SingletonEnumImplementation.INSTANCE.getName());
	}

}
