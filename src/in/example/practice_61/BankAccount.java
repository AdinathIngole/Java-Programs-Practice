package in.example.practice_61;

 class BankAccount {
     private String accNo;
     private String accHolderName;
     private double accBalance;

     public BankAccount(String accNo, String accHolderName) {
         this.accNo = accNo;
         this.accHolderName = accHolderName;
     }

     public double depositeMoney (double money){
         if (money <=0){
             System.out.println("Invalid Amount.");
         }
         accBalance +=money;
         System.out.println("Deposit Successfully acc balance is : "+accBalance);
         return accBalance;
     }

     public double withdrawMoney(double money){
         if (money <=0){
             System.out.println("Please Enter Valid Amount.");
         }else if (accBalance >=money){
             accBalance -= money;
             System.out.println("Debited Amt : "+money);
         }  else {
             money = accBalance;
             accBalance = 0;
             System.out.println("Debited Amt : "+money);
         }
         return accBalance;
     }
}
