public class Calculo {
        public static void main(String[] args) {
            int n1, n2, n3;
            n1=10;
            n2=20;
            n3=30;
            System.out.println("n1= "+n1+"n2= "+n2+"n3= "+n3);
            n1= n1+n2+n3;
            System.out.println("n1= "+n1);
            n2=n3 / 10 + 4 * n1;
            System.out.println("n2= "+n2);
            n3++;
            System.out.println("n3= "+n3);
            n1=n2=n3+1;
            System.out.println("n1=n2=n3= "+n1);
        }

}
