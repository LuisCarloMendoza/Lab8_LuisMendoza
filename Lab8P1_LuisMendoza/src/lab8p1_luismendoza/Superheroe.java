/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_luismendoza;


public class Superheroe {
    
    public String superName;
    public String realName;
    public String franchise;
    public String city;

    public Superheroe(String superName, String realName, String franchise, String city) {
        this.superName = superName;
        this.realName = realName;
        this.franchise = franchise;
        this.city = city;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Superheroe{" + "superName=" + superName + ", realName=" + realName + ", franchise=" + franchise + ", city=" + city + '}';
    }
    
    
    
    
}
