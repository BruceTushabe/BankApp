package com.pets;

class Pet {
    int size;
    String name;

    void sound(){
        if (size > 30);
        System.out.println("Hooof hoof");

        if (size < 15)
        System.out.println("Mew meww");

        if (size > 40)
        System.out.println("Meee meeee");
}

}

class PetTest{

    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.size = 40;

        Pet cat = new Pet();
        cat.size = 10;

        Pet goat = new Pet();
        goat.size = 50;

        dog.sound();
        cat.sound();
        goat.sound();
    }
 }
