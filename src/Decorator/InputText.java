package Decorator;

public class InputText implements HtmlElement {

    protected String name;

    public InputText(String name) {
        this.name = name;
    }

    @Override
    public String toStringLine() {
        return "<input type=\"text\" id=\"" + name + "\" name=\"" + name +"\" />\n";
    }

    @Override
    public String getName() {
        return name;
    }
}
