package practize7;

public class MathFunctions implements MathCalculable {
    @Override
    public double[] ComplexPow(double real, double imaginary, double exponent) {
        double arg_z = Math.atan(imaginary/real);

        double r_otvet = ComplexAbs(real, imaginary)*Math.cos(arg_z*exponent);
        double i_otvet = ComplexAbs(real, imaginary)*Math.sin(arg_z*exponent);

        double[] otvet = new double[2];
        otvet[0] = r_otvet;
        otvet[1] = i_otvet;

        return otvet;
    }

    @Override
    public double ComplexAbs(double real, double imaginary) {
        return  Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }
}
