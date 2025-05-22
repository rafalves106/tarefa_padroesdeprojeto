/**
 * @author falvesmac
 */

package br.com.falves;

public class ConcessionariaBmw implements IConstrutora{

    @Override
    public ICarro criarCarro(String modelo, int ano, int potencia) {
        return new CarroBmw(modelo, ano, potencia);
    }

    @Override
    public IMoto criarMoto(String modelo, int ano, int potencia) {
        return new MotoBmw(modelo, ano, potencia);
    }

    @Override
    public ICaminhao criarCaminhao(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A BMW não fabrica caminhões no momento.");
    }
}