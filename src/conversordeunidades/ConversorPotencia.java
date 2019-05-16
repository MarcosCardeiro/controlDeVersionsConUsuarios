package conversordeunidades;

public class ConversorPotencia {
    public double KWaCV(double potencia){/*Conversor de KW a CV*/
        potencia=potencia*1.34;    /*1 KW equivale a 1.34 CV*/
        return potencia;
    }
    public double CVaKW(double potencia){/*Conversor de CV a KW*/
        potencia=potencia*0.74;  /*1 CV equivale a 0.74 KW*/
        return potencia;
    }
    public double KWaFT(double potencia){/*Conversor de KW a Ft/Lb*/
        potencia=potencia*737.56;  /*1 KW equivale a 737.56 Ft/Lb*/
        return potencia;
    }
    public double FTaKW(double potencia){/*Conversor de Ft/Lb*/
        potencia=potencia*0.00135;   /*equivalencia de 1 Ft/lb a KW*/
        return potencia;
    }
    
}
