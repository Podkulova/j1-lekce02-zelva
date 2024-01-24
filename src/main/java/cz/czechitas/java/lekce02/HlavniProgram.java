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
    nakresliPrasatko();
    nakresliNozky();
    nakreslihlavu();
    nakresliOcasek();

    nakresliViceuhelnik();
    nakresliViceuhelnik2();
    nakresliViceuhelnik3();
  }

  /* ---------------------------------------------------- > Prasatko <---------------------------------------------------- */
  public  void nakresliPrasatko() {
    zofka.turnLeft(90.0);
    for (int i = 0; i < 2; i++) {
      zofka.move(120.0);
      zofka.turnRight(90.0);
      zofka.move(60.0);
      zofka.turnRight(90.0);
    }
  }

  public void nakreslihlavu() {
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
  public void  nakresliOcasek() {
    zofka.penUp();
    zofka.turnRight(30.0);
    zofka.move(120);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(20);
    zofka.penUp();
    zofka.move(200);
  }
  /* ---------------------------------------------------- > Obrazce <---------------------------------------------------- */

  public void nakresliViceuhelnik() {
    zofka.penDown();
    for (int i = 0; i < 8; i++) {
      zofka.turnRight(45.0);
      zofka.move(60);
    }
    zofka.penUp();
    zofka.move(200);
  }

  public void nakresliViceuhelnik2() {
    zofka.penDown();
    for (int i = 0; i < 8; i++) {
      zofka.turnRight(60.0);
      zofka.move(80);
    }
    zofka.penUp();
    zofka.turnLeft(120.0);
    zofka.move(200);
  }

  public void nakresliViceuhelnik3() {
    zofka.penDown();
    for (int i = 0; i < 24; i++) {
      zofka.turnRight(15.0);
      zofka.move(20);
    }
    zofka.penUp();
    zofka.move(200);
  }





}
