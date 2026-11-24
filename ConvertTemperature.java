
class ConvertTemperature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        double celsius = 36.50;

        double[] ans = convertTemperature(celsius);

        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
