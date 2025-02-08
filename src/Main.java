public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возвраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //задача 2
        System.out.println("задача 2");
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }
        // задача 3
        System.out.println("задача 3");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }
        // задача 4
        System.out.println("задача 4");
        int ageHuman = 27;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в детский сад.");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека ревен " + ageHuman + ", то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в университет.");
        }
        if ( ageHuman > 24) {
            System.out.println("Если возвраст человека равен " + ageHuman + " , то ему пора ходить на работу.");
        }
        // задача 5
        System.out.println("задача 5");
        int ageChildren = 15;
        if (ageChildren < 5) {
            System.out.println("Если возраст равен " + ageChildren + " нельзя кататься на аттракционе");
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст равен " + ageChildren + " можно кататься в сопровождении взрослого");
        }
        if (ageChildren > 14) {
            System.out.println("Если возрат равен " + ageChildren + " можно кататься без сопровождения взрослого");
        }
        // задача 6
        System.out.println("задача 6");
        int willingPeople = 61;
        if (willingPeople <= 60) {
            System.out.println("В вагоне есть только сидячие места");
        }
        if (willingPeople > 60 && willingPeople <= 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }
        //задача 7
        System.out.println("задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " меньше числа " + two + " и меньше числа " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + "  больше " + one + " , но меньше числа " + three);
        } else {
            System.out.println("Число " + three + " больше числа " + one + " и числа " + two);
        }


    }
}