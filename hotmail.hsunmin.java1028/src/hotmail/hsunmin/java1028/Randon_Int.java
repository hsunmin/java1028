package hotmail.hsunmin.java1028;

public class Randon_Int {

	public static void main(String[] args) 
	{
		// 랜덤 인스턴스 생성
		java.util.Random r = new java.util.Random();
		for(int i=0; i<6;i=i+1)
		{
			int x =r.nextInt(45);
			System.out.println(x+1);
		}

	}

}
