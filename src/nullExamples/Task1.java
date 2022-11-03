package nullExamples;

import java.util.*;

public class Task1 {

    private List<Integer> database = new LinkedList<>();
    private Map<Integer, String> menu = new HashMap<>();
    private boolean endFlag = true;

    public static void main(String[] args) {
        Task1 task1 = new Task1();

        task1.database.add(task1.getNumberFromConsole());
        task1.database.add(task1.getNumberFromConsole());
        task1.database.add(task1.getNumberFromConsole());

        task1.generateMenu();

        do {
            task1.controllerOfProgram();
        } while (task1.endFlag);
    }

    public void showMenu() {
        for (int i = 1; i < menu.size() + 1; i++) {
            System.out.println(i + ". " + menu.get(i));
        }
    }

    /*
    public void showMenu2(){
        menu.forEach((k,v) -> System.out.println(k + ". " + v));
    }
    */

    public void controllerOfProgram() {
        showMenu();
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 1: {
                int newNumber = getNumberFromConsole();
                database.add(newNumber);
                break;
            }
            case 2: {
                int removedNumber = getNumberFromConsole();
                deleteNumberFromDB(removedNumber);
                showDatabaseEntries();
                break;
            }
            case 3: {
                showDatabaseEntries();
                break;
            }
            case 6: {
                endFlag = false;
            }

        }
    }

    public void deleteNumberFromDB(int number) {
        database.remove(Integer.valueOf(number));
    }

    public void showDatabaseEntries() {
        for (Integer number : database) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public int getMenuPoint() {
        System.out.print("Введите пункт меню: ");
        return new Scanner(System.in).nextInt();
    }

    public int getNumberFromConsole() {
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public void generateMenu() {
        menu.put(1, "Добавить элемент в список.");
        menu.put(2, "Удалить элемент из списка.");
        menu.put(3, "Показать содержимое списка.");
        menu.put(4, "Проверить есть ли значение в списке.");
        menu.put(5, "Заменить значение в списке.");
        menu.put(6, "Выход");
    }
}
