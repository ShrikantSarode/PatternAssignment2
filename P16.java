package patterns;

public class P16 {
	
	public static void main(String[] args) {
		int row=5;
			
		for(int i=0;i<row;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" "+j);
			}
			
			System.out.println();
		}
	}

}
