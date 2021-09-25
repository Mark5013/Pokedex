package src;

public interface pInterface{

    /*Interface for the pokemon object*/
    

    //Set type of the pokemon
    void setType(String type);

    //Gets type of the pokemon
    String getType();
        
    //Set the weakness of the pokemon
    void setWeakness(String weakness);
  
    //Get the weakness of the pokemon
    String getWeakness();

    //Set the specific move number to the inputed move
    void setMove(int moveNumber, String moveName);
  
    //Get the move for the specific move number
    String getMove(int moveNumber);

    //Checks if the pokemon has been discovered or not
    boolean getDiscovered();

    //Sets the pokemon to discovered or not
    void setDiscovered(boolean discovered);

    //Checks if the pokemon has been captured or not
    boolean getCaptured();

    //Sets the pokemon to captured or not
    void setCaptured(boolean captured);

    //Sets the name of the pokemon
    void setName(String name);

    //Gets the name of the pokemon
    String getName();

    //Displays Pokemon Information
    String toString();


}