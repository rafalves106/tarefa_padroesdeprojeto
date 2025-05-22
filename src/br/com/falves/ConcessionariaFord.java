/**
 * @author falvesmac
 */

package br.com.falves;

public class ConcessionariaFord implements IConstrutora{

    @Override
    public ICarro criarCarro(String modelo, int ano, int potencia) {
        return new CarroFord(modelo, ano, potencia);
    }

    @Override
    public IMoto criarMoto(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A Ford não fabrica motos no momento.");
    }

    @Override
    public ICaminhao criarCaminhao(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A Ford não fabrica caminhões no momento.");
    }
}