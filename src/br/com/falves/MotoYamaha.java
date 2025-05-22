/**
 * @author falvesmac
 */

package br.com.falves;

public class MotoYamaha implements IMoto {
    private String modelo;
    private int ano;
    private int potencia;

    public MotoYamaha(String modelo, int ano, int potencia) {
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Yamaha " + modelo + " " + ano + " | " + potencia + "CV");
    }
}