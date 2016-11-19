import java.util.*;
public class TestPerformance
{
	public static void main(String args[])
	{
		List<Integer> arrList=new ArrayList<Integer>();
		List<Integer> lnkList=new LinkedList<Integer>();
		long arrTime,llTime;
		long start=System.currentTimeMillis();
		addValues(5,arrList);
		System.out.println("\n\n Array list values :-");
		printValues(arrList);
		long stop=System.currentTimeMillis();
		arrTime=(stop-start);		

		start=System.currentTimeMillis();
		addValues(2,lnkList);
		System.out.println("\n\n Linked list values :-");
		printValues(lnkList);
		stop=System.currentTimeMillis();
		llTime=(stop-start);
		
		
		System.out.println("\n\n Time for array list : "+arrTime);
		System.out.println("\n\n Time for linked list : "+llTime);

		start=System.currentTimeMillis();
		arrList.remove(3);
		//System.out.println("\n\n Array list values after removing third value :-");
		stop=System.currentTimeMillis();
		System.out.println("\n\n Removing Time for Array list : "+(stop-start));

		start=System.currentTimeMillis();
		lnkList.remove(2);
		//System.out.println("\n\n Linked list values after removing second value :-");
		stop=System.currentTimeMillis();
		System.out.println("\n\n Removing Time for linked list : "+(stop-start));
		
	
	}

	public static void addValues(int start,List<Integer> list)
	{
		for(int i=0;i<500;i++)
		{
			list.add(i*start);
		}
	}

	public static void printValues(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println("\t"+list.get(i));
		}
	}
}


/* 
Output :-(partial Output)

 Time for array list : 63


 Time for linked list : 31


 Removing Time for Array list : 0


 Removing Time for linked list : 0
 
 */