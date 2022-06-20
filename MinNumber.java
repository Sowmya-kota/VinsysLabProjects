class MinNumber 
 {
  public static void main(String args[])
  {
 	 int a=10;
 	 int b=19;
 	 MinNumber e = new MinNumber();
 	 int result = e.minfunc(a, b);
 	 System.out.printf("Minimum Value = %d" ,result);
  }
  public int minfunc(int n1 , int n2)
  {
 	 int min;
 	 if(n1>n2)
 		 {
 		 return n2;
 		 }
 	 else 
 		 {
 		 return n1;
 		 } 
  }
 }