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
        zofka.move(390);

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

        nakresliSpodniDomecek();

        nakresliPrasatkoAPosun();
        nakresliHlavuPrasatku();
        nakresliNozkyPrasatku();
        NakresliOcasek();

        NakresliDruhyDomekDole();

        pismenoD();
        pismenoA();
        pismenoS();
        pismenoA();
    }


    public void domecek() {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(100); // 120
            zofka.turnLeft(90);
            zofka.move(140); //160
            zofka.turnLeft(90);
        }
    }

    public void strecha() {
        zofka.turnRight(90);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
    }

    public void posunDSlunceAPosunomkuDoPrava() {
        zofka.penUp();

        for (int i = 0; i < 12; i++) {
            zofka.turnRight(15.0);
            zofka.move(10);
        }

        // zofka.turnRight(90);
        //  zofka.move(60);
        // zofka.turnRight(90);
        //   zofka.turnLeft( 180);
        zofka.move(210); //240
        zofka.turnLeft(90);
        zofka.move(120); //140
        zofka.turnLeft(180);
    }

    public void posunDomkuDoPrava() {
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(315); //400
        zofka.turnRight(180);
    }

    public void slunicko() {
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(220);
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

    public void nakresliSpodniDomecek(){
        // zovka jde na pozici - horní pravý roh
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnRight(90);

        //zovka půjde na dolni pozici - pod domky
          zofka.move(320);
         zofka.turnRight(90);
         domecek();
         strecha();
    }

    public void nakresliPrasatkoAPosun() {
        zofka.penUp();
        zofka.turnRight(60.0);
        zofka.move(470); // zde uprav hodnotu k posunu tretiho domku

        //zofka je na miste vytocime ji a dame niz
        zofka.turnLeft(90.0);
        zofka.move(30);
        zofka.penDown();
        domecek();
    }

    public void nakresliHlavuPrasatku() {
        zofka.turnRight(60.0);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
    }

    public void nakresliNozkyPrasatku() {
        //přední pár
        zofka.turnRight(50.0);
        zofka.move(30.0);
        zofka.turnRight(180.0);
        zofka.move(30.0);
        zofka.turnLeft(120.0);
        zofka.move(30.0);
        zofka.turnRight(180.0);
        zofka.move(30.0);
       zofka.turnRight(40.0);
        //zadní pár
        zofka.move(140);

        zofka.turnRight(50.0);
        zofka.move(30.0);
        zofka.turnRight(180.0);
        zofka.move(30.0);
        zofka.turnLeft(90.0);
        zofka.move(30.0);
        zofka.turnRight(180.0);
        zofka.move(30.0);
        zofka.turnLeft(50.0);
    }

    public void NakresliOcasek() {
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(30);
    }

    public void NakresliDruhyDomekDole() {
        zofka.penUp();
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(860);

        domecek();
        strecha();
    }

    public void pismenoD() {
        zofka.penUp();
        zofka.turnLeft(30);
        zofka.move(360);
        zofka.penDown();
        zofka.turnLeft(180);
        zofka.move(110);
        zofka.turnRight(90);

        for(int i = 0;i <8 ; i++){
            zofka.turnRight(20.0);
            zofka.move(20);
        }
    }

    public void pismenoA() {
        zofka.penUp();
        zofka.turnLeft(160);
        zofka.move(100);

        zofka.penDown();

        zofka.turnLeft(65);
        zofka.move(110);
        zofka.turnRight(130);
        zofka.move(110);
        zofka.turnLeft(180);
     //   zofka.move(110); //120
        zofka.move(50);
        zofka.turnLeft(65);
        zofka.move(50);


       /* zofka.turnRight(30);
        zofka.move(120);*/
    }

    public void pismenoS() {

    }

}