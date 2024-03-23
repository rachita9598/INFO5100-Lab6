/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Form;

//import java.io.File;

/**
 *
 * @author HP
 */
public class User {
    String Name;
    int Age;
    int Id;
   
    /**
     *
     * @param Name
     * @param Age
     */
   /* public User() {
        this.Name = Name;
       
        this.Age = Age;
        this.Id = Id;
       
    }
*/
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

        public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
 public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
   
}
