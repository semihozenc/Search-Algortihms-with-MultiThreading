package multiThreading;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		InputItems inputItems = new InputItems();
		Thread inputItemsThread = new Thread(inputItems);
		inputItemsThread.start();
		
		synchronized (inputItemsThread) {
			try {
				inputItemsThread.wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		LinearSearch linearSearch = new LinearSearch(inputItems.arr, inputItems.target);
		linearSearch.start();
		
		BinarySearch binarySearch = new BinarySearch(inputItems.arr, inputItems.target);
		binarySearch.start();

	}

}
