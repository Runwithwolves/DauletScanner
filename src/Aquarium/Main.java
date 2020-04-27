package Aquarium;
import Test.Akvarium;
import Test.Fish;
import Test.FishName;

import java.util.Scanner;


public class Main extends Akvarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method fishes = new Method();
        while (true) {
            System.out.println("Fish name here");
            String name = scanner.nextLine();
            System.out.println("Fish colour here");
            String colour = scanner.nextLine();
            System.out.println("Fish age here");
            int age = scanner.nextInt();
            scanner.nextLine();
            Fish fish = new Fish(name, colour, age);
            fishes.fillFish(fish);
            fishes.allFish();
        }
    }
}