public class Main {
    public static void main(String[] args) {
        String w=" ";
        //Циклы.Часть 2
        System.out.println("Задание 1");
        int limit = 2_459_000;
        int saveSum =15_000;
        int mySaveSum=0;
        int month=0;

        while (mySaveSum<=limit){
            mySaveSum=mySaveSum+saveSum;
            month++;
            System.out.println("Месяц"+w+month+w+"сумма накоплений равна"+w+mySaveSum+w+"рублей");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        int x =0;
        while(x<10){
            x++;
            System.out.print(x+w);
        }
        System.out.println();
        for (;x>0;x--){
            System.out.print(x+w);
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population=12_000_000;
        int fertility=17*(population/1000);
        int mortality=8*(population/1000);
        for (int i=0;i<=10;i++){
            if (i>0){ // что бы не отображать базовый год
                population = population + fertility - mortality;
                System.out.println("Через"+w+i+w+"год численность населения составляет" + w + population);
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        int limit2 = 12_000_000;
        int saveSum2 =15_000;
        int mySaveSum2=0;
        int month2=0;
        double persentInMonth = 0.07;//уж не знаю в какой стране 7% в Месяц бывают депозиты...=))
        while (mySaveSum2<limit2){
            mySaveSum2= (int) ( mySaveSum2+(mySaveSum2*persentInMonth));
            mySaveSum2=mySaveSum2+saveSum2;
            System.out.println("Месяц"+w+month2+w+"сумма накоплений равна"+w+mySaveSum2+w+"рублей");
            month2++;
        }
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");

        int limit3 = 12_000_000;
        int saveSum3 =15_000;
        int mySaveSum3=0;
        int month3=0;
        while (mySaveSum3<limit3){
            mySaveSum3= (int) ( mySaveSum3+(mySaveSum3*persentInMonth));
            mySaveSum3=mySaveSum3+saveSum3;
            month3++;
            if(month3%6==0)System.out.println("Месяц"+w+month3+w+"сумма накоплений равна"+w+mySaveSum3+w+"рублей");
        }
        System.out.println();

        //Задание 6
        System.out.println("Задание 6");
        int depositTimeInMonth = 9*12;
        int saveSum4 =15_000;
        int mySaveSum4=0;
        int month4=0;
        double year = 12;
        while (month4<depositTimeInMonth){
            mySaveSum4= (int) ( mySaveSum4+(mySaveSum4*persentInMonth));
            mySaveSum4=mySaveSum4+saveSum4;
            month4++;
            if(month4%6==0)System.out.println("Спустя"+w+month4/year+w+"лет сумма накоплений равна"+w+mySaveSum4+w+"рублей");
        }//за счет таких не реальных процентов получается супер выгодный депозит и оч. большая сумма
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        int friday = 5;
        int day =1;
        while (day<31){
            day++;
            if (day%friday==0) System.out.println("Сегодня пятница,"+w+day+"-е число. Необходимо подготовить отчет!");
        }
        System.out.println();

        //Задание 8
        System.out.println("Задание 8");
        int comet=79;
        int thisYears=2022;
        for (int i=0;i<thisYears+100;i++){
            if (i%comet==0&&i>thisYears-200) System.out.println(i); //Это было КРУТО!!!=))
        }

    }
}