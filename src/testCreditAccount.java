class TestCreditAccount {

  public static void main(String[] args) {
// Instantiate 3 accounts using constructor with values
    Account a1 = new Account("Sanjay Gupta", 11556, 300);
    Account a2 = new Account("He Xai", 22338, 500);
    Account a3 = new Account("Ilya Mustafana", 44559, 1000);
// Instantiate 2 credit accounts using constructor with
// values which will call constructor from super
    CreditAccount c1 = new CreditAccount("A.N Other", 88776, 500);
    CreditAccount c2 = new CreditAccount("Another", 66778, 1000, 500);
// Print accounts
    System.out.println(a1);
    //a2.print();
    System.out.println(a2);
    //a3.print();
    System.out.println(a3);
    //c1.print();
    System.out.println(c1);
    //c2.print();
    System.out.println(c2);
  }//end method main
}//end class testCreditAccount