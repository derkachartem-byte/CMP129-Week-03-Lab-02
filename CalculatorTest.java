public class CalculatorTest {
    public static void main(String[] args){
        Calculator math = new Calculator();
        int first = math.add(17, 13);
        double second = math.add(6.13, 13.25);
        int third = math.add(50, 5, 1);
        String fourth = math.add("Darth", "Vader");
        System.out.println("Testing the Int add Method: " + first);
        System.out.println("Testing the Double add Method: " + second);
        System.out.println("Testing the triple Int add Method: " + third);
        System.out.println("Testing the String add Method: " + fourth);
    }
}
