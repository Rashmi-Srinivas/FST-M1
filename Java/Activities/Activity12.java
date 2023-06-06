package Activities;

public class Activity12 {
    public static void main(String[] args){
        Addable ad1, ad2;
        ad1 = (num1, num2) -> num1 + num2;
        System.out.println("Result of lambda expression having no body is "+ad1.add(20,40));
        ad2 = (num1, num2) -> {
            return num1 + num2;
        };
        System.out.println("Result of lambda expression having body is "+ad2.add(50,40));
    }
}
