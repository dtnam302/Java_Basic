package com.Test;

public class SpecialAgent extends Agent{

    private int clearanceLevelClass;
    private boolean statusClass = true;
    SpecialAgent(String codename, String specialisation,int clearanceLevel) {
        super(codename,specialisation);

        clearanceLevelClass = clearanceLevel;
    }
    public int getClearanceLevel() {
        return clearanceLevelClass;
    }
    public void setClearanceLevel(int clearanceLevel) {
        clearanceLevelClass = clearanceLevel;
    }
    public void setStatus(boolean status) {
        statusClass = status;
        if (!statusClass) {
            clearanceLevelClass = 0;
        }
    }


    public String toString() {
        String active;
        if (statusClass) {
            active = "active";
        } else {
            active = "inactive";
        }
        return String.format("Agent %s specialises in %s. The are currently %s"
                        +" with a clearance level of %d."
                ,super.getCodename(),super.getSpecialisation(),active,clearanceLevelClass);
    }

    public static void main(String[] args) {
        SpecialAgent supersix = new SpecialAgent("006", "Being Bond", 6);
        SpecialAgent three = new SpecialAgent("333", "Riding tricycles", 3);
        SpecialAgent amy = new SpecialAgent("Amy", "Black widow", 66);
        amy.setStatus(false);
        System.out.println(supersix);
        System.out.println(three);
        System.out.println(amy);
        System.out.println(amy instanceof SpecialAgent);
        System.out.println(amy instanceof Agent);


    }

}
