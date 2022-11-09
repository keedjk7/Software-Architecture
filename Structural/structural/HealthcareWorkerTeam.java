package edu.parinya.softarchdesign.structural;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private LinkedHashSet<HealthcareServiceable> team = new LinkedHashSet();
    public void addMember(Object healthcareWorkerTeam){
        this.team.add((HealthcareServiceable) healthcareWorkerTeam);
    }

    public void removeMember(Object healthcareWorkerTeam){
        this.team.remove((HealthcareServiceable) healthcareWorkerTeam);
    }

    @Override
    public void service() {
        Iterator<HealthcareServiceable> it = this.team.iterator();
        while (it.hasNext()){
            it.next().service();
        }
    }

    @Override
    public double getPrice(){
        Iterator<HealthcareServiceable> it = this.team.iterator();
        double sum = 0;
        while(it.hasNext()) {
            sum += it.next().getPrice();
        }
        return sum;
    }
}
