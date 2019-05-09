package conversordeunidades;

public class ConversorDistancia {
   
  public double KmsMillas(double distancia){/*Conversor de kilometros a millas*/
    distancia=distancia*0.62;    /*1 kilometro son 0.62 millas*/
     return distancia;
}
  public double MillasKms(double distancia){/*Conversor de millas a kilometros*/
      distancia=distancia/0.62;
      return distancia;
  }
  public double MillasPulgadas(double distancia){/*Conversor de millas a pulgadas*/
      distancia=distancia*63360;    /*1 milla son 63360 pulgadas*/
      return distancia;
  }
  public double PulgadasMillas(double distancia){/*Conversor de pulgadas a millas*/
      distancia=distancia/63360;   
      return distancia;
  }
  
}
