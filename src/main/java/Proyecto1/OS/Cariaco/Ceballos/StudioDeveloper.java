
package Proyecto1.OS.Cariaco.Ceballos;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudioDeveloper {
    private String type;
    private float salaryPerHour;
    private float productionPerDay;
    private int dayDuration = 1000;
    private float earnings;
    private float totalProduction;
    private float acc = 0;
    private String gameComponent;
    private String company;
    private Drive drive;
    private Semaphore mutex;
    
    public StudioDeveloper(String type, String company, Drive drive, Semaphore m){
        this.gameComponent= type;
        this.company= company;
        this.earnings= 0;
        this.totalProduction= 0;
        this.configureDeveloperByComponent();
        this.drive = drive;
        this.mutex = m;
    }

    //@Override
    public void run() {
        while(true) {
            try {  
                produceGameComponent();
                sleep(dayDuration);
            } catch (InterruptedException ex) {
                System.out.println("Ocurrió un error");
            }
        }
    }
    
    private void configureDeveloperByComponent(){
        if (company.equals("Square Enix")){
            switch(gameComponent){
                case "Narrativa":
                    salaryPerHour= 10;
                    productionPerDay= 0.5f;
                    break;
                case "Niveles":
                    salaryPerHour= 13;
                    productionPerDay= 0.5f;
                    break;
                case "Sprites":
                    salaryPerHour= 20;
                    productionPerDay= 3.0f;
                    break;
                case "Lógica":
                    salaryPerHour= 8;
                    productionPerDay= 3.0f;
                    break;
                case "DLC":
                    salaryPerHour= 17;
                    productionPerDay= 1.0f/3;
                    break;
                case "Integrador":
                    salaryPerHour= 25;
                    productionPerDay= 0.5f;
                    break;  
        }
        }else if(company.equals("Capcom")){
            switch(gameComponent){
                case "Narrativa":
                    salaryPerHour= 10;
                    productionPerDay= 0.5f;
                    break;
                case "Niveles":
                    salaryPerHour= 13;
                    productionPerDay= 0.5f;
                    break;
                case "Sprites":
                    salaryPerHour= 20;
                    productionPerDay= 3.0f;
                    break;
                case "Lógica":
                    salaryPerHour= 8;
                    productionPerDay= 3.0f;
                    break;
                case "DLC":
                    salaryPerHour= 17;
                    productionPerDay= 1.0f/3;
                    break;
                case "Integrador":
                    salaryPerHour= 25;
                    productionPerDay= 0.5f;
                    break;  
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

