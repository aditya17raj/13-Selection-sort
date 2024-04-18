import java.util.Scanner;

class selection
{

    int arr[] = new int[5];

    void createArray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("enter elements in array");
            arr[i]=sc.nextInt();
        }

    }

    void sort()
    {
        for(int i=0; i<5-1; i++)
        {
            for(int j=i+1; j<5; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void showArray()
    {
        for(int i=0; i<5; i++)
            System.out.print(" "+arr[i]);
    }
}

public class Main {
  public static void main(String[] args) {
    selection ss = new selection();
    ss.createArray();
    System.out.println("Before Sorting");
    ss.showArray();
    System.out.println(\n + "After sorting");
    ss.sort();
    ss.showArray();
  }

}