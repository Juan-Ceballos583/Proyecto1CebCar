
package Proyecto1.OS.Cariaco.Ceballos;

import javax.swing.JLabel;

public class Drive {
    private int levels;
    private int narrative;
    private int sprites;
    private int logic;
    private int DLC;
    private int daysRemaining;
    private int games;
    private int gamesDLC;
    private int gamesCounter;
    private JLabel[] labels;
    
    
    public Drive() {
        this.levels = 0;
        this.narrative = 0;
        this.sprites = 0;
        this.logic = 0;
        this.DLC = 0;
        this.daysRemaining= 5;
        this.games = 0;
        this.gamesDLC = 0;
        this.gamesCounter= 0;
        this.labels = new JLabel[5];
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
    
    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGamesDLC() {
        return gamesDLC;
    }

    public void setGamesDLC(int gamesDLC) {
        this.gamesDLC = gamesDLC;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.setLabels(labels);
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(int daysRemaining) {
        this.daysRemaining = daysRemaining;
    }

    public int getGamesCounter() {
        return gamesCounter;
    }

    public void setGamesCounter(int gamesCounter) {
        this.gamesCounter = gamesCounter;
    }
    
    public void addProduct(int productQty, String type){
        switch(type){
            case "Narrativa":
                if (narrative<25){
                    if ((narrative+productQty >25)){
                        narrative += (25-narrative);
                    }else{
                        narrative += productQty;
                    }
                    labels[0].setText("Texto:"+ Integer.toString(narrative));
                }
                break;
            
            case "Niveles":
                if (levels<20){
                    if ((levels+productQty >20)){
                        levels += (20-levels);
                    }else{
                        levels += productQty;
                    }
                    labels[0].setText("Texto:"+ Integer.toString(levels));
                }
                break;
            
            case "Sprites":
                if (sprites<55){
                    if ((sprites+productQty >55)){
                        sprites += (55-sprites);
                    }else{
                        sprites += productQty;
                    }
                    labels[0].setText("Texto:"+ Integer.toString(sprites));
                }
                break;
                
            case "Lógica":
                if (logic<35){
                    if ((logic+productQty >35)){
                        logic += (35-logic);
                    }else{
                        logic += productQty;
                    }
                    labels[0].setText("Texto:"+ Integer.toString(logic));
                }
                break;
                
            case "DLC":
                if (DLC<10){
                    if ((DLC+productQty >10)){
                        narrative += (10-DLC);
                    }else{
                        DLC += productQty;
                    }
                    labels[0].setText("Texto:"+ Integer.toString(DLC));
                }
                break;
        }
    }
}
