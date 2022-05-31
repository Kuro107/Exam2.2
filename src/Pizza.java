import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Pizza {
   protected String name;
   protected double price;
   protected double weight;
   protected static int counter = 0;


   public Pizza(double price, double weight) {
      this.price = price;
      this.weight = weight;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public static @NotNull
   String bake(int x) {
      counter++;
      if (x == 1) {
         return "Готовится пицца № " + counter;
      } else return "Ожидание готовки";
   }

   public String delivery(int x) {
      if (x == 1) {
         return "Отправлено";
      } else return "Ожидание отправки";
   }
   @Override
   public String toString(){
      return "Вы выбрали: " + name + " \n " + "Вес: "+ weight + " \n" + "Цена: "  +  price ;
   }
}

class Peperoni extends Pizza {
   String name = "Peperoni";

   public Peperoni(double price, double weight) {
      super(price, weight);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String spicy(int x) {

      if (x == 1) {
         return "Готовим острую пиццу?";
      } else return "Готовим НЕ острую пиццу?";
   }
   @Override
   public String toString(){
      return "Вы выбрали: " + name + "\nЦена: " + weight + "\nВес: " + price;
   }
}

class Margarita extends Pizza {
   String name = "Margarita";

   public Margarita(double price, double weight) {
      super(price, weight);
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void setName(String name) {
      this.name = name;
   }

   public String withMeat(int x) {
      if (x == 1) {
         return "Готовим пиццу с мясом?";
      } else return "Готовим пиццу без мяса?";
   }
   @Override
   public String toString(){
      return "Вы выбрали: " + name + "\nЦена: " + weight + "\nВес: " + price;
   }
}

class LaFinta extends Pizza {
   String name = "LaFinta";

   public LaFinta(double price, double weight) {
      super(price, weight);
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void setName(String name) {
      this.name = name;
   }

   public String mushrooms(int x) {

      if (x == 1) {
         return "Готовим пиццу с грибами?";
      } else return "Готовим пиццу без грибов?";
   }
   @Override
   public String toString(){
      return "Вы выбрали: " +  name  + "\nЦена: " + price + "\nВес: "+ weight + " \n";
   }
}

//    Имеются разные пиццы. Пепперони, Маргарита, Ла Финта.
//        Все виды пицц имеют цену, вес, их можно готовить, доставлять.
//        Каждая пицца готовится по уникальному рецепту.
//        Пепперони может быть острой или не острой,
//        Маргарита – с мясом или без
//        Ла Финта с грибами или без.
//        На этикетке(при использовании к примеру System.out.println(somePizza)) нужно написать какая именно это пицца
//        (тип, вес, цена, и специфика в зависимости от типа).
//        При готовке нужно вывести «готовиться пицца №{Порядковый номер готовящейся пиццы}». (Подсказка вспоминаем статик)
//        При доставке нужно вывести детали пиццы (этикетку)