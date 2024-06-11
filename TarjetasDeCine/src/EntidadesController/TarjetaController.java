package EntidadesController;

import Entidades.Cliente;
import Entidades.Tarjeta;
import Excepciones.SaldoInsuficienteException;

import java.util.HashMap;
import java.util.Map;

public class TarjetaController {
    private Map<Long, Tarjeta> tarjetas;
    private Map<Long, Cliente> clientes;

    public TarjetaController() {
        tarjetas = new HashMap<>();
        clientes = new HashMap<>();
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.put(tarjeta.getNo_Tarjeta(), tarjeta);
    }

    public void asociarTarjetaCliente(long numeroTarjeta, Cliente cliente) {
        clientes.put(numeroTarjeta, cliente);
    }

    public void recargarTarjeta(long numeroTarjeta, double monto) throws IllegalArgumentException {
        Tarjeta tarjeta = tarjetas.get(numeroTarjeta);
        if (tarjeta != null) {
            tarjeta.recargar(monto);
        } else {
            throw new IllegalArgumentException("Tarjeta no encontrada");
        }
    }

    public void pagarConTarjeta(long numeroTarjeta, double monto) throws SaldoInsuficienteException {
        Tarjeta tarjeta = tarjetas.get(numeroTarjeta);
        if (tarjeta != null) {
            tarjeta.pagar(monto);
        } else {
            throw new IllegalArgumentException("Tarjeta no encontrada");
        }
    }

    public double consultarSaldo(long numeroTarjeta) throws IllegalArgumentException {
        Tarjeta tarjeta = tarjetas.get(numeroTarjeta);
        if (tarjeta != null) {
            return tarjeta.getSaldo();
        } else {
            throw new IllegalArgumentException("Tarjeta no encontrada");
        }
    }
    
    public boolean existeTarjeta(long numeroTarjeta) {
        return tarjetas.containsKey(numeroTarjeta);
    }
}
