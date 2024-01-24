package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO tady bude kód

    /* ----> vytvor prasatko <----*/
    prasatko();
    nakresliNozky();
    hlava();
    ocasek();
  }

  public  void prasatko() {
    zofka.turnLeft(90.0);
    for (int i = 0; i < 2; i++) {
      zofka.move(120.0);
      zofka.turnRight(90.0);
      zofka.move(60.0);
      zofka.turnRight(90.0);
    }
  }

  public void hlava() {
    zofka.turnRight(30.0);
    zofka.move(60);
    zofka.turnRight(120);
    zofka.move(60);
  }


  public void nakresliNozky() {
    //zadní pár
    zofka.turnLeft(45.0);
    zofka.move(20.0);
    zofka.turnRight(180.0);
    zofka.move(20.0);
    zofka.turnRight(90.0);
    zofka.move(20.0);
    zofka.turnRight(180.0);
    zofka.move(20.0);
    zofka.turnLeft(45.0);
    //přední pár
    zofka.move(120);

    zofka.turnLeft(45.0);
    zofka.move(20.0);
    zofka.turnRight(180.0);
    zofka.move(20.0);
    zofka.turnRight(90.0);
    zofka.move(20.0);
    zofka.turnRight(180.0);
    zofka.move(20.0);
    zofka.turnLeft(45.0);
  }
  public void ocasek() {
    zofka.penUp();
    zofka.turnRight(30.0);
    zofka.move(120);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(20);
    zofka.penUp();
    zofka.turnLeft(90);
  }

}
