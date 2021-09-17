package com.barclays.fsd.oop;

//record SomeRecord {
//	
//}

enum SAomeEnum {
	
}

@FunctionalInterface
interface SomeInterface {
	default void m2() {

	}

	static void m3() {

	}

	void someMethod();
}

class ClassOne implements SomeInterface {
	@Override
	public void someMethod() {
		System.out.println("Impl 1");
	}
}

class ClassTwo {
	SomeInterface obj = new SomeInterface() {
		@Override
		public void someMethod() {
			System.out.println("Impl 2");
		}
	};
}

public class LambDemo {
	public static void main(String[] args) {
		ClassOne obj = new ClassOne();
		obj.someMethod();
		
		

		SomeInterface obj2 = new SomeInterface() {
			@Override
			public void someMethod() {
				System.out.println("Impl 2");
			}
		};
		obj2.someMethod();
		// lambda expression
		SomeInterface obj3 = () -> {
			System.out.println("Impl 3");
		};
		obj3.someMethod();

	}

}
