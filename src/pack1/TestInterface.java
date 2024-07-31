package pack1;

public class TestInterface implements MyInterface, Interface1 {

	public void show() {
		System.out.println("show() in TestInterface ");
	}

	public void display(String msg) {
		System.out.println("display (String) in TestInterface");
		System.out.println("Message : " + msg);
	}

	public static void main(String[] args) {
		// MyInterface obj = new MyInterface();// we can create reference of interface
		// type but not object
		System.out.println("Number :  "+MyInterface.NUMBER);// classname.propertyname//it it final static 
		MyInterface obj = new TestInterface();// up casting
		obj.show();
		obj.display("Hello");
		//obj.print();// myInterface does not have print
		((Interface1)obj).print();// down casting
	}

	public void print() {
		System.out.println("print () in TestInterface ");
	}

}
