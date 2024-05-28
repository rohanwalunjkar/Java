package com.app.fruits;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------- JAVA APPLICATION APP : FRUIT BASKET-------------------------------");

		Fruits fr[] = new Fruits[100];

		boolean flag = false;

		int cnt = 0;

		while (!flag) {
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4.  Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("6. Mark a fruit in a basket , as stale(=not fresh)");
			System.out.println("7. Mark all sour fruits stale");
			System.out.println("8. Invoke fruit specific functionality (pulp / juice / jam)");
			System.out.println("9. Exit");
			System.out.println("Take your favourite Fruit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the color ,weight,name,freshness of Mango");
				fr[cnt] = new Mango(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				cnt++;
				break;

			case 2:
				System.out.println("Enter the color ,weight,name,freshness of Orange");
				fr[cnt] = new Orange(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				cnt++;
				break;

			case 3:
				System.out.println("Enter the color ,weight,name,freshness of Apple");
				fr[cnt] = new Apple(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				cnt++;
				break;

			case 4:
				System.out.println("-------------------Displaying Name of fruits--------------------------");
				for (Fruits f : fr) {
					if (f != null) {
						System.out.println(f.disName());
					}
				}
				break;
			case 5:
				System.out.println("-------------------Displaying fruits--------------------------");
				for (Fruits f : fr) {
					if (f != null) {
						System.out.print(f.toString());
						System.out.println(f.taste());
					}
				}
				break;

			case 6:
				System.out.println("-------------------Marking fruit as not fresh--------------------------");
				System.out.println("Enter index of fruit to set fruit as not fresh");
				int idx = sc.nextInt();
				if (idx < cnt && idx >= 0)
					fr[idx].setFresh(false);
				else
					System.out.println("Index out of boundary");
				break;
				
			case 7:
				System.out.println("------------------- Mark all sour fruits stale--------------------------");
				for(Fruits f : fr)
				{
					if(f!=null)
					{
						if(f.equals(f))
						{
							f.setFresh(false);
						}
					}
				}
				break;
				
			case 8:
				System.out.println("-------------------Marking fruit specific functionality--------------------------");
				System.out.println("Enter index of fruit to invoke fruit functionality");
				for (Fruits f : fr) {
					if (f != null) {
						if (f instanceof Mango) {
							((Mango) f).pulp();
						} else if (f instanceof Orange) {
							((Orange) f).juice();
						} else
							((Apple) f).jam();
					}
				}
				break;
			case 9:
				flag = true;
				System.out.println("JAVA APPLICATION APP COMPLETED");

			}

		}

		sc.close();
	}

}
