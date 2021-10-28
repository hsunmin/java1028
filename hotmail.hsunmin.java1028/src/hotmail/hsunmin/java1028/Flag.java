package hotmail.hsunmin.java1028;

public class Flag {

	public static void main(String[] args) 
	{
		// 2가지 상태 번갈아 가면서 10번 수행하기
		boolean flag = true;
		for(int i=0;i<10;i=i+1)
		{
			if(flag == true) {System.out.println("깃발 들어");}
			else {System.out.println("깃발 내려");}
			flag = !flag; // true 와 false를 번갈아가면서 flag에 저장
		}
		
		System.out.println("=======");
		
		int i=0;
		for (i=0;i<10;i=i+1) {}
		System.out.println(i);
		
		System.out.println("=======");
		
		int j=0;
		boolean f= true;
		
		for(j=0;j<5;j=j+1)
		{
			if(j % 4 == 1) 
			{
				f = false;
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}
		if(f == true) {System.out.println("중간에 반복문을 멈추지 않았음");}
		else {System.out.println("중간에 반복문을 중단 했습니다");}
		
	}

}
