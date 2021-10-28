package hotmail.hsunmin.java1028;

public class Etc {

	public static void main(String[] args) 
	{
		// 1부터 10까지 출력하는 반복문
		for(int i=1;i<11;i=i+1) 
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		int i=1;
		while(i<11) {
			System.out.print(i+" ");
			i=i+1;
		}
		
		System.out.println();
		System.out.println("====================");
		
		i=1;
		do{
			System.out.print(i+" ");
			i=i+1;
		}while(i<11);
		
		System.out.println();
		System.out.println("====================");
		
		// 3의 배수가 되면 더 이상 내용을 수행하지 않고 다음 반복으로 이동
		// 3의 배수가 되면 아래 문장을 수행하지 않기 떄문에 출력이 되지 않음
		for(int j=1;j<11;j=j+1) 
		{
			if(j % 3 == 0) {continue;}
			System.out.print(j+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		// for을 사용하지 않은 것과 동일한 상태
		for(int j=1;j<11;j=j+1);
		{
			System.out.print("한번만 수행 ");
		}
		
	}

}
