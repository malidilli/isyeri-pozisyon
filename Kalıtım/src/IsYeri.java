public class IsYeri {
  public static void mesaiBasla(Calisan[] c ) {
      for (int i = 0 ; i < c.length ; i++) {
        c[i].calis(); // !Dikkat!
      }
  }
  public static void main(String args[]) {
        Calisan[] c = new Calisan[4];
        c[0] = new Calisan(); // yukarı cevirim gerekmiyor
        c[1] = new Programci(); // yukarı cevirim (upcasting)
        c[2] = new Pazarlamaci(); // yukarı cevirim (upcasting)
        c[3] = new Mudur(); // yukarı cevirim (upcasting)
        mesaiBasla(c);
  }
}
