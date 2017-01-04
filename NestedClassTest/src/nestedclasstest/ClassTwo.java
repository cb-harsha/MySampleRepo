/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasstest;

/**
 *
 * @author cb-harsha
 */
class ClassTwo {
    
       static class InnerClass  {
        private void innerMethod(){
            System.out.println("private method");
        }
        void innerDefault(){
            System.out.println("default");
            NestedClassTest.something();
        }
        protected void innerProtected(){
            System.out.println("protected method");
        }
        
    }
 
    
}
