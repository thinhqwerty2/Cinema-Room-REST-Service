import java.util.Scanner;

record Person(String name, int age, String gender) {
  //don't change this record
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.next(), scanner.nextInt(), scanner.next());

        // your code goes here
        System.out.printf("%s is %d years old and is %s",person.name(),person.age(),person.gender());
    }
}