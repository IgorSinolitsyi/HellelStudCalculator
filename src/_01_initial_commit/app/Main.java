package _01_initial_commit.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // System.out.println("My git app.");
        Scanner input = new Scanner(System.in);
        System.out.println("My git app. is: ...? ");
        System.out.print("Write the name:" );
        String name = input.nextLine();
        System.out.println("My git app. is: "+name);
        input.close();

    }
}
