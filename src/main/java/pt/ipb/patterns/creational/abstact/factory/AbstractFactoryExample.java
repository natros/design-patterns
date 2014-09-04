package pt.ipb.patterns.creational.abstact.factory;

public class AbstractFactoryExample {
    public AbstractFactoryExample(WidgetFactory factory) {
        factory.createWindow().paint();
        factory.createScrollBar();
    }

    public static void main(String[] args) {
        new AbstractFactoryExample(new MotifFactory());
    }
}
