
public class arrays {
	public static void main(String[] args) {
		
		//1D Array
/*		int[] arr = new int[4];
		arr[0] = 21;
		arr[1] = 73;
		arr[2] = 2;
		arr[3] = 45;
		
		System.out.println("Element at index 0 is: " +arr[0]);
		System.out.println("Element at index 1 is: " +arr[1]);
		System.out.println("Element at index 2 is: " +arr[2]);
		System.out.println("Element at index 3 is: " +arr[3]);*/
		
		//2D Array
		int arr[][] = {{2,4,5}, {1,5,3}, {8,9,4}};
		int i,j;
		for(i=0; i<3; i++) 
		{
			for(j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
	}

}
