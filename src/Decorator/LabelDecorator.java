package Decorator;

public class LabelDecorator implements HtmlElement {
    protected InputText inputText;

    public LabelDecorator(InputText inputText) {
        this.inputText = inputText;
    }

    @Override
    public String toStringLine() {
        String name = inputText.getName();
        return "<label for=\"" + name + "\">" + inputText.toStringLine() + "</label>\n";
    }

    @Override
    public String getName() {
        return null;
    }
}
