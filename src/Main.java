import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter: I love java 8 Я люблю java 14 core1");
        String check1 = input.nextLine();
        String check2=check1.replaceAll("[0-9а-яА-Я]","" );
        System.out.println(check2);
        String []wordAray=check2.trim().split("\\s+");
        int wordCount = wordAray.length;
        System.out.println("Word count is ="+wordCount);

    }


}
