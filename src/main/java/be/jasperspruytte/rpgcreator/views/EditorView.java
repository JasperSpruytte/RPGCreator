package be.jasperspruytte.rpgcreator.views;

import be.jasperspruytte.rpgcreator.controllers.EditorController;
import be.jasperspruytte.rpgcreator.rpgcreation.HtmlRPGBuilder;

import javax.swing.*;

/**
 * Created by jaspe on 12/01/2016.
 */
public class EditorView {
    private EditorController controller;
    private JButton createRPG;
    private JPanel panel1;

    public EditorView() {
        controller = new EditorController(new HtmlRPGBuilder());
        createRPG.addActionListener(e -> controller.createRPG());
    }

    public void show() {
        JFrame frame = new JFrame("EditorView");
        frame.setContentPane(new EditorView().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
