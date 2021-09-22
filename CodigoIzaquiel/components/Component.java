package CodigoIzaquiel.components;
import CodigoIzaquiel.mediator.*;
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}