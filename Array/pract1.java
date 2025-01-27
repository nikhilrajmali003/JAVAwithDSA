
import java.util.Scanner;

// how to insert and delete the element in array
public class pract1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a item and postion of element :- ");
        int i1=x.nextInt();
        int p1=x.nextInt();
        int l=a.length-1;
        for(int i=a.length-1;i>=i1;i--){
            a[i+1]=a[i];
        }
        a[p1-1]=i1;
        l=l+1;
        for(int i=0;i<l;i++){
            System.out.println(a[i]+"");
        }

        System.out.print("Ente postion of element you want to delete :- ");
        int p2=x.nextInt();
        for(int i=p2;i<=a.length-1;i++)
        {
            a[i-1]=a[i];
        }
        int l2=a.length-1;
        for(int i=0;i<l2;i++)
        System.out.println(a[i]+" ");

    }
}
