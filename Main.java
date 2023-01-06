import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập một chuỗi bất kì :");
        int count=0;
        String s =sc.nextLine();
        System.out.println("Hãy nhập vào một kí tự ");
        char c = sc.next().charAt(0);
        for(char element :s.toCharArray())
        {
            if(element==c)
                count++;
        }
        System.out.println("Số lần xuất hiện của "+c+ " "+"trong chuỗi là :" +count);

    }
}