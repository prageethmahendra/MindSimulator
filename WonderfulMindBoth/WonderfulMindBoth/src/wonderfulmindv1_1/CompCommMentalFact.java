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
public class CompCommMentalFact implements Comparator<String> {

    ArrayList<String> array;

    public CompCommMentalFact() {
        array = new ArrayList<String>();
        array.add("phassa");
        array.add("vedhana");
        array.add("sangya");
        array.add("chethana");
        array.add("ekagatha");
        array.add("jeewitheedriya");
        array.add("manasikaraya");
        array.add("vithakka");
        array.add("vichara");
        array.add("adhimokkha");
        array.add("veeriya");
        array.add("preethi");
        array.add("chandha");
        array.add("moha");
        array.add("ahirika");
        array.add("anoththaptha");
        array.add("udhacha");
        array.add("lobha");
        array.add("dhitti");
        array.add("mana");
        array.add("dhosa");
        array.add("issa");
        array.add("michariya");
        array.add("kukucha");
        array.add("theena");
        array.add("middha");
        array.add("vichikicha");
        array.add("saddha");
        array.add("sathi");
        array.add("hiri");
        array.add("othappa");
        array.add("alobha");
        array.add("adhosa");
        array.add("thathramajanthatha");
        array.add("kaya passadhi");
        array.add("chitha passadhi");
        array.add("kaya lahutha");
        array.add("chitha lahutha");
        array.add("kaya mutdutha");
        array.add("chittha mutdutha");
        array.add("kaya kammagatha");
        array.add("chittha kammagatha");
        array.add("kaya pragungyatha");
        array.add("chitta pragungyatha");
        array.add("kayujjukatha");
        array.add("chithayujjuktha");
        array.add("samma wacha");
        array.add("samma kamantha");
        array.add("samma arjeewa");
        array.add("karuna");
        array.add("mudhitha");
        array.add("pragnya");
    }

    @Override
    public int compare(String o1, String o2) {
        int ind1 = array.indexOf(o1);
        int ind2 = array.indexOf(o2);
        //System.out.println(o1+" "+ind1+" "+ o2+" "+ind2);
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
