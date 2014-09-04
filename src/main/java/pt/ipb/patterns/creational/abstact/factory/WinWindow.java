package pt.ipb.patterns.creational.abstact.factory;

class WinWindow implements Window {
    @Override
    public void paint() {
        System.out.println("WinWindow.paint");
    }
}
