package DSA;

public class MaximumGap {
    static int solve(int[]  input){
        // input has integers - its an array
        // return max difference between two successive elements in its sorted form
        // if array has less than 2 elements
        // return 0
        if (input.length < 2) return 0; //base condition
        // find the min and max, to find the range for bucket sort
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int inputs:input){
            min=Math.min(min,inputs);
            max=Math.max(max,inputs);
        }
        // The min and max values are now found
        // Now tp determine the bucket size and bucket count(*number of elements each bucket should hold and 
        // total number of buckets to create so that all the elements can be held)

        int bucketSize=Math.max(1, ((max-min)/(input.length-1)));
        int bucketCount=(max-min)/bucketSize+1;

        // initialize buckets as per the bucketSize and bucketCount
        int[][] buckets = new int[bucketCount][2];
        for(int i=0; i<bucketCount; i++){
            buckets[i][0]=Integer.MAX_VALUE;
            buckets[i][1]=Integer.MIN_VALUE;
        }

        // distribute values to the buckets
        for(int inputs:input){
            int bucketIndex=(inputs-min)/bucketSize; //1--> 1-1/2 = 0, 3--> 3-1/2 = 1, 6-->6-1/2=2, 9-->4
            buckets[bucketIndex][0]=Math.min(buckets[bucketIndex][0], inputs); // buckets[0][0]=Math.min(Integer.MAX_VALUE, 1)-->1
            buckets[bucketIndex][1]=Math.max(buckets[bucketIndex][1], inputs); // buckets[0][1]=Math.max(Integer.MIN_VALUE, 1)-->1
        }

        // Calculate the max gap
        int maxGap=0, prevMax=min;
        for (int [] bucket:buckets){
            if (bucket[0]==Integer.MAX_VALUE){
                continue;
            }
            maxGap=Math.max(maxGap, bucket[0]-prevMax);
            prevMax=bucket[1];
            // first iteration --> maxGap=Math.max(0, 1-1) --> maxGap=0
            // second iteration --> maxGap=Math.max(0, 3-1)--> maxGap=2
        }
        return maxGap;
    }
}
