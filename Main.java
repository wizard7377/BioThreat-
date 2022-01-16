import java.util.Scanner;

class Main {
  // hi wizard
  static String clrCode = "\033[H\033[2J";

  // static

  static Human human = new Human("bob");

  static Terminal terminal = new Terminal(human);

  static Virus ebola = new Ebola();

  public static void main(String[] args) {
    // i am just gonna work on the simple ui
    System.out.println(clrCode);

    human.addVirus(ebola);

    terminal.run();

  }
}