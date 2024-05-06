package main.java.org.example;



import main.java.org.example.model.Trader;
import main.java.org.example.model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


//        #1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
//        transactions.stream()
//                .filter(transaction -> transaction.getYear()==2011)
//                .map(Transaction::getValue)
//                .sorted()
//                .forEach(System.out::println);

//        #2. Вывести список неповторяющихся городов, в которых работают трейдеры.
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getCity)
//                .distinct()
//                .forEach(System.out::println);

//        #3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(trader -> "Cambridge".equalsIgnoreCase(trader.getCity()))
//                .sorted(Comparator.comparing(trader -> trader.getName()))
//                .distinct()
//                .forEach(System.out::println);

//        #4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
//        String nameSorted = transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getName)
//                .sorted()
//                .distinct()
//                .collect(Collectors.joining(", "));
//        System.out.println("Имена трейдеров в алфовитном порядке: \n" + nameSorted);

//        #5. Выяснить, существует ли хоть один трейдер из Милана.
//        String city = "Milan";
//        boolean ofMilan = (transactions.stream()
//                .anyMatch(transaction -> city.equalsIgnoreCase(transaction.getTrader().getCity())));
//        System.out.println(ofMilan?"Есть хотя бы один трейдер из Милана":"нет ни одного трейдера из Милана");

//        6. Вывести суммы всех транзакций трейдеров из Кембриджа
//        transactions.stream()
//                .filter(transaction -> "Cambridge".equalsIgnoreCase(transaction.getTrader().getCity()))
//                .forEach(x -> System.out.printf("%s трейдер из %s. Сумма его транзакций: %s\n",
//                        x.getTrader().getName(),x.getTrader().getCity(),x.getValue()));


//        7. Какова максимальная сумма среди всех транзакций?
        OptionalInt maxTransaction = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max();
        System.out.println("Максимальная сумма транзакций: " + maxTransaction.getAsInt());

//        8. Найти транзакцию с минимальной суммой.
        OptionalInt minTransaction = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min();
        System.out.println("Максимальная сумма транзакций: " + minTransaction.getAsInt());
    }
}
