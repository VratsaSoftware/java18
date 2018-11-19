public class BankAccountTask {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String secondName = "Ivanov";
        String familyName = "Georgiev";
        float accountBalance = 23456.24f;
        //     or int/long if balance value is integer
//     int accountBalance = 23456; -> example
//     long accountBalance = 245663145566l; -> example
        String bankName = "BNBG";
        String iban = "BG80BNBG96611020345678";
        String bic = "BNBGBG";
        String cardNumber = "0000 1111 2222 3333";

        System.out.println("First name: " + firstName
                + " Second name: " + secondName
                + " Family name: " + familyName);
        System.out.println("Balance: " + accountBalance
                + " Bank name: " + bankName + " IBAN: " + iban
                + " BIC: " + bic);
        System.out.println("Card number: " + cardNumber);

    }
}
