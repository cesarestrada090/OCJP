package instanceOf;

interface X{
	
}
class Z implements X{
	
}


public class InstanceInterfaces extends Z  {

	public static void main(String[] args) {
		X x = new Z();
		
		System.out.println("Como vemos todo sigue dependiendo del objeto");
		System.out.println(x instanceof Z);
		
	}
}
