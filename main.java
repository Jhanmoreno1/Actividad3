
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empresa> empresas = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();

        OperacionEmpleado opEmpleado = new OperacionEmpleado(empleados);
        OperacionEmpresa