class Prime
{
	public static void main(String arg[])	
	{
	int i,count;
              
    System.out.println("Prime numbers between 20 to 100 are ");
	for(int j=21;j<=100;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;  
	   }
	   
	}
	if(count==2)
	       System.out.print(j+"\n");     
	}
	}
}



Output:

Prime numbers between 20 to 100 are                                                                                     
23                                                                                                                      
29                                                                                                                      
31                                                                                                                      
37                                                                                                                      
41                                                                                                                      
43                                                                                                                      
47                                                                                                                      
53                                                                                                                      
59                                                                                                                      
61                                                                                                                      
67                                                                                                                      
71                                                                                                                      
73                                                                                                                      
79                                                                                                                      
83                                                                                                                      
89                                                                                                                      
97

