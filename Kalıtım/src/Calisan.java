class Calisan {
  public String pozisyon="Calisan" ;
  public void calis() {}
}
class Mudur extends Calisan {
  public Mudur () { // yapılandırıcı
      pozisyon = "Mudur" ;
  }
  @Override
  public void calis() { // iptal etme (override)
      System.out.println("Mudur Calisiyor");
  }
}

class Programci extends Calisan {
  public Programci() { // yapılandırıcı
      pozisyon = "Programci" ;
  }
  @Override
  public void calis() { // iptal etme (override)
      System.out.println("Programci Calisiyor");
  }
}
class Pazarlamaci extends Calisan {
  public Pazarlamaci() { // yapılandırıcı
      pozisyon = "Pazarlamaci" ;
  }
  @Override
  public void calis() { // iptal etme (override)
      System.out.println("Pazarlamaci Calisiyor");
  }
}
