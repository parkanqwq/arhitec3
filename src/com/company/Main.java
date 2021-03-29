package com.company;

import com.company.HouseParts.*;

public class Main {

    public static void main(String[] args) {

        BuildingHome buildingHome = new BuildingHome();
        buildingHome.frontDoor(new FrontDoor("Коричневый", "Дерево")).
                window(new Window("Прозрачный", "Стекло")).
                brick(new Brick("Красный", "Кирпич")).
                roof(new Roof("Черный", "Железо")).
                stairs(new Stairs("Серый", "Бетон")).
                build();
    }
}
