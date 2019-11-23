package com.busyqa.course.dependency_injection.case2;


public class Soldier {

    IMission mission = null;

    public void setMission(IMission mission) {
        this.mission = mission;
    }

    public void goToMission(){
    	this.mission.executeMission();
    }

}
