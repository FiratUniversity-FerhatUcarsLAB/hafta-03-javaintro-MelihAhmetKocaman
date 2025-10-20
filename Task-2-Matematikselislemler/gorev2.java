public class gorev2{
    public static void main(String[] args){
        int toplam =  1+2+3+4+5+6+7+8+9;
        System.out.println(" 1+2+3+4+5+6+7+8+9 = " + toplam);
        System.out.println(" ");

        double pay = (9.5*4.5) - (2.5*3);
        double payda = 45.5 - 3.5;
        double sonuc = pay/payda;
        System.out.println("((9.5*4.5) − (2.5*3))/(45.5 − 3.5)="+ sonuc);
        System.out.printf("%.4f", sonuc);

        System.out.println(" ");
        int faktoriyel = 5*4*3*2*1;
        int adim1 = 1*2;
        int adim2 = 2*3;
        int adim3 = 6*4;
        System.out.println("5! faktöriyelini bulmak için;");
        System.out.println("1.Adım: 1x2= " + adim1 );
        System.out.println("2.Adım: 2x3= " + adim2 );
        System.out.println("3.Adım: 6x4= " + adim3 );
        System.out.println("4.Adım: 24x5= " + faktoriyel );
        System.out.println("5!= " + faktoriyel );


    }

}