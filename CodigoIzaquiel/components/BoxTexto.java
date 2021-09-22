package CodigoIzaquiel.components;
import javax.swing.*;
import CodigoIzaquiel.mediator.Mediator;
import java.awt.event.KeyEvent;

public class BoxTexto extends JTextArea implements Component {
    
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "BoxTexto";
    }
}