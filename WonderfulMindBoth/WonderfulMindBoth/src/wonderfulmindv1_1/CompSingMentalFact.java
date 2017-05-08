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
public class CompSingMentalFact implements Comparator<String> {

    ArrayList<String> array;

    public CompSingMentalFact() {
        array = new ArrayList<String>();
        array.add("ඵස්ස");
        array.add("වෙදනා");
        array.add("සන්ග්යා");
        array.add("චෙතනා");
        array.add("එකග්ඝතා");
        array.add("ජීවිතෙන්ද්‍රීය");
        array.add("මනසිකාරය");
        array.add("විතක්ක");
        array.add("විචාර");
        array.add("අදිමොක්ක");
        array.add("වීරිය");
        array.add("ප්‍රීති");
        array.add("චන්ද");
        array.add("මොහ");
        array.add("අහිරික");
        array.add("අනොත්පාද");
        array.add("උදච්ච");
        array.add("ලොභ");
        array.add("දිට්ටි");
        array.add("මාන");
        array.add("දොස");
        array.add("ඉස්සා");
        array.add("මිචචරිය");
        array.add("කුකුච්ච");
        array.add("තීන");
        array.add("මිද්ද");
        array.add("විචිකිචා");
        array.add("සද්දා");
        array.add("සති");
        array.add("හිරි");
        array.add("ඔතප්ප");
        array.add("අලොභ");
        array.add("අදොස");
        array.add("තත්‍රමජන්තත");
        array.add("කාය පසාදි");
        array.add("චිත්ත පසාද");
        array.add("කාය ලහුතා");
        array.add("චිතත ලහුතා");
        array.add("කාය මුදුතා");
        array.add("චිතත මුදුත");
        array.add("කාය කම්මගතා");
        array.add("චිත්ත කම්මගතා");
        array.add("කාය ප්‍රගුන්යතා");
        array.add("චිත්ත ප්‍රගුන්යතා");
        array.add("කයුජ්ජුකතා");
        array.add("චිත්තයුජ්ජුකතා");
        array.add("සම්මා වචා");
        array.add("සම්මා කම්මන්ත");
        array.add("සම්මා ආජීව");
        array.add("කරුනා");
        array.add("මුදිතා");
        array.add("ප්‍රග්න්යා");
        
        
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
