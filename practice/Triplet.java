package practice;

public class Triplet {
	private void printTriplet(int[] arr) {
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]==arr[k]) {
						System.out.println("<"+arr[i]+","+arr[j]+","+arr[k]+">");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
    Triplet tp=new Triplet();
	int[] arr2= {2,3,4,5,7};
	tp.printTriplet(arr2);
	System.out.println("_________");
	int [] arr= {1,2,3,4,5,7,9};
	tp.printTriplet(arr);
	}
}
