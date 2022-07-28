package exemplos.aula.java;

public class ExemplosAulaJava {

    public static void main(String[] args) {
        int numeroMes = 9;
        String estacion = "", mes = "";

        switch (numeroMes) {
            case 12:
                mes = "Diciembre";
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
                break;
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;
            case 9:
                mes = "Septiembre";
                estacion = "Invierno ";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;
        }

        System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
    }

}
