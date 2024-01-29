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
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(390);

        celyDum();

        celeSlunce();

        celyDum();

        TriDomky();

        nakresliSpodniDomecek();

        celePrasatko();

        NakresliDruhyDomekDole();

         celeJmeno();

         zofkaJdiDomu();
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

    public void celyDum() {
        domecek();
        strecha();
    }

    public void posunDSlunceAPosunomkuDoPrava() {
        zofka.penUp();

        for (int i = 0; i < 12; i++) {
            zofka.turnRight(15.0);
            zofka.move(10);
        }

        zofka.move(190); //210
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(180);
    }

    public void posunDomkuDoPrava() {
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(315); //400
        zofka.turnRight(180);
    }

    public void celeTriDomky() {
        posunDomkuDoPrava();
        celyDum();
    }

    public void TriDomky() {
        celeTriDomky();
        celeTriDomky();
        celeTriDomky();
    }

    public void slunicko() {
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(200); //220
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

    public void celeSlunce() {
        slunicko();
        nakresliSlunicko();
        posunDSlunceAPosunomkuDoPrava();
    }

    public void nakresliSpodniDomecek() {
        // zovka jde na pozici - horní pravý roh
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnRight(90);

        //zovka půjde na dolni pozici - pod domky
        zofka.move(300);
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

    public void celePrasatko() {
        nakresliPrasatkoAPosun();
        nakresliHlavuPrasatku();
        nakresliNozkyPrasatku();
        NakresliOcasek();
    }

    public void NakresliDruhyDomekDole() {
        zofka.penUp();
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(80); //70
        zofka.turnLeft(90);
        zofka.move(860);

        domecek();
        strecha();
    }

    public void pismenoD() {
        zofka.penUp();
        zofka.turnLeft(30);
        zofka.move(340);
        zofka.penDown();
        zofka.turnLeft(180);
        zofka.move(110);
        zofka.turnRight(90);

        for (int i = 0; i < 8; i++) {
            zofka.turnRight(20.0);
            zofka.move(20);

        }
    }

    public void pomocnacaraNaPismena() {
        zofka.penUp();
        zofka.turnLeft(160);
        zofka.move(500);
        zofka.turnRight(180);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(115);
        zofka.turnRight(90);
        zofka.move(500);
        zofka.turnRight(180);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(115);
        zofka.turnLeft(90);
    }

    public void pismenoA() {
        zofka.move(120);
        zofka.penDown();

        //   trojuhelnik
        zofka.turnLeft(65);
        zofka.move(120);
        zofka.turnRight(130);
        zofka.move(120);
        zofka.turnLeft(180);
        //   trojuhelnik
        zofka.move(50);
        zofka.turnLeft(65);
        zofka.move(60); //50
        zofka.turnLeft(65);
        zofka.move(50);

        zofka.penUp();
        zofka.turnLeft(135); //130
    }

    public void pismenoS() {
        zofka.move(270);

        zofka.turnLeft(90.0);
        zofka.move(20);
        zofka.penDown();
        posun40x20Left();
        posun30x20Left();
        posun40x20Left();
        posun40x20Left();
        posun30x20Left();
        zofka.turnLeft(40.0);
        zofka.move(40);

        posun40x20Right();
        posun40x20Right();
        posun30x20Right();
        posun40x20Right();
        posun30x20Right();
    }
    public void posunKpismenuA() {
        zofka.penUp();
        zofka.move(-14);
        zofka.turnLeft(210);
        zofka.move(10);
    }

    public void posun40x20Right() {
        zofka.turnRight(40.0);
        zofka.move(20);
    }

    public void posun40x20Left() {
        zofka.turnLeft(40.0);
        zofka.move(20);
    }

    public void posun30x20Right() {
        zofka.turnRight(30.0);
        zofka.move(20);
    }

    public void posun30x20Left() {
        zofka.turnLeft(30.0);
        zofka.move(20);
    }

    public void celeJmeno() {
        pismenoD();
        pomocnacaraNaPismena();
        pismenoA();
        pismenoS();
        posunKpismenuA();
        pismenoA();
    }

    public void zofkaJdiDomu() {
        zofka.turnLeft(80);
        zofka.move(450);
        zofka.turnLeft(90);
        zofka.move(280);
        zofka.turnRight(100);
        zofka.move(130);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(20);
    }

}