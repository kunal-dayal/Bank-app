public interface BankInterface {
    double checkbalance();
    String addmonet(int amount);
    String withdrawlmoney(int amt,String password);
    double calculateinterest(int years);
}
