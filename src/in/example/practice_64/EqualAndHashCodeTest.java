package in.example.practice_64;

public class EqualAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Adi" , 25 , 50000);
        Person person2 = new Person("Adi" , 25 , 50000);

//        if (person1 == person2){  // == campare only adress of reference .
//            System.out.println("Equals :");
//        } else {
//            System.out.println("Not Equals :");
//        }

        // .equals method still compare address because of its Object class methods .
        // if you want to compare values then you should override equals methods.
        if (person1.equals(person2)){
            System.out.println("Equals :");
        } else {
            System.out.println("Not Equals :");
        }
    }
}
