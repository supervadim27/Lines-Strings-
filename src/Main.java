public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание №1");
        task1();
        System.out.println();
        System.out.println("Задание №2");
        task2();
        System.out.println();
        System.out.println("Задание №3");
        task3();
    }
    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        String startPhrase = "Ф.И.О. сотрудника - ";
        System.out.println(startPhrase+fullName);
    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String startPhrase = "Данные Ф.И.О. сотрудника для заполнения отчета - ";
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println(startPhrase+fullNameToUpperCase);

        //Решение №2 (покороче. не знаю какое лучше, подскажите, пожалуйста)
        String fullName2 = "Ivanov Ivan Ivanovich";
        String startPhrase2 = "Данные Ф.И.О. сотрудника для заполнения отчета - ";
        System.out.println(startPhrase2+fullName2.toUpperCase());

        //Решение №3 (еще покороче. не знаю какое лучше, подскажите, пожалуйста)
        String fullName3 = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "+fullName3.toUpperCase());
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - "+fullName.replace('ё', 'е'));
    }
}