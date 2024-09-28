import java.util.*;
public class Main {
    public static void main(String[] args) {
        // A AV1 ainda não foi feita, quando tiver tudo certo, usarei esse algoritmo
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
        int totalIdades = idades.length;
        for (Integer idade : idades) {
            somaIdades += idade;
        }
        double mediaArith = somaIdades / totalIdades;
        System.out.printf("A média aritmética das idades é %.2f\n", mediaArith);

        // MODA

        Map<Integer, Integer> count = new TreeMap<>();
        int maior = 0;
        for (int num : idades) {
            // Se uma idade não existe no Map, ela é adicionado com o valor inicial de 0
            if (!count.containsKey(num)) {
                count.put(num, 0);
            }
            // Pega a frequência associado ao número adicionado anteriormente e incrementa 1
            int total = count.get(num) + 1;
            // Atualiza a frequência da idade no mapa
            count.put(num, total);
            // Verifica se a frequência de num, que tá armazenada em total, é maior que o valor de maior
            if (maior < total) {
                maior = total;
            }
        }
        for (Map.Entry<Integer, Integer> counts : count.entrySet()) {
            if (counts.getValue() == maior) {
                System.out.printf("Moda: %d, aparecendo %d vezes\n", counts.getKey(), maior);
            }
        }

        // MEDIANA

        int[] toCalcMediana = idades.clone();
        double mediana;
        Arrays.sort(toCalcMediana);

        int meio1 = toCalcMediana[(totalIdades / 2) - 1];
        int meio2 = toCalcMediana[totalIdades / 2];
        mediana = (meio1 + meio2) / 2.0;
        System.out.printf("Mediana: %.2f\n", mediana);

        // FREQUÊNCIA ABSOLUTA

        Map<Integer, Integer> frequencia = new TreeMap<>();

        for (int idade : idades) {
            frequencia.put(idade, frequencia.getOrDefault(idade, 0) + 1);
        }

        System.out.println("Frequência de cada idade:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.printf("Idade: %d, Frequência: %d\n", entry.getKey(), entry.getValue());
        }

    }
}