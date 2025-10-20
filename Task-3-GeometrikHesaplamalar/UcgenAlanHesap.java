
public class gorev3_3{
  public static void main(String[] args){

  int a_kenari = 3;
  int b_kenari = 4;
  int c_kenari = 5;
  int s = (a_kenari + b_kenari + c_kenari) / 2;
  int ucgenalan = (s*(s-a_kenari)*(s-b_kenari)*(s-c_kenari))^(1/2);
  System.out.println("Üçgenin alanı=" + ucgenalan);

  }
}
