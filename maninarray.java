public class maninarray {
    public static void main(String[] args) {
        int[] arr ={10,20,22,30,33,55,66};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
