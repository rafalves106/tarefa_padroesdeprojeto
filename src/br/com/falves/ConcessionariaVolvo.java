/**
 * @author falvesmac
 */

package br.com.falves;

public class ConcessionariaVolvo implements IConstrutora{

    @Override
    public ICarro criarCarro(String modelo, int ano, int potencia) {
        return new CarroVolvo(modelo, ano, potencia);
    }

    @Override
    public IMoto criarMoto(String modelo, int ano, int potencia) {
        throw new UnsupportedOperationException("A Volvo não fabrica motos no momento.");
    }

    @Override
    public ICaminhao criarCaminhao(String modelo, int ano, int potencia) {
        return new CaminhaoVolvo(modelo, ano, potencia);
    }
}