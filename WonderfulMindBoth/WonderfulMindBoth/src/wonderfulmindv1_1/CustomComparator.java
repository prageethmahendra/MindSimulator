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
public class CustomComparator implements Comparator<String> {

    ArrayList<String> array;

    public CustomComparator() {
        array = new ArrayList<String>();
        array.add("somanassasahagata ditthigatasampayutta asankharika citta");
        array.add("somanassasahagata ditthigatasampayutta sasankharika citta");
        array.add("somanassasahagata ditthigatavippayutta asankharika citta");
        array.add("somanassasahagata ditthigatavippayutta sasankharika citta");
        array.add("upekkhasahagata ditthigatasampayutta asankharika citta");
        array.add("upekkhasahagata ditthigatasampayutta sasankharika citta");
        array.add("upekkhasahagata ditthigatavippayutta asankharika citta");
        array.add("upekkhasahagata ditthigatavippayutta sasankharika citta");
        array.add("domanassasahagata patighasampayutta asankharika citta");
        array.add("domanassasahagata patighasampayutta sasankharika citta");
        array.add("upekkhasahagata vicikicchasampayutta citta");
        array.add("upekkhasahagata uddhaccasampayutta citta");
        array.add("upekkhasahagata cakkhuvinnana akusala vipaka citta");
        array.add("upekkhasahagata sotavinnana akusala vipaka citta");
        array.add("upekkhasahagata ghanavinnana akusala vipaka citta");
        array.add("upekkhasahagata jivhavinnana akusala vipaka citta");
        array.add("dukkhasahagata kayavinnana akusala vipaka citta");
        array.add("upekkhasahagata sampaticchana akusala vipaka citta");
        array.add("upekkhasahagata santirana akusala vipaka citta");
        array.add("upekkhasahagata cakkhuvinnana kusala vipaka citta");
        array.add("upekkhasahagata sotavinnana kusala vipaka citta");
        array.add("upekkhasahagata ghanavinnana kusala vipaka citta");
        array.add("upekkhasahagata jivhavinnana kusala vipaka citta");
        array.add("sukhasahagata kayavinnana kusala vipaka citta");
        array.add("upekkhasahagata sampaticchana kusala vipaka citta");
        array.add("upekkhasahagata santirana kusala vipaka citta");
        array.add("somanassasahagata santirana kusala vipaka citta");
        array.add("upekkhasahagata manodvaravajjana kriya citta");
        array.add("upekkhasahagata pancadvaravajjana kriya citta");
        array.add("somanassasahagata hasituppada kriya citta");
        array.add("somanassasahagata nanasampayutta asankharika kusal citta");
        array.add("somanassasahagata nanasampayutta sasankharika kusal citta");
        array.add("somanassasahagata nanavippayutta asankharika kusal citta");
        array.add("somanassasahagata nanavippayutta sasankharika kusal citta");
        array.add("upekkhasahagata nanasampayutta asankharika kusal citta");
        array.add("upekkhasahagata nanasampayutta sasankharika kusal citta");
        array.add("upekkhasahagata nanavippayutta asankharika kusal citta");
        array.add("upekkhasahagata nanavippayutta sasankharika kusal citta");
        array.add("somanassasahagata nanasampayutta asankharika vipaka citta");
        array.add("somanassasahagata nanasampayutta sasankharika vipaka citta");
        array.add("somanassasahagata nanavippayutta asankharika vipaka citta");
        array.add("somanassasahagata nanavippayutta sasankharika vipaka citta");
        array.add("upekkhasahagata nanasampayutta asankharika vipaka citta");
        array.add("upekkhasahagata nanasampayutta sasankharika vipaka citta");
        array.add("upekkhasahagata nanavippayutta asankharika vipaka citta");
        array.add("upekkhasahagata nanavippayutta sasankharika vipaka citta");
        array.add("somanassasahagata nanasampayutta asankharika kriya citta");
        array.add("somanassasahagata nanasampayutta sasankharika kriya citta");
        array.add("somanassasahagata nanavippayutta asankharika kriya citta");
        array.add("somanassasahagata nanavippayutta sasankharika kriya citta");
        array.add("upekkhasahagata nanasampayutta asankharika kriya citta");
        array.add("upekkhasahagata nanasampayutta sasankharika kriya citta");
        array.add("upekkhasahagata nanavippayutta asankharika kriya citta");
        array.add("upekkhasahagata nanavippayutta sasankharika kriya citta");
        array.add("vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta");
        array.add("vicara piti sukha ekaggata sahita dutiyajjhana kusala citta");
        array.add("piti sukha ekaggata sahita tatiyajjhana kusala citta");
        array.add("sukha ekaggata sahita catutthajjhana kusala citta");
        array.add("upekkh ekaggata sahita pancamajjhana kusala citta");
        array.add("vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta");
        array.add("vicara piti sukha ekaggata sahita dutiyajjhana kriya citta");
        array.add("piti sukha ekaggata sahita tatiyajjhana kriya citta");
        array.add("sukha ekaggata sahita catutthajjhana kriya citta");
        array.add("upekkh ekaggata sahita pancamajjhana kriya citta");
        array.add("vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta");
        array.add("vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta");
        array.add("piti sukha ekaggata sahita tatiyajjhana vipaka citta");
        array.add("sukha ekaggata sahita catutthajjhana vipaka citta");
        array.add("upekkh ekaggata sahita pancamajjhana vipaka citta");
        array.add("akasanancayatana kusala citta");
        array.add("vinnanancayatana kusala citta");
        array.add("akincannayatana kusala citta");
        array.add("nevasannanasannayatana kusala citta");
        array.add("akasanancayatana vipaka citta");
        array.add("vinnanancayatana vipaka citta");
        array.add("akincannayatana vipaka citta");
        array.add("nevasannanasannayatana vipaka citta");
        array.add("akasanancayatana kriya citta");
        array.add("vinnanancayatana kriya citta");
        array.add("akincannayatana kriya citta");
        array.add("nevasannanasannayatana kriya citta");
        array.add("prathama dhyana shrothapathi mharga citta");
        array.add("dwitheeya dhyana shrothapathi mharga citta");
        array.add("thrutheeya dhyana shrothapathi mharga citta");
        array.add("chathurtha dhyana shrothapathi mharga citta");
        array.add("panchama dhyana shrothapathi mharga citta");
        array.add("prathama dhyana sakadagami mharga citta");
        array.add("dwitheeya dhyana sakadagami mharga citta");
        array.add("thrutheeya dhyana sakadagami mharga citta");
        array.add("chathurtha dhyana sakadagami mharga citta");
        array.add("panchama dhyana sakadagami mharga citta");
        array.add("prathama dhyana anagami mharga citta");
        array.add("dwitheeya dhyana anagami mharga citta");
        array.add("thrutheeya dhyana anagami mharga citta");
        array.add("chathurtha dhyana anagami mharga citta");
        array.add("panchama dhyana anagami mharga citta");
        array.add("prathama dhyana arahath mharga citta");
        array.add("dwitheeya dhyana arahath mharga citta");
        array.add("thrutheeya dhyana arahath mharga citta");
        array.add("chathurtha dhyana arahath mharga citta");
        array.add("panchama dhyana arahath mharga citta");
        array.add("prathama dhyana shrothapathi phala citta");
        array.add("dwitheeya dhyana shrothapathi phala citta");
        array.add("thrutheeya dhyana shrothapathi phala citta");
        array.add("chathurtha dhyana shrothapathi phala citta");
        array.add("panchama dhyana shrothapathi phala citta");
        array.add("prathama dhyana sakadagami phala citta");
        array.add("dwitheeya dhyana sakadagami phala citta");
        array.add("thrutheeya dhyana sakadagami phala citta");
        array.add("chathurtha dhyana sakadagami phala citta");
        array.add("panchama dhyana sakadagami phala citta");
        array.add("prathama dhyana anagami phala citta");
        array.add("dwitheeya dhyana anagami phala citta");
        array.add("thrutheeya dhyana anagami phala citta");
        array.add("chathurtha dhyana anagami phala citta");
        array.add("panchama dhyana anagami phala citta");
        array.add("prathama dhyana arahath phala citta");
        array.add("dwitheeya dhyana arahath phala citta");
        array.add("thrutheeya dhyana arahath phala citta");
        array.add("chathurtha dhyana arahath phala citta");
        array.add("panchama dhyana arahath phala citta");

    }

    @Override
    public int compare(String o1, String o2) {
        String ind1 = array.indexOf(o1)+"";
        String ind2 = array.indexOf(o2)+"";
       // System.out.println(ind1+" "+ind2);
        return ind1.compareTo(ind2);
    }
    
   
}
