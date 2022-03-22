import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę:");
    int num1 = scanner.nextInt();
    long x = num1 % 10;
    
    System.out.println(x);
  }
}