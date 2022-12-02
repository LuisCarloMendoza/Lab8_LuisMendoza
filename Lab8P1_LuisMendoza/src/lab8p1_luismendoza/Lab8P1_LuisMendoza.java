/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_luismendoza;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lab8P1_LuisMendoza {

    public static void Menu(){
        
        Scanner entrada = new Scanner(System.in);
        
        int n = 0;
        
        do{
        
        System.out.println("");
        System.out.println("Bienvenido al Lab #8!");
        System.out.println("");
        System.out.println("Ingrese una de las siguientes opciones: ");
        System.out.println("1. Pokemon Battle , 2. MyHero , 3. Salir");
        int opcionUsuario = entrada.nextInt();
        
        switch(opcionUsuario){
            
            case 1: 
                
                PokemonBattle();
                
                break;
                
            case 2: 
                
                Heroe();
                
                break;
                
            case 3: 
                
                System.out.println("Bye Bye!");
                n++;
                
                break;
                
            default:
                System.out.println("Opción no valida");
                break;
        }
        
        } while (n != 1);
    }
    
    public static void PokemonBattle(){

        Scanner entrada = new Scanner(System.in);

        ArrayList<Pokemon> Trainer1 = new ArrayList();

        ArrayList<Pokemon> Trainer2 = new ArrayList();

        int a = 0;
        int b = 0;
        int round = 1;
        int n1 = 0;
        int n2 = 0;

        System.out.println("Bienvenido a las batallas pokemon!");

        System.out.println("Ingrese el numero de pokemon para el entrenador #1 ");
        int pokemonNumber1 = entrada.nextInt();

        System.out.println("Ingrese el numero de pokemon para el entrenador #2 ");
        int pokemonNumber2 = entrada.nextInt();

        do {

            int m1 = n1 + 1;

            System.out.println("Ingrese el nombre del Pokemon #" + m1 + " para el entrenador #1");
            String nombre1 = entrada.next();
            nombre1 += entrada.nextLine();

            System.out.println("Ingrese la vida del Pokemon #" + m1 + " para el entrenador #1");
            int vida1 = entrada.nextInt();

            System.out.println("Ingrese el ataque del Pokemon #" + m1 + " para el entrenador #1");
            int ataque1 = entrada.nextInt();

            int lucky1 = Random();
            System.out.println("Suerte: " + lucky1);

            Pokemon pokemon1 = new Pokemon(nombre1, vida1, ataque1, lucky1);

            Trainer1.add(pokemon1);

            n1++;

        } while (n1 != pokemonNumber1);

        do {

            int m2 = n2 + 1;

            System.out.println("Ingrese el nombre del Pokemon #" + m2 + " para el entrenador #2");
            String nombre2 = entrada.next();
            nombre2 += entrada.nextLine();

            System.out.println("Ingrese la vida del Pokemon #" + m2 + " para el entrenador #2");
            int vida2 = entrada.nextInt();

            System.out.println("Ingrese el ataque del Pokemon #" + m2 + " para el entrenador #2");
            int ataque2 = entrada.nextInt();

            int random2 = new Random().nextInt((5 - 1) + 1) + 1;
            int lucky2 = random2;
            System.out.println("Suerte: " + lucky2);

            Pokemon pokemon2 = new Pokemon(nombre2, vida2, ataque2, lucky2);

            Trainer2.add(pokemon2);

            n2++;

        } while (n2 != pokemonNumber2);

        for (int i = 0; i < Trainer1.size(); i++) {

            Pokemon poke1 = Trainer1.get(i);

            System.out.println("-> " + poke1);

        }

        for (int i = 0; i < Trainer2.size(); i++) {

            Pokemon poke2 = Trainer2.get(i);

            System.out.println("-> " + poke2);

        }

        System.out.println("*****************************************");

        do {

            Pokemon pokemon1 = Trainer1.get(a);
            Pokemon pokemon2 = Trainer2.get(b);

            System.out.println("*********************************************");
            System.out.println("Se enfrentara: " + pokemon1.name + " contra " + pokemon2.name);

            while (pokemon1.vida > 0 && pokemon2.vida > 0) {

                if (pokemon1.luck >= pokemon2.luck) {

                    System.out.println("Round #" + round);

                    System.out.println("->" + pokemon1.name + " Ataca primero " + " tiene " + pokemon1.vida + " puntos de vida");
                    System.out.println("->" + pokemon2.name + " Ataca segundo " + " tiene " + pokemon2.vida + " puntos de vida");

                    pokemon2.vida = pokemon2.vida - pokemon1.ataque;

                    if (pokemon2.vida <= 0) {
                        System.out.println(pokemon2.name + " Fallecio en combate");
                        break;

                    } else {
                        pokemon1.vida = pokemon1.vida - pokemon2.ataque;
                    }

                    System.out.println("-> Puntos Restantes:");
                    System.out.println("->" + pokemon1.name + " tiene " + pokemon1.vida + " puntos de vida");
                    System.out.println("->" + pokemon2.name + " tiene " + pokemon2.vida + " puntos de vida");
                    round++;

                    pokemon1.luck = Random();

                    System.out.println("*****************************************");

                } else if (pokemon1.luck < pokemon2.luck) {

                    System.out.println("Round #" + round);

                    System.out.println("->" + pokemon2.name + " Ataca primero " + " tiene " + pokemon2.vida + " puntos de vida");
                    System.out.println("->" + pokemon1.name + " Ataca segundo " + " tiene " + pokemon1.vida + " puntos de vida");

                    pokemon1.vida = pokemon1.vida - pokemon2.ataque;

                    if (pokemon1.vida <= 0) {
                        System.out.println(pokemon1.name + " Fallecio en combate");
                        break;

                    } else {
                        pokemon2.vida = pokemon2.vida - pokemon1.ataque;
                    }

                    System.out.println("->" + pokemon2.name + " tiene " + pokemon2.vida + " puntos de vida");
                    System.out.println("->" + pokemon1.name + " tiene " + pokemon1.vida + " puntos de vida");
                    round++;

                    pokemon2.luck = Random();

                    System.out.println("*****************************************");
                }

            }

            if (pokemon1.vida <= 0) {

                round++;
                a++;

            } else if (pokemon2.vida <= 0) {

                round++;
                b++;
            }

        } while (n1 - 1 >= a && n2 - 1 >= b);

        if (a > b) {

            System.out.println("El entrenador #2 Gano!");

        } else if (b > a) {

            System.out.println("El entrenador #1 Gano!");

        }
        
        
        
        
    }
   
    public static int Random(){
        int random1 = new Random().nextInt((5 - 1)+1)+1;
        int lucky1 = random1; 
        
        return lucky1;
    }
    
    public static void Heroe(){
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList <String> DC = new ArrayList();
        
        ArrayList <String> Marvel = new ArrayList();

        int n = 0;
        
        do{
            System.out.println("Bienvenido al Array de Super Heroes: ");
            System.out.println("Ingrese una de las siguientes opciones: ");
            System.out.println("1. Buscar , 2. Agregar , 3. Salir");
            int opcionUsuario = entrada.nextInt();
            
            switch(opcionUsuario){
                
                case 1:
                    
                    System.out.println("Ingrese el nombre del Super Heroe");
                    String nameSuper = entrada.next();
                    nameSuper += entrada.nextLine();
                    System.out.println("**************************");
                    
                    for (int i = 0; i < Marvel.size(); i++) {
                    
                       String elemento = Marvel.get(i);
                      
                      if(nameSuper.equalsIgnoreCase(elemento)){
                          System.out.println(" -> Nombre de super héroe: " + elemento);
                          System.out.println(" -> Nombre verdadero: " + Marvel.get(i+1));
                         System.out.println(" -> Franquicia:: " + Marvel.get(i+2));
                          System.out.println(" -> Ciudad de Origen: " + Marvel.get(i+3));

                      
                      }
                  }
                 
                    for (int i = 0; i < DC.size(); i++) {
                        
                        String elemento = DC.get(i);
                        
                        if(nameSuper.equalsIgnoreCase(elemento)){
                            System.out.println(" -> Nombre de super héroe: " + elemento);
                            System.out.println(" -> Nombre verdadero: " + DC.get(i+1));
                            System.out.println(" -> Franquicia:: " + DC.get(i+2));
                            System.out.println(" -> Ciudad de Origen: " + DC.get(i+3));
                        }
                        
                        
                    }

                    break;
                
                case 2: 
                    
                    System.out.println("Ingrese la franquicia del Super Heroe");
                    String franchise = entrada.next();
                    franchise += entrada.nextLine();
                    
                    System.out.println("Ingrese el nombre del Super Heroe");
                    String superName = entrada.next();
                    superName += entrada.nextLine();
                    
                    System.out.println("Ingrese el nombre real del Super Heroe");
                    String realName = entrada.next();
                    realName += entrada.nextLine();
                    
                    System.out.println("Ingrese la ciudad del Super Heroe");
                    String city = entrada.next();
                    city += entrada.nextLine();
                    
                    Superheroe superHeroe = new Superheroe(superName,realName,franchise,city);
                    
                    String fran = superHeroe.franchise;
                    
                    if(fran.equalsIgnoreCase("DC")){
                        
                        DC.add(superHeroe.superName);
                        DC.add(superHeroe.realName);
                        DC.add(superHeroe.franchise);
                        DC.add(superHeroe.city);

                        
                    } else if (fran.equalsIgnoreCase("Marvel")){
                        
                        Marvel.add(superHeroe.superName);
                        Marvel.add(superHeroe.realName);
                        Marvel.add(superHeroe.franchise);
                        Marvel.add(superHeroe.city);
                        
                        
                    } else{
                        
                        System.out.println("Franquicia no valida");
                    }
                    
                    System.out.println(superHeroe.superName + " se ha añadido a la lista");
                    
                    
                    break;
                    
                case 3: 
                    n = 1;
                    break;
                    
                default:
                    System.out.println("Opción no valida");
                    break;
                
            }
            
         

        } while(n != 1);
    }
   
    public static void main(String[] args) {
        
        Menu();
        
    }
}
