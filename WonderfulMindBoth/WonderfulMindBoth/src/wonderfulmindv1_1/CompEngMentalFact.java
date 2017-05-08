/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wonderfulmindv1_1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author harindra
 */
public class CompEngMentalFact implements Comparator<String> {

    ArrayList<String> array;

    public CompEngMentalFact() {
        array = new ArrayList<String>();
        array.add("Contact");
        array.add("Feeling");
        array.add("Perception");
        array.add("Volition");
        array.add("One-pointedness");
        array.add("Psychic life");
        array.add("Attention");
        array.add("Initial application");
        array.add("Sustained application");
        array.add("Decision");
        array.add("Energy");
        array.add("Zest");
        array.add("Desire");
        array.add("Delusion");
        array.add("Shamelessness");
        array.add("Fearlessness of wrong");
        array.add("Restlessness");
        array.add("Greed");
        array.add("Wrong view");
        array.add("Conceit");
        array.add("Hatred");
        array.add("Jealousy");
        array.add("Avarice");
        array.add("Worry");
        array.add("Sloth");
        array.add("Torpor");
        array.add("Doubt");
        array.add("Confidence");
        array.add("Mindfulness");
        array.add("Shame");
        array.add("Dread");
        array.add("Non-greed");
        array.add("Non-hatred");
        array.add("Equanimity");
        array.add("Tranquility of mental states");
        array.add("Tranquility of mind");
        array.add("Lightness of mental states");
        array.add("Lightness of mind");
        array.add("Pliancy of mental states");
        array.add("Pliancy of mind");
        array.add("Adaptability of mental states");
        array.add("Adaptability of mind");
        array.add("Proficiency of metal states");
        array.add("Proficiency of mind");
        array.add("Rectitude of mental states");
        array.add("Rectitude of mind");
        array.add("Right speech");
        array.add("Right actions");
        array.add("Right livelihood");
        array.add("Compassion");
        array.add("Appreciative Joy");
        array.add("Wisdom Faculty");
        
        
    }

    @Override
    public int compare(String o1, String o2) {
        int ind1 = array.indexOf(o1);
        int ind2 = array.indexOf(o2);
        System.out.println(o1+" "+ind1+" "+ o2+" "+ind2);
        if (ind1>ind2) {
            return 1;
        }
        else if (ind2>ind1) {
            return -1;
        }
        else{
            return 0;
        }
    }
    
   
}
