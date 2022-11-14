package lesson_6;

import java.beans.JavaBean;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму. Добавьте метод, который выводит текущую информацию о карточке.
(переопределить toString(), пример:
Номер счёта : <сумма>
Количество денег на счету : <цифра>
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCard {
    int accNumber;
    int sum;
    public void addSum(int number){ //увеличение(пополнение суммы)
        sum += number;

    }
    public void reduceSum(int number){ //снятие с карты (уменьшение)
        sum -= number;
    }
    public void printInformation(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Номер счета: " + accNumber + "\nКол-во денег на счету: " + sum;
    }
    public CreditCard(int accNumber, int sum) {
       this.accNumber = accNumber;
       this.sum = sum;
    }
    public CreditCard(int accNumber){
        this.accNumber = accNumber;
    }
}
