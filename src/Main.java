import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    /* ЗАДАЧА 1
    Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
    */

    public static void task1() {
        System.out.println("ЗАДАЧА №1");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

    }

    /* ЗАДАЧА 2
     *Также бухгалтерия попросила найти минимальную и максимальную трату за день.
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
     * «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
     */

    public static void task2() {
        System.out.println("ЗАДАЧА №2");

        int[] arr = generateRandomArray();
        int minCost = arr[0];
        int maxCost = arr[0];

        for (int current : arr) {
            if (current < minCost) {
                minCost = current;
            }
            if (current > maxCost) {
                maxCost = current;
            }
        }

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println("Минимальная сумма трат задень составила " + minCost + " рублей");
        System.out.println("Максимальная сумма трат задень составила " + maxCost + " рублей");
        System.out.println();

    }

    /* ЗАДАЧА 3
     * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
     * Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
     * и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
     */

    public static void task3() {
        System.out.println("ЗАДАЧА №3");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int element : arr) sum += element;
        double averageCost = sum / arr.length;

//        System.out.println(sum);

        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
        System.out.println();

    }

    /* ЗАДАЧА 4
     *В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
     * Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
     * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     */

    public static void task4() {
        System.out.println("ЗАДАЧА №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrayL = reverseFullName.length;
        char c;

        for (int i = 0; i <= (arrayL - 1) / 2; i++)
            {
                c = reverseFullName[i];
                reverseFullName[i] = reverseFullName[arrayL - 1 - i];
                reverseFullName[arrayL - 1 - i] = c;
            }

        for (char j: reverseFullName) {
            System.out.print(j);
        }
        System.out.println();

    }


}