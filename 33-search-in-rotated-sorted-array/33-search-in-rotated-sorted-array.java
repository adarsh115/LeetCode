class Solution {
	public int findMin(int[] nums) {
        
        int l =0, len = nums.length, r = len-1;
        int res = nums[l];
        int prev, next;
        while(l<=r){
            //when array is already sorted 
            if(nums[l] <= nums[r]){
                return nums[l];
            }
            
            int mid= l+ (r-l)/2;
            prev = (mid+len-1)%len;
            next = (mid+1)%len;
            
            //mid is less then the prev and the next element
            if(nums[mid]<= nums[prev] && nums[mid] <= nums[next]){
                return mid;
            }
            else if(nums[mid] >= nums[l]){
                l = mid+1;
            }
            else {
                r= mid-1;
            }
            
        }
        
        return res;
    }
	public int bs(int arr[],int start, int end, int target){
		int s = start;
		int e = end;
		
		while(s <= e){
			int mid = s + (e-s)/2;
			
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target ){
				s = mid+1;
			}
			else{
				e = mid-1;
			}
		}
		return -1;
	}


    public int search(int[] nums, int target) {
        int arrayStartIndex = findRotation(nums);
        int index= binarySearch(nums, arrayStartIndex,nums.length-1,target);
        int index2 = binarySearch(nums, 0,arrayStartIndex-1,target);
        return index==-1?index2:index;
        
    }
    
     public int findRotation(int [] arr){
        int N = arr.length;
        int start = 0,end = N-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int prev = (mid - 1 + N)%N;
            int next = (mid + 1)%N;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                return mid;
            else if(arr[mid]>=arr[0])
                start = mid+1;
            else 
                end = mid-1;
        }
        return 0;
    }
    
    public int binarySearch(int [] arr,int start , int end,int target){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>=target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
}