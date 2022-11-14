package lesson_6;

public class lesson_6 {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(1,86);
        CreditCard card2 = new CreditCard(2,64);
        CreditCard card3 = new CreditCard(3,59);
        System.out.println(card.toString());
        System.out.println(card2);
        System.out.println(card3);
        System.out.println();
        card.addSum(2);
        card2.addSum(4);
        card3.reduceSum(3);
        card.printInformation();
        card2.printInformation();
        card3.printInformation();
    }
}
