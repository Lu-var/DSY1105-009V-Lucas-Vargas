package cl.duoc.dsy1105.lab;

public class LaboratorioJava {

    public static void main(String[] args) {
        String modelo = "Galaxy A55";
        int porcentaje = 18;
        boolean modoBateria = false;
        String nombreProp = null;

        System.out.println("=== TELÉFONO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + porcentaje);
        System.out.println("Estado: " + obtenerEstadoBateria(porcentaje));
        System.out.println("Ahorro de energia: " + modoBateria);

        if(nombreProp == null){
            nombreProp = "Sin propietario";
        }

        System.out.println("Propietario: " + nombreProp);
    }

    public static String obtenerEstadoBateria(int porcentaje){
            if(porcentaje <= 20){
                return "Bateria baja";
            }
            else if (porcentaje <= 79) {
                return "Bateria suficiente";                
            }
            else{
                return "Bateria alta";
            }
        }
}
