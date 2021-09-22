package CodigoIzaquiel.components;
import CodigoIzaquiel.mediator.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Button extends JButton implements Component{

        private Mediator mediator;
    
        public Button() {
            super("Add");
        }
    
        @Override
        public void setMediator(Mediator mediator) {
            this.mediator = mediator;
        }
    
        @Override
        protected void fireActionPerformed(ActionEvent actionEvent) {
            mediator.addNewNote(new Note());
        }
    
        @Override
        public String getName() {
            return "Button";
        }
    
}
