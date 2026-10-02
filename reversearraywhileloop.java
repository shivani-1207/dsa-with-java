public class reversearraywhileloop {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0,j=n-1;
        while(i<=j){
            //int temp=arr[i];
            //arr[i]=arr[j];
           //  arr[j]=temp;
           swap(arr,i,j);
            i++ ;
            j-- ;

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
}
