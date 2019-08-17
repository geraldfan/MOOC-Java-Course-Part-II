
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerald
 */
public class PromissoryNote {
    private HashMap<String,Double> accounts = new HashMap<String, Double> ();
    public PromissoryNote(){
        
    }
    public void setLoan(String toWhom, double value){
        accounts.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose){
        if(accounts.containsKey(whose)){
            return accounts.get(whose);
        } else{
            return 0;
        }
    }
}
