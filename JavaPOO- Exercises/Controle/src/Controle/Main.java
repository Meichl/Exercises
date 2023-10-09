package Controle;
public class Main {
    public static void main(String[] args) {
        ControleRemoto Sams = new ControleRemoto();
        Sams.ligar();
        Sams.play();
        Sams.maisVolume();
        Sams.menosVolume();
        Sams.abrirMenu();
        Sams.fecharMenu();
    }
}