package conversordeunidades;

public class ConversorTemperatura {
   
  public double ConversorTemperaturas(double distancia,int opc1,int opc2){
      double[] conversor1={1,((5)-32)/9,(1)+273.15,((5)-491.67)/9,((1)+100)/1.500,0.33000,(5)/4,((21)/40)+7.5};
      double[] conversor2={1,((9)+32)/5,(1)-273.15,((9)+491.67)/5,(((1)-100)*3)/2,(1)/0.33000,(4)/5,((1)-7.5)/0.52500};
      distancia=((distancia*conversor1[opc1-1])*conversor2[opc2-1]);
    return distancia;  
  } 
}

