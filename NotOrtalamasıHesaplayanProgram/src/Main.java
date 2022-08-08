import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;
        int average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mat grade: ");
        int mat_grade = scanner.nextInt();

        System.out.println("Enter fizik grade: ");
        int fizik_grade = scanner.nextInt();

        System.out.println("Enter kimya grade: ");
        int kimya_grade = scanner.nextInt();

        System.out.println("Enter turkce grade: ");
        int turkce_grade = scanner.nextInt();

        System.out.println("Enter tarih grade: ");
        int tarih_grade = scanner.nextInt();

        System.out.println("Enter muzik grade: ");
        int muzik_grade = scanner.nextInt();

        average = (mat_grade + fizik_grade + kimya_grade + turkce_grade + tarih_grade + muzik_grade) / 6;
        String result = average > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(result);


    }
}
