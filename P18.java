package patterns;

public class P18 {

	public static void main(String[] args) {
		int row=6;
		int space=1;
		int num=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<6;k++)
			{
				System.out.print(" "+(num+k)+" ");
			}
			space++;
			num++;
			
			
			System.out.println();
		}
	}
}
