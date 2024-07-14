public class Factura {
    public static String Facturacion(){
        String factura = "FACTURA PARA EL CLIENTE " + Main.clientName.toUpperCase();
        factura += "\n\n Cantidad de platos procesados: " + Main.platosCounter;
        factura += "\n Cantidad de platos típicos: " + Main.platoTipicoCounter;
        factura += "\n Cantidad de platos a la carta: " + Main.platoALaCartaCounter;
        factura += "\n Cantidad de platos internacionales: " + Main.platoInternacionalCounter;
        factura += "\n Valor a pagar por los platos pedidos: $" + Main.amountToPay;
        factura += "\n\n Acérquese a la caja para pagar su pedido.\n";
        factura += " Fue un gusto atenderlo el día de hoy.";

        return factura;
    }
}
