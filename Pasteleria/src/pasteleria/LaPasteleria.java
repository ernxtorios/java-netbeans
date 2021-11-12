package pasteleria;

import modelo.*;

public class LaPasteleria {
    public static void main(String[] args) {
        //La pastelería
        Pasteleria perullina = new Pasteleria("Perullina");
        
        //Las tortas
        Torta t1 = new Torta("Eventos");
        t1.setPrecio(100);
        t1.setPeso(2);
        t1.setDescripcion("Torta de tres leches");
        
        perullina.agregarTorta(t1);
        
        Torta t2 = new Torta("Cumpleaños");
        t2.setPrecio(35);
        t2.setPeso(1);
        t2.setDescripcion("Torta chocosoda, para el cumpleaños de Alejandrito");
        
        perullina.agregarTorta(t2);
        
        Torta t3 = new Torta("Clásica");
        t3.setPrecio(20);
        t3.setPeso(0.5);
        t3.setDescripcion("Torta de naranja");
        
        perullina.agregarTorta(t3);
        
        Torta t4 = new Torta("Eventos");
        t4.setPrecio(120);
        t4.setPeso(2.2);
        t4.setDescripcion("Torta selva negra con durazno y crema de café");
        
        perullina.agregarTorta(t4);
        
        Torta t5 = new Torta("Cumpleaños");
        t5.setPrecio(50);
        t5.setPeso(1.2);
        t5.setDescripcion("Torta helada");
        
        perullina.agregarTorta(t5);
        
        Torta t6 = new Torta("Clásica");
        t6.setPrecio(18);
        t6.setPeso(0.4);
        t6.setDescripcion("Torta de café");
        
        perullina.agregarTorta(t6);
        
        Torta t7 = new Torta("Eventos");
        t7.setPrecio(200);
        t7.setPeso(3);
        t7.setDescripcion("Torta especial para matrimonio");
        
        perullina.agregarTorta(t7);
        
        Torta t8 = new Torta("Cumpleaños");
        t8.setPrecio(70);
        t8.setPeso(1.6);
        t8.setDescripcion("Torta de maracuya con temática del hombra araña");
        
        perullina.agregarTorta(t8);
        
        Torta t9 = new Torta("Clásica");
        t9.setPrecio(60);
        t9.setPeso(2.1);
        t9.setDescripcion("Torta de plátano");
        
        perullina.agregarTorta(t9);
        
        Torta t10 = new Torta("Eventos");
        t10.setPrecio(100);
        t10.setPeso(2);
        t10.setDescripcion("Torta de café bañada en chocolate");
        
        perullina.agregarTorta(t10);
        
        Torta t11 = new Torta("Cumpleaños");
        t11.setPrecio(60);
        t11.setPeso(2);
        t11.setDescripcion("Torta de arándano");
        
        perullina.agregarTorta(t11);
        
        Torta t12 = new Torta("Clásica");
        t12.setPrecio(100);
        t12.setPeso(4);
        t12.setDescripcion("Torta de guanábana");
        
        perullina.agregarTorta(t12);
        
        Torta t13 = new Torta("Eventos");
        t13.setPrecio(100);
        t13.setPeso(2);
        t13.setDescripcion("Torta de zanahoria para cumpleaños de mascota");
        
        perullina.agregarTorta(t13);
        
        Torta t14 = new Torta("Cumpleaños");
        t14.setPrecio(50);
        t14.setPeso(1.9);
        t14.setDescripcion("Torta de chocochip");
        
        perullina.agregarTorta(t14);
        
        Torta t15 = new Torta("Clásica");
        t15.setPrecio(18);
        t15.setPeso(0.7);
        t15.setDescripcion("Torta común");
        
        perullina.agregarTorta(t15);
        
        //Los eventos
        EventoEspecial e1 = new EventoEspecial("Matrimonio");
        e1.setLugar("Recreo Selva Paraiso");
        
        perullina.agregarEvento(e1);
        
        EventoNormal e2 = new EventoNormal("Baby Shower");
        e2.setLugar("Casino de La Policía Nacional");
        
        perullina.agregarEvento(e2);
        
        EventoEspecial e3 = new EventoEspecial("Cumpleanos Infantil");
        e3.setLugar("Hotel Las Vegas");
        
        perullina.agregarEvento(e3);
        
        EventoEspecial e4 = new EventoEspecial("Cumpleaños Juvenil");
        e4.setLugar("Fundo Alegría");
        
        perullina.agregarEvento(e4);
        
        EventoNormal e5 = new EventoNormal("Aniversario de la Ciudad");
        e5.setLugar("Plaza de Armas de Moyobamba");
        
        perullina.agregarEvento(e5);
        
        // Los clientes
        Cliente c1 = new Cliente("00800258", "Pedro Castillo");
        Cliente c2 = new Cliente("47589623", "Juliana Oxenford");
        Cliente c3 = new Cliente("44127800", "Miguel Bardalez");
        Cliente c4 = new Cliente("10580920", "Jessica Ríos");
        
        System.out.println("TORTAS ANTES DE REALIZAR LOS PEDIDOS");
        perullina.reporteTortas();
        System.out.println("EVENTOS ANTES DE REALIZAR LOS PEDIDOS");
        perullina.reporteEventos();
        
        //Los pedidos
        Pedido p1 = new Pedido(c1, e1);
        p1.setNumero("00001");
        p1.setEvento(e1);
        DetallePedido p1dp1 = new DetallePedido(p1);
        p1dp1.setItem(1);
        p1dp1.setTorta(t3);
        DetallePedido p1dp2 = new DetallePedido(p1);
        p1dp2.setItem(2);
        p1dp2.setTorta(t10);
        
        perullina.agregarPedido(p1);
        perullina.agregarItemPedido(p1dp1);
        perullina.agregarItemPedido(p1dp2);
        
        Pedido p2 = new Pedido(c2, e2);
        p2.setNumero("00002");
        p2.setEvento(e2);
        DetallePedido p2dp1 = new DetallePedido(p2);
        p2dp1.setItem(1);
        p2dp1.setTorta(t8);
        
        perullina.agregarPedido(p2);
        perullina.agregarItemPedido(p2dp1);
        
        Pedido p3 = new Pedido(c3, e3);
        p3.setNumero("00003");
        p3.setEvento(e3);
        DetallePedido p3dp1 = new DetallePedido(p3);
        p3dp1.setItem(1);
        p3dp1.setTorta(t7);
        DetallePedido p3dp2 = new DetallePedido(p3);
        p3dp2.setItem(2);
        p3dp2.setTorta(t9);
        DetallePedido p3dp3 = new DetallePedido(p3);
        p3dp3.setItem(3);
        p3dp3.setTorta(t11);
        
        perullina.agregarPedido(p3);
        perullina.agregarItemPedido(p3dp1);
        perullina.agregarItemPedido(p3dp2);
        perullina.agregarItemPedido(p3dp3);
        
        Pedido p4 = new Pedido(c4, e4);
        p4.setNumero("00004");
        p4.setEvento(e4);
        DetallePedido p4dp1 = new DetallePedido(p4);
        p4dp1.setItem(1);
        p4dp1.setTorta(t15);
        
        perullina.agregarPedido(p4);
        perullina.agregarItemPedido(p4dp1);
        
        //Reporte 1
        perullina.buscarPedido(p3).estado();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("DETALLE DEL PEDIDO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("ITEM                      TORTA                           PRECIO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (DetallePedido dP : perullina.buscarItemPedido(p3)) {
            dP.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(String.format("%35s %28s", "TOTAL DEL PEDIDO", perullina.totalItemsPedido(p3)));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        System.out.println();
        
        //Reporte 2
        perullina.buscarPedido(p1).estado();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("DETALLE DEL PEDIDO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("ITEM                      TORTA                           PRECIO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (DetallePedido dP : perullina.buscarItemPedido(p1)) {
            dP.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(String.format("%35s %28s", "TOTAL DEL PEDIDO", perullina.totalItemsPedido(p1)));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    
        System.out.println();
    
        //Reporte 3
        perullina.buscarPedido(p4).estado();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("DETALLE DEL PEDIDO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("ITEM                      TORTA                           PRECIO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (DetallePedido dP : perullina.buscarItemPedido(p4)) {
            dP.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(String.format("%35s %28s", "TOTAL DEL PEDIDO", perullina.totalItemsPedido(p4)));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        System.out.println();
        
        //Reporte 4
        perullina.buscarPedido(p2).estado();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("DETALLE DEL PEDIDO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("ITEM                      TORTA                           PRECIO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (DetallePedido dP : perullina.buscarItemPedido(p2)) {
            dP.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(String.format("%35s %28s", "TOTAL DEL PEDIDO", perullina.totalItemsPedido(p2)));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        System.out.println();
        
        System.out.println("TORTAS DESPUES DE REALIZAR LOS PEDIDOS");
        perullina.reporteTortas();
        System.out.println("EVENTOS DESPUES DE REALIZAR LOS PEDIDOS");
        perullina.reporteEventos();
    }
}
