package be.jasperspruytte.rpgcreator.controllers;

import be.jasperspruytte.rpgcreator.rpgcreation.RPGBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by jaspe on 12/01/2016.
 */
public class EditorControllerTest {

    @Test
    public void createEmptyProject() {
        RPGBuilder rpgBuilder = Mockito.mock(RPGBuilder.class);
        EditorController controller = new EditorController(rpgBuilder);

        controller.createRPG();

        verify(rpgBuilder).createRPG();
    }
}