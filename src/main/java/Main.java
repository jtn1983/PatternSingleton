import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int bound = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> source = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++){
            source.add(new Random().nextInt(bound));
        }
        System.out.println("Вот случайный список:");
        printList(source);
        logger.log("Просим пользователя ввести входные данные для филтрации");
        System.out.println("Введите порог для фильтра:");
        int treshold = scanner.nextInt();
        logger.log("Запиускаем филтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(source);
        System.out.println("Вот отфитльтрованный список");
        printList(result);
        logger.log("Завершаем работу программы");
    }

    public static void printList(List<Integer> list) {
        list.forEach(num -> System.out.print(num + " "));
        System.out.println(System.lineSeparator());
    }
}
