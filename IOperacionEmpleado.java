package Operaciones;
public interface IOperacionEmpleado {
    void consultarEmpleadoPorDocumento(String documento);
    void calcularSueldoEmpleado(String documento);
    void contarEmpleadosPorEmpresa(String nit);
}
