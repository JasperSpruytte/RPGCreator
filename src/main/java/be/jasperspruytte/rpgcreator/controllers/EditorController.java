package be.jasperspruytte.rpgcreator.controllers;

import be.jasperspruytte.rpgcreator.rpgcreation.RPGBuilder;

/**
 * Created by jaspe on 12/01/2016.
 */
public class EditorController {
    private RPGBuilder rpgBuilder;

    public EditorController(RPGBuilder rpgBuilder) {

        this.rpgBuilder = rpgBuilder;
    }

    public void createRPG() {
        rpgBuilder.createRPG();
    }
}
