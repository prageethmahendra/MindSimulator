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
public class CustomComparatorEnglish implements Comparator<String> {

    ArrayList<String> array;

    public CustomComparatorEnglish() {
        array = new ArrayList<String>();
        array.add("\nOne consciousness, accompanied by joy, associated with wrong view, unprompted");
        array.add("\nOne consciousness, accompanied by joy, associated with wrong view, prompted");
        array.add("\nOne consciousness, accompanied by joy, dissociated from wrong view, unprompted");
        array.add("\nOne consciousness, accompanied by joy, dissociated from wrong view, prompted");
        array.add("\nOne consciousness, accompanied by equanimity, associated with wrong view, unprompted");
        array.add("\nOne consciousness, accompanied by equanimity, associated with wrong view, prompted");
        array.add("\nOne consciousness, accompanied by equanimity, dissociated from wrong view, unprompted");
        array.add("\nOne consciousness, accompanied by equanimity, dissociated from wrong view, prompted");
        array.add("\nOne consciousness, accompanied by displeasure, associated with aversion, unprompted");
        array.add("\nOne consciousness, accompanied by displeasure, associated with aversion, prompted");
        array.add("\nOne consciousness, accompanied by equanimity, associated with doubt");
        array.add("\nOne consciousness, accompanied by equanimity, associated with restlessness");
        array.add("\nUnwholesome resultant eye-consciousness accompanied by equanimity");
        array.add("\nUnwholesome resultant ear-consciousness accompanied by equanimity");
        array.add("\nUnwholesome resultant nose-consciousness accompanied by equanimity");
        array.add("\nUnwholesome resultant tongue-consciousness accompanied by equanimity");
        array.add("\nUnwholesome resultant body-consciousness accompanied by displeasure");
        array.add("\nUnwholesome resultant receiving consciousness accompanied by equanimity");
        array.add("\nUnwholesome resultant investigating consciousness accompanied by equanimity");
        array.add("\nWholesome resultant eye-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant ear-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant nose-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant tongue-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant body-consciousness accompanied by pleasure");
        array.add("\nWholesome resultant receiving-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant investigating-consciousness accompanied by equanimity");
        array.add("\nWholesome resultant investigating-consciousness accompanied by joy");
        array.add("\nRootless functional five-sense-door adverting consciousness accompanied by equanimity");
        array.add("\nRootless functional five-sense-door adverting consciousness accompanied by equanimity");
        array.add("\nRootless functional smile-producing consciousness accompanied by joy");
        array.add("\nWholesome consciousness accompanied by joy, associated with knowledge, unprompted");
        array.add("\nWholesome consciousness accompanied by joy, associated with knowledge, prompted");
        array.add("\nWholesome consciousness accompanied by joy, disassociated with knowledge, unprompted");
        array.add("\nWholesome consciousness accompanied by joy, disassociated with knowledge, prompted");
        array.add("\nWholesome consciousness accompanied by equanimity, associated with knowledge, unprompted");
        array.add("\nWholesome consciousness accompanied by equanimity, associated with knowledge, prompted");
        array.add("\nWholesome consciousness accompanied by equanimity, disassociated with knowledge, unprompted");
        array.add("\nWholesome consciousness accompanied by equanimity, disassociated with knowledge, prompted");
        array.add("\nWholesome-resultant consciousness accompanied by joy, associated with knowledge, unprompted");
        array.add("\nWholesome-resultant consciousness accompanied by joy, associated with knowledge, prompted");
        array.add("\nWholesome-resultant consciousness accompanied by joy, disassociated with knowledge, unprompted");
        array.add("\nWholesome-resultant consciousness accompanied by joy, disassociated with knowledge, prompted");
        array.add("\nWholesome-resultant consciousness accompanied by equanimity, associated with knowledge, unprompted");
        array.add("\nWholesome-resultant consciousness accompanied by equanimity, associated with knowledge, prompted");
        array.add("\nWholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, unprompted");
        array.add("\nWholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, prompted ");
        array.add("\nWholesome-functional consciousness accompanied by joy, associated with knowledge, unprompted");
        array.add("\nWholesome-functional consciousness accompanied by joy, associated with knowledge, prompted");
        array.add("\nWholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted");
        array.add("\nWholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted");
        array.add("\nWholesome-functional consciousness accompanied by equanimity, associated with knowledge, unprompted");
        array.add("\nWholesome-functional consciousness accompanied by equanimity, associated with knowledge,  prompted");
        array.add("\nWholesome functional consciousness accompanied by equanimity, disassociated with knowledge, unprompted");
        array.add("\nWholesome functional consciousness accompanied by equanimity, disassociated with knowledge, prompted");
        array.add("\nFirst jhana wholesome consciousness together with initial application, sustained application, zest, happiness, and one-pointedness");
        array.add("\nSecond jhana wholesome consciousness together with sustained application, zest, happiness, and one-pointedness");
        array.add("\nThird jhana wholesome consciousness together with zest, happiness, and one-pointedness");
        array.add("\nFourth jhana wholesome consciousness together with happiness and one-pointedness");
        array.add("\nFifth jhana wholesome consciousness together with equanimity and one-pointedness");
        array.add("\nFirst jhana resultant consciousness together with initial application, sustained application, zest, happiness, and one-pointedness");
        array.add("\nSecond jhana resultant consciousness together with sustained application, zest, happiness, and one-pointedness");
        array.add("\nThird jhana resultant consciousness together with zest, happiness and one-pointedness");
        array.add("\nFourth jhana resultant consciousness together with happiness and one-pointedness");
        array.add("\nFifth jhana resultant consciousness together with equanimity and one-pointedness");
        array.add("\nFirst jhana functional consciousness together with initial application, sustained application, zest, happiness and one-pointedness");
        array.add("\nSecond jhana functional consciousness together with sustained application, zest, happiness, and one-pointedness");
        array.add("\nThird jhana functional consciousness together with zest, happiness and one-pointedness");
        array.add("\nFourth jhana functional consciousness together with happiness and one-pointedness");
        array.add("\nFifth jhana functional consciousness together with equanimity and one-pointedness");
        array.add("\nWholesome consciousness pertaining to the base of infinite space");
        array.add("\nWholesome consciousness pertaining to the base of infinite consciousness.");
        array.add("\nWholesome consciousness pertaining to the base of nothingness");
        array.add("\nWholesome consciousness pertaining to the base of neither-perception-nor-non-perception");
        array.add("\nResultant consciousness pertaining to the base of infinite space");
        array.add("\nResultant consciousness pertaining to the base of infinite consciousness");
        array.add("\nResultant consciousness pertaining to the base of nothingness");
        array.add("\nResultant consciousness pertaining to the base of neither- perception-nor-non-perception");
        array.add("\nFunctional consciousness pertaining to the base of infinite space");
        array.add("\nFunctional consciousness pertaining to the base of infinite consciousness");
        array.add("\nFunctional consciousness pertaining to the base of nothingness");
        array.add("\nFunctional consciousness pertaining to the base of neitherperception-nor-non-perception");
        array.add("\nThe first Jhana, path consciousness of stream-entry");
        array.add("\nThe second Jhana, path consciousness of stream-entry");
        array.add("\nThe third Jhana, path consciousness of stream-entry");
        array.add("\nThe fourth Jhana, path consciousness of stream-entry");
        array.add("\nThe fifth Jhana, path consciousness of stream-entry");
        array.add("\nThe first Jhana, path consciousness of once-returning");
        array.add("\nThe second Jhana, path consciousness of once-returning");
        array.add("\nThe third Jhana, path consciousness of once-returning");
        array.add("\nThe fourth Jhana, path consciousness of once-returning");
        array.add("\nThe fifth Jhana, path consciousness of once-returning");
        array.add("\nThe first Jhana, path consciousness of non-returning");
        array.add("\nThe second Jhana, path consciousness of non-returning");
        array.add("\nThe third Jhana, path consciousness of non-returning");
        array.add("\nThe fourth Jhana, path consciousness of non-returning");
        array.add("\nThe fifth Jhana, path consciousness of non-returning");
        array.add("\nThe first Jhana, path consciousness of Arahantship");
        array.add("\nThe second Jhana, path consciousness of Arahantship");
        array.add("\nThe third Jhana, path consciousness of Arahantship");
        array.add("\nThe fourth Jhana, path consciousness of Arahantship");
        array.add("\nThe fifth Jhana, path consciousness of Arahantship");
        array.add("\nThe first Jhana, fruition consciousness of stream-entry");
        array.add("\nThe second Jhana, fruition consciousness of stream-entry");
        array.add("\nThe third Jhana, fruition consciousness of stream-entry");
        array.add("\nThe fourth Jhana, fruition consciousness of stream-entry");
        array.add("\nThe fifth Jhana, fruition consciousness of stream-entry");
        array.add("\nThe first Jhana, fruition consciousness of once-returning");
        array.add("\nThe second Jhana, fruition consciousness of once-returning");
        array.add("\nThe third Jhana, fruition consciousness of once-returning");
        array.add("\nThe fourth Jhana, fruition consciousness of once-returning");
        array.add("\nThe fifth Jhana, fruition consciousness of once-returning");
        array.add("\nThe first Jhana, fruition consciousness of non-returning");
        array.add("\nThe second Jhana, fruition consciousness of non-returning");
        array.add("\nThe third Jhana, fruition consciousness of non-returning");
        array.add("\nThe fourth Jhana, fruition consciousness of non-returning");
        array.add("\nThe fifth Jhana, fruition consciousness of non-returning");
        array.add("\nThe first Jhana, fruition consciousness of Arahantship");
        array.add("\nThe second Jhana, fruition consciousness of Arahantship");
        array.add("\nThe third Jhana, fruition consciousness of Arahantship");
        array.add("\nThe fourth Jhana, fruition consciousness of Arahantship");
        array.add("\nThe fifth Jhana, fruition consciousness of Arahantship");
        

    }

    @Override
    public int compare(String o1, String o2) {
        String ind1 = array.indexOf(o1) + "";
        String ind2 = array.indexOf(o2) + "";
        //System.out.println(array.indexOf(o1) + " " + array.indexOf(o2));
        return ind1.compareTo(ind2);
    }
}
