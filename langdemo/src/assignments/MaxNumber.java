package assignments;

public class MaxNumber {
	
	public static int max(int ... values)
	{
		var largest = values[0];
		for(int n : values)
			if ( n > largest)
				 largest = n;
		
		return largest;
		
	}

	public static void main(String[] args) {
		 
        System.out.println(max(10,20,15,60,30));
        System.out.println(max(1,2,15));
	}

}
