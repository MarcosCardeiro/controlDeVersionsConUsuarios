package conversordeunidades;

public class ConversorPotencia {
   
  public double ConversorPotencias(double distancia,int opc1,int opc2){
      double[] conversor1={1,1000,735.49,745.7,1000000,1.3558};
      double[] conversor2={1,0.001,0.001359,0.00134102,0.000001,0.737562};
      distancia=((distancia*conversor1[opc1])*conversor2[opc2]);
    return distancia;  
  } 
}
