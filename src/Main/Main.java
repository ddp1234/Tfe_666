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

	     

public static void main(String[] args)  
{
    int []score ={67,98,75,63,82,79,81,91,66,84};
System.out.println("***��������*****");
    Sort sort = new Sort();
    sort.sort(score);
    System.out.println("--------------ƽ��ֵ-----------------");
    Mmq mmq = new Mmq();
   mmq.getAvgScore(score);
   System.out.println("���ֵ");
   mmq.getMax(score);
   System.out.println("��Сֵ");
   mmq.getMin(score);
}



}
