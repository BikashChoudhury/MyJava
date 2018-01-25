public class Temperature {
    public static void main(String args[]) {
    double forenhite =62.5;
    double celcious =f2c(forenhite);

        System.out.println(forenhite + 'F' + " = " + celcious + 'F');
        System.out.println( celcious + 'f');
    }
    static double f2c(double fahr){
        return (fahr - 32.0)* 5.0/9.0;
    }
}
