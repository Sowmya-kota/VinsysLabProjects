public class JavaExpectionEg 
{
	public static void main(String args[])
	{
		try
		{
			int arr[]= {1,2,3,4,5,6,7,8,9};
			System.out.println(arr[12]);
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			System.out.println(e);
		}
		System.out.println(e);
     }
}

////		try 
////		{
////		   int arr[]= {112,34,56,78,22,28,97,34,29};
////		   System.out.println(arr[12]);
////		 }
////		catch(ArrayIndexOutOfBoundsException e)
////		{
////			System.out.println(e);
////		}
////		System.out.println("endd");
////	}
//
////		try
////		{
////			int a=30/0;
////		}
////		catch(Exception e)
////		{
////			System.out.println("Error");
////		}
//	
//	
//	
//		try
//        {
////	        int a = 10;
//		    int b = new int[5];
//		    b[6]= 15;
//	     }
//         catch(ArithmeticException e)
//		{
//			System.out.println("OOPS!! An Error Occured.!!");
//			System.out.println(e);		
//		}
//		catch(Exception c)
//		{
//			System.out.println(c);
//			System.out.println("Error Again!!!")
//	   }
//}
////		
////     }
//
