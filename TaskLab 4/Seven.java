class Seven
{
   public static void main(String[]nah)
   {
      int arr[]=new int[]{9,4,3,5,2,6,7,1,8};
      int temp=1;
      System.out.println("Array before:");
      for(int elements:arr)
      {
       System.out.print(elements); 
      }
      System.out.println();
      for(int a=0;a<arr.length;a++)
      {
         for(int b=0;b<(arr.length-1);b++)
         {
            if(arr[b]>arr[b+1])
            {
              temp=arr[b];
              arr[b]=arr[b+1];
              arr[b+1]=temp;
            }
         }
      }
      System.out.println("Array After applying BubbleSort:");
      for(int elements:arr)
      {
       System.out.print(elements); 
     }
    }
}      