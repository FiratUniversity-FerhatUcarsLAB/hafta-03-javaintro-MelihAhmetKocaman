public class gorev3 {
    public static void main(String[] args) {

        double cap = 5.5;
        double pi = 3.14159;
        double daireninalan = pi * (cap * cap);
        double dairenincevre = pi * 2 *cap;
        System.out.println("Dairenin alanı =" + daireninalan);
        System.out.println("Dairenin çevresi =" + dairenincevre);
        System.out.println(" ");

        double en = 4.5;
        double boy = 7.9;
        double dikdortgeninalan = en * boy;
        double dikdortgenincevre = (en + boy)*2;
        System.out.println("Dikdörgenin alanı= En x Boy = " + dikdortgeninalan);
        System.out.println("Dikdörtgenin çevresi= 2xEn + 2xBoy= " + dikdortgenincevre);
        System.out.println(" ");


        int a_kenari = 3;
        int b_kenari = 4;
        int c_kenari = 5;
        int s = (a_kenari + b_kenari + c_kenari) / 2;
        int ucgenalan = (s*(s-a_kenari)*(s-b_kenari)*(s-c_kenari))^(1/2);
        System.out.println("Üçgenin alanı=" + ucgenalan);



    }
}