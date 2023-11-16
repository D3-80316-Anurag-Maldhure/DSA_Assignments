import java.util.Scanner;

public class LinearSearchLastIndex {

	public static void main(String[] args) {
		
		int key;
		int result = -1;
		
		int[] arr = new int[] {12,24,36,12,60,72,12,96,12,24,120};
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the number you want to search: ");
		key = scanner.nextInt();
		
		result = getLastOccuranceIndex(arr, key);
		if(result==-1) {
			System.out.println("\nNumber not found in the list!");
		}
		else {
			System.out.println("\nNumber " + key +" found at index : " + result);
		}
		scanner.close();
	}
	
	//Linear search to find last occurrence in the array
	public static int getLastOccuranceIndex(int[] array, int key) {
		for(int i = array.length-1 ; i >=0; i--) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
