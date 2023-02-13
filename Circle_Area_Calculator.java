import java.util.Scanner;
/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */

public class Circle_Area_Calculator {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz:");
        int r = input.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsünü giriniz:");
        int c = input.nextInt();
        double Alan = pi*r*r;
        double cevre= 2*pi*r;
        double dilim = (pi*(r*r)*c)/360;
        System.out.println("Dairenin Alanı:"+Alan);
        System.out.println("Dairenin Çevresi:"+cevre);
        System.out.println("Daire diliminin alanı:"+dilim);
    }
}
