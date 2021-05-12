
public class Dynamic {

	public void devision(int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("the devision of c="+c);
	}
	
	public int devision (int a, int b, int c)
	{
		c= a/b;
		System.out.println("the devision of c= "+c);
		
		return c;
		
	}
	
	public static void main(String[] args) {
		
			Dynamic s=new Dynamic();
			s.devision(10, 20);
				s.devision(10, 20, 30);
				
		}
}
