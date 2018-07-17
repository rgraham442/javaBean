
public class HelloWorlds {

	public static void main(String[] args) {
		
		Level1 lvl1 = new Level1();
		Level2 lvl2 = new Level2();
		
		/*
		lvl1.task1();
		
		lvl1.task2();
		System.out.println();
				
		lvl1.task3("Hi there World!");
		System.out.println();
				
		System.out.println(lvl1.task4());
		System.out.println();
				
		System.out.println(lvl1.task5(20,7));
		System.out.println();
				
		System.out.println(lvl1.task6(10,7,true));
		System.out.println(lvl1.task6(10,7,false));
		System.out.println();
				
		System.out.println(lvl1.task7(0,7));
		System.out.println(lvl1.task7(10,0));
		System.out.println(lvl1.task7(10,7));
		System.out.println(lvl1.task7(0,0));
		System.out.println();
		
		lvl1.task8();
		System.out.println();
		
		lvl1.task9();
		System.out.println();
		
		lvl1.task10();
		System.out.println();
		
		lvl1.task11();
		System.out.println();
		
		*/
		System.out.println(lvl2.blackjack(4, 4));
		System.out.println(lvl2.blackjack(4, 22));
		System.out.println(lvl2.blackjack(24, 2));
		System.out.println(lvl2.blackjack(19, 5));
		System.out.println(lvl2.blackjack(8, 16));
		System.out.println(lvl2.blackjack(24, 22));
		System.out.println();
		
		
		System.out.println(lvl2.unique(1,2,3));
		System.out.println(lvl2.unique(3,3,3));
		System.out.println(lvl2.unique(1,1,3));
		System.out.println(lvl2.unique(3,5,3));
		System.out.println(lvl2.unique(7,3,3));
		
		
	}
	
}
