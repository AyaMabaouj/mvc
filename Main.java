public class Main {
    public static void main(String[] args) {
        // Création d'un modèle
        Model model = new Model();

        // Création d'une vue
        View view = new View();

        // Création d'un contrôleur
        Controller controller = new Controller(model, view);

        // Mise à jour du message
        controller.setMessage("Bonjour tout le monde!");

        // Affichage du message
        controller.updateView();
   
    }}