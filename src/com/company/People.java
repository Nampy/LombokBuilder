package com.company;

public class People {
    public int age;
    public String name;
    public String lastName;

    String greet="hello";

    public People(){
        // constructor to instantiate
    }
    public String greet(){
        return greet+" my name is "+name;
    }
    class Builder{
        public Builder(){

        }
        public People build(){
            return new People();
        }
    }
}
