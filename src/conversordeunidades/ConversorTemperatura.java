package conversordeunidades;

public class ConversorTemperatura {
    public double CelsiusAFahrenheit(double temp){/*Conversor de Celsius aFahrenheit*/
        temp=((temp*9)/5)+32;  
        return temp;
    }
    public double FahrenheitACelsius(double temp){/*Conversor de Fahrenheit a Celsius*/
        temp=((temp-32)*5)/9;
        return temp;
    } 
    public double CelsiusAKelvin(double temp){/*Conversor de Celsius a Kelvin*/
        temp=(temp+273.15);
        return temp;
    }
    public double KelvinACelsius(double temp){/*Conversor de Kelvin a Celsius*/
        temp=(temp-273.15);
        return temp;
    }
}
