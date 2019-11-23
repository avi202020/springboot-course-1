package com.busyqa.course.dependency_injection.case2;



public class MilitaryCampaign {

    public static void main(String[] args) {

        Soldier soldier = new Soldier();

        IMission km = new KoreaMission();

        soldier.setMission(km);
        soldier.goToMission();


//        IMission vm = new VietnamMission();

//        soldier.setMission(vm);
//        soldier.goToMission();


    }

}
