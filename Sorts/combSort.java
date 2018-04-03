/**
 *
 * @author Paul Parisot (https://github.com/tosirap)
 *
 */

public class combSort{
	  /**
     * This method implements the Generic comb Sort
     *
     * @param arr The array to be sorted
     * @param n The count of total number of elements in array
     * Sorts the array in increasing order
     **/


	public static <T extends Comparable<T>> void CS(T[] arr, int n) {
		int intervalle = n; //initialisation of intervalle
        boolean echange = true; //initialisation at true;

        while(intervalle>1 || echange==true){
        	intervalle =(int)(intervalle/1.3);
        	if(intervalle<1){
        		intervalle=1;
        	}

        	int i=0;
        	echange= false;

        	while(i<(n-intervalle)){
        		if(arr[i].compareTo(arr[i+intervalle])>0){
        			T temp = arr[i];
        			arr[i]=arr[i+intervalle];
        			arr[i+intervalle]=temp;
        			echange=true;
        		}
        		i++;
        	}
        }
    }

    public static void main(String[] args) {

        // Integer Input
        int[] arr1 = {4,23,6,78,1,54,231,9,12};
        int n = arr1.length;

        Integer[] array = new Integer[n];
        for (int i=0;i<n;i++) {
            array[i] = arr1[i];
        }

        CS(array, n);

        // Output => 1	  4	 6	9	12	23	54	78	231
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+"\t");
        }

        System.out.println();

        // String Input
        String[] array1 = {"c", "a", "e", "b","d"};
        n = array1.length;

        CS(array1, n);

        //Output => a	b	 c  d	e
        for(int i=0; i<n; i++)
        {
            System.out.print(array1[i]+"\t");
        }
    }
}
