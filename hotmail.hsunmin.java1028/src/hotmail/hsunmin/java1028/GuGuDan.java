package hotmail.hsunmin.java1028;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단을 2단부터 9단까지 출력
		
		int i=2;
		int j=1;
		
		for(i=2;i<10;i=i+1)
		{
			for(j=1;j<10;j=j+1)
			{
				System.out.println((i) + "*" + j + "=" + i*j);
			}
		}
	}

}
