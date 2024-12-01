public class Main {
    public static void main(String[] args) {
        System.out.println("\nДЗ \"Переменные\" \n");

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper + "\n");

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper + "\n");

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper + "\n");

        //Задача 4
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 3;
        System.out.println("friend = " + friend  + "\n");

        //Задача 5
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog  + "\n");

        //Задача 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Задача 6");
        System.out.println("Общая масса двух бойцов " + (boxerWeight1 + boxerWeight2) + " кг");
        if (boxerWeight1 > boxerWeight2) {
            System.out.println("Разница между массами бойцов составляет " + (boxerWeight1 - boxerWeight2) + " кг\n");
        }
        else{
            System.out.println("Разница между массами бойцов составляет " + (boxerWeight2 - boxerWeight1) + " кг\n");
        }

        //Задача 7
        System.out.println("Задача 7");
        if (boxerWeight1 > boxerWeight2) {
            System.out.println("Остаток от деления между двумя весами бойцов составляет " + (boxerWeight1 % boxerWeight2) + " кг\n");
        }
        else{
            System.out.println("Остаток от деления между двумя весами бойцов составляет " + (boxerWeight2 % boxerWeight1) + " кг\n");
        }
    }
}