import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*A AV1 ainda não foi feita, quando tiver tudo certo, usarei esse algoritmo */
        int[] idades =
        {45, 54, 21, 16, 32, 32, 43, 21, 22, 18,
         19, 18, 54, 68, 28, 26, 25, 16, 19, 20,
         21, 61, 59, 60, 32, 30, 36, 34, 28, 29,
         12, 17, 15, 19, 33, 35, 39, 43, 34, 39,
         37, 67, 48, 52, 49, 44, 22, 45, 32, 37,
         53, 25, 29, 31, 73, 65, 59, 41, 20, 30
        };
        // MÉDIA ARITMÉTICA
        double somaIdades = 0.0;
        for (Integer idade : idades) {
            somaIdades += idade;
        }
        double mediaArith = somaIdades / idades.length;
        System.out.printf("A média aritmética das idades é %.2f\n", mediaArith);


    }
}