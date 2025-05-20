import javax.swing.JOptionPane;
public class CicloWhile{
    public static int obtenerNumero(String mensaje){
        int numeroTemporal = 0;
        while(numeroTemporal <= 0){    
            String numero1 = JOptionPane.showInputDialog(mensaje);
            numeroTemporal = Integer.parseInt(numero1);
        }
        return numeroTemporal;
    }
    public static void main(String[] args) {
        int numero = obtenerNumero("Ingresa un numero");
    }
}