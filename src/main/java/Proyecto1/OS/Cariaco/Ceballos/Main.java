
package Proyecto1.OS.Cariaco.Ceballos;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore mutex = new Semaphore(1);
        Drive drive = new Drive(0, 0, 0, 0, 0);
        StudioDeveloper dev1 = new StudioDeveloper(0, 0.5f, drive,mutex);
        StudioDeveloper dev2 = new StudioDeveloper(1, 0.5f, drive, mutex);
        StudioDeveloper dev3 = new StudioDeveloper(2, 3f, drive,mutex);
        StudioDeveloper dev4 = new StudioDeveloper(3, 3f, drive,mutex);
        StudioDeveloper dev5 = new StudioDeveloper(4, 0.33f, drive,mutex);
        StudioDeveloper dev6 = new StudioDeveloper(0, 0.33f, drive,mutex);
        StudioDeveloper dev7 = new StudioDeveloper(1, 0.33f, drive,mutex);
        StudioDeveloper dev8 = new StudioDeveloper(2, 0.33f, drive,mutex);
        StudioDeveloper dev9 = new StudioDeveloper(3, 0.33f, drive,mutex);
        StudioDeveloper dev10 = new StudioDeveloper(4, 0.33f, drive,mutex);
        StudioDeveloper dev11 = new StudioDeveloper(0, 0.33f, drive,mutex);
        dev1.run();
          dev2.run();
            dev3.run();
              dev4.run();
                dev5.run();
                    dev6.run();
                        dev7.run();
                            dev8.run();
                                dev9.run();
                                    dev10.run();
                                        dev11.run();
    }
    
}
