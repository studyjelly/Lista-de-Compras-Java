import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();
        double total = 0;
        String item;
        double value;

        System.out.println("-----------LISTA DE COMPRAS-----------");
        System.out.println("A seguir, digite os itens e seu respectivos valores:");
        System.out.println("Quando terminar, digite 'fim'");

        while (true) {
            System.out.println("Digite o item:");
            item = scanner.nextLine();
            if (item.equalsIgnoreCase("fim")) {
                break;
            }
            items.add(item);

            System.out.println("Digite o valor do item:");
            value = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            values.add(value);
            total += value;
        }

        System.out.println("Aqui está sua lista de compras!");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ": R$" + values.get(i));
        }
        System.out.println("O valor total da compra será de: R$" +total);
}
}