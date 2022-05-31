import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пиццу:\nПепперони (1) \n" +
                "Маргарита (2) \n" +
                "ЛаФинта (3)");
        int choose;
        choose = scanner.nextInt();
        if (choose == 1) {
            Peperoni peperoni = new Peperoni(300, 400);

            System.out.println("Вы выбрали: " + peperoni.getName() + "\nЕго вес: " + peperoni.getWeight() + "\nЕго цена: " + peperoni.getPrice() + "Сом" +
                    "\nЧто бы оформить доставку пиццы введите 1\n" +
                    "Самовывоз любое, другое число");
            peperoni.delivery(scanner.nextInt());
            System.out.println("Что бы выбрать острую пепперони введите 1\n" +
                    "Не острая любое, другое число");
            String spice = peperoni.spicy(scanner.nextInt());
            System.out.println(peperoni + "\n" + spice);
           String peperoniBake = Pizza.bake(scanner.nextInt());
            System.out.println(peperoniBake);


        } else if (choose == 2) {
            Margarita margarita = new Margarita(430, 500);

            System.out.println("Вы выбрали: " + margarita.getName()+ "\nВес: " + margarita.getWeight()+ "\nЦена: "+ margarita.getPrice()  + "Сом\n" +
                    "Что бы оформить доставку пиццы введите 1\n" +
                    "Самовывоз любое, другое число");
            margarita.delivery(scanner.nextInt());
            System.out.println("Что бы выбрать маргариту с мясом введите 1\n" +
                    "без мяса любое, другое число");
            String meat = margarita.withMeat(scanner.nextInt());
            System.out.println(margarita + "\n" + meat );
           String margaritaBake = Pizza.bake(scanner.nextInt());
            System.out.println(margaritaBake);

        } else if (choose == 3) {
            LaFinta laFinta = new LaFinta(550, 420);

            System.out.println("Вы выбрали: " + laFinta.name+ "\nЕго Вес: " + laFinta.getWeight()+ "\n Его цена: "+ laFinta.getPrice()  + "Сом\n"+
                    "Что бы оформить доставку пиццы введите 1\n" +
                    "Самовывоз любое, другое число");
            laFinta.delivery(scanner.nextInt());
            System.out.println("Что бы выбрать Ла Финту с грибами введите 1\n" +
                    "Без грибов любое, другое число");
            String mushroom = laFinta.mushrooms(scanner.nextInt());
            System.out.println(laFinta + "\n" + mushroom);
            String laFintaBake = Pizza.bake(scanner.nextInt());
            System.out.println(laFintaBake);

        }
    }
}
