package com.company;

import com.company.HouseParts.*;

public class BuildingHome {

    private String[] chengeHomeBuild = new String[5];
    private int core = 0;

    public BuildingHome frontDoor(FrontDoor frontDoor){
        chengeHomeBuild[core] = "дверей";
        core++;
        return this;
    }

    public BuildingHome window(Window window){
        chengeHomeBuild[core] = "окон";
        core++;
        return this;
    }

    public BuildingHome brick(Brick brick){
        chengeHomeBuild[core] = "кирпичей";
        core++;
        return this;
    }

    public BuildingHome roof(Roof roof){
        chengeHomeBuild[core] = "крыш";
        core++;
        return this;
    }

    public BuildingHome stairs(Stairs stairs){
        chengeHomeBuild[core] = "лестниц";
        core++;
        return this;
    }

    public void build(){
        for (int i = 0; i < chengeHomeBuild.length; i++) {
            if (chengeHomeBuild[i] == null){
                System.out.println("Нехватает элементов дома");
                return;
            }
        }
        System.out.println("Дом построен");
    }
}
