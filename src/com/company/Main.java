package com.company;

import com.company.empleado.EmpleadoLimpieza;
import com.company.empleado.EmpleadoLimpiezaGeneral;
import com.company.empleado.EmpleadoLimpiezaVajilla;
import com.company.vajilla.*;

public class Main {

    public static void main(String[] args) {

        Restaurante tgiThursdays = new Restaurante("TGI Thursdays");

        Cuchillo cuchillo = new Cuchillo("cuchillo");
        Tenedor tenedor = new Tenedor("tenedor");
        Taza unaTaza = new Taza("taza grande");
        Taza otraTaza = new Taza("taza mediana");
        Taza otraTazaDistinta = new Taza("taza chica");
        Plato unPlato = new Plato("plato grande");
        Plato otroPlato = new Plato("plato mediano");
        Plato otroPlatoDistinto = new Plato("plato chico");
        Vaso unVaso = new Vaso("vaso grande");
        Vaso otroVaso = new Vaso("vaso mediano");
        Vaso otroVasoDistinto = new Vaso("vaso chico");

        EmpleadoLimpiezaGeneral pepe = new EmpleadoLimpiezaGeneral("pepe", "perez", "30303030");
        EmpleadoLimpiezaGeneral richar = new EmpleadoLimpiezaGeneral("richar", "starkey", "10101010");
        EmpleadoLimpiezaGeneral yoni = new EmpleadoLimpiezaGeneral("yoni", "tolengo", "25252525");
        EmpleadoLimpiezaVajilla eze = new EmpleadoLimpiezaVajilla("ezequiel", "lopez", "31313131");
        EmpleadoLimpiezaVajilla nahuel = new EmpleadoLimpiezaVajilla("nahuel", "gonzalez", "32323232");
        EmpleadoLimpiezaVajilla tamara = new EmpleadoLimpiezaVajilla("tamara", "rodriguez", "33333333");

        tgiThursdays.agregarEmpleados(pepe);
        tgiThursdays.agregarEmpleados(richar);
        tgiThursdays.agregarEmpleados(yoni);
        tgiThursdays.agregarEmpleados(eze);
        tgiThursdays.agregarEmpleados(nahuel);
        tgiThursdays.agregarEmpleados(tamara);

        tgiThursdays.informarSueldosEmpleados();

        nahuel.romperVajilla(unVaso);
        tamara.romperVajilla(otroPlato);

        tgiThursdays.informarSueldosEmpleados();






    }
}
