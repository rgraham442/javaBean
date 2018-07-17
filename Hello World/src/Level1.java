
public class Level1 {
	
	public void task1() {
		System.out.println("Hello World!");
		
	}
	
	public void task2() {
		String hello = "Goodmorning World!";
		System.out.println(hello);
		
	}
	
	public void task3(String hi) {
		System.out.println(hi);
		
	}
	
	public String task4() {
		return "Howdy World!";
	}
	
	public int task5(int first, int second) {
		return first+second;
	}
	
	public int task6(int first, int second, boolean type){
		if (type == true) {
			return first + second;
		}
		else {
			return first * second;
		}
	}
	
	public int task7(int first, int second){
		if (first == 0) {
			return second;
		}
		else if (second == 0) {
			return first;
		}
		else {
			return first + second;
		}
	}
	
	public void task8() {
		
		for (int i=0; i < 10; i++) {
			System.out.println(task7(10,i));
		}
			
		
	}
	
	public void task9() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i < 10; i++) {
			System.out.println(task7(a[i],i));
		}
		
	}
	
	public void task10() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i < 10; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public void task11() {
		int[] a = new int[10];
		
		for (int i=0; i < a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		for (int i=0; i < a.length; i++) {
			a[i] = i*10;
			System.out.println(a[i]);
		}
		
		
	}
}
