package loop;

public class LoopFix {

	public static void main(String[] args){
		
		int length = 5; //Can modify length here
		int  x = 1; //Count for number of numbers to append at first
		
		while(length > 0)
		{
			char[] dots = new char[length-1];
			char[] nums = new char[x];
			 
			 String d = new String(dots).replace("\0", ".");
			 System.out.print(d);
			 
			 String n = new String(nums).replace("\0", Integer.toString(x));
			 System.out.println(n);
			 
			
			length--;
			x++;
		}
	}
}
