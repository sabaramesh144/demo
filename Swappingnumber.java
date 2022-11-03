public class Swappingnumber
 {
    
      void usingthirdvariable ()
		  
	  {
	      int a = 15;
		  int b = 55;
		  
		  a=15;
		  b=55;
		  
		 int c = a; 
	         a = b;
		     b = c;
		  
		  System.out.println("afterswapping");
	      System.out.println(a);
          System.out.println(b);	  
	  }
		
		 void withoutthirdvariable (){
		 
		       int a =20;
			   int b =-10;
			 
			 a = a+b;
			 b = a-b;
			 a = a-b;
			 
		 System.out.println("afterswapping");
	      System.out.println(a);
          System.out.println(b);	 
			 
			 
		      
		 }
		
		
		public static void main (String[] args)
	{
		
    	Swappingnumber obj = new Swappingnumber();
		     obj.usingthirdvariable();
             obj.withoutthirdvariable();
	}
}