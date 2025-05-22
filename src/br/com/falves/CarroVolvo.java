/**
 * @author falvesmac
 */

package br.com.falves;

public class CarroVolvo implements ICarro {
    private String modelo;
    private int ano;
    private int potencia;

    public CarroVolvo(String modelo, int ano, int potencia) {
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
        System.out.println("Volvo " + modelo + " " + ano + " | " + potencia);
    }
}