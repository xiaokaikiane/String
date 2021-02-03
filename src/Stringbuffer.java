import java.util.Scanner;

public class Stringbuffer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int k=  scanner.nextInt();
//        System.out.println(k);
        String f=scanner.nextLine();
        System.out.println(f);
        String s=scanner.nextLine();
//        double d=scanner.nextDouble();
//        System.out.println(d);
        StringBuffer res=new StringBuffer();
        StringBuilder res1=new StringBuilder();
//        res.append(k);
//        res.append(f);
        res1.insert(0,f);
        res1.insert(2,s);
//        res.append(d);
        System.out.println(res1);
    }
}
