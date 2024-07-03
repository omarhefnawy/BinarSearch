
public class RoatatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nums = [4,5,6,7,0,1,2]
		int[] nums= {1};
		int target =1;
		int Divide2Arrays=search(nums,target);
		System.out.println(Divide2Arrays);
	}
	
	 static public int search (int[] nums, int target) {
		 
		 int pivotS= pivot(nums);
		  if(pivotS==-1)
		  {
			  return SearchInBoth(nums,0,nums.length-1,target);
		  }
		  if (target >= nums[0]) {
	            // Search in the left part before the pivot
	            return SearchInBoth(nums, 0, pivotS, target);
	        } else {
	            // Search in the right part after the pivot
	            return SearchInBoth(nums, pivotS + 1, nums.length - 1, target);
	        }
		  
	
		 
	    }

	  static int SearchInBoth(int[] nums, int start, int end,int target) {
	   while(start<=end)
	   {
			int mid = start+(end-start)/2;;
		if (target==nums[mid])
		{
			return mid;
		}
		else if (target>nums[mid])
		{
			start=mid+1;
		}
		else
		{
			end=mid-1;
		}
	   }
		return -1;
	}

	static int pivot(int[] nums) {
		// TODO Auto-generated method stub
		int start=0;
		int end=nums.length-1;

		 if (nums[start] <= nums[end]) {
	            // Array is not rotated
	            return -1;
	        }
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			
			if (mid<end&&nums[mid]>nums[mid+1])
			{
			return mid;	
			}
			
				 if (mid>start&&nums[mid]<nums[mid-1])
					{
						return mid-1;
					}	
			
			
			 if (nums[start]>=nums[mid])
			{
				end=mid-1;
			}
			 else
			 {
				 start=mid+1;
			 }
			
		}
		return -1;
		
	}

}
