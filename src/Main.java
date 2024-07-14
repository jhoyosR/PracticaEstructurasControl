import javax.swing.*;

public class Main {
    static int codMenuPpal;
    static int amountToPay=0;
    static int platosCounter=0;
    static int platoTipicoCounter=0;
    static int platoALaCartaCounter=0;
    static int platoInternacionalCounter=0;
    static String clientName = JOptionPane.showInputDialog(null,"Ingrese su nombre");

    public static void main(String[] args) {
        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir y generar facturación\n\n";
            menu += clientName + ", por favor seleccione una opción \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    int codMenuTipico;
                    do {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1. Frijoles\n";
                        menuTipico += "2. Sopa de Verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += clientName + ", por favor seleccione una opción \n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $" + 12000);
                                amountToPay+=12000;
                                platosCounter++;
                                platoTipicoCounter++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $" + 8000);
                                amountToPay+=8000;
                                platosCounter++;
                                platoTipicoCounter++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    int codMenuALaCarta;
                    do {
                        String menuALaCarta = "MENU A LA CARTA\n\n";
                        menuALaCarta += "1. Spaguetti Amatriciana\n";
                        menuALaCarta += "2. Tagliata de Res\n";
                        menuALaCarta += "3. Salmón en Queso Azúl\n";
                        menuALaCarta += "4. Regresar\n\n";
                        menuALaCarta += clientName + ", por favor seleccione una opción \n";
                        codMenuALaCarta = Integer.parseInt(JOptionPane.showInputDialog(menuALaCarta));

                        switch (codMenuALaCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Spaguetti Amatriciana, el costo es de $" + 20000);
                                amountToPay+=20000;
                                platosCounter++;
                                platoALaCartaCounter++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Tagliata de Res, el costo es de $" + 28000);
                                amountToPay+=28000;
                                platosCounter++;
                                platoALaCartaCounter++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Salmón en Queso Azúl, el costo es de $" + 29000);
                                amountToPay+=29000;
                                platosCounter++;
                                platoALaCartaCounter++;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codMenuALaCarta != 4);
                    break;
                case 3:
                    int codMenuInternacional;
                    do {
                        String menuInternacional = "MENU INTERNACIONAL\n\n";
                        menuInternacional += "1. Hamburguesa\n";
                        menuInternacional += "2. Sushi x10\n";
                        menuInternacional += "3. Paella\n";
                        menuInternacional += "4. Burrito Mexicano\n";
                        menuInternacional += "5. Regresar\n\n";
                        menuInternacional += clientName + ", por favor seleccione una opción \n";
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                        switch (codMenuInternacional) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Hamburguesa, el costo es de $" + 22000);
                                amountToPay+=22000;
                                platosCounter++;
                                platoInternacionalCounter++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Sushi x10, el costo es de $" + 25000);
                                amountToPay+=25000;
                                platosCounter++;
                                platoInternacionalCounter++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Paella, el costo es de $" + 32000);
                                amountToPay+=32000;
                                platosCounter++;
                                platoInternacionalCounter++;
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Burrito Mexicano, el costo es de $" + 17000);
                                amountToPay+=17000;
                                platosCounter++;
                                platoInternacionalCounter++;
                                break;
                            case 5:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codMenuInternacional != 5);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, Factura.Facturacion());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}
