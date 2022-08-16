public class Main {
    public static void main(String[] args) {

        // первое задание


        int arrey[] = new int[3];
        arrey[0] = 1;
        arrey[1] = 2;
        arrey[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        int[] plasesOfTrein = {1, 2, 3, 4, 5, 6, 7};


        // второе задание

        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i]);
            if (arrey.length - 1 > i){
                System.out.print(", ");
            }


        }
        System.out.println();

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (weights.length -1 >i){
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < plasesOfTrein.length; i++) {
            System.out.print(plasesOfTrein[i]);
            if (plasesOfTrein.length -1  > i){
                System.out.print(", ");
            }
        }

        // третье задание

        System.out.println();

        for (int i = arrey.length - 1; i >= 0; i--) {
            System.out.print(arrey[i]);
            if (i > 0){
                System.out.print(", ");
            }

        }

        System.out.println();

        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0){
                System.out.print(", ");
            }

        }

        System.out.println();

        for (int i = plasesOfTrein.length - 1; i >= 0; i--) {
            System.out.print(plasesOfTrein[i]);
            if (i > 0){
                System.out.print(", ");
            }

        }
        System.out.println();


        // четвёрое задание

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i]%2 > 0){
                arrey[i] += 1;
            }

            System.out.print(arrey[i]);
            if (arrey.length - 1 > i){
                System.out.print(", ");
            }

        }


    }
}