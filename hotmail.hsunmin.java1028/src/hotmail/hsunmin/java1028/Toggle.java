package hotmail.hsunmin.java1028;

public class Toggle {

	public static void main(String[] args) {
		// 3초마다 2가지 동작을 번갈아 가면서 10번하기
		for(int i=0;i<10;i=i+1)
		{
			try 
			{
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			if( i % 5 ==0) {System.out.println("디아블로");}
			else if(i % 5 == 1) {System.out.println("메피스토");}
			else if(i% 5 ==2){System.out.println("바알");}
			else if(i% 5 ==3){System.out.println("디아블로");}
			else if(i% 5 ==4){System.out.println("바알");}
		}

	}

}
