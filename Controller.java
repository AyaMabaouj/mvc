public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setMessage(String message) {
        model.setMessage(message);
    }

    public void updateView() {
        view.printMessage(model.getMessage());
    }
}
