package TypeCasting;

import static java.lang.Math.*;

public class Casting {

	public static void main(String[] args) {

		System.out.println("main method");
		System.out.println(sqrt(10));

		parent p1 = new parent();
		parent p2 = new child();

		child c1 = new child();
		//	child c2 = new parent();  need to typecast

		child c3 = (child) p2;
		
	//	child c4 = (child) p1; ---> class cast exception.
	}

}
class parent {

	void m1() {

		System.out.println("this is parent class m1 method");
	}

}
class child extends parent {

	void m1() {

		System.out.println("this is child class overrriden method");
	}

}
