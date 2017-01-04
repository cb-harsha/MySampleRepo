/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasstest;
import java.util.*;
/**
 *
 * @author cb-harsha
 */
public class NestedClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassTwo ct = new ClassTwo();
        ClassTwo.InnerClass cti = new ClassTwo.InnerClass();
        cti.innerDefault();
        cti.innerProtected();
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("hi");
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        al.add(2);
        System.out.println((int)(al.get(2))+(int)(al.get(0)));
        
    }
    static void something(){
        System.out.println("something in nested class test");
    }
       
}

