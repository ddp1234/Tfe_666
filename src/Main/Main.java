package Main;

public class Main{//����
	static void printScore(int score[])
	{
	int i;
	for(i=0;i<10;i++)
	{
	System.out.println("������=="+score[i]);
	}
	}
	//�����ܷ�
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
	//����ƽ����
	static int getAvgScore(int score[])
	{
	return getTotalScore( score)/10;
	}
	//������߷�
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
	//������ͷ�
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
	//������������
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
    System.out.println("�ܷ��ǣ�"+sum);
    System.out.println("ƽ�����ǣ�"+avg);
    System.out.println("��߷��ǣ�"+max);
    System.out.println("��ͷ���"+min);
    System.out.println("----------�ɼ�����---------");
    sort(score);
}



}
