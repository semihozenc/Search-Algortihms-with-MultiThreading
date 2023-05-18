package multiThreading;

public class LinearSearch extends Thread{

	private int[] array;
	private int target;
	
	public LinearSearch(int[] array, int target) {
		this.array = array;
		this.target = target;
	}
	
	
    public void run() {
    	boolean control = true;
    	for (int i = 0; i < array.length; i++) {
            System.out.println("Linear Search arama adımları -->  Aranan Değer: " + target + " -- Şu an bakılan değer: " + array[i] + "\n");
    		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
    		if (array[i] == target) {
    			System.out.println("Linear Search ile eleman bulundu! Dizideki indisi = "+i);
    	    	control = false;
	    		break;
	    	}
	    }	
    	if (control) {
    		System.out.println("Linear Search ile eleman bulunamadı!");			
    	}
    }
    
}
