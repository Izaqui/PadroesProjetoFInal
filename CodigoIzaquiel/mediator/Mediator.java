package CodigoIzaquiel.mediator;
import CodigoIzaquiel.components.Component;

public interface Mediator {
    void addNewNote(Note note);
    void getInfoFromList(Note note);
    void markNote();
    void clear();
    void registerComponent(Component component);
    void createGUI();
    
}
