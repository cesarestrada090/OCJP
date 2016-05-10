package equalsHash;

import java.util.HashMap;
import java.util.Map;

class Casa {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Casa(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Casa c = (Casa)obj;
		return this.getX()==c.getX();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.x*y;
	}
	

}

public class Maps {
	public static void main(String[] args) {
		Map m = new HashMap<Casa, String>();

		m.put( new Casa(1,2),"1");
		m.put( new Casa(1,4), "4");
		m.put( new Casa(1,4), "7");

		System.out.println(m.get(new Casa(1,2)));

	}

}
