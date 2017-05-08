/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonderfulmindv1_1;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harindra
 */
public class Utilities {

    public static HashMap<String, String> ethicallyVariablesArray = new HashMap<String, String>();
    public static HashMap<String, String> unwholesomeFactorsArray = new HashMap<String, String>();
    public static HashMap<String, String> beautifulFactorsArray = new HashMap<String, String>();

    //1.When Universals are not selected

    public static boolean universalsNotSelected(JPanel jPanel4) {
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        boolean selected = true;
        for (Component comp : jPanel4.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (!comp.isSelected()) {
                selected = false;
                break;
            }
        }

        return selected;

    }

    public static void selectUniversal(JPanel jPanel4) {
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel4.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            comp.setSelected(true);
        }

    }

    //2.Selecting any Unwholesome with any Beautiful factors
    public static void unwholesomeWithAnyBeautifulFactors(JPanel jpanel10, JPanel jpanel11, JPanel jpanel25, JPanel jpanel26, JPanel akusalasadarana, JPanel loba, JPanel dosha, JPanel theenamidda, JPanel vichikicha, JCheckBox jCheckBox11) {
        boolean selected = false;

        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel15 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel11.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel15.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel15) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel16 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel25.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel16.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel16) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel17 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel26.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel17.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel17) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        if (selected) {
            JOptionPane.showMessageDialog(null, "Unwholesome and Beautiful factors cannot co-exist.");

            List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : akusalasadarana.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel5.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel6 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : loba.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel6.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel6) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
            List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : dosha.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel7.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
            List<javax.swing.JCheckBox> checkboxesForPanel8 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : vichikicha.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel8.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel8) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
            List<javax.swing.JCheckBox> checkboxesForPanel9 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : theenamidda.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel9.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel9) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
        } else {
            if (!jCheckBox11.isSelected()) {
                JOptionPane.showMessageDialog(null, "Energy appears in all choices of Unwholesome and beautiful mental factors.");
                jCheckBox11.setSelected(true);
            }
        }

    }

    //3.When selecting any one from greed group and one from hatred group
    public static void greedHatredTogetherCannot(JPanel jPanel28, JPanel jPanel29) {
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        boolean greed = false;
        boolean hatred = false;
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (comp.isSelected()) {
                greed = true;
                break;
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
            if (comp.isSelected()) {
                hatred = true;
                break;
            }
        }
        if (greed && hatred) {
            JOptionPane.showMessageDialog(null, "Greed group and Hatred group cannot co-exist.");

            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
        }

    }

    //4.When selecting a mental factor under unwholesome occasional
    public static void selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(JPanel jPanel7, JCheckBox jCheckBox11, JPanel jpanel10, JPanel jpanel11, JPanel jpanel25, JPanel jpanel26) {

        Utilities.selectUnwholesomeUniversal(jPanel7, jCheckBox11, jpanel10, jpanel11, jpanel25, jpanel26);
    }

    public static void selectUnwholesomeUniversal(JPanel jPanel7, JCheckBox jCheckBox11, JPanel jpanel10, JPanel jpanel11, JPanel jpanel25, JPanel jpanel26) {
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelect = true;
        for (Component comp : jPanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }

        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (!comp.isSelected()) {
                isSelect = false;
                break;
            }
        }

        boolean isSelectBeutiful = false;
        List<javax.swing.JCheckBox> checkboxesForPanel9 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel9.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel9) {
            if (comp.isSelected()) {
                isSelectBeutiful = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel11.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel10.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
            if (comp.isSelected()) {
                isSelectBeutiful = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel25.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (comp.isSelected()) {
                isSelectBeutiful = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel12 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel26.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel12.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel12) {
            if (comp.isSelected()) {
                isSelectBeutiful = true;
                break;
            }
        }
        if (!isSelect && !isSelectBeutiful) {
            JOptionPane.showMessageDialog(null, "Select Unwholesome Universals.");
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                comp.setSelected(true);
            }

            if (!jCheckBox11.isSelected()) {
                JOptionPane.showMessageDialog(null, "Energy appears in all choice of Unwholesome and beautiful mental factors.");
                jCheckBox11.setSelected(true);
            }
        }

    }

    //5.	When selecting a abstinence, illimitable or Non-delusion
    public static void selectBeautifulFactors(JPanel jpanel10, JPanel jpanel11, JPanel jpanel26, JPanel jpanel25, JCheckBox jCheckBox11, JPanel jpanel7, JPanel jpanel28, JPanel jpanel29, JPanel jpanel30, JPanel jpanel31) {
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelect = true;
        for (Component comp : jpanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }

        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (!comp.isSelected()) {
                isSelect = false;
                break;
            }
        }

        boolean selectedUnwholsome = false;
        List<javax.swing.JCheckBox> checkboxesForPanel9 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel9.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel9) {
            if (comp.isSelected()) {
                selectedUnwholsome = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel10.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
            if (comp.isSelected()) {
                selectedUnwholsome = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (comp.isSelected()) {
                selectedUnwholsome = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel12 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel12.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel12) {
            if (comp.isSelected()) {
                selectedUnwholsome = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel122 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel122.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel122) {
            if (comp.isSelected()) {
                selectedUnwholsome = true;
                break;
            }
        }

        if (selectedUnwholsome) {
            JOptionPane.showMessageDialog(null, "Unwholesome and Beautiful factors cannot co-exist.");
            List<javax.swing.JCheckBox> checkboxesForPanel19 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel10.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel19.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel19) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel110 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel11.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel110.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel110) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel111 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel25.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel111.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel111) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel112 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel26.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel112.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel112) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

        } else if (!isSelect) {
            JOptionPane.showMessageDialog(null, "Select Beautiful Universals.");
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                comp.setSelected(true);
            }

        }
        if (!jCheckBox11.isSelected()) {
            JOptionPane.showMessageDialog(null, "Energy appears in all choice of Unwholesome and beautiful mental factors.");
            jCheckBox11.setSelected(true);
        }
    }

    //6.When selecting Wrong view  and Conceit
    public static void wrongViewAndConsientCannotTogether(JCheckBox jCheckBox22, JCheckBox jCheckBox23) {
        boolean wrongViewSelected = jCheckBox22.isSelected();
        boolean consientSelected = jCheckBox23.isSelected();

        if (wrongViewSelected && consientSelected) {
            JOptionPane.showMessageDialog(null, "Wrong View and Conceit cannot co-exist.");
            jCheckBox22.setSelected(false);
            jCheckBox23.setSelected(false);
        }

    }

    public static void energyEnable(JCheckBox jCheckBox11) {
        if (!jCheckBox11.isSelected()) {
            JOptionPane.showMessageDialog(null, "Energy appears in all choice of Unwholesome and beautiful mental factors.");
            jCheckBox11.setSelected(true);
        }
    }

    //8.When Desire is not selected with Unwholesome or Beautiful
    public static void zestCannotBewithBeutifulAndUnwholesome(JCheckBox jCheckBox13, JPanel akusalasadarana, JPanel loba, JPanel dosha, JPanel theenamidda, JPanel vichikicha, JPanel jpanel10, JPanel jpanel11, JPanel jpanel25, JPanel jpanel26, JCheckBox jCheckBox12) {
        if (!jCheckBox13.isSelected()) {//If desire not selected
            boolean selected = false;

            List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : akusalasadarana.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel4.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : loba.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel5.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel6 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : dosha.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel6.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel6) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : theenamidda.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel7.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel8 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : vichikicha.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel8.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel8) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel9 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel10.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel9.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel9) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel11.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel10.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel25.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel11.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel12 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel26.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel12.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel12) {
                if (comp.isSelected()) {
                    selected = true;
                    break;
                }
            }

            if (selected) {
                JOptionPane.showMessageDialog(null, "Zest should appear with Desire.");
                jCheckBox12.setSelected(true);
                jCheckBox13.setSelected(true);
            }
        }
    }

    public static void unselectUnwholesomeUniversalIfSelected(JPanel jpanel7, JPanel jpanel28, JPanel jpanel29, JPanel jpanel30, JPanel jpanel31, JPanel jpanel10, JPanel jpanel11, JPanel jpanel25, JPanel jpanel26) {
        boolean selected = false;
        List<javax.swing.JCheckBox> checkboxesForPanel9 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel9.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel9) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel10.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel12 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel12.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel12) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        List<javax.swing.JCheckBox> checkboxesForPanel122 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jpanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel122.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel122) {
            if (comp.isSelected()) {
                selected = true;
                break;
            }
        }

        if (selected) {
            JOptionPane.showMessageDialog(null, "Unwholesome and Beautiful factors cannot co-exist.");
            List<javax.swing.JCheckBox> checkboxesForPanel19 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel10.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel19.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel19) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel110 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel11.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel110.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel110) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel111 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel25.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel111.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel111) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }

            List<javax.swing.JCheckBox> checkboxesForPanel112 = new ArrayList<javax.swing.JCheckBox>();
            for (Component comp : jpanel26.getComponents()) {
                if (comp instanceof javax.swing.JCheckBox) {
                    javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                    checkboxesForPanel112.add(check6);
                }
            }
            for (javax.swing.JCheckBox comp : checkboxesForPanel112) {
                if (comp.isSelected()) {
                    comp.setSelected(false);
                }
            }
        }

    }

    //9.When Sloth and Torpor is selected

    public static void slothTropper(JCheckBox jCheckBox28, JCheckBox jCheckBox29, JCheckBox jCheckBox30) {
        if (jCheckBox28.isSelected() && jCheckBox29.isSelected()) {
            JOptionPane.showMessageDialog(null, "Doubt cannot appear with Sloth and Torpor.");
            jCheckBox30.setSelected(false);
        }
    }

    public static void whenLobhaSelected(JCheckBox jCheckBox28, JCheckBox jCheckBox29, JCheckBox jCheckBox30) {
        if (jCheckBox28.isSelected()) {
            if ((!jCheckBox29.isSelected() || !jCheckBox30.isSelected()) == true) {
                JOptionPane.showMessageDialog(null, "Wrong view or Conceit should be selected with Greed.");
            }

        }
    }

    public static void whenDhittiSelected(JCheckBox jCheckBox28, JCheckBox jCheckBox29) {
        if (jCheckBox28.isSelected()==true && jCheckBox29.isSelected()==false) {//WrongView    Greed
            JOptionPane.showMessageDialog(null, "Greed should be selected with Wrong view.");
            jCheckBox29.setSelected(true);

        }
        if (jCheckBox28.isSelected()==false && jCheckBox29.isSelected()==true) {
            JOptionPane.showMessageDialog(null, "Wrong view or Conceit should be selected with Greed.");

        }
    }

    public static void whenManaSelected(JCheckBox jCheckBox28, JCheckBox jCheckBox29) {
        if (jCheckBox28.isSelected()==true &&  jCheckBox29.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "Greed should be selected with Conceit.");
            jCheckBox29.setSelected(true);

        }
        if (jCheckBox28.isSelected()==false && jCheckBox29.isSelected()==true) {
            JOptionPane.showMessageDialog(null, "Wrong view or Conceit should be selected with Greed.");

        }
    }
public static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) { /* TODO: error handling */ }
        } else { /* TODO: error handling */ }

    }
    public static boolean netIsAvailable() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }

    public static void setPercentages() {
        ethicallyVariablesArray = new HashMap<String, String>();
        unwholesomeFactorsArray = new HashMap<String, String>();
        beautifulFactorsArray = new HashMap<String, String>();

       ethicallyVariablesArray.put("somanassasahagata ditthigatasampayutta asankharika citta", "13");
        ethicallyVariablesArray.put("somanassasahagata ditthigatasampayutta sasankharika citta", "13");
        ethicallyVariablesArray.put("somanassasahagata ditthigatavippayutta asankharika citta", "13");
        ethicallyVariablesArray.put("somanassasahagata ditthigatavippayutta sasankharika citta", "13");
        ethicallyVariablesArray.put("upeksha sahagatha drushtigatha vipprayuktha asasankarika citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata ditthigatavippayutta sasankharika citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata ditthigatasampayutta asankharika citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata ditthigatasampayutta sasankharika citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata ditthigatavippayutta asankharika citta", "12");
        
        ethicallyVariablesArray.put("domanassasahagata patighasampayutta asankharika citta", "12");
        ethicallyVariablesArray.put("domanassasahagata patighasampayutta sasankharika citta", "12");
        
        ethicallyVariablesArray.put("upekkhasahagata vicikicchasampayutta citta", "10");
        ethicallyVariablesArray.put("upekkhasahagata uddhaccasampayutta citta", "11");
        
        ethicallyVariablesArray.put("upekkhasahagata cakkhuvinnana akusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata sotavinnana akusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata ghanavinnana akusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata jivhavinnana akusala vipaka citta", "7");
        ethicallyVariablesArray.put("dukkhasahagata kayavinnana akusala vipaka citta", "7");
        
        ethicallyVariablesArray.put("upekkhasahagata sampaticchana akusala vipaka citta", "10");
        ethicallyVariablesArray.put("upekkhasahagata santirana akusala vipaka citta", "10");
        
        ethicallyVariablesArray.put("upekkhasahagata cakkhuvinnana kusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata sotavinnana kusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata ghanavinnana kusala vipaka citta", "7");
        ethicallyVariablesArray.put("upekkhasahagata jivhavinnana kusala vipaka citta", "7");
        ethicallyVariablesArray.put("sukhasahagata kayavinnana kusala vipaka citta", "7");
        
        ethicallyVariablesArray.put("upekkhasahagata sampaticchana kusala vipaka citta", "10");
        ethicallyVariablesArray.put("upekkhasahagata santirana kusala vipaka citta", "10");
        ethicallyVariablesArray.put("somanassasahagata santirana kusala vipaka citta", "11");
        ethicallyVariablesArray.put("upekkhasahagata pancadvaravajjana kriya citta", "10");
        ethicallyVariablesArray.put("upekkhasahagata manodvaravajjana kriya citta", "11");
        ethicallyVariablesArray.put("somanassasahagata hasituppada kriya citta", "12");
////////////////////////Kusal//////////////////////,"") ;
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta asankharika kusal citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta sasankharika kusal citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta asankharika kusal citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta sasankharika kusal citta", "13");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta asankharika kusal citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta sasankharika kusal citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta asankharika kusal citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta sasankharika kusal citta", "12");
////////////////////////Vipaka//////////////////////,"") ;
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta asankharika vipaka citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta sasankharika vipaka citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta asankharika vipaka citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta sasankharika vipaka citta", "13");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta asankharika vipaka citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta sasankharika vipaka citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta asankharika vipaka citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta sasankharika vipaka citta", "12");
////////////////////////Kriya//////////////////////,"") ;
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta asankharika kriya citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanasampayutta sasankharika kriya citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta asankharika kriya citta", "13");
        ethicallyVariablesArray.put("somanassasahagata nanavippayutta sasankharika kriya citta", "13");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta asankharika kriya citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanasampayutta sasankharika kriya citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta asankharika kriya citta", "12");
        ethicallyVariablesArray.put("upekkhasahagata nanavippayutta sasankharika kriya citta", "12");
//////////////////ROOPAVACHARA?????,"") ;
/////////////Kusal///////,"") ;
        ethicallyVariablesArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta", "13");
        ethicallyVariablesArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kusala citta", "12");
        ethicallyVariablesArray.put("piti sukha ekaggata sahita tatiyajjhana kusala citta", "11");
        ethicallyVariablesArray.put("sukha ekaggata sahita catutthajjhana kusala citta", "10");
        ethicallyVariablesArray.put("upekkh ekaggata sahita pancamajjhana kusala citta", "10");

//////////////////ROOPAVACHARA?????,"") ;
        ethicallyVariablesArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta", "13");
        ethicallyVariablesArray.put("vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta", "12");
        ethicallyVariablesArray.put("piti sukha ekaggata sahita tatiyajjhana vipaka citta", "11");
        ethicallyVariablesArray.put("sukha ekaggata sahita catutthajjhana vipaka citta", "10");
        ethicallyVariablesArray.put("upekkh ekaggata sahita pancamajjhana vipaka citta", "10");

//////////////////ROOPAVACHARA?????,"") ;
////////////Kriya///////,"") ;
        ethicallyVariablesArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta", "13");
        ethicallyVariablesArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kriya citta", "12");
        ethicallyVariablesArray.put("piti sukha ekaggata sahita tatiyajjhana kriya citta", "11");
        ethicallyVariablesArray.put("sukha ekaggata sahita catutthajjhana kriya citta", "10");
        ethicallyVariablesArray.put("upekkh ekaggata sahita pancamajjhana kriya citta", "10");
//////////////////ROOPAVACHARA?????,"") ;
        ethicallyVariablesArray.put("akasanancayatana kusala citta", "10");
        ethicallyVariablesArray.put("vinnanancayatana kusala citta", "10");
        ethicallyVariablesArray.put("akincannayatana kusala citta", "10");
        ethicallyVariablesArray.put("nevasannanasannayatana kusala citta", "10");
        ethicallyVariablesArray.put("akasanancayatana vipaka citta", "10");
        ethicallyVariablesArray.put("vinnanancayatana vipaka citta", "10");
        ethicallyVariablesArray.put("akincannayatana vipaka citta", "10");
        ethicallyVariablesArray.put("nevasannanasannayatana vipaka citta", "10");
        ethicallyVariablesArray.put("akasanancayatana kriya citta", "10");
        ethicallyVariablesArray.put("vinnanancayatana kriya citta", "10");
        ethicallyVariablesArray.put("akincannayatana kriya citta", "10");
        ethicallyVariablesArray.put("nevasannanasannayatana kriya citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana shrothapathi mharga citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana shrothapathi mharga citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana shrothapathi mharga citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana shrothapathi mharga citta", "10");
        ethicallyVariablesArray.put("panchama dhyana shrothapathi mharga citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana sakadagami mharga citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana sakadagami mharga citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana sakadagami mharga citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana sakadagami mharga citta", "10");
        ethicallyVariablesArray.put("panchama dhyana sakadagami mharga citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana anagami mharga citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana anagami mharga citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana anagami mharga citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana anagami mharga citta", "10");
        ethicallyVariablesArray.put("panchama dhyana anagami mharga citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana arahath mharga citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana arahath mharga citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana arahath mharga citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana arahath mharga citta", "10");
        ethicallyVariablesArray.put("panchama dhyana arahath mharga citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana shrothapathi phala citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana shrothapathi phala citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana shrothapathi phala citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana shrothapathi phala citta", "10");
        ethicallyVariablesArray.put("panchama dhyana shrothapathi phala citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana sakadagami phala citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana sakadagami phala citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana sakadagami phala citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana sakadagami phala citta", "10");
        ethicallyVariablesArray.put("panchama dhyana sakadagami phala citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana anagami phala citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana anagami phala citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana anagami phala citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana anagami phala citta", "10");
        ethicallyVariablesArray.put("panchama dhyana anagami phala citta", "10");
        
        ethicallyVariablesArray.put("prathama dhyana arahath phala citta", "13");
        ethicallyVariablesArray.put("dwitheeya dhyana arahath phala citta", "12");
        ethicallyVariablesArray.put("thrutheeya dhyana arahath phala citta", "11");
        ethicallyVariablesArray.put("chathurtha dhyana arahath phala citta", "10");
        ethicallyVariablesArray.put("panchama dhyana arahath phala citta", "10");
        
        //######################################################
                unwholesomeFactorsArray.put("somanassasahagata ditthigatasampayutta asankharika citta", "6");
        unwholesomeFactorsArray.put("somanassasahagata ditthigatasampayutta sasankharika citta", "8");
        unwholesomeFactorsArray.put("somanassasahagata ditthigatavippayutta asankharika citta", "6");
        unwholesomeFactorsArray.put("somanassasahagata ditthigatavippayutta sasankharika citta", "8");
        unwholesomeFactorsArray.put("upeksha sahagatha drushtigatha vipprayuktha asasankarika citta", "6");
        unwholesomeFactorsArray.put("upekkhasahagata ditthigatavippayutta sasankharika citta", "8");
        unwholesomeFactorsArray.put("upekkhasahagata ditthigatasampayutta asankharika citta", "6");
        unwholesomeFactorsArray.put("upekkhasahagata ditthigatasampayutta sasankharika citta", "8");
        unwholesomeFactorsArray.put("upekkhasahagata ditthigatavippayutta asankharika citta", "6");
        
        unwholesomeFactorsArray.put("domanassasahagata patighasampayutta asankharika citta", "8");
        unwholesomeFactorsArray.put("domanassasahagata patighasampayutta sasankharika citta", "10");
        
        unwholesomeFactorsArray.put("upekkhasahagata vicikicchasampayutta citta", "5");
        unwholesomeFactorsArray.put("upekkhasahagata uddhaccasampayutta citta", "4");
        
        unwholesomeFactorsArray.put("upekkhasahagata cakkhuvinnana akusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata sotavinnana akusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata ghanavinnana akusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata jivhavinnana akusala vipaka citta", "0");
        unwholesomeFactorsArray.put("dukkhasahagata kayavinnana akusala vipaka citta", "0");
        
        unwholesomeFactorsArray.put("upekkhasahagata sampaticchana akusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata santirana akusala vipaka citta", "0");
        
        unwholesomeFactorsArray.put("upekkhasahagata cakkhuvinnana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata sotavinnana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata ghanavinnana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata jivhavinnana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("sukhasahagata kayavinnana kusala vipaka citta", "0");
        
        unwholesomeFactorsArray.put("upekkhasahagata sampaticchana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata santirana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata santirana kusala vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata pancadvaravajjana kriya citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata manodvaravajjana kriya citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata hasituppada kriya citta", "0");
////////////////////////Kusal//////////////////////,"") ;
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta asankharika kusal citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta sasankharika kusal citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta asankharika kusal citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta sasankharika kusal citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta asankharika kusal citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta sasankharika kusal citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta asankharika kusal citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta sasankharika kusal citta", "0");
////////////////////////Vipaka//////////////////////,"") ;
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta asankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta sasankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta asankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta sasankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta asankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta sasankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta asankharika vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta sasankharika vipaka citta", "0");
////////////////////////Kriya//////////////////////,"") ;
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta asankharika kriya citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanasampayutta sasankharika kriya citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta asankharika kriya citta", "0");
        unwholesomeFactorsArray.put("somanassasahagata nanavippayutta sasankharika kriya citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta asankharika kriya citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanasampayutta sasankharika kriya citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta asankharika kriya citta", "0");
        unwholesomeFactorsArray.put("upekkhasahagata nanavippayutta sasankharika kriya citta", "0");
//////////////////ROOPAVACHARA?????,"") ;
/////////////Kusal///////,"") ;
        unwholesomeFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta", "0");
        unwholesomeFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kusala citta", "0");
        unwholesomeFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana kusala citta", "0");
        unwholesomeFactorsArray.put("sukha ekaggata sahita catutthajjhana kusala citta", "0");
        unwholesomeFactorsArray.put("upekkh ekaggata sahita pancamajjhana kusala citta", "0");

//////////////////ROOPAVACHARA?????,"") ;
        unwholesomeFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta", "0");
        unwholesomeFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta", "0");
        unwholesomeFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana vipaka citta", "0");
        unwholesomeFactorsArray.put("sukha ekaggata sahita catutthajjhana vipaka citta", "0");
        unwholesomeFactorsArray.put("upekkh ekaggata sahita pancamajjhana vipaka citta", "0");

//////////////////ROOPAVACHARA?????,"") ;
////////////Kriya///////,"") ;
        unwholesomeFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta", "0");
        unwholesomeFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kriya citta", "0");
        unwholesomeFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana kriya citta", "0");
        unwholesomeFactorsArray.put("sukha ekaggata sahita catutthajjhana kriya citta", "0");
        unwholesomeFactorsArray.put("upekkh ekaggata sahita pancamajjhana kriya citta", "0");
//////////////////ROOPAVACHARA?????,"") ;
        unwholesomeFactorsArray.put("akasanancayatana kusala citta", "0");
        unwholesomeFactorsArray.put("vinnanancayatana kusala citta", "0");
        unwholesomeFactorsArray.put("akincannayatana kusala citta", "0");
        unwholesomeFactorsArray.put("nevasannanasannayatana kusala citta", "0");
        unwholesomeFactorsArray.put("akasanancayatana vipaka citta", "0");
        unwholesomeFactorsArray.put("vinnanancayatana vipaka citta", "0");
        unwholesomeFactorsArray.put("akincannayatana vipaka citta", "0");
        unwholesomeFactorsArray.put("nevasannanasannayatana vipaka citta", "0");
        unwholesomeFactorsArray.put("akasanancayatana kriya citta", "0");
        unwholesomeFactorsArray.put("vinnanancayatana kriya citta", "0");
        unwholesomeFactorsArray.put("akincannayatana kriya citta", "0");
        unwholesomeFactorsArray.put("nevasannanasannayatana kriya citta", "0");
        
        unwholesomeFactorsArray.put("prathama dhyana shrothapathi mharga citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana shrothapathi mharga citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana shrothapathi mharga citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana shrothapathi mharga citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana shrothapathi mharga citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana sakadagami mharga citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana sakadagami mharga citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana sakadagami mharga citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana sakadagami mharga citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana sakadagami mharga citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana anagami mharga citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana anagami mharga citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana anagami mharga citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana anagami mharga citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana anagami mharga citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana arahath mharga citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana arahath mharga citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana arahath mharga citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana arahath mharga citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana arahath mharga citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana shrothapathi phala citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana shrothapathi phala citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana shrothapathi phala citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana shrothapathi phala citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana shrothapathi phala citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana sakadagami phala citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana sakadagami phala citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana sakadagami phala citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana sakadagami phala citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana sakadagami phala citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana anagami phala citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana anagami phala citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana anagami phala citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana anagami phala citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana anagami phala citta", "0");
        unwholesomeFactorsArray.put("prathama dhyana arahath phala citta", "0");
        unwholesomeFactorsArray.put("dwitheeya dhyana arahath phala citta", "0");
        unwholesomeFactorsArray.put("thrutheeya dhyana arahath phala citta", "0");
        unwholesomeFactorsArray.put("chathurtha dhyana arahath phala citta", "0");
        unwholesomeFactorsArray.put("panchama dhyana arahath phala citta", "0");
        
        
        //#######################################
        beautifulFactorsArray.put("somanassasahagata ditthigatasampayutta asankharika citta", "0");
        beautifulFactorsArray.put("somanassasahagata ditthigatasampayutta sasankharika citta", "0");
        beautifulFactorsArray.put("somanassasahagata ditthigatavippayutta asankharika citta", "0");
        beautifulFactorsArray.put("somanassasahagata ditthigatavippayutta sasankharika citta", "0");
        beautifulFactorsArray.put("upeksha sahagatha drushtigatha vipprayuktha asasankarika citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ditthigatavippayutta sasankharika citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ditthigatasampayutta asankharika citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ditthigatasampayutta sasankharika citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ditthigatavippayutta asankharika citta", "0");
        beautifulFactorsArray.put("domanassasahagata patighasampayutta asankharika citta", "0");
        beautifulFactorsArray.put("domanassasahagata patighasampayutta sasankharika citta", "0");
        beautifulFactorsArray.put("upekkhasahagata vicikicchasampayutta citta", "0");
        beautifulFactorsArray.put("upekkhasahagata uddhaccasampayutta citta", "0");
        beautifulFactorsArray.put("upekkhasahagata cakkhuvinnana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata sotavinnana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ghanavinnana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata jivhavinnana akusala vipaka citta", "0");
        beautifulFactorsArray.put("dukkhasahagata kayavinnana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata sampaticchana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata santirana akusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata cakkhuvinnana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata sotavinnana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata ghanavinnana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata jivhavinnana kusala vipaka citta", "0");
        beautifulFactorsArray.put("sukhasahagata kayavinnana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata sampaticchana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata santirana kusala vipaka citta", "0");
        beautifulFactorsArray.put("somanassasahagata santirana kusala vipaka citta", "0");
        beautifulFactorsArray.put("upekkhasahagata pancadvaravajjana kriya citta", "0");
        beautifulFactorsArray.put("upekkhasahagata manodvaravajjana kriya citta", "0");
        beautifulFactorsArray.put("somanassasahagata hasituppada kriya citta", "0");
////////////////////////Kusal//////////////////////,"") ;
        beautifulFactorsArray.put("somanassasahagata nanasampayutta asankharika kusal citta", "25");
        beautifulFactorsArray.put("somanassasahagata nanasampayutta sasankharika kusal citta", "25");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta asankharika kusal citta", "24");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta sasankharika kusal citta", "24");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta asankharika kusal citta", "25");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta sasankharika kusal citta", "25");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta asankharika kusal citta", "24");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta sasankharika kusal citta", "24");
////////////////////////Vipaka//////////////////////,"") ;
        beautifulFactorsArray.put("somanassasahagata nanasampayutta asankharika vipaka citta", "20");
        beautifulFactorsArray.put("somanassasahagata nanasampayutta sasankharika vipaka citta", "20");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta asankharika vipaka citta", "19");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta sasankharika vipaka citta", "19");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta asankharika vipaka citta", "20");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta sasankharika vipaka citta", "20");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta asankharika vipaka citta", "19");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta sasankharika vipaka citta", "19");
////////////////////////Kriya//////////////////////,"") ;
        beautifulFactorsArray.put("somanassasahagata nanasampayutta asankharika kriya citta", "22");
        beautifulFactorsArray.put("somanassasahagata nanasampayutta sasankharika kriya citta", "22");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta asankharika kriya citta", "21");
        beautifulFactorsArray.put("somanassasahagata nanavippayutta sasankharika kriya citta", "21");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta asankharika kriya citta", "22");
        beautifulFactorsArray.put("upekkhasahagata nanasampayutta sasankharika kriya citta", "22");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta asankharika kriya citta", "21");
        beautifulFactorsArray.put("upekkhasahagata nanavippayutta sasankharika kriya citta", "21");
//////////////////ROOPAVACHARA?????,"") ;
/////////////Kusal///////,"") ;
        beautifulFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta", "23");
        beautifulFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kusala citta", "23");
        beautifulFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana kusala citta", "23");
        beautifulFactorsArray.put("sukha ekaggata sahita catutthajjhana kusala citta", "23");
        beautifulFactorsArray.put("upekkh ekaggata sahita pancamajjhana kusala citta", "22");

//////////////////ROOPAVACHARA?????,"") ;
        beautifulFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta", "23");
        beautifulFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta", "23");
        beautifulFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana vipaka citta", "23");
        beautifulFactorsArray.put("sukha ekaggata sahita catutthajjhana vipaka citta", "23");
        beautifulFactorsArray.put("upekkh ekaggata sahita pancamajjhana vipaka citta", "22");

//////////////////ROOPAVACHARA?????,"") ;
////////////Kriya///////,"") ;
        beautifulFactorsArray.put("vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta", "23");
        beautifulFactorsArray.put("vicara piti sukha ekaggata sahita dutiyajjhana kriya citta", "23");
        beautifulFactorsArray.put("piti sukha ekaggata sahita tatiyajjhana kriya citta", "23");
        beautifulFactorsArray.put("sukha ekaggata sahita catutthajjhana kriya citta", "23");
        beautifulFactorsArray.put("upekkh ekaggata sahita pancamajjhana kriya citta", "22");
//////////////////ROOPAVACHARA?????,"") ;
        beautifulFactorsArray.put("akasanancayatana kusala citta", "20");
        beautifulFactorsArray.put("vinnanancayatana kusala citta", "20");
        beautifulFactorsArray.put("akincannayatana kusala citta", "20");
        beautifulFactorsArray.put("nevasannanasannayatana kusala citta", "20");
        
        beautifulFactorsArray.put("akasanancayatana vipaka citta", "20");
        beautifulFactorsArray.put("vinnanancayatana vipaka citta", "20");
        beautifulFactorsArray.put("akincannayatana vipaka citta", "20");
        beautifulFactorsArray.put("nevasannanasannayatana vipaka citta", "20");
        
        beautifulFactorsArray.put("akasanancayatana kriya citta", "20");
        beautifulFactorsArray.put("vinnanancayatana kriya citta", "20");
        beautifulFactorsArray.put("akincannayatana kriya citta", "20");
        beautifulFactorsArray.put("nevasannanasannayatana kriya citta", "20");
        
        beautifulFactorsArray.put("prathama dhyana shrothapathi mharga citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana shrothapathi mharga citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana shrothapathi mharga citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana shrothapathi mharga citta", "23");
        beautifulFactorsArray.put("panchama dhyana shrothapathi mharga citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana sakadagami mharga citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana sakadagami mharga citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana sakadagami mharga citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana sakadagami mharga citta", "23");
        beautifulFactorsArray.put("panchama dhyana sakadagami mharga citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana anagami mharga citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana anagami mharga citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana anagami mharga citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana anagami mharga citta", "23");
        beautifulFactorsArray.put("panchama dhyana anagami mharga citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana arahath mharga citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana arahath mharga citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana arahath mharga citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana arahath mharga citta", "23");
        beautifulFactorsArray.put("panchama dhyana arahath mharga citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana shrothapathi phala citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana shrothapathi phala citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana shrothapathi phala citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana shrothapathi phala citta", "23");
        beautifulFactorsArray.put("panchama dhyana shrothapathi phala citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana sakadagami phala citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana sakadagami phala citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana sakadagami phala citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana sakadagami phala citta", "23");
        beautifulFactorsArray.put("panchama dhyana sakadagami phala citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana anagami phala citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana anagami phala citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana anagami phala citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana anagami phala citta", "23");
        beautifulFactorsArray.put("panchama dhyana anagami phala citta", "22");
        
        beautifulFactorsArray.put("prathama dhyana arahath phala citta", "23");
        beautifulFactorsArray.put("dwitheeya dhyana arahath phala citta", "23");
        beautifulFactorsArray.put("thrutheeya dhyana arahath phala citta", "23");
        beautifulFactorsArray.put("chathurtha dhyana arahath phala citta", "23");
        beautifulFactorsArray.put("panchama dhyana arahath phala citta", "22");
    }

}
