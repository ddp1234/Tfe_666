package Main;

public class Sort {
	public void sort(int score[]) {
		int i,j;
		
		for(i=10-2;i>=0;i--)
		{
		for(j=0;j<=i;j++)
		{
		if(score[j]<score[j+1])
		{
		int temp;
		temp = score[j];
		score[j] = score[j+1];
		score[j+1]=temp;
	}

		}
		}
		for (int k = 0; k < score.length; k++) {
			System.out.println(score[k]);
		}
}}