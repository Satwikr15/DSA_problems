import java.util.*;
class Main {
    public static int[] twosum(int[] arr, int n,int target){
        HashMap<Integer, Integer> mpp=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            int num=arr[i];
            int m=target-num;
            if (mpp.containsKey(m)) {
                return new int[]{mpp.get(m), i}; // Return indices of the pair
            }
            // if(mpp.containsKey(m)){
            //     return "Yes";
            // }
            mpp.put(arr[i],i);
        }
        // return "No";
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] arr={2,3,1,4};
        int n=arr.length;
        int target=4;
        // System.out.println(twosum(arr,n,target));
        int[] result = twosum(arr, n, target);
        
        if (result[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}
