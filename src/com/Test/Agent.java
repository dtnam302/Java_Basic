package com.Test;

public class Agent {
    private String codenameClass;
    private String specialisationClass;
    private boolean statusClass = true;
    Agent(String codename, String specialisation){
        codenameClass = codename;
        specialisationClass = specialisation;
    }
    public String getCodename(){
        return codenameClass;
    }

    public String getSpecialisation() {
        return specialisationClass;
    }
    public void setStatus(boolean status){
        statusClass = status;
    }
    public boolean getStatus(){
        return statusClass;
    }


    public String toString() {
        String active;
        if (statusClass) {
            active = "active";
        } else {
            active = "inactive";
        }
       return String.format("Agent %s specialises in %s. The are currently %s.",codenameClass,specialisationClass,active);
    }

    public static void main(String[] args) {
        ClassTest c = new ClassTest();
        System.out.println(c);



    }
}
