package Main;

public class Mmq {
	
	static int getTotalScore(int score[])
	{
	int sum = 0;
	int i;
	for(i=0;i<10;i++)
	{
	sum+=score[i];
	}
	return sum;
	}
	public void getAvgScore(int score[]) {
		int i= getTotalScore( score)/10;
		System.out.println(i);
		
	}
	public  void getMax(int score[]) {
		int max = -1;
		int i;
		for(i=0;i<10;i++)
		{
		if(score[i]>max)
		{
		max = score[i];
		}
		}
		//return max;
		System.out.println(max);
	}
	public  void  getMin(int score[]) {
		int min =100;
		int i;
		for(i=0;i<10;i++)
		{
		if(score[i]< min)
		{
		min = score[i];
		}
		}
		 System.out.println(min);
	}

}
