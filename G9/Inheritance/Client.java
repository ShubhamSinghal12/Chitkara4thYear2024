package Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p =new Parent();
		p.fun();
		
		Child c =new Child();
		c.fun();
		
		Parent cp =new Child();
		cp.fun();
		
		
		System.out.println(cp);
	}

}
