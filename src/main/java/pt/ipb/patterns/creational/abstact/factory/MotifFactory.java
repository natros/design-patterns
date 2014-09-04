package pt.ipb.patterns.creational.abstact.factory;

class MotifFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}
