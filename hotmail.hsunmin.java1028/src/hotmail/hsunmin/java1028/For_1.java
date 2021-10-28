package hotmail.hsunmin.java1028;

public class For_1 {

	public static void main(String[] args) 
	{
		
		//Hello Java while
		int i=0;
		
		while(i<3) 
		{
			System.out.println("Hello Java");
			i=i+1;
		}
		
		System.out.println("============");
		
		//for 제어문안에서 만든 변수는 제어문 바깥에서 사용할 수 없음
		for(int j=0;j<3;j=j+1) 
		{
			System.out.println("Hello Python");
		}
		
		System.out.println("============");
		
		for(int k=1;k<4;k=k+1) 
		{
			System.out.println("image"+k+".png");
		}
		
		System.out.println("============");
		
		// for에서 첫번쨰 변수를 꼭 만들필요없이 있는거 사용가능
		for(i=1;i<4;i=i+1) 
		{
			System.out.println("image"+i+".png");
		}
		
		// for에서 두개의 실행문 작성가능 이떄는 ;이 아닌 ,사용
		
	}

}
