import java.util.Arrays;
public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] list = {-1,0,10,12,23,53,60,77,90,760};
   int Ans= BinarySearchAlgorithm (list , 53);
   check(Ans);
   Ans=BinarySearchAlgorithm (list , 80);
   check(Ans);
	}
	

	static int BinarySearchAlgorithm(int[] list, int t) {
		// TODO Auto-generated method stub
		int Start=0;
		int End= list.length-1;
		while(Start<=End)
		{
			int mid=Start+(End-Start)/2;
			///Equality
			if(list[mid]==t)
			{
				return mid;
			}
			// target is larger
			else if (list[mid]<t)
			{
				Start=mid+1;
			}
			else
			{
				End=mid-1;
			}
		}
		return -1;
	}
///check method
	  static void check(int ans) {
		// TODO Auto-generated method stub
		if (ans==-1)
		{
		System.out.println("Not found ,,,,,,Error");	
		}
		else
			System.out.println("Found Target index: "+ans);
	}


}
