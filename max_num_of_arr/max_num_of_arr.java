import java.util.Scanner;
public class max_num_of_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int []arr=new int[n];
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=input.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
