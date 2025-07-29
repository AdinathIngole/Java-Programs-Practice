 class StudentClass {
    String name;
    int age;
    String address;

     public StudentClass(String name ,int age , String address) {
         this.name = name;
         this.age = age ;
         this.address = address;
     }

     @Override
     public String toString() {
         return "StudentClass{ " +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", address='" + address + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         StudentClass st = new StudentClass("Adi" , 25 , "Pune");
         System.out.println(st);
     }
 }
