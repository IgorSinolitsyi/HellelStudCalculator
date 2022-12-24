package _05_merge_conflicts.master_02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super app!");

        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
