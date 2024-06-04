package org.jhonatan.app.main;

import org.jhonatan.app.formulario.frmRegistroEmpleados;

/**
 *
 * @author Jhonatan
 */
public class RegistroEmpledosPilas {

    public static void main(String[] args) {
        llamarFormulario();
    }

    public static void llamarFormulario() {
        frmRegistroEmpleados empleados = new frmRegistroEmpleados();
        empleados.setVisible(true);
    }
}
