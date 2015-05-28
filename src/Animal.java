/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cat
 */
public class Animal {
    
    public static void main(String args[]) {
        
        Lion timmytheLion = new Lion("a", "b", "c", "d");
        System.out.println("It makes a noise -" + timmytheLion.makeNoise + ".");
        System.out.println("It eats -" + timmytheLion.eat + ".");
        System.out.println("It sleeps" + timmytheLion.sleep + ".");
        System.out.println("It roams -" + timmytheLion.roam + ".");
    }

    private static class Lion extends Mammal {

        public Lion() {
        }
    }

class Mammal  {    
    String makeNoise = "";
    String eat = "";
    String sleep = "";
    String roam = "";


public Mammal () {
            makeNoise = this.makeNoise;
            eat = this.eat;
            sleep = this.sleep;
            roam = this.roam;
}
               
public Mammal (String sMakeNoise, String sEat, String sSleep, String sRoam){
            makeNoise = sMakeNoise;
            eat = sEat;
            sleep = sSleep;
            roam = sRoam;
}}

class Feline extends Animal {
    String roam = "hunts";
} 

class Lion extends Feline {
    String makeNoise = "roars";
    String eat = "at night";
}}