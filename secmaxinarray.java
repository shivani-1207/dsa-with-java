public class secmaxinarray {
     public static void main(String[] args) {
        int[] arr ={10,20,22,30,33,55,66};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>smx && arr[i] !=mx) smx = arr[i];
          //  if(arr[i] !=mx)
          //   smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
}
}