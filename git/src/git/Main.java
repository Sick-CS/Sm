package git;

class A {

	void meth() {
		System.out.println("meth");
		System.out.println("meth2");
	}
}

class B extends A {
	@Override
	void meth() {
		// TODO Auto-generated method stub
		super.meth();
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
	}
}
