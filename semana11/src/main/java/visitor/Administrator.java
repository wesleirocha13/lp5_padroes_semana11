/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Weslei
 */
public class Administrator implements Person{
    private String name;
    private int id;

    public Administrator(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String accept(Visitor visitor) {
        return visitor.getAdministratorInformations(this);
    }
}
