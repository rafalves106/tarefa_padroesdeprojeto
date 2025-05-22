/**
 * @author falvesmac
 */

package br.com.falves;

public class Demo {
  public static void main(String[] args) {
    IConstrutora bmw = new ConcessionariaBmw();
    ICarro carroBmw = bmw.criarCarro("Serie 3", 2022, 300);
    IMoto motoBmw = bmw.criarMoto("R1250 GS", 2023, 60);
    carroBmw.exibirInfo();
    motoBmw.exibirInfo();

    System.out.println("--------------");

    IConstrutora ford = new ConcessionariaFord();
    ICarro carroFord = ford.criarCarro("Ranger", 2025, 250);
    carroFord.exibirInfo();

    System.out.println("--------------");

    IConstrutora yamaha = new ConcessionariaYamaha();
    IMoto motoYamaha = yamaha.criarMoto("Teneré 700", 2026, 55);
    motoYamaha.exibirInfo();

    System.out.println("--------------");

    IConstrutora volvo = new ConcessionariaVolvo();
    ICarro carroVolvo = volvo.criarCarro("XC90", 2020, 240);
    ICaminhao caminhaoVolvo = volvo.criarCaminhao("FH", 2025, 420);
    carroVolvo.exibirInfo();
    caminhaoVolvo.exibirInfo();
  }

}