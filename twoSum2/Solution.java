class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        
        for(int i=0;i<numbers.length;i++)
        {
            int ret=binarySearch(numbers,numbers[i],i+1,numbers.length-1,target);
            if(ret!=-1){
                result[0]=i+1;
                result[1]=ret+1;
                break;
            }
        }
        return result;
    }

    public int binarySearch(int[] nums,int curr,int start, int end, int target){
        if(start>end) return -1;

        int mid=start+(end-start)/2;

        if(nums[mid]==target-curr) return mid;

        if(nums[mid]>target-curr) return binarySearch(nums, curr, start, mid-1, target);

        else return binarySearch(nums, curr, mid+1, end, target);
    }
}