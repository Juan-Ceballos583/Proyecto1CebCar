
package Proyecto1.OS.Cariaco.Ceballos;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudioDeveloper {
    private int type;
    private float productionPerDay;
    private int dayDuration = 1000;
    private float acc = 0;
    private Drive drive;
    Semaphore mutex;
    
    public StudioDeveloper (int type, float pp, Drive drive, Semaphore m){
        this.type = type;
        this.productionPerDay = pp;
        this.drive = drive;
        this.mutex = m;
    }

    //@Override
    public void run() {
        while(true) {
            try {  
                Work();
                sleep(dayDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(StudioDeveloper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        this.acc += this.productionPerDay;
        if (this.acc >= 1){
            try {
                 // sección critica
                this.mutex.acquire(1);
                this.drive.addProduct(1, type);
              
                this.acc=0;
                this.mutex.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(StudioDeveloper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(this.drive.getLevels());
        System.out.println(this.drive.getNarrative());
        System.out.println(this.drive.getSprites());
        System.out.println(this.drive.getLogic());
        System.out.println(this.drive.getDLC());
    }
}
