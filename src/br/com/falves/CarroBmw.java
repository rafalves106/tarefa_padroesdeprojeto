/**
 * @author falvesmac
 */

package br.com.falves;

public class CarroBmw implements ICarro{
    private int ano;
    private String modelo;
    private int potencia;

    public CarroBmw(String modelo, int ano, int potencia) {
        this.ano = ano;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public void exibirInfo() {
        System.out.println("BMW " + modelo + " " + ano + " | " + potencia + "CV");
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
}