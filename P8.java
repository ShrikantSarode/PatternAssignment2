package patterns;

public class P8 {

	public static void main(String[] args) {
		int row=6;
		int col=1;
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+(i+j));
			}
			col++;
			System.out.println();
		}
	}
}
