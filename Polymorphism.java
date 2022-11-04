//Polymorphism-->MethodOverloading

public class Polymorphism {

       void addition(int a,int b, int c)
       {
    	   int sum= a+b+c;
    	   System.out.println(sum);
    	   
       }
	
       void addition(int a, int b, int c, int d) {
    	   
    	   int sum= a+b+c+d;
    	   System.out.println(sum);
    	   
    	   
       }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism obj= new Polymorphism();
		obj.addition(4, 5, 1);
		obj.addition(4, 5, 1,2);
		
	}

}
