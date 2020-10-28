
public class Account extends AbstractBankAccount {

  private int bonusValue;

  Account(String name, int num, int amt) {
    super(name, num, amt + calculateInitialBonusValue(amt));
  }

  private static int calculateInitialBonusValue(int amt) {
    if (amt >= 1 && amt <= 100) {
      return 10;
    } else if (amt <= 300) {
      return 20;
    } else {
      return 30;
    }//endif
  }//end method calculateInitialBonusValue

  //print method
  public void print() {
    System.out.println("\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance);
  }//end method print
}
