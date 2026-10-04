public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hei olen tulostin-ohjelma!");
        //System.out.println("Ohjelman tekijä:");
        String tekija = "Tino Laakso";
        System.out.println("Ohjelman tekijä: " + tekija);

        int luku1 = 5;
        int luku2 = 10;
        int tulo = luku1 * luku2;

        double luku3 = 22.67;
        double luku4 = 11.69;
        double tulo2 = luku3 / luku4;

        int luku5 = 10;
        int luku6 = 2;
        int tulo3 = luku5 - luku6;

        double luku7 = 5.6;
        double luku8 = 2.3;
        double tulo4 = luku7 + luku8;

        //System.out.println("Luku1 muuttujan arvo on: " + luku1);
        //System.out.println("Luku2 muuttujan arvo on: " + luku2);
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku3 + " / " + luku4 + " = " + tulo2);
        System.out.println(luku5 + " - " + luku6 + " = " + tulo3);
        System.out.println(luku7 + " + " + luku8 + " = " + tulo4);

      
    }
}
