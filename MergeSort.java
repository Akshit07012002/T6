package trimester6;

/* --------------------------------------------
 * 		JAVA IMPLEMENTATION OF MERGE SORT
 * --------------------------------------------
 * 				MAYANK & GROUP
 *        -------------------------
 *        
 *        
 *        MERGE SORT FOLLOWS THE DIVIDE &
 *        CONQUER STRATEGY. 
 *        
 *        TIME COMPLEXITIES :
 *        
 *        DIVIDE : log n
 *        CONQUER : n
 *        
 *        TOTAL = O(n.log n) 
 * 			
 */

public class MergeSort {
	
	public static void divide(int a[], int startIndex, int endIndex) {
		
		// check for single element
		if(startIndex >= endIndex)
			return;
		
		int mid = startIndex + (endIndex - startIndex)/2;
		divide(a, startIndex, mid);
		divide(a, mid+1, endIndex);
		conquer(a, startIndex, mid, endIndex);
	}
	
	public static void conquer(int a[], int startIndex, int mid , int endIndex) {
		
		int merged[] = new int[endIndex - startIndex + 1];
		
		int idx1 = startIndex; // tracks subarray 1
		int idx2 = mid+1; // tracks subarray 2
		int x = 0; // tracks merged array
		
		while(idx1 <= mid && idx2 <= endIndex) {
			if(a[idx1] <= a[idx2])
				merged[x++] = a[idx1++];
			else
				merged[x++] = a[idx2++];
		}
		
		// in case elements are remaining in either of the arrays, include them
		// subarray 1
		while(idx1 <= mid)
			merged[x++] = a[idx1++];
		
		// subarray 2
		while(idx2 <= endIndex)
			merged[x++] = a[idx2++];
		
		// copying the merged array in main array
		for(int i=0, j=startIndex; i<merged.length; i++, j++) {
			a[j] = merged[i];
		}
	}
	
	public static void main(String []args) {
		
		int a[] = {7,4,9,5,3,8};
		int n = a.length;
		
		divide(a, 0, n-1);
		
		System.out.print("\t { ");
		for(int i=0; i<n-1; i++)
			System.out.print(a[i]+ ", ");
		System.out.println(a[n-1] + " }");
	}

}
