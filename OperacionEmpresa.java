package Operciones;
import java.util.List;

import Modelos.Empresa;

public interface IOperacionEmpresa {
    void consultarTodasLasEmpresas();
}

public class OperacionEmpresa implements IOperacionEmpresa {
    private List<Empresa> empresas;

    public OperacionEmpresa(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    @Override
    public void consultarTodasLasEmpresas() {
        for (Empresa e : empresas) {
            System.out.println(e);
        }
    }


    private List<Empresa> empresas;

    public OperacionEmpresa(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    @Override
    public void consultarTodasLasEmpresas() {
        for (Empresa e : empresas) {
            System.out.println(e);
        }
    } {
    
}
