public class Cambio {
        public static void main(String[] args) {
            final double[] TIPOS = new double[]{2,1,0.5,0.2,0.1,0.05,0.02,0.01};
            double cambio;
            int monedas;
            cambio = Double.parseDouble(args[0]);
            calculaCambio(TIPOS, 0, cambio);
        }
        public static void calculaCambio(double[] tipos, int i, double cambio){
            if (i<tipos.length) {
                double monedas = 100 *  cambio / (tipos[i]*100);
                monedas=(int) (monedas + 0.001);
                cambio = cambio - monedas * tipos[i];
                System.out.println("Monedas de " + tipos[i] + "€ : " + monedas);
                calculaCambio(tipos, i+1, cambio);
            }
        }

    }

