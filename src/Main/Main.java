package Main;

public class Main{//分数
	static void printScore(int score[])
	{
	int i;
	for(i=0;i<10;i++)
	{
	System.out.println("分数是=="+score[i]);
	}
	}
	//考试总分
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
	//计算平均分
	static int getAvgScore(int score[])
	{
	return getTotalScore( score)/10;
	}
	//计算最高分
	static int getMax(int score[])
	{
	int max = -1;
	int i;
	for(i=0;i<10;i++)
	{
	if(score[i]>max)
	{
	max = score[i];
	}
	}
	return max;
	}
	//计算最低分
	static int getMin(int score[])
	{
	int min =100;
	int i;
	for(i=0;i<10;i++)
	{
	if(score[i]< min)
	{
	min = score[i];
	}
	}
	return min;
	}
	//分数降序排序
	static void sort(int score[])
	{
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
	printScore(score);
	}
		     

public static void main(String[] args)  
{
    int []score ={67,98,75,63,82,79,81,91,66,84};
    int sum,avg,max,min;
    sum = getTotalScore(score);
    avg = getAvgScore(score);
    max = getMax(score);
    min = getMin(score);
    System.out.println("总分是："+sum);
    System.out.println("平均分是："+avg);
    System.out.println("最高分是："+max);
    System.out.println("最低分是"+min);
    System.out.println("----------成绩排名---------");
    sort(score);
}



}
