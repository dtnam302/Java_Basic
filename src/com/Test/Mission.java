package com.Test;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    private String objectiveClass;
    private int requiredNumberOfAgentClass;
    private List<Agent> agents = new ArrayList<Agent>();

    public Mission(String objective, int requiredNumberOfAgent) {
        objectiveClass = objective;
        requiredNumberOfAgentClass = requiredNumberOfAgent;
    }
    public boolean isReady(){
        return numberOfExtraAgentsRequired() == 0;
    }
    public boolean addAgent(Agent agent){
        if (agents.size() < requiredNumberOfAgentClass){
            if(agent.getStatus() && !agents.contains(agent)) {
                agents.add(agent);
                return true;
            } else return false;
        }
        else return false;
    }
    public int numberOfExtraAgentsRequired(){
        if (requiredNumberOfAgentClass > agents.size()) {
            return requiredNumberOfAgentClass - agents.size();
        } else return 0;
    }

    public String toString() {
        String ready;
        String agentRequired="";
        String eachAgent = "";
        for(Agent agent:agents){
            eachAgent += agent.toString();
            eachAgent+="\n";
        }
        if(isReady()){
            ready = "ready";
        } else {
            ready = "not ready";
            agentRequired = ", "+numberOfExtraAgentsRequired()+" more agent(s) required";
        }
         return String.format("Mission Objective:\n%s\n" +
                 "Agents:\n"+ eachAgent +
                 "Mission is %s"+agentRequired,objectiveClass,ready);
    }

    public static void main(String[] args) {
        Mission m = new Mission("Take the bridge", 3);
        System.out.println(m);

    }

}
