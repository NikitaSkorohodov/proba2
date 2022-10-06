/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author user
 */
public class Author {
    private String frstname;
    private String lastname;

    public Author() {
    }

    public String getFrstname() {
        return frstname;
    }

    public void setFrstname(String frstname) {
        this.frstname = frstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" + "frstname=" + frstname + ", lastname=" + lastname + '}';
    }
    
         
    
}
