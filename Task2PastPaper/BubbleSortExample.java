
public class BubbleSortExample {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  

            }  
        }  

    }  

    public static void bubbleSortChar (char[] arr2)
    {
        int m = arr2.length;
        char temp = ' ';

        for(int i=0; i < m; i++){  
            for(int j=1; j < (m-i); j++){  
                if(arr2[j-1] > arr2[j]){  
                    //swap elements  
                    temp = arr2[j-1];  
                    arr2[j-1] = arr2[j];  
                    arr2[j] = temp;  
                }  

            }  
        }  

        
        
    }

    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
        char arr2[]= {'F','A','Z','C','H'};
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  

        bubbleSort(arr);//sorting array elements using bubble sort  
        bubbleSortChar(arr2);
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        for(int i=0; i < arr2.length; i++){  
            System.out.print(arr2[i] + " ");  
        }  

    }  
}  