package Decorator;

public abstract class HtmlDecorator implements HtmlElement {
    protected InputText inputText;

    public HtmlDecorator(InputText inputText) {
        this.inputText = inputText;
    }

    @Override
    public String toStringLine() {
        return inputText.toStringLine();
    }

    @Override
    public String getName() {
        return inputText.getName();
    }
}
