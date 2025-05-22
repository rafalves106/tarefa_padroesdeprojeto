/**
 * @author falvesmac
 */

package br.com.falves;

public class MotoBmw implements IMoto {
    private String modelo;
    private int ano;
    private int potencia;

    public MotoBmw(String modelo, int ano, int potencia) {
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
        System.out.println("BMW " + modelo + " " + ano + " | " + potencia + "CV");
    }
}