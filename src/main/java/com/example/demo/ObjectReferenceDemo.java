package com.example.demo;

class StudentDemo {
    int marks;
}

public class ObjectReferenceDemo {
    static void changeStudent(StudentDemo s) {
        s = new StudentDemo(); 
        s.marks = 100;
    }

    public static void main(String[] args) {
    	StudentDemo st = new StudentDemo();
        st.marks = 50;

        changeStudent(st);

        System.out.println(st.marks);
    }
    
//    output : 50
    
//    STACK
//    -----
//    st ----► Object A
//
//    HEAP
//    -----
//    Object A
//    marks = 50
//
//    Object B
//    marks = 100   (garbage)
}