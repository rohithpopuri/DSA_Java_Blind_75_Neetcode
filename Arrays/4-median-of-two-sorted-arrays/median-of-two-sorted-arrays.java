import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;

        int[] sortarr = new int[size];

        for(int i=0;i<nums1.length;i++){
            sortarr[i]=nums1[i];
        }
        for(int i=nums1.length;i<size;i++){
            sortarr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(sortarr);

        double mid = (size-1)/2.0;


        if ((size-1)%2==0){
            int mid_1=(size-1)/2;
            return sortarr[mid_1];
            // int mid_1=(size-1)/2;
            // System.out.println(mid_1);
            // double median = (sortarr[mid_1]+sortarr[mid_1+1])/2.0;
            // return median;
        }else{
            int mid_1=(size-1)/2;
            // System.out.println(mid_1);
            double median = (sortarr[mid_1]+sortarr[mid_1+1])/2.0;
            return median;
            

        }
        

    }
}