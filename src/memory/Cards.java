/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory;
import java.util.ArrayList;

/**
 *
 * @author bradd
 */
public class Cards {
    private ArrayList<Card> cardList;

    public Cards() {
        this.cardList = new ArrayList<Card>();
    }
    
    public void addNewCard(Card card){
        this.cardList.add(card);
    }
    public void removeCard(Card card){
        this.cardList.remove(card);
    }
    
    
}
