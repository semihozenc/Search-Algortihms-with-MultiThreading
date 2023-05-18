package multiThreading;

import java.util.Arrays;

public class BinarySearch extends Thread{
	
	private int[] array;
	private int target;
	
	public BinarySearch(int[] array, int target) {
		this.array = array;
		this.target = target;
	}
	
	
	public void run() {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		Arrays.sort(sortedArray);
		System.out.println("Binary Search ilk adım olarak dizi küçükten büyüğe sıralanır: " + Arrays.toString(sortedArray));
    	boolean control = true;
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Binary Search arama adımları -->  Aranan Değer: " + target + " -- Şu an bakılan değer: " + sortedArray[mid] + "\n");
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

            if (sortedArray[mid] == target) {
    			System.out.println("Binary Search ile eleman bulundu! Dizideki indisi = "+mid);
    	    	control = false;
    			break;
            }

            if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    	if (control) {
    		System.out.println("Binary Search ile eleman bulunamadı!");			
    	}
	}

}
