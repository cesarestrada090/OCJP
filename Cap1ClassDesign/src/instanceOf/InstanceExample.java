package instanceOf;

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

public class InstanceExample {

	public static void main(String[] args) {
		A obj = new C();
		
		System.out.println("Imprimir� true debido a que es un Instancia de C");
		
		System.out.println(obj instanceof C);
		
		A obj2 = new B();
		
		System.out.println("Imprimir� false debido a que es un Instancia de B");
		
		System.out.println(obj2 instanceof C);
	}
}
