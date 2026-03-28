package com.example.demo;

class Student {
    int marks;
    String s = "Hello";
}

public class PrimitiveObjectDemo {
    static void changeMarks(Student s) {
        s.marks = 90;
        
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.marks = 50;

        changeMarks(st);

        System.out.println(st.marks);
    }
//    output : 90
    
//    STACK
//    -----
//    st ----┐
//           │
//    s  ----┘
//
//    HEAP
//    -----
//    Student Object
//    marks = 90
}
