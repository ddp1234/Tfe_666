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

	     

public static void main(String[] args)  
{
    int []score ={67,98,75,63,82,79,81,91,66,84};
System.out.println("***排序结果是*****");
    Sort sort = new Sort();
    sort.sort(score);
    System.out.println("--------------平均值-----------------");
    Mmq mmq = new Mmq();
   mmq.getAvgScore(score);
   System.out.println("最大值");
   mmq.getMax(score);
   System.out.println("最小值");
   mmq.getMin(score);
}



}
