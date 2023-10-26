import java.util.*;
import java.util.Arrays;  // this is for use sorting of arrays (inbuilt Sort) complexity is (nlogn)
import java.util.Collections;

public class sorting {

    public static void bubbleSort(int arr[]){    // optimize code if array has already sorted or unsorted
        int n = arr.length;
        boolean swapped;

        for(int turn = 0; turn < n-1; turn++){
            swapped =  false;

            for(int j = 0; j<n-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
         }
    }

    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    } 


    public static void selectionSort(int arr[]){
        for(int i = 0; i< arr.length-1; i++){
               int minPosition = i;
            for(int j = i+1; j< arr.length ; j++){
                 if(arr[minPosition] > arr[j]){   // for descending order use < sign
                    minPosition = j;
                 }
            }
            // swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;

        }
    }


    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){  // for descinding order use < sign
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }



    public static void main(String args[]){
        // this array is a object of integer class
        Integer arr[] = {4,7,1,3,9,8};
        
        // insertionSort(arr);
        //Arrays.sort(arr);

        /*  if u want to sort till index 2 ,then write 
            till index 3  (here ending index is non inclusive) */

        //Arrays.sort(arr , 0 , 3); 
        // reverse order function always work on object
        //Arrays.sort(arr, Collections.reverseOrder()); 
        Arrays.sort(arr, 0 , 4, Collections.reverseOrder());
        printArr(arr);


    }
    
}
