package src;
import java.util.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class gFourDex extends Pokemon implements gFourDexInterface {

    //ArrayList of all Pokemon in the pokedex
    ArrayList<Pokemon> Pokedex;

    public gFourDex() throws FileNotFoundException{

        //Fills up Pokedex with Pokemon Objects using their name
        Pokedex = new ArrayList<Pokemon>();
        File pokemonNames = new File("pokemonNames.txt");
        Scanner scnr = new Scanner(pokemonNames);
        scnr.useDelimiter(", ");
        while(scnr.hasNext()){
            String name = scnr.next();
            String type = "";
            if(scnr.hasNext()){
                type = scnr.next();
            }
            Pokedex.add(new Pokemon(name,type));
        }
        scnr.close();
    }

    public ArrayList<Pokemon> getPokedex(){
        return Pokedex;
    }

    @Override
    //Searchs pokedex by pokemon name and returns pokemon
    public void search (String pokemonName) {
        int low = 0;
        int high = Pokedex.size()- 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(Pokedex.get(mid).getName().compareToIgnoreCase(pokemonName) == 0){
                System.out.println(Pokedex.get(mid).toString());
                return;
            }
            else if(Pokedex.get(mid).getName().compareToIgnoreCase(pokemonName) < 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println("Pokemon is not in Pokedex");
    }


    @Override
    //Searchs pokedex by type and returns a string with all pokemon with that type
    public void searchByType(String type) {
        ArrayList<Pokemon> list = new ArrayList<Pokemon>();
        String pokemonList = "The " + type + " pokemon are:";
        for(int i = 0; i < Pokedex.size(); ++i){
            if(Pokedex.get(i).getType().toUpperCase().contains(type.toUpperCase())){
                list.add(Pokedex.get(i));
            }
        }
        if(list.size() == 0){
            System.out.println("Not a valid type.");
            return;
        }
        for(int i = 0; i < list.size(); ++i){
            pokemonList += " " + list.get(i).getName() + ",";
        }
        System.out.println(pokemonList);
    }

    public static void main(String[] args) throws FileNotFoundException {
        gFourDex curClass = new gFourDex();
    

        System.out.println("Please enter the name of the Pokemon you would like to search for." 
                          +" The pokedex currently contains pokemon from Gen 1 to Gen 4.\n"
                          +"If you would like to search by"
                          +" type, please enter T. When you want to exit, press Q.");
        Scanner scnr2 = new Scanner(System.in);
        do{
            String pokemon = scnr2.next();
            if(pokemon.equalsIgnoreCase("Q")){
                System.out.println("Thank you for using the Pokedex!");
                break;
            }
            else if(pokemon.equalsIgnoreCase("T")){
                System.out.println("Please enter the type you would like to search for");
                do{
                    String type = scnr2.next();
                    if(type.equalsIgnoreCase("Q")){
                        System.out.println("Thank you for using the Pokedex!");
                        break;
                    }
                    curClass.searchByType(type);
                }while(true);
                
            }
            else if(!(pokemon.equalsIgnoreCase("Q")) && !(pokemon.equalsIgnoreCase("T"))){
                curClass.search(pokemon);
            }
        }while(true);
        scnr2.close();
        
    }
    
}