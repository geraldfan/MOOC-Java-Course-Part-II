
import java.util.ArrayList;
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
public class Dictionary {

    private HashMap<String, String> words = new HashMap<String, String>();

    public Dictionary() {

    }

    public String translate(String word) {
        if (words.containsKey(word)) {
            return words.get(word);
        } else {
            return null;
        }
    }

    public void add(String word, String translation) {
        words.put(word, translation);
    }

    public int amountOfWords() {
        return words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : words.keySet()) {
            translationList.add(key + " = " + words.get(key));
        }
        return translationList;
    }
}
