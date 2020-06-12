package com.abstractClasses;

public class Student extends Person {
    private String major;
    /*
    *  @param name Name of a student
    *   @param major specialisation of a student
    * */
    public Student (String name, String major){
        //Give string name to constructor of a superclass
        // in his param
        super(name);
        this.major = major;
    }
    public String getDescription(){
        return "a student major in " + major;
    }
}
