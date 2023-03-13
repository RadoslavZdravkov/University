import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        command = scanner.nextLine();
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShape(command).calculateArea();
    }
}