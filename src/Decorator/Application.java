package Decorator;

import java.io.BufferedReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nicName = in.nextLine();

        InputText inputText = new InputText(nicName);
        System.out.println(inputText.toStringLine());

        LabelDecorator labelDecorator = new LabelDecorator(inputText);
        System.out.println(labelDecorator.toStringLine());

        ErrorDecorator errorDecorator = new ErrorDecorator(inputText);
        errorDecorator.setError("ERROR 404");
        System.out.println("___________________");
        System.out.println(errorDecorator.toStringLine());
    }
}
