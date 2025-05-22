/**
 * @author falvesmac
 */

package br.com.falves;

public class ConcessionariaYamaha implements IConstrutora{

    @Override
    public ICarro criarCarro(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A Yamaha não fabrica carros no momento.");
    }

    public IMoto criarMoto(String modelo, int ano, int potencia) {
        return new MotoYamaha(modelo, ano, potencia);
    }

    @Override
    public ICaminhao criarCaminhao(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A Yamaha não fabrica caminhões no momento.");
    }
}