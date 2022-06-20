class Question11 
{
	public static void main(String args[])
	{
		int i,j,k=1;
		int arr[]={6,12,3,6,7,1,19,13,8,4,5,20,17,10,14,16,11,15,5,3};
		int len= arr.length;
		for(i=0;i<len/2;i++)
		{
              arr[i]=0;
		}
		for(i=0;i<len;i++)
		{
              arr[i]=arr[i]+1;
		}
			for(i=0;i<len;i++)
		{
			for(j=0;j<len-1;j++)
			{
              if(arr[j]>arr[j+1])
              {
              	int temp=arr[j];
              	arr[j]=arr[j+1];
              	arr[j+1]=temp;
 
              }
          }
		}
		System.out.println("");

		System.out.println("Best Scores");
        
		for(i=len-1;i>=len-5;i--)
		{

              System.out.println(k +"\t\t"+arr[i]);
                 k++;
		}

	} 
}
