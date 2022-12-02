/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_luismendoza;


public class Pokemon {
    
    public String name;
    public int vida;
    public int ataque;
    public int luck;

    public Pokemon(String name, int vida, int ataque,int luck) {
        this.name = name;
        this.vida = vida;
        this.ataque = ataque;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", vida=" + vida + ", ataque=" + ataque + ", luck=" + luck + '}';
    }
    
    


    
    
    
}
