
package Proyecto1.OS.Cariaco.Ceballos;

public class Drive {
    public int levels;
    public int narrative;
    public int sprites;
    public int logic;
    public int DLC;
    
    public Drive(int levels, int narrative, int sprites, int logic, int DLC) {
        this.levels = levels;
        this.narrative = narrative;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
    }
    
    public int getSprites() {
        return sprites;
    }

    public void setSprites(int sprites) {
        this.sprites = sprites;
    }
    
    public int getLogic() {
        return logic;
    }

    public void setLogic(int logic) {
        this.logic = logic;
    }
    
    public int getDLC() {
        return DLC;
    }

    public void setDLC(int DLC) {
        this.DLC = DLC;
    }
    
    public void addProduct(int productQty, int type){
    if(type == 0){
        setLevels(getLevels()+productQty);
    }else if(type == 1){
        setNarrative(getNarrative()+productQty);
    }else if(type == 2){
        setSprites(getSprites()+productQty);
    }else if(type == 3){
        setLogic(getLogic()+productQty);
    }else if(type == 4){
        setDLC(getDLC()+productQty);
    }else{
        System.out.println("Error, por favor, inténtelo de nuevo");
    }
    }
}
