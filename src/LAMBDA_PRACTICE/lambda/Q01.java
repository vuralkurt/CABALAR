package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {
//        2) "Q01" olarak adlandırılan bir class oluşturun
//        3) 5 String öğesi içeren bir String listo luşturun.
//        4) 3 tanesi "A" harfi ile başlayacak
//        5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
//        5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.

    public static void main(String[] args) {
        List<String>list = new ArrayList<String>(Arrays.asList("Ayse","Hasan","Ademi","Enes","Arif" ));
        a1(list);

    }

    public static void yazdir(String t) {
        System.out.println(t+" ");
    }


    public static void a1(List<String> list){

        list.stream().filter(t->t.startsWith("A") & t.length()<5).forEach(Q01::yazdir);

    }

}
