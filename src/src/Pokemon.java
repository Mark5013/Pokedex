package src;

public class Pokemon implements pInterface{

    private String type;
    private String weakness;
    private String[] moveSet;
    private boolean discovered;
    private boolean captured;
    private String name;
    private Pokemon firstEvolution;
    private Pokemon secondEvolution;

    //Constructor for all variables
    public Pokemon(String name, String type, String weakness, boolean discovered, boolean captured){
        this.name = name;
        this.type = type;
        this.weakness = weakness;
        this.discovered = discovered;
        this.captured = captured;
    }
    //Constructor for solely the name
    public Pokemon(String name){
        this.name = name;
    }
    //Constructor for name/type
    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }
    //Constructor for no info
    public Pokemon(){

    }

    //Sets type
    @Override
    public void setType(String type){
        this.type = type;
    }
    //Gets type
    @Override
    public String getType(){
        return type;
    }

    //Sets weakness
    @Override
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
    //Gets weakness
    @Override
    public String getWeakness(){
        return weakness;
    }

    //Sets move
    @Override
    public void setMove(int moveNumber, String moveName){
        moveSet[moveNumber] = moveName;
    }
    //Gets move
    @Override
    public String getMove(int moveNumber){
        return moveSet[moveNumber];
    }

    //Gets discovered
    @Override
    public boolean getDiscovered(){
        return discovered;
    }
    //Sets discovered
    @Override
    public void setDiscovered(boolean discovered){
        this.discovered = discovered;
    }

    //Checks if captured
    @Override
    public boolean getCaptured(){
        return captured;
    }
    //Sets captured
    @Override
    public void setCaptured(boolean captured){
        this.captured = captured;
    }

    //Sets name
    @Override
    public void setName(String name){
        this.name = name;
    }
    //Gets name
    @Override
    public String getName(){
        return name;
    }

    //Displays Pokemon Information
    @Override
    public String toString(){
        return name + " is the " + this.getType() + "-type Pokemon. It is weak to " + this.getWeakness() + " type Pokemon.";
    }

    //Set first evolution
    public void setFirstEvo(Pokemon pokemon){
        this.firstEvolution = pokemon;
    }
    //Get first evolution
    public Pokemon getFirstEvo(){
        return firstEvolution;
    }

    //Set second evolution
    public void setSecondEvo(Pokemon pokemon){
        this.secondEvolution = pokemon;
    }
    //Get second evolution
    public Pokemon getSecondEvo(){
        return secondEvolution;
    }

}