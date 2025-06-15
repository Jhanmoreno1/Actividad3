package Operciones;
import java.util.List;

import Modelos.Empleado;

    
public interface IOperacionEmpleado {
    void consultarEmpleadoPorDocumento(String documento);
    void calcularSueldoEmpleado(String documento);
    void contarEmpleadosPorEmpresa(String nit);
} OperacionEmpleado implements IOperacionEmpleado {
    private List<Empleado> empleados;

    public OperacionEmpleado(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void consultarEmpleadoPorDocumento(String documento) {
        for (Empleado e : empleados) {
            if (e.getDocumento().equals(documento)) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    @Override
    public void calcularSueldoEmpleado(String documento) {
        for (Empleado e : empleados) {
            if (e.getDocumento().equals(documento)) {
                double sueldo = e.getSueldoHora() * 160; // Ejemplo con 160 horas al mes
                System.out.println("Sueldo: " + sueldo);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    @Override
    public void contarEmpleadosPorEmpresa(String nit) {
        long count = empleados.stream().filter(e -> e.getDocumento().startsWith(nit)).count();
        System.out.println("Cantidad de empleados en la empresa: " + count);
    }
}