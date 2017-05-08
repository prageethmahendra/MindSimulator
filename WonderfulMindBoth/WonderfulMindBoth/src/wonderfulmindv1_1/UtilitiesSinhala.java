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
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harindra
 */
public class UtilitiesSinhala {

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
    public static void unwholesomeWithAnyBeautifulFactors(JPanel jpanel10, JPanel jpanel11,JPanel jpanel25,JPanel jpanel26,JPanel akusalasadarana, JPanel loba, JPanel dosha, JPanel theenamidda, JPanel vichikicha, JCheckBox jCheckBox11) {
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
            String html =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව් ." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
        
          //  JOptionPane.showMessageDialog(null, "අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව් .");

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
                String html =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
               // JOptionPane.showMessageDialog(null, "සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි.");
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
            String html =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">ලෝභ ත්රිකය හා දෝස චතුස්කය එකම සිතක ඇති නොවේ." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "ලෝභ ත්රිකය හා දෝස චතුස්කය එකම සිතක ඇති නොවේ..");

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
    public static void selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(JPanel jPanel7, JCheckBox jCheckBox11,JPanel jpanel10,JPanel jpanel11,JPanel jpanel25,JPanel jpanel26) {

        UtilitiesSinhala.selectUnwholesomeUniversal(jPanel7, jCheckBox11,jpanel10,jpanel11,jpanel25,jpanel26);
    }

    public static void selectUnwholesomeUniversal(JPanel jPanel7, JCheckBox jCheckBox11,JPanel jpanel10,JPanel jpanel11,JPanel jpanel25,JPanel jpanel26) {
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
             String html
                    = "<html><p><font color=\"#000\" "
                    + "size=\"5\" face=\"Iskoola Pota\">අකුසල සාධාරණ චෛතසික තොරන්න."
                    + "</font></p></html>";

            JOptionPane.showMessageDialog(null, html, "තොරතුරු පනිවිඩය", JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "අකුසල සාධාරණ චෛතසික තොරන්න.");
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                comp.setSelected(true);
            }

            if (!jCheckBox11.isSelected()) {
                String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
              //  JOptionPane.showMessageDialog(null, "සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි  .");
                jCheckBox11.setSelected(true);
            }
        }

    }

    //5.	When selecting a abstinence, illimitable or Non-delusion
    public static void selectBeautifulFactors(JPanel jpanel10, JPanel jpanel11,JPanel jpanel26,JPanel jpanel25,JCheckBox jCheckBox11,JPanel jpanel7,JPanel jpanel28,JPanel jpanel29,JPanel jpanel30,JPanel jpanel31) {
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
                String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව්." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(null, "අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව් .");
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
        
            else if (!isSelect) {
                String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">සෝබන සාධාරණ චෛතසික තෝරන්න." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "සෝබන සාධාරණ චෛතසික තෝරන්න.");
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                comp.setSelected(true);
            }

        }
        if (!jCheckBox11.isSelected()) {
            String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
          //  JOptionPane.showMessageDialog(null, "සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි  .");
            jCheckBox11.setSelected(true);
        }
    }

    //6.When selecting Wrong view  and Conceit
    public static void wrongViewAndConsientCannotTogether(JCheckBox jCheckBox22, JCheckBox jCheckBox23) {
        boolean wrongViewSelected = jCheckBox22.isSelected();
        boolean consientSelected = jCheckBox23.isSelected();

        if (wrongViewSelected && consientSelected) {
             String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">දිට්ඨිය හා මානය එකට නොයෙදෙයි." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "දිට්ඨිය හා මානය එකට නොයෙදෙයි.");
            jCheckBox22.setSelected(false);
            jCheckBox23.setSelected(false);
        }

    }
    

     public static void whenLobhaSelected(JCheckBox jCheckBox28,JCheckBox jCheckBox29,JCheckBox jCheckBox30){
        if (jCheckBox28.isSelected()) {
            if ((!jCheckBox29.isSelected()  || !jCheckBox30.isSelected())==true) {
            String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">ලෝභය සමඟ දිට්ඨිය හෝ මානය යන දෙකින් එකක් තේරිය යුතුය." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "ලෝභය සමඟ දිට්ඨිය හෝ මානය යන දෙකින් එකක් තේරිය යුතුය.");
            }
        }
    }
     
     public static void whenDhittiSelected(JCheckBox jCheckBox28,JCheckBox jCheckBox29){
        if (!jCheckBox28.isSelected() || !jCheckBox29.isSelected()) {
             String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">දිට්ඨිය සමඟ ලෝභය තේරිය යුතුය." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "දිට්ඨිය සමඟ ලෝභය තේරිය යුතුය.");
        jCheckBox29.setSelected(true);
           
        }
    }
     public static void whenManaSelected(JCheckBox jCheckBox28,JCheckBox jCheckBox29){
        if (!jCheckBox28.isSelected() || !jCheckBox29.isSelected()) {
            String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">මානය සමඟ ලෝභය තේරිය යුතුය." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "මානය සමඟ ලෝභය තේරිය යුතුය.");
        jCheckBox29.setSelected(true);
           
        }
    }
    public static void energyEnable(JCheckBox jCheckBox11) {
        if (!jCheckBox11.isSelected()) {
            String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showMessageDialog(null, "සෑම අකුසල හෝ කුසල චෛතසික තේරීමක් සමග විරිය යෙදෙයි  .");
            jCheckBox11.setSelected(true);
        }
    }

    //8.When Desire is not selected with Unwholesome or Beautiful
    public static void zestCannotBewithBeutifulAndUnwholesome(JCheckBox jCheckBox13,JPanel akusalasadarana, JPanel loba, JPanel dosha, JPanel theenamidda, JPanel vichikicha,JPanel jpanel10,JPanel jpanel11,JPanel jpanel25,JPanel jpanel26,JCheckBox jCheckBox12) {
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
                String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">ප්රීතිය සමඟ චන්දය යෙදිය යුතුය." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
               // JOptionPane.showMessageDialog(null, "ප්රීතිය සමඟ චන්දය යෙදිය යුතුය.");
                jCheckBox12.setSelected(true);
                jCheckBox13.setSelected(true);
            }
        }
    }
    
    public static void unselectUnwholesomeUniversalIfSelected(JPanel jpanel7,JPanel jpanel28,JPanel jpanel29,JPanel jpanel30,JPanel jpanel31,JPanel jpanel10,JPanel jpanel11,JPanel jpanel25,JPanel jpanel26) {
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
             String html2
                    = "<html><p><font color=\"#000\" "
                    + "size=\"5\" face=\"Iskoola Pota\">අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව් ."
                    + "</font></p></html>";

            JOptionPane.showMessageDialog(null, html2, "තොරතුරු පනිවිඩය", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "අකුසල චෛතසික හා කුසල චෛතසික එකම සිතක ඇති නොව් .");
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
    public static void slothTropper(JCheckBox jCheckBox28,JCheckBox jCheckBox29,JCheckBox jCheckBox30){
        if (jCheckBox28.isSelected() && jCheckBox29.isSelected()) {
            String html2 =
            "<html><p><font color=\"#000\" " +
            "size=\"5\" face=\"Iskoola Pota\">විචිකිච්ඡාව, ථීන මිද්ධ සමඟ නොයෙදෙයි ." +
            "</font></p></html>";

        JOptionPane.showMessageDialog(null, html2,"තොරතුරු පනිවිඩය",JOptionPane.INFORMATION_MESSAGE);
          //  JOptionPane.showMessageDialog(null, "විචිකිච්ඡාව, ථීන මිද්ධ සමඟ නොයෙදෙයි.");
            jCheckBox30.setSelected(false);
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

}
