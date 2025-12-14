package Mat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(5, 10));
		
		int	a = -123;
		String b = "I";
		long c = -18L;
		boolean d = true;
		char e = '%';
		
		int  imena [][] = {{1, 2}, {1, 2, 3}, {1, 2}, {1, 2, 3}};
		System.out.println(imena[3].length); 
	}
	
	public static int fun(int x, int y)
	{
	    if (x == 0)
	        return 1;
	    else
	        return y + fun(x-1, y - 1);
	}


}
