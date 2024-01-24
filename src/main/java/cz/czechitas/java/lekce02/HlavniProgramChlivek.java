package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgramChlivek {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgramChlivek().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(1000);

      domecek();
      strecha();

      slunicko();
      nakresliSlunicko();
      posunDSlunceAPosunomkuDoPrava();

      domecek();
      strecha();
        posunDomkuDoPrava();

        domecek();
        strecha();

        posunDomkuDoPrava();
        domecek();
        strecha();

       posunDomkuDoPrava();
        domecek();
       strecha();

    }


    public void domecek() {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(160);
            zofka.turnLeft(90);
        }
    }

    public void strecha() {
        zofka.turnRight(90);
        zofka.turnLeft(30);
        zofka.move(120);
        zofka.turnLeft(120);
        zofka.move(120);
    }

    public void posunDSlunceAPosunomkuDoPrava() {
        zofka.penUp();
        zofka.turnLeft( 180);
        zofka.move(240);
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnLeft( 180);
    }

    public void posunDomkuDoPrava() {
        zofka.penUp();
        zofka.turnLeft( 120);
        zofka.move(300);
        zofka.turnRight(180);
    }

    public void slunicko() {
        zofka.penUp();
        zofka.turnLeft( 120);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(240);
    }

    public void nakresliSlunicko() {
        zofka.penDown();
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15.0);
            zofka.move(10);
        }
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();
        nakresliPaprsek();

    }

    public void nakresliPaprsek() {
        zofka.turnLeft(90.0);
        zofka.move(15);

        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(15);
        zofka.turnLeft(90.0);

        for (int i = 0; i < 2; i++) {
            zofka.turnRight(15.0);
            zofka.move(10);
        }
        zofka.penDown();
    }



}