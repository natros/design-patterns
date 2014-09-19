package pt.ipb.patterns;

interface ScrollBar {}

interface WidgetFactory {
    Window createWindow();
    ScrollBar createScrollBar();
}

interface Window {
    void paint();
}

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

class MotifScrollBar implements ScrollBar {
}

class MotifWindow implements Window {
    @Override
    public void paint() {
        System.out.println("MotifWindow.paint");
    }
}

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

class WinScrollBar implements ScrollBar {
}

class WinWindow implements Window {
    @Override
    public void paint() {
        System.out.println("WinWindow.paint");
    }
}

public class AbstractFactoryExample {
    public AbstractFactoryExample(WidgetFactory factory) {
        factory.createWindow().paint();
        factory.createScrollBar();
    }

    public void main(String[] args) {
        new AbstractFactoryExample(new MotifFactory());
    }
}
