package patterns;

public class P13 {

	public static void main(String[] args) {
		
		int row=5;
		int space=5;
		int star=1;
		
		for(int i=1;i<row;i++)
		{
			int num = i;
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print(num+++" ");
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
