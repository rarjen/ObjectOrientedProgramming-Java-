package com.company;

class Matematika {
    int pertambahan;
    int pengurangan;
    int perkalian;
    int pembagian;
    int a, b;

    void pertambahan(int a, int b){
        this.a = a;
        this.b = b;
        this.pertambahan = a + b;
    }
    void pengurangan(int a, int b){
        this.a = a;
        this.b = b;
        this.pengurangan = a - b;
    }
    void perkalian(int a, int b){
        this.a = a;
        this.b = b;
        this.perkalian = a * b;
    }
    void pembagian(int a, int b){
        this.a = a;
        this.b = b;
        this.pembagian = a / b;
    }
    void display(){
        System.out.println(this.pertambahan);
        System.out.println(this.pengurangan);
        System.out.println(this.perkalian);
        System.out.println(this.pembagian);
    }
}

public class Main {

    public static void main(String[] args) {
	    Matematika matematika = new Matematika();
	    matematika.pertambahan(20, 20);
	    matematika.pengurangan(10, 5);
	    matematika.perkalian(10, 20);
	    matematika.pembagian(20, 2);
	    matematika.display();
    }
}
