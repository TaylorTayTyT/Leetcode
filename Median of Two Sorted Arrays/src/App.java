public class App {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ansSize = nums1.length + nums2.length; 
        double ans[] = new double[ansSize];
        int max2 = nums2.length; 
        int index1 = 0; 
        int index2 = 0; 
        for(int i = 0; i < ansSize; i++) {
            if (index1 == nums1.length) {
                //ran out of num1 elements
                for( ; index2 < nums2.length; index2++) {
                    //ran out of num2 elements
                    ans[i++] = nums2[index2]; 
                }
                break; 
            }
            else if (index2 == nums2.length) {
                for( ; index1 < nums1.length; index1++) {
                    //ran out of num2 elements
                    ans[i++] = nums1[index1]; 
                }
                break; 
            }
            
            if(max2 > index2 && nums1[index1] > nums2[index2]) {
                //nums2 has the smaller element
                ans[i] = nums2[index2++]; 
            }
            else {
                //num1 has the smaller eleemtn
                ans[i] = nums1[index1++];
            }
        }
        
        double median; 

        if (ansSize % 2 != 0) {
            median = ans[(ansSize - 1) / 2];
        } 
        else {
            median = (ans[(ansSize - 1) / 2] + ans[((ansSize - 1) / 2) + 1] ) / 2; 
        }
        return median; 
    }
    public static void main(String[] args) throws Exception {
        int nums1[] = {3, 4};
        int nums2[] = {};
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }
}
