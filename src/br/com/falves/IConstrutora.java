package br.com.falves;

public interface IConstrutora {
    ICarro criarCarro(String modelo, int ano, int potencia);
    IMoto criarMoto(String modelo, int ano, int potencia);
    ICaminhao criarCaminhao(String modelo, int ano, int potencia);
}
