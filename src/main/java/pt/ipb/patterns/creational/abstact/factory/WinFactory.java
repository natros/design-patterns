package pt.ipb.patterns.creational.abstact.factory;

class WinFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WinScrollBar();
    }
}
