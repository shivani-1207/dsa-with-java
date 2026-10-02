import java.util.*;

public class histo {

    public static void maxArea(int arr[]) { //o(n)

        int maxArea = 0;

        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // ---------------- NSR ----------------
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // ---------------- NSL ----------------
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // ---------------- Current Area ----------------

        for (int i = 0; i < arr.length; i++) {

            int height = arr[i];

            // width = NSR - NSL - 1
            int width = nsr[i] - nsl[i] - 1;

            int currArea = height * width;

            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max area in my histogram = " + maxArea);
    }

    public static void main(String[] args) {

        int arr[] = {2,4};

        maxArea(arr);
    }
}