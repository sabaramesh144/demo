public class Patternprogram
 {

     void triangle1() {
	 
		 
		 for (int i =1 ; i<5;i++)
	   {
		
		   for(int j=1; j<=i;j++)
		     {
		   
		   System.out.print(j);
	       } 
		   System.out.println();
	   }
	     } 
		 
	void triangle2()
	{
	    for (int i=1;i<=5;i++)
		{
		   for (int j=5;j>=i;j--) {
		
		    System.out.print(j);
		   }
			System.out.println();
		}
	}
	
	void triangle3()
		
	{
		 
		int num=5;
	for (int i=1;i<=num;i++)
	{
	
       for(int j=1;j<=num-i;j++)
	   {
	     
	   System.out.print(" ");
	   }
	    for (int k=1;k<=i;k++)
			
		{
		System.out.print(k);
		
		}
       	System.out.println("");
 	}
	}
	
		
		void triangle4 ()
		{
		
		for (int i = 1; i <= 5; i++) 
		{
        for (int j = 1; j <= 5 - i; j++) 

        {
             System.out.print(" ");
             }
        for (int k = 1; k <= i; k++) 
         {
               System.out.print("* ");
          }
              System.out.println(" ");
		
			}
		}
		
		
		
		
		
		
		public static void main (String[] args)
	{
		
    	Patternprogram p1 = new Patternprogram();
		
              p1.triangle1();		
              p1.triangle2();
		      p1.triangle3();
		      p1.triangle4();
		      
	}
}