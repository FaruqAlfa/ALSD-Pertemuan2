package Pertemuan2.Kode_Program;

public class PacmanMain {
    public static void main(String[] args) {
        Pacman p1 = new Pacman();
        p1.moveLeft(2);
        p1.moveRight(0);
        p1.moveDown(3);
        p1.moveUp(5);

       p1.printPotition();
    }
}
