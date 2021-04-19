package com.tts;

public class Pet {
    private String name ;
    private int age ;
    private String location;
    private String type ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet(){
        this.name="Cat";
        this.age=2;
        this.location="Charlotte";
        this.type="Mammal";
    }
    public Pet(String name,int age,String location,String type){
        this.name=name;
        this.age=age;
        this.location=location;
        this.type=type;
    }

}
