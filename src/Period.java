import java.util.Scanner;

public class Period {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Введите начало 1 события (yyyy-mm-dd)");
         String dateBeg1 = in.nextLine();
        if(dateBeg1.isEmpty())  //если строка пустая
            dateBeg1="0000-00-00 (-бесконечность)";//маленькое число

        System.out.println("Введите конец 1 события  (yyyy-mm-dd)");
        String dateFin1 = in.nextLine();
        if(dateFin1.isEmpty())
            dateFin1="9999-99-99 (+бесконечность)";//большре число

        System.out.println("Введите начало 2 события  (yyyy-mm-dd)");
        String dateBeg2 = in.nextLine();
        if(dateBeg2.isEmpty())
            dateBeg2="0000-00-00 (-бесконечность)";

        System.out.println("Введите конец 2 события  (yyyy-mm-dd)");
        String dateFin2 = in.nextLine();
        if(dateFin2.isEmpty())
            dateFin2="9999-99-99 (+бесконечность)";


        if(dateFin2.compareTo(dateFin1)>=0){  //если конец 2 периода >= концу 1 периода
            if(dateBeg2.compareTo(dateFin1)>=0) {//если начало 2 периода >= концу 1 периода
                System.out.println("Пересечений нет");
            }
            else
                System.out.println("Пересечения есть: "+dateBeg2+" -- "+dateFin1);
        }
        else {
            if (dateFin2.compareTo(dateBeg1)<=0)//если конец 2 периода <= началу 1 периода
                System.out.println("Пересечений нет");
            else
                System.out.println("Пересечения есть: "+dateBeg1+" -- "+dateFin2);
        }
    }
}
