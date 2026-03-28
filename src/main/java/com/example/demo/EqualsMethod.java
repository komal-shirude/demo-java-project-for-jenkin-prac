package com.example.demo;


public class EqualsMethod {

    String name;

    public EqualsMethod(String name) {
        this.name = name;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualsMethod other = (EqualsMethod) obj;
        return name.equals(other.name);
    }

    public static void main(String[] args) {

        EqualsMethod e1 = new EqualsMethod("Hello");
        EqualsMethod e2 = new EqualsMethod("Hello");

        System.out.println(e1 == e2);        // compares references  false 
        System.out.println(e1.equals(e2));   // compares content     false  bcz of its not override 
        
        System.out.println(e1 == e2);        // compares references  false 
        System.out.println(e1.equals(e2));    //while useing ovverride the method then its check content so its true
        
        
    }
}