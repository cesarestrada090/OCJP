package equalsHash;

public class Principal {
	
	private int x;
	private int y;
	
	
	
	public static void main(String[] args) {
		
		Object o = new Object();
		System.out.println("always true because the overriden method is 'from Principal' class"); 
		System.out.println(o.equals(o));
		
		System.out.println("----------");
		System.out.println("----------");
		
		Principal p = new Principal();
		p.x=3;
		p.y=4;
		
		Principal p2= new Principal();
		p2.x=3;
		p2.y=4;
		System.out.println("I'm comparing two object with the same attributes with equals method");
		System.out.println(p.equals(p2));
		
		System.out.println("I'm comparing two object with the same attributes with hashcode method");
		System.out.println(p.hashCode()==p2.hashCode());
		
		
	
		
		
		
		
	}
	
	public boolean equals(Object b){
		if(b==null){
			return false;
		}
		if(!(b instanceof Principal)){
			return false;
		}
		
		final Principal other= (Principal)b;
		
		if(other.x==this.x && other.y==this.y){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.x*11+this.y*13;
		
	}
	
//	Here crush because i'm returning a double and the return type is int
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return this.x*3.4f;
//	}
	
// LINKS IMPORTANTES 
	/*
	 * http://lineadecodigo.com/java/usando-las-clases-hashset-y-hashmap/
	 */
	 

//	It is reflexive: for any reference value x, x.equals(x) should return true.
//	It is symmetric: for any reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
//	It is transitive: for any reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
//	It is consistent: for any reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the object is modified.
	
}
