package multiThreading;

import java.util.Scanner;

public class InputItems implements Runnable{
	
	public int[] arr;
	public int target;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dizinin eleman sayısını giriniz: ");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Dizinin elemanlarını tek tek giriniz:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Oluşturulan Dizi: ");
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			if (i==(size-1)) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
		this.arr = arr;
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.print("\nDizide aranacak elemanı giriniz: ");
		int target = scanner.nextInt();	
		this.target = target;
		
		scanner.close();		
	}
	
}
