package pt.ipb.patterns.structural.facade;

/* Complex parts */
class CPU {
    public void freeze() {
    }

    public void jump(long position) {
    }

    public void execute() {
    }
}

class Memory {
    public void load(long position, byte[] data) {
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        return null;
    }
}
 
/* Facade */
class ComputerFacade {
    private static final long BOOT_ADDRESS = 0L;
    private static final long BOOT_SECTOR = 0L;
    private static final int SECTOR_SIZE = 0;
    private final CPU processor = new CPU();
    private final Memory ram = new Memory();
    private final HardDrive hd = new HardDrive();

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
 
/* Client */
public class FacadeExample {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
