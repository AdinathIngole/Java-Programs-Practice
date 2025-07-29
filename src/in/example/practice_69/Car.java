package in.example.practice_69;

public class Car extends Vehicle{

    // here is 1st parent class service method is invoked
    @Override
    public void service() {
        super.service();
        System.out.println("Cars Service called...");
    }
}
