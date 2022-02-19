import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class CuerpoDeAgua extends ObjetoGeografico {
    public String respuesta = "";
    public CuerpoDeAgua (String nombre, int id, String municipio, String tipoagua, String tipocuerpo, Double irca, String respuesta){
        super(nombre, id, municipio, tipoagua, tipocuerpo, irca);
        this.respuesta = respuesta;
    }
    
    public CuerpoDeAgua(){
        super();
    }
      
    public String nivel(String nombre, Double irca){
               
        if(irca<=5){
            respuesta = "SIN RIESGO " + nombre;
            } else if(irca>=5.1 && irca<=14){ 
                respuesta = "BAJO " + nombre;
            } else if(irca>=14.1 && irca<=35){
                respuesta = "MEDIO " + nombre;
            } else if(irca>=35.1 && irca<=80){
                respuesta = "ALTO " + nombre;
            } else {
                respuesta = "INVIABLE SANITARIAMENTE " + nombre;
            }
        return respuesta;
    }
    
    public void imprimir(String respuesta){
        System.out.println(respuesta);
    }
    public static void Analisis(List<Double> irca1){    
        float suma = 0;
        for(int i = 0; i<irca1.size(); i++){
            Double provisional = irca1.get(i);
            if(provisional>80 || provisional<35.1){
                suma = suma + 1;
            }
        }
        System.out.printf("%.2f", suma);
        System.out.println("");
    }
  
    public static void Sinriesgo(List<Double> irca1){
        List<Double> sinriesgo = new ArrayList();
        
        for (int i = 0; i < irca1.size(); i++){
            Double provisional = irca1.get(i);
            if (provisional>0 && provisional<=5) {
                System.out.printf("%.2f", provisional);
                System.out.printf(" ");
                sinriesgo.add(provisional);
            }
        }
         
        if(sinriesgo.size() == 0) {
            System.out.println("NA");
        } else {
            System.out.println("");
        }
    }
   
    public static void Estadistica(List<Double> irca1){
        DoubleSummaryStatistics estadistica = irca1.stream().collect(Collectors.summarizingDouble(item -> item));
        System.out.printf("%.2f", estadistica.getAverage());
        System.out.println("");
    }
}