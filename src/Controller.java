import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Work method
    public void processUser() {
        Scanner scan = new Scanner(System.in);

        model.setRange(Consts.RANGE_LOW, Consts.RANGE_TOP);
        model.SetAimValue(model.generateValue());

        while (model.checkForAttampt(validateValueWithRange(scan))) ;

        view.printMessage(View.WON_STRING + model.GetAimValue());
        view.printMessage(View.Attempt_STRING + model.GetAttampt());
    }

    public int validateValueWithRange(Scanner scanner) {
        int res;
        view.printMessage(View.INPUT_STRING);
        view.printRange(model.GetRangeLow(), model.GetRangeTop());

        while (true) {
            while (! scanner.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_STRING);
                view.printRange(model.GetRangeLow(), model.GetRangeTop());
                scanner.next();
            }

            res = scanner.nextInt();
            if (res <= model.GetRangeLow() || res >= model.GetRangeTop()) {
                view.printMessage(View.WRONG_INPUT_STRING);
                view.printMessage(View.INPUT_STRING);
                continue;
            }
            break;
        }
        return res;
    }
}