package chapter1;

/*
 * Example for naming
 */

//  CLASS
//  public = ACCES MODIFIER
//  Animal = CLASSNAME
//  a public class needs to have the same name as file
public class Animal {

    //  FIELD
    String name;

    //  METHOD
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}

//  you can have multiple classes, but only 1 public class
class Animal2{

}
