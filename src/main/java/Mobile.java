import java.util.Scanner;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public String call(String inputMsg) {
        String result = "Message : " + inputMsg;
        System.out.println(result);
        return result;
    }

}