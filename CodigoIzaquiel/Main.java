package CodigoIzaquiel;

import CodigoIzaquiel.components.*;
import CodigoIzaquiel.mediator.Mediator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Edit();
        
        mediator.registerComponent(new BoxTexto());
        mediator.registerComponent(new Button());

        mediator.createGUI();
    }
}