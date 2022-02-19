import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) throws Exception {
        List<CuerpoDeAgua> listaobjeto = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        CuerpoDeAgua obj = new CuerpoDeAgua();
        List<Double> irca1 = new ArrayList<Double>();
        int cantidad = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i < cantidad; i++){
            System.out.print("");
            String[] lecturas = entrada.nextLine().split(" ");
            String provisionaluno = lecturas[0];
            obj.nombre = provisionaluno;
            int provisionaldos = Integer.parseInt(lecturas[1]);
            obj.id = provisionaldos;
            String provisionaltres = lecturas[2];
            obj.municipio = provisionaltres;
            String provisionalcuatro = lecturas[3];
            obj.tipoagua = provisionalcuatro;
            String provisionalcinco = lecturas[4];
            obj.tipocuerpo = provisionalcinco;
            Double provisionalseis = Double.parseDouble(lecturas[5]);
            obj.irca = provisionalseis;
            listaobjeto.add(obj);
            irca1.add(provisionalseis);
            String respuesta = obj.nivel(provisionaluno, provisionalseis);
            obj.imprimir(respuesta);
        }
            
    CuerpoDeAgua.Analisis(irca1);
    CuerpoDeAgua.Sinriesgo(irca1);
    CuerpoDeAgua.Estadistica(irca1);
  }
              
}