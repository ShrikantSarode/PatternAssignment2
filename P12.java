package patterns;

public class P12 {

	public static void main(String[] args) {
		int row=6;
		int space=5;
		int star=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<star;l++)
			{
				System.out.print(" *");
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
