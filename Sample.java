public class Sample
 {
       void fibonacci (){
	   
	      int a=0; int b=1;
	      
		  for(int i=1;i<15;i++)
		  {
		     
		     int c=a+b;
			 System.out.println(c);
			  
			  a=b;
			  b=c;
		  
		  }
	    System.out.println("---------------");
	   }
	      
	   void primenummber()
	   
	   {         
		   
		   int count =0;
	         for (int i=1;i<15;i++)
             {
				count=0; 
				
				for(int j=2;j<=15;j++) 
			{		
					
			  if (i%2==0)
			  {
				count++; 
		     	  }
		 	   }
				 
				 if(count==0)
				 {
				   System.out.println(i);
				 }
				 
	         }
				 
	   
	   
	   }
	
	
		
		public static void main (String[] args)
	{
		
    	Sample obj = new Sample();
		     obj.fibonacci();
             obj.primenummber();
	}
}