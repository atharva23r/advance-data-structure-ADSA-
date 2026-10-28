import java.util.Scanner;

public class sortingarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements"  );
        int n=sc.nextInt();
        int [] arr= new int[n];
        
        System.out.println("enter the elements in array");
        for(int i=0;i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("display the array");
        for(int i=0;i<n ; i++){
            System.out.print(arr[i]+ " ");
        }



    }
}
