package in.example.practice_68;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    //method overloading apply here
    
    public int add(int num1, int num2 ,int num3){
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(5,10));
        System.out.println(cal.add(5,15,10));
        System.out.println(cal.add(5.5,10.2));
    }
}
