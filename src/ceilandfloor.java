import java.util.Arrays;
public class ceilandfloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] list = {-1000,-3,-1,0,4,30,55,90,110,200,300,500,1000,1500};
 int CeilAnswer= Ceiling(list,2000);
 int FloorAnswer= Flooring(list,80);
 if (CeilAnswer>list.length-1)
 {
	 System.out.println("No ceil in the list for :"+2000);	 
 }
 else
 {
	 System.out.println(list[CeilAnswer]);
 }

 System.out.println(list[FloorAnswer]);
 
	}

	  static int Flooring(int[] list, int t) {
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
			return End;
	}

	static int Ceiling(int[] list, int t) {
	
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
			return Start;
	}

}
