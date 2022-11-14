package lesson_6;

public class lesson_6 {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(1,2);
        CreditCard card2 = new CreditCard(10,6);
        CreditCard card3 = new CreditCard(5,8);
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
