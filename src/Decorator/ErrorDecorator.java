package Decorator;

public class ErrorDecorator extends HtmlDecorator {

    String error;

    public void setError(String error) {
        this.error = error;
    }

    public ErrorDecorator(InputText inputText) {
        super(inputText);
    }

    @Override
    public String toStringLine() {
        return super.toStringLine() + "<span>" + error + "</span>\n";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
