package programs;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,12,13,10,12,15};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					break;
				}
			}
		}
	}

}
