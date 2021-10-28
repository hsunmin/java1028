package hotmail.hsunmin.java1028;

public class PracticeLoop {

	public static void main(String[] args) 
	{
		// 반복문안에 반복문
		// *****엔터 를 생성
		
		for(int j=0;j<5;j=j+1) 
		{
			// 늘어나는 부분 
			if( j<3 )
			{
				for(int i=0;i<j+1;i=i+1)
				{
					
					System.out.print("*");
				}
			}
			// 줄어드는 부분
			else
			{
				for(int i=0;i<5-j;i=i+1)
				{
					
					System.out.print("*");
				}
			}
			
			System.out.println("");
		}
	}
		
		

}


