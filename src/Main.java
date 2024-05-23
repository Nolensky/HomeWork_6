public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            for (int i = 1; i <= 10; i++) {
                System.out.println("i = " + i);
            }
        }
        {
            System.out.println("Задача 2");
            for(int i = 10; i >0; i--){
                System.out.println("i = "+i);
            }
        }
        {
            System.out.println("Задача 3");//Задача 3
            for (int i = 0; i <= 17; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("");
        {
            System.out.println("Задача 4");
            for(int i = 10; i >= -10; i--){
                System.out.print(i +" ");
            }
        }
        System.out.println("");
        {
            System.out.println("Задача 5");
            for(int i = 1904; i <=2096; i++){
                if((i % 4 ==0 && i % 100 !=0) || i %400==0){
                    System.out.println(i +" год является високосным");
                }
            }
        }
        {
            System.out.println("Задача 6");
            for(int i = 7; i <= 98; i += 7){
                System.out.print(i +" ");}
        }
        System.out.println("");
        {
            System.out.println("Задача 7");
            for(int i = 1; i <= 512; i =i * 2){
                System.out.print(i +" ");
            }
        }
        {
            System.out.println("Задача 8");
            int sumAccumulation = 0;
            for(int i = 1; i <= 12; i++){
                sumAccumulation =sumAccumulation +29000;
                System.out.println("Месяц " + i +" сумма накоплений равна " + sumAccumulation+" рубллей");
            }
        }
        {
            System.out.println("Задача 9");
            double sumAccumulation = 0;
            double percentMonth = 0.01;
            for(int i = 1; i <=12; i++){
                sumAccumulation =sumAccumulation +29000;
                double percentPerSumAccumulation = sumAccumulation * percentMonth;
                double total = sumAccumulation + percentPerSumAccumulation;
                System.out.println("Месяц "+i +" сумма накоплений равна "+total+" рубллей");
            }
        }
        {
            System.out.println("Задача 10");
            for(int i = 1; i< 11; i++){
                int result = 2 * i;
                System.out.println(2 + " * " + i + " = " + result);
            }
        }

    }
}