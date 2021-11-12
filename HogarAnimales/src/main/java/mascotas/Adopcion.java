/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import hogaranimales.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erios
 */
public class Adopcion {
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos registradores del hogar para animales
        Registrador juan = new Registrador("00800521", "Juan Guevara");
        juan.setDireccion("Rioja");
        juan.setGenero("Masculino");
        
        Registrador karla = new Registrador("47035893", "Karla Vásquez");
        karla.setDireccion("Nueva Cajamarca");
        karla.setGenero("Femenino");
        
        List<Animal> animalesJuan = new ArrayList<>();
        List<Animal> animalesKarla = new ArrayList<>();
        
        //Creamos los animales a adoptar
        Perro juano = new Perro();
        Gato bimba = new Gato();
        Perro hercules = new Perro();
        Gato botas = new Gato();
        
        //Los datos de juano
        juano.setColor("Gris");
        juano.setPeso(10.80f);
        juano.setEdad(6.5f);
        juano.setLongitud(40.3f);
        juano.setAltura(20.2f);
        juano.setNombre("Juano");
        juano.setGenero("Macho");
        juano.setRaza("Peruano");
        juano.setAlturaEsperada(25.0f);
        juano.setLongitudEsperada(42.5f);
        
        //Los datos de bimba
        bimba.setColor("Marrón, blanco y negro");
        bimba.setPeso(5.3f);
        bimba.setEdad(1.2f);
        bimba.setLongitud(29.7f);
        bimba.setAltura(15.3f);
        bimba.setNombre("Bimba");
        bimba.setGenero("Hembra");
        bimba.setRaza("Cálico");
        
        //Los datos de hercules
        hercules.setColor("Marrón y negro");
        hercules.setPeso(12.5f);
        hercules.setEdad(8.0f);
        hercules.setLongitud(45.0f);
        hercules.setAltura(30.8f);
        hercules.setNombre("Hércules");
        hercules.setGenero("Macho");
        hercules.setRaza("Chusco");
        hercules.setAlturaEsperada(35.0f);
        hercules.setLongitudEsperada(47.0f);
        
        //Los datos de botas
        botas.setColor("Blanco y negro");
        botas.setPeso(4.2f);
        botas.setEdad(2.5f);
        botas.setLongitud(20.4f);
        botas.setAltura(14.6f);
        botas.setNombre("Botas");
        botas.setGenero("Macho");
        botas.setRaza("Cálico");
        
        //Creamos adoptanes
        Adoptante pedro = new Adoptante("46528947", "Pedro Pérez");
        pedro.setDireccion("Moyobamba");
        pedro.setGenero("Masculino");
        
        Adoptante juvicza = new Adoptante("12457896", "Juvicza Coronel");
        juvicza.setDireccion("Tarapoto");
        juvicza.setGenero("Femenino");
        
        Adoptante teresa = new Adoptante("25694713", "Teresa Gamarra");
        teresa.setDireccion("Lamas");
        teresa.setGenero("Femenino");
        
        Adoptante carlos = new Adoptante("65329874", "Carlos Acosta");
        carlos.setDireccion("Moyobamba");
        carlos.setGenero("Masculino");
        
        List<Animal> animalesPedro = new ArrayList<>();
        List<Animal> animalesJuvicza = new ArrayList<>();
        List<Animal> animalesTeresa = new ArrayList<>();
        List<Animal> animalesCarlos = new ArrayList<>();
        
        //Damos en adopción
        juano.setAdoptante(teresa);
        juano.setRegistrador(karla);
        animalesTeresa.add(juano);
        animalesKarla.add(juano);
        teresa.setAnimales(animalesTeresa);
        karla.setAnimales(animalesKarla);
        
        bimba.setAdoptante(carlos);
        bimba.setRegistrador(juan);
        animalesCarlos.add(bimba);
        animalesJuan.add(bimba);
        carlos.setAnimales(animalesCarlos);
        juan.setAnimales(animalesJuan);
        
        hercules.setAdoptante(juvicza);
        hercules.setRegistrador(juan);
        animalesJuvicza.add(hercules);
        animalesJuan.add(hercules);
        juvicza.setAnimales(animalesJuvicza);
        juan.setAnimales(animalesJuan);
        
        botas.setAdoptante(pedro);
        botas.setRegistrador(karla);
        animalesPedro.add(botas);
        animalesKarla.add(botas);
        pedro.setAnimales(animalesPedro);
        karla.setAnimales(animalesKarla);
        
        //Reporte de animales
        System.out.println("Adopción 1:");
        juano.estado();
        juano.datosAdoptante();
        juano.datosRegistrador();
        System.out.println("");
        System.out.println("Adopción 2:");
        bimba.estado();
        bimba.datosAdoptante();
        bimba.datosRegistrador();
        System.out.println("");
        System.out.println("Adopción 3:");
        hercules.estado();
        hercules.datosAdoptante();
        hercules.datosRegistrador();
        System.out.println("");
        System.out.println("Adopción 4:");
        botas.estado();
        botas.datosAdoptante();
        botas.datosRegistrador();
        System.out.println("");
        
        //Reporte de animales registrados por persona
        System.out.println("Animales registrados por " + karla.getNombre());
        karla.reporteAnimales();
        System.out.println("");
        System.out.println("Animales registrados por " + juan.getNombre());
        juan.reporteAnimales();
        System.out.println("");
        System.out.println("Animales adoptados por " + pedro.getNombre());
        pedro.reporteAnimales();
        System.out.println("");
        System.out.println("Animales adoptados por " + juvicza.getNombre());
        juvicza.reporteAnimales();
        System.out.println("");
        System.out.println("Animales adoptados por " + teresa.getNombre());
        teresa.reporteAnimales();
        System.out.println("");
        System.out.println("Animales adoptados por " + carlos.getNombre());
        carlos.reporteAnimales();
        System.out.println("");
    }
}
