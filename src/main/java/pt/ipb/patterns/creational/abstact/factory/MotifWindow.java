package pt.ipb.patterns.creational.abstact.factory;

class MotifWindow implements Window {
    @Override
    public void paint() {
        System.out.println("MotifWindow.paint");
    }
}
