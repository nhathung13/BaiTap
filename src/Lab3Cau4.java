import java.util.Scanner;

public class Lab3Cau4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
        else
            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
    }}
