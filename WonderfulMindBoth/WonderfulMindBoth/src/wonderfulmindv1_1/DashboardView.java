/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonderfulmindv1_1;

import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.utils.CollectionUtils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat;
import uk.ac.manchester.cs.bhig.util.Tree;
import uk.ac.manchester.cs.owlapi.dlsyntax.DLSyntaxObjectRenderer;

/**
 *
 * @author harindra
 */
public class DashboardView extends javax.swing.JFrame {

    URI uri = null;

    public static CommonInstances commonInstances;
    static DashboardView dashboardView;
    public String selectedTexts = "";// To concatinate all the selected values.
    public String selectedThoughts = "";// To concatinate all the selected
    // values.

    public String selectedTempStrings = "";
    Set<String> relavantCittTemp = new TreeSet<String>();
    int counter = 0;
    int lastCount = 0;

    int counterForLoop = 0;
    int counterForLoop2 = 0;

    Set<String> allCitt = new TreeSet<String>();
    List<String> common = new ArrayList<String>();

    Set<String> allCitt2 = new TreeSet<String>();
    List<String> common2 = new ArrayList<String>();

    ArrayList<String> redArray = new ArrayList<String>();
    ArrayList<String> blueArray = new ArrayList<String>();
    ArrayList<String> orangeArray = new ArrayList<String>();

    boolean restart = false;

    // private static final String BASE_URL =
    // "/Users/harindra/NetBeansProjects/WonderfulMindV1_1/src/wonderfulmindv1_1/Citta7.owl";
    static URL url = DashboardView.class.getResource("Citta7.owl");
    // static String file1 =
    // DashboardView.class.getResource("Citta7.owl").getFile();
    // private static final String BASE_URL = file1;
    // private static final String BASE_URL = url.toString().replace("file:",
    // "").replace("!","").replace("jar:","");
    private static String BASE_URL = url.toString().replace("file:", "")
            .replace("jar:", "");
    // private static String BASE_URL = url.toString();

    static InputStream in = DashboardView.class
            .getResourceAsStream("Citta7.owl");
    private static final String PREFIX = "http://www.semanticweb.org/harindra/ontologies/2014/9/untitled-ontology-28";
    private static OWLObjectRenderer renderer = new DLSyntaxObjectRenderer();

    boolean beautifulUniversal = false;

    static boolean feedBackSent = false;

    /**
     * Creates new form DashboardView
     */
    public DashboardView() {
        initComponents();
        // BASE_URL =
        // this.getClass().getClassLoader().getResource("Citta7.owl").getPath().toString();
        //System.out.println("" + BASE_URL);

    }

    public void redo() {
        if (dashboardView.feedBackSent) {
            jButton40.setText("Thank you");
            jButton40.setEnabled(false);
        }
    }

    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) { /* TODO: error handling */ }
        } else { /* TODO: error handling */ }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jCheckBox31 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox42 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox43 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox44 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox45 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox46 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox47 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox48 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton9 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jCheckBox115 = new javax.swing.JCheckBox();
        jLabel90 = new javax.swing.JLabel();
        jCheckBox116 = new javax.swing.JCheckBox();
        jLabel91 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jButton10 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jCheckBox171 = new javax.swing.JCheckBox();
        jLabel163 = new javax.swing.JLabel();
        jCheckBox172 = new javax.swing.JCheckBox();
        jLabel164 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jButton11 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jCheckBox73 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        jCheckBox74 = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        jCheckBox75 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jCheckBox76 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox77 = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        jCheckBox78 = new javax.swing.JCheckBox();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox79 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jButton12 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jCheckBox106 = new javax.swing.JCheckBox();
        jLabel83 = new javax.swing.JLabel();
        jCheckBox107 = new javax.swing.JCheckBox();
        jLabel84 = new javax.swing.JLabel();
        jCheckBox108 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jButton14 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jCheckBox118 = new javax.swing.JCheckBox();
        jLabel99 = new javax.swing.JLabel();
        jCheckBox119 = new javax.swing.JCheckBox();
        jLabel100 = new javax.swing.JLabel();
        jCheckBox120 = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jCheckBox121 = new javax.swing.JCheckBox();
        jLabel102 = new javax.swing.JLabel();
        jCheckBox122 = new javax.swing.JCheckBox();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox123 = new javax.swing.JCheckBox();
        jLabel104 = new javax.swing.JLabel();
        jCheckBox124 = new javax.swing.JCheckBox();
        jLabel105 = new javax.swing.JLabel();
        jCheckBox125 = new javax.swing.JCheckBox();
        jLabel106 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jButton16 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        jCheckBox98 = new javax.swing.JCheckBox();
        jLabel79 = new javax.swing.JLabel();
        jCheckBox99 = new javax.swing.JCheckBox();
        jLabel80 = new javax.swing.JLabel();
        jCheckBox100 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jCheckBox101 = new javax.swing.JCheckBox();
        jLabel87 = new javax.swing.JLabel();
        jCheckBox102 = new javax.swing.JCheckBox();
        jLabel88 = new javax.swing.JLabel();
        jCheckBox103 = new javax.swing.JCheckBox();
        jLabel89 = new javax.swing.JLabel();
        jCheckBox104 = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        jCheckBox105 = new javax.swing.JCheckBox();
        jLabel95 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jButton18 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jCheckBox143 = new javax.swing.JCheckBox();
        jLabel137 = new javax.swing.JLabel();
        jCheckBox144 = new javax.swing.JCheckBox();
        jLabel138 = new javax.swing.JLabel();
        jCheckBox145 = new javax.swing.JCheckBox();
        jLabel139 = new javax.swing.JLabel();
        jCheckBox146 = new javax.swing.JCheckBox();
        jLabel140 = new javax.swing.JLabel();
        jCheckBox147 = new javax.swing.JCheckBox();
        jLabel141 = new javax.swing.JLabel();
        jCheckBox148 = new javax.swing.JCheckBox();
        jLabel142 = new javax.swing.JLabel();
        jCheckBox149 = new javax.swing.JCheckBox();
        jLabel143 = new javax.swing.JLabel();
        jCheckBox150 = new javax.swing.JCheckBox();
        jLabel144 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jButton20 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextPane19 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jCheckBox167 = new javax.swing.JCheckBox();
        jLabel170 = new javax.swing.JLabel();
        jCheckBox168 = new javax.swing.JCheckBox();
        jLabel171 = new javax.swing.JLabel();
        jCheckBox169 = new javax.swing.JCheckBox();
        jLabel172 = new javax.swing.JLabel();
        jCheckBox170 = new javax.swing.JCheckBox();
        jLabel173 = new javax.swing.JLabel();
        jCheckBox173 = new javax.swing.JCheckBox();
        jLabel174 = new javax.swing.JLabel();
        jCheckBox174 = new javax.swing.JCheckBox();
        jLabel175 = new javax.swing.JLabel();
        jCheckBox175 = new javax.swing.JCheckBox();
        jLabel176 = new javax.swing.JLabel();
        jCheckBox176 = new javax.swing.JCheckBox();
        jLabel177 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        jButton22 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel36 = new javax.swing.JPanel();
        jCheckBox90 = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        jCheckBox91 = new javax.swing.JCheckBox();
        jLabel68 = new javax.swing.JLabel();
        jCheckBox92 = new javax.swing.JCheckBox();
        jLabel69 = new javax.swing.JLabel();
        jCheckBox93 = new javax.swing.JCheckBox();
        jLabel70 = new javax.swing.JLabel();
        jCheckBox94 = new javax.swing.JCheckBox();
        jLabel93 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane15 = new javax.swing.JTextPane();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jCheckBox181 = new javax.swing.JCheckBox();
        jLabel186 = new javax.swing.JLabel();
        jCheckBox182 = new javax.swing.JCheckBox();
        jLabel187 = new javax.swing.JLabel();
        jCheckBox183 = new javax.swing.JCheckBox();
        jLabel188 = new javax.swing.JLabel();
        jCheckBox184 = new javax.swing.JCheckBox();
        jLabel189 = new javax.swing.JLabel();
        jCheckBox185 = new javax.swing.JCheckBox();
        jLabel190 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane14 = new javax.swing.JTextPane();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jCheckBox156 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jCheckBox157 = new javax.swing.JCheckBox();
        jLabel158 = new javax.swing.JLabel();
        jCheckBox158 = new javax.swing.JCheckBox();
        jLabel159 = new javax.swing.JLabel();
        jCheckBox159 = new javax.swing.JCheckBox();
        jLabel160 = new javax.swing.JLabel();
        jCheckBox162 = new javax.swing.JCheckBox();
        jLabel161 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel39 = new javax.swing.JPanel();
        jCheckBox95 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        jCheckBox96 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jCheckBox97 = new javax.swing.JCheckBox();
        jLabel109 = new javax.swing.JLabel();
        jCheckBox126 = new javax.swing.JCheckBox();
        jLabel110 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextPane16 = new javax.swing.JTextPane();
        jButton30 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        jPanel40 = new javax.swing.JPanel();
        jCheckBox136 = new javax.swing.JCheckBox();
        jLabel132 = new javax.swing.JLabel();
        jCheckBox137 = new javax.swing.JCheckBox();
        jLabel133 = new javax.swing.JLabel();
        jCheckBox140 = new javax.swing.JCheckBox();
        jLabel147 = new javax.swing.JLabel();
        jCheckBox141 = new javax.swing.JCheckBox();
        jLabel148 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextPane17 = new javax.swing.JTextPane();
        jButton32 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jPanel41 = new javax.swing.JPanel();
        jCheckBox154 = new javax.swing.JCheckBox();
        jLabel155 = new javax.swing.JLabel();
        jCheckBox155 = new javax.swing.JCheckBox();
        jLabel162 = new javax.swing.JLabel();
        jCheckBox163 = new javax.swing.JCheckBox();
        jLabel179 = new javax.swing.JLabel();
        jCheckBox164 = new javax.swing.JCheckBox();
        jLabel180 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextPane18 = new javax.swing.JTextPane();
        jButton34 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel48 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel44 = new javax.swing.JPanel();
        jCheckBox132 = new javax.swing.JCheckBox();
        jLabel121 = new javax.swing.JLabel();
        jCheckBox138 = new javax.swing.JCheckBox();
        jLabel123 = new javax.swing.JLabel();
        jCheckBox139 = new javax.swing.JCheckBox();
        jLabel124 = new javax.swing.JLabel();
        jCheckBox142 = new javax.swing.JCheckBox();
        jLabel129 = new javax.swing.JLabel();
        jCheckBox151 = new javax.swing.JCheckBox();
        jLabel131 = new javax.swing.JLabel();
        jCheckBox152 = new javax.swing.JCheckBox();
        jLabel134 = new javax.swing.JLabel();
        jCheckBox153 = new javax.swing.JCheckBox();
        jLabel136 = new javax.swing.JLabel();
        jCheckBox160 = new javax.swing.JCheckBox();
        jLabel146 = new javax.swing.JLabel();
        jCheckBox161 = new javax.swing.JCheckBox();
        jLabel149 = new javax.swing.JLabel();
        jCheckBox165 = new javax.swing.JCheckBox();
        jLabel152 = new javax.swing.JLabel();
        jCheckBox166 = new javax.swing.JCheckBox();
        jLabel153 = new javax.swing.JLabel();
        jCheckBox177 = new javax.swing.JCheckBox();
        jLabel154 = new javax.swing.JLabel();
        jCheckBox178 = new javax.swing.JCheckBox();
        jLabel234 = new javax.swing.JLabel();
        jCheckBox179 = new javax.swing.JCheckBox();
        jLabel235 = new javax.swing.JLabel();
        jCheckBox229 = new javax.swing.JCheckBox();
        jLabel236 = new javax.swing.JLabel();
        jCheckBox230 = new javax.swing.JCheckBox();
        jLabel237 = new javax.swing.JLabel();
        jCheckBox231 = new javax.swing.JCheckBox();
        jLabel238 = new javax.swing.JLabel();
        jCheckBox232 = new javax.swing.JCheckBox();
        jLabel239 = new javax.swing.JLabel();
        jCheckBox233 = new javax.swing.JCheckBox();
        jLabel240 = new javax.swing.JLabel();
        jCheckBox234 = new javax.swing.JCheckBox();
        jLabel241 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextPane21 = new javax.swing.JTextPane();
        jButton39 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel43 = new javax.swing.JPanel();
        jCheckBox193 = new javax.swing.JCheckBox();
        jLabel210 = new javax.swing.JLabel();
        jCheckBox194 = new javax.swing.JCheckBox();
        jLabel211 = new javax.swing.JLabel();
        jCheckBox195 = new javax.swing.JCheckBox();
        jLabel212 = new javax.swing.JLabel();
        jCheckBox196 = new javax.swing.JCheckBox();
        jLabel213 = new javax.swing.JLabel();
        jCheckBox197 = new javax.swing.JCheckBox();
        jLabel215 = new javax.swing.JLabel();
        jCheckBox198 = new javax.swing.JCheckBox();
        jLabel216 = new javax.swing.JLabel();
        jCheckBox199 = new javax.swing.JCheckBox();
        jLabel217 = new javax.swing.JLabel();
        jCheckBox208 = new javax.swing.JCheckBox();
        jLabel218 = new javax.swing.JLabel();
        jCheckBox209 = new javax.swing.JCheckBox();
        jLabel219 = new javax.swing.JLabel();
        jCheckBox210 = new javax.swing.JCheckBox();
        jLabel220 = new javax.swing.JLabel();
        jCheckBox211 = new javax.swing.JCheckBox();
        jLabel221 = new javax.swing.JLabel();
        jCheckBox218 = new javax.swing.JCheckBox();
        jLabel222 = new javax.swing.JLabel();
        jCheckBox219 = new javax.swing.JCheckBox();
        jLabel223 = new javax.swing.JLabel();
        jCheckBox220 = new javax.swing.JCheckBox();
        jLabel224 = new javax.swing.JLabel();
        jCheckBox221 = new javax.swing.JCheckBox();
        jLabel225 = new javax.swing.JLabel();
        jCheckBox222 = new javax.swing.JCheckBox();
        jLabel226 = new javax.swing.JLabel();
        jCheckBox223 = new javax.swing.JCheckBox();
        jLabel227 = new javax.swing.JLabel();
        jCheckBox224 = new javax.swing.JCheckBox();
        jLabel231 = new javax.swing.JLabel();
        jCheckBox227 = new javax.swing.JCheckBox();
        jLabel232 = new javax.swing.JLabel();
        jCheckBox228 = new javax.swing.JCheckBox();
        jLabel233 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextPane20 = new javax.swing.JTextPane();
        jButton37 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel125 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jLabel128 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jPanel31 = new javax.swing.JPanel();
        jCheckBox30 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jPanel26 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox63 = new javax.swing.JCheckBox();
        jPanel25 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jPanel50 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1896, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTabbedPane3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel17.setBackground(new java.awt.Color(169, 245, 169));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox31.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox31.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox31.setText("(somanassasahagata ditthigatasampayutta asankharika citta)");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel15.setForeground(new java.awt.Color(204, 51, 0));
        jLabel15.setText("One consciousness, accompanied by joy, associated with wrong view, unprompted");

        jCheckBox42.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox42.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox42.setText("(somanassasahagata ditthigatasampayutta sasankharika citta)");
        jCheckBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox42ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel16.setForeground(new java.awt.Color(204, 51, 0));
        jLabel16.setText("One consciousness, accompanied by joy, associated with wrong view, prompted");

        jCheckBox43.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox43.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox43.setText("(somanassasahagata ditthigatavippayutta asankharika citta)");
        jCheckBox43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox43ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel17.setForeground(new java.awt.Color(204, 51, 0));
        jLabel17.setText("One consciousness, accompanied by joy, dissociated from wrong view, unprompted");

        jCheckBox44.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox44.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox44.setText("(somanassasahagata ditthigatavippayutta sasankharika citta)");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel18.setForeground(new java.awt.Color(204, 51, 0));
        jLabel18.setText("One consciousness, accompanied by joy, dissociated from wrong view, prompted");

        jCheckBox45.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox45.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox45.setText("(upekkhasahagata ditthigatasampayutta asankharika citta)");
        jCheckBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox45ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel19.setForeground(new java.awt.Color(204, 51, 0));
        jLabel19.setText("One consciousness, accompanied by equanimity, associated with wrong view, unprompted");

        jCheckBox46.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox46.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox46.setText("(upekkhasahagata ditthigatasampayutta sasankharika citta)");
        jCheckBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox46ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel20.setForeground(new java.awt.Color(204, 51, 0));
        jLabel20.setText("One consciousness, accompanied by equanimity, associated with wrong view, prompted");

        jCheckBox47.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox47.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox47.setText("(upekkhasahagata ditthigatavippayutta asankharika citta)");
        jCheckBox47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox47ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel21.setForeground(new java.awt.Color(204, 51, 0));
        jLabel21.setText("One consciousness, accompanied by equanimity, dissociated from wrong view, unprompted");

        jCheckBox48.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox48.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox48.setText("(upekkhasahagata ditthigatavippayutta sasankharika citta)");
        jCheckBox48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox48ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jLabel22.setForeground(new java.awt.Color(204, 51, 0));
        jLabel22.setText("One consciousness, accompanied by equanimity, dissociated from wrong view, prompted");

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton3.setText("Get Mental Factors");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane15.setViewportView(jTextPane1);

        jButton9.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel31.setText("Number of mental factors:");

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel32.setForeground(new java.awt.Color(51, 0, 255));
        jLabel32.setText("0");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox31)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15))
                            .addComponent(jCheckBox42)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel16))
                            .addComponent(jCheckBox43)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel17))
                            .addComponent(jCheckBox44)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel18)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox45)
                            .addComponent(jCheckBox46)
                            .addComponent(jCheckBox47)
                            .addComponent(jCheckBox48)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1653, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel17);

        jTabbedPane4.addTab("<html>1.1.1 Rooted in greed <i>(lobha moola)</i></html>", jScrollPane4);

        jPanel18.setBackground(new java.awt.Color(172, 247, 172));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox115.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox115.setText("(domanassasahagata patighasampayutta asankharika citta)");
        jCheckBox115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox115ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel90.setForeground(new java.awt.Color(204, 51, 0));
        jLabel90.setText("One consciousness, accompanied by displeasure, associated with aversion, unprompted");

        jCheckBox116.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox116.setText("(domanassasahagata patighasampayutta sasankharika citta)");
        jCheckBox116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox116ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel91.setForeground(new java.awt.Color(204, 51, 0));
        jLabel91.setText("One consciousness, accompanied by displeasure, associated with aversion, prompted");

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton5.setText("Get Mental Factors");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane18.setViewportView(jTextPane4);

        jButton10.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton10.setText("Refresh");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel33.setForeground(new java.awt.Color(51, 0, 255));
        jLabel33.setText("0");

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel34.setText("Number of mental factors:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox116)
                    .addComponent(jCheckBox115)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel91))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel90)))
                .addGap(50, 50, 50)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox115, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox116, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("<html>1.1.2 Rooted in hatred <i>(dwesha moola)</i></html>", jPanel18);

        jPanel20.setBackground(new java.awt.Color(172, 247, 172));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox171.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox171.setText("(upekkhasahagata vicikicchasampayutta citta)");
        jCheckBox171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox171ActionPerformed(evt);
            }
        });

        jLabel163.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel163.setForeground(new java.awt.Color(204, 102, 0));
        jLabel163.setText("One consciousness, accompanied by equanimity, associated with doubt");

        jCheckBox172.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox172.setText("(upekkhasahagata uddhaccasampayutta citta)");
        jCheckBox172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox172ActionPerformed(evt);
            }
        });

        jLabel164.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel164.setForeground(new java.awt.Color(204, 102, 0));
        jLabel164.setText("One consciousness, accompanied by equanimity, associated with restlessness");

        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton6.setText("Get Mental Factors");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane19.setViewportView(jTextPane5);

        jButton11.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton11.setText("Refresh");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel35.setForeground(new java.awt.Color(51, 0, 255));
        jLabel35.setText("0");

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel36.setText("Number of mental factors:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox171)
                    .addComponent(jCheckBox172)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel164))))
                .addGap(53, 53, 53)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton11))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox171, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox172)))
                .addContainerGap(485, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("<html>1.1.3 Rooted in delusion <i>(moha moola)</i></html>", jPanel20);

        jTabbedPane2.addTab("<html>1.1 Unwholesome Consciousness <i>(akusala citt)</i></html>", jTabbedPane4);

        jPanel21.setBackground(new java.awt.Color(172, 247, 172));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox73.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox73.setText("(upekkhasahagata cakkhuvinnana akusala vipaka citta)");
        jCheckBox73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox73ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel42.setForeground(new java.awt.Color(204, 102, 0));
        jLabel42.setText("Unwholesome resultant eye-consciousness accompanied by equanimity");

        jCheckBox74.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox74.setText("(upekkhasahagata sotavinnana akusala vipaka citta)");
        jCheckBox74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox74ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel43.setForeground(new java.awt.Color(204, 102, 0));
        jLabel43.setText("Unwholesome resultant ear-consciousness accompanied by equanimity");

        jCheckBox75.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox75.setText("(upekkhasahagata ghanavinnana akusala vipaka citta)");
        jCheckBox75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox75ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel44.setForeground(new java.awt.Color(204, 102, 0));
        jLabel44.setText("Unwholesome resultant nose-consciousness accompanied by equanimity");

        jCheckBox76.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox76.setText("(upekkhasahagata jivhavinnana akusala vipaka citta)");
        jCheckBox76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox76ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel45.setForeground(new java.awt.Color(204, 102, 0));
        jLabel45.setText("Unwholesome resultant tongue-consciousness accompanied by equanimity");

        jCheckBox77.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox77.setText("(dukkhasahagata kayavinnana akusala vipaka citta)");
        jCheckBox77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox77ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel46.setForeground(new java.awt.Color(204, 102, 0));
        jLabel46.setText("Unwholesome resultant body-consciousness accompanied by displeasure");

        jCheckBox78.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox78.setText("(upekkhasahagata sampaticchana akusala vipaka citta)");
        jCheckBox78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox78ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel47.setForeground(new java.awt.Color(204, 102, 0));
        jLabel47.setText("Unwholesome resultant receiving consciousness accompanied by equanimity");

        jCheckBox79.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox79.setText("(upekkhasahagata santirana akusala vipaka citta)");
        jCheckBox79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox79ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel48.setForeground(new java.awt.Color(204, 102, 0));
        jLabel48.setText("Unwholesome resultant investigating consciousness accompanied by equanimity");

        jButton8.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton8.setText("Get Mental Factors");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane20.setViewportView(jTextPane6);

        jButton12.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton12.setText("Refresh");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel37.setText("Number of mental factors:");

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel38.setForeground(new java.awt.Color(51, 0, 255));
        jLabel38.setText("0");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel43))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox75)
                                    .addComponent(jCheckBox74)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel45)))))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox73))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel42))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox77)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel47))))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel46))
                                    .addComponent(jCheckBox76))))
                        .addGap(193, 193, 193)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel48))
                            .addComponent(jCheckBox78)
                            .addComponent(jCheckBox79))))
                .addContainerGap(1204, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox74, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox75, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox76, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox79)
                .addGap(0, 1543, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel21);

        jTabbedPane5.addTab("<html>1.2.1 Unwholesome-Resultant <i>(akusala vipaka)</i></html>", jScrollPane5);

        jPanel22.setBackground(new java.awt.Color(172, 247, 172));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox106.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox106.setText("(upekkhasahagata pancadvaravajjana kriya citta)");
        jCheckBox106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox106ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel83.setForeground(new java.awt.Color(204, 102, 0));
        jLabel83.setText("Rootless functional five-sense-door adverting consciousness accompanied by equanimity");

        jCheckBox107.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox107.setText("(upekkhasahagata manodvaravajjana kriya citta)");
        jCheckBox107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox107ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel84.setForeground(new java.awt.Color(204, 102, 0));
        jLabel84.setText("Rootless functional five-sense-door adverting consciousness accompanied by equanimity");

        jCheckBox108.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox108.setText("(somanassasahagata hasituppada kriya citta)");
        jCheckBox108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox108ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel85.setForeground(new java.awt.Color(204, 102, 0));
        jLabel85.setText("Rootless functional smile-producing consciousness accompanied by joy");

        jButton13.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton13.setText("Get Mental Factors");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextPane8.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane21.setViewportView(jTextPane8);

        jButton14.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton14.setText("Refresh");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel39.setText("Number of mental factors:");

        jLabel49.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel49.setForeground(new java.awt.Color(51, 0, 255));
        jLabel49.setText("0     ");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox107)
                    .addComponent(jCheckBox106)
                    .addComponent(jCheckBox108)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel83)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel84)
                                .addComponent(jLabel85)))))
                .addGap(90, 90, 90)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel49))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox106, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1627, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("<html>1.2.2 Rootless Functional <i>(kriya)</i></html>", jPanel22);

        jPanel23.setBackground(new java.awt.Color(172, 247, 172));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox118.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox118.setText("(upekkhasahagata cakkhuvinnana kusala vipaka citta)");
        jCheckBox118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox118ActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel99.setForeground(new java.awt.Color(204, 102, 0));
        jLabel99.setText("Wholesome resultant eye-consciousness accompanied by equanimity");

        jCheckBox119.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox119.setText("(upekkhasahagata sotavinnana kusala vipaka citta)");
        jCheckBox119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox119ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel100.setForeground(new java.awt.Color(204, 102, 0));
        jLabel100.setText("Wholesome resultant ear-consciousness accompanied by equanimity");

        jCheckBox120.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox120.setText("(upekkhasahagata ghanavinnana kusala vipaka citta)");
        jCheckBox120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox120ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel101.setForeground(new java.awt.Color(204, 102, 0));
        jLabel101.setText("Wholesome resultant nose-consciousness accompanied by equanimity");

        jCheckBox121.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox121.setText("(upekkhasahagata jivhavinnana kusala vipaka citta)");
        jCheckBox121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox121ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel102.setForeground(new java.awt.Color(204, 102, 0));
        jLabel102.setText("Wholesome resultant tongue-consciousness accompanied by equanimity");

        jCheckBox122.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox122.setText("(sukhasahagata kayavinnana kusala vipaka citta)");
        jCheckBox122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox122ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel103.setForeground(new java.awt.Color(204, 102, 0));
        jLabel103.setText("Wholesome resultant body-consciousness accompanied by pleasure");

        jCheckBox123.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox123.setText("(upekkhasahagata sampaticchana kusala vipaka citta)");
        jCheckBox123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox123ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel104.setForeground(new java.awt.Color(204, 102, 0));
        jLabel104.setText("Wholesome resultant receiving-consciousness accompanied by equanimity");

        jCheckBox124.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox124.setText("(upekkhasahagata santirana kusala vipaka citta)");
        jCheckBox124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox124ActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel105.setForeground(new java.awt.Color(204, 102, 0));
        jLabel105.setText("Wholesome resultant investigating-consciousness accompanied by equanimity");

        jCheckBox125.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox125.setText("(somanassasahagata santirana kusala vipaka citta)");
        jCheckBox125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox125ActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel106.setForeground(new java.awt.Color(204, 102, 0));
        jLabel106.setText("Wholesome resultant investigating-consciousness accompanied by joy");

        jButton15.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton15.setText("Get Mental Factors");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane22.setViewportView(jTextPane9);

        jButton16.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton16.setText("Refresh");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel50.setText("Number of mental factors: ");

        jLabel51.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel51.setForeground(new java.awt.Color(102, 0, 255));
        jLabel51.setText("0      ");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox119)
                            .addComponent(jCheckBox120)
                            .addComponent(jCheckBox118)
                            .addComponent(jCheckBox121)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel102)))
                            .addComponent(jCheckBox122)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox123)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel104))
                                    .addComponent(jCheckBox125)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel106))
                                    .addComponent(jCheckBox124)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel105))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel103))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel99)))
                .addGap(96, 96, 96)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox118)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox120, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox121))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15)
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox122, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox123, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox124, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox125)
                .addContainerGap(1431, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("<html>1.2.3 Wholesome-Resultant <i>(kusala vipaka)</i></html>", jPanel23);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("<html>1.2 Rootless Consciousness <i>(ahetuka citt)</i></html>", jPanel12);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel24.setBackground(new java.awt.Color(172, 247, 172));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox98.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox98.setText("(somanassasahagata nanasampayutta asankharika kusal citta)");
        jCheckBox98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox98ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel79.setForeground(new java.awt.Color(204, 102, 0));
        jLabel79.setText("Wholesome consciousness accompanied by joy, associated with knowledge, unprompted");

        jCheckBox99.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox99.setText("(somanassasahagata nanasampayutta sasankharika kusal citta)");
        jCheckBox99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox99ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel80.setForeground(new java.awt.Color(204, 102, 0));
        jLabel80.setText("Wholesome consciousness accompanied by joy, associated with knowledge, prompted");

        jCheckBox100.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox100.setText("(somanassasahagata nanavippayutta asankharika kusal citta)");
        jCheckBox100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox100ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel81.setForeground(new java.awt.Color(204, 102, 0));
        jLabel81.setText("Wholesome consciousness accompanied by joy, disassociated with knowledge, unprompted");

        jCheckBox101.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox101.setText("(somanassasahagata nanavippayutta sasankharika kusal citta)");
        jCheckBox101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox101ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel87.setForeground(new java.awt.Color(204, 102, 0));
        jLabel87.setText("Wholesome consciousness accompanied by joy, disassociated with knowledge, prompted");

        jCheckBox102.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox102.setText("(upekkhasahagata nanasampayutta asankharika kusal citta)");
        jCheckBox102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox102ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel88.setForeground(new java.awt.Color(204, 102, 0));
        jLabel88.setText("Wholesome consciousness accompanied by equanimity, associated with knowledge, unprompted");

        jCheckBox103.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox103.setText("(upekkhasahagata nanasampayutta sasankharika kusal citta)");
        jCheckBox103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox103ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel89.setForeground(new java.awt.Color(204, 102, 0));
        jLabel89.setText("Wholesome consciousness accompanied by equanimity, associated with knowledge, prompted");

        jCheckBox104.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox104.setText("(upekkhasahagata nanavippayutta asankharika kusal citta)");
        jCheckBox104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox104ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel92.setForeground(new java.awt.Color(204, 102, 0));
        jLabel92.setText("Wholesome consciousness accompanied by equanimity, disassociated with knowledge, unprompted");

        jCheckBox105.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox105.setText("(upekkhasahagata nanavippayutta sasankharika kusal citta)");
        jCheckBox105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox105ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel95.setForeground(new java.awt.Color(204, 102, 0));
        jLabel95.setText("Wholesome consciousness accompanied by equanimity, disassociated with knowledge, prompted");

        jButton17.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton17.setText("Get Mental Factors");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jTextPane10.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane23.setViewportView(jTextPane10);

        jButton18.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton18.setText("Refresh");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel52.setText("Number of mental factors:");

        jLabel53.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel53.setForeground(new java.awt.Color(51, 0, 255));
        jLabel53.setText("0       ");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox102)
                            .addComponent(jCheckBox103)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel89))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel79))
                                        .addComponent(jCheckBox98)
                                        .addComponent(jCheckBox99))
                                    .addComponent(jCheckBox101)
                                    .addComponent(jCheckBox100)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel81))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel87))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel80))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel88)))
                                .addGap(157, 157, 157)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jButton17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel52)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel53))
                                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel92))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel95))
                            .addComponent(jCheckBox104)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox105)))
                .addContainerGap(767, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox98)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox99)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox100)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox102)
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel95)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox105)
                .addContainerGap(1651, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel24);

        jScrollPane3.setViewportView(jScrollPane6);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("<html>1.3.1 Wholesome Consciousness <i>(kusal citt)</i></html>", jPanel14);

        jPanel34.setBackground(new java.awt.Color(172, 247, 172));
        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox143.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox143.setText("(somanassasahagata nanasampayutta asankharika vipaka citta)");
        jCheckBox143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox143ActionPerformed(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel137.setForeground(new java.awt.Color(204, 102, 0));
        jLabel137.setText("Wholesome-resultant consciousness accompanied by joy, associated with knowledge, unprompted");

        jCheckBox144.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox144.setText("(somanassasahagata nanasampayutta sasankharika vipaka citta)");
        jCheckBox144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox144ActionPerformed(evt);
            }
        });

        jLabel138.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel138.setForeground(new java.awt.Color(204, 102, 0));
        jLabel138.setText("Wholesome-resultant consciousness accompanied by joy, associated with knowledge, prompted");

        jCheckBox145.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox145.setText("(somanassasahagata nanavippayutta asankharika vipaka citta)");
        jCheckBox145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox145ActionPerformed(evt);
            }
        });

        jLabel139.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel139.setForeground(new java.awt.Color(204, 102, 0));
        jLabel139.setText("Wholesome-resultant consciousness accompanied by joy, disassociated with knowledge, unprompted");

        jCheckBox146.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox146.setText("(somanassasahagata nanavippayutta sasankharika vipaka citta)");
        jCheckBox146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox146ActionPerformed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel140.setForeground(new java.awt.Color(153, 153, 0));
        jLabel140.setText("<html>One consciousness, accompanied by joy, dissociated from knowledge, prompted </html>");

        jCheckBox147.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox147.setText("(upekkhasahagata nanasampayutta asankharika vipaka citta)");
        jCheckBox147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox147ActionPerformed(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel141.setForeground(new java.awt.Color(204, 102, 0));
        jLabel141.setText("Wholesome-resultant consciousness accompanied by equanimity, associated with knowledge, unprompted");

        jCheckBox148.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox148.setText("(upekkhasahagata nanasampayutta sasankharika vipaka citta)");
        jCheckBox148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox148ActionPerformed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel142.setForeground(new java.awt.Color(204, 102, 0));
        jLabel142.setText("Wholesome-resultant consciousness accompanied by equanimity, associated with knowledge, prompted");

        jCheckBox149.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox149.setText("(upekkhasahagata nanavippayutta asankharika vipaka citta)");
        jCheckBox149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox149ActionPerformed(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel143.setForeground(new java.awt.Color(204, 102, 0));
        jLabel143.setText("Wholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, unprompted");

        jCheckBox150.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox150.setText("(upekkhasahagata nanavippayutta sasankharika vipaka citta)");
        jCheckBox150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox150ActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel144.setForeground(new java.awt.Color(204, 102, 0));
        jLabel144.setText("Wholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, prompted");

        jButton19.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton19.setText("Get Mental Factors");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTextPane11.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane24.setViewportView(jTextPane11);

        jButton20.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton20.setText("Refresh");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel54.setText("Number of mental factors:");

        jLabel55.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel55.setForeground(new java.awt.Color(0, 0, 255));
        jLabel55.setText("0      ");

        jLabel150.setFont(new java.awt.Font("Iskoola Pota", 1, 14));
        jLabel150.setForeground(new java.awt.Color(153, 153, 0));
        jLabel150.setText("<html>One consciousness, accompanied by joy, dissociated from knowledge, prompted <br><font color='#8000FF'>සොමනස්ස සහගත ඤාණ විපපයුක්ත සසන්ඛාරික විපාක  සිත</font></html>");

        jLabel151.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel151.setForeground(new java.awt.Color(204, 102, 0));
        jLabel151.setText("Wholesome-resultant consciousness accompanied by joy, disassociated with knowledge, prompted");

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jButton2.setText("Get Mental Factors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jButton35.setText("Refresh");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jTextPane19.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jTextPane19.setToolTipText("");
        jScrollPane32.setViewportView(jTextPane19);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel1.setText("Number of mental factors: ");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("0");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20))
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel55))))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel142))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel141))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel143))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel144))
                            .addComponent(jCheckBox150)
                            .addComponent(jCheckBox149)
                            .addComponent(jCheckBox148)
                            .addComponent(jCheckBox147)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel138))
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel137))
                                    .addComponent(jCheckBox143)
                                    .addComponent(jCheckBox144)
                                    .addComponent(jCheckBox145)
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel139))
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel151))
                                    .addComponent(jCheckBox146))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton35))
                                    .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(476, 476, 476)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox143)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox144)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox145)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox146))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton35))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox147)
                .addGap(18, 18, 18)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox148)
                .addGap(18, 18, 18)
                .addComponent(jLabel143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox149)
                .addGap(14, 14, 14)
                .addComponent(jLabel144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox150)
                .addGap(90, 90, 90)
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(946, 946, 946)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(946, Short.MAX_VALUE)))
        );

        jTabbedPane6.addTab("<html>1.3.2 Resultant Consciousness <i>(vipaka citt)</i></html>", jPanel34);

        jPanel35.setBackground(new java.awt.Color(172, 247, 172));
        jPanel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox167.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox167.setText("(somanassasahagata nanasampayutta asankharika kriya citta)");
        jCheckBox167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox167ActionPerformed(evt);
            }
        });

        jLabel170.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel170.setForeground(new java.awt.Color(204, 102, 0));
        jLabel170.setText("Wholesome-functional consciousness accompanied by joy, associated with knowledge, unprompted");

        jCheckBox168.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox168.setText("(somanassasahagata nanasampayutta sasankharika kriya citta)");
        jCheckBox168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox168ActionPerformed(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel171.setForeground(new java.awt.Color(204, 102, 0));
        jLabel171.setText("Wholesome-functional consciousness accompanied by joy, associated with knowledge, prompted");

        jCheckBox169.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox169.setText("(somanassasahagata nanavippayutta asankharika kriya citta)");
        jCheckBox169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox169ActionPerformed(evt);
            }
        });

        jLabel172.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel172.setForeground(new java.awt.Color(204, 102, 0));
        jLabel172.setText("Wholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted");

        jCheckBox170.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox170.setText("(somanassasahagata nanavippayutta sasankharika kriya citta)");
        jCheckBox170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox170ActionPerformed(evt);
            }
        });

        jLabel173.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel173.setForeground(new java.awt.Color(204, 102, 0));
        jLabel173.setText("Wholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted");

        jCheckBox173.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox173.setText("(upekkhasahagata nanasampayutta asankharika kriya citta)");
        jCheckBox173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox173ActionPerformed(evt);
            }
        });

        jLabel174.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel174.setForeground(new java.awt.Color(204, 102, 0));
        jLabel174.setText("Wholesome-functional consciousness accompanied by equanimity, associated with knowledge, unprompted ");

        jCheckBox174.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox174.setText("(upekkhasahagata nanasampayutta sasankharika kriya citta)");
        jCheckBox174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox174ActionPerformed(evt);
            }
        });

        jLabel175.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel175.setForeground(new java.awt.Color(204, 102, 0));
        jLabel175.setText("Wholesome-functional consciousness accompanied by equanimity, associated with knowledge,  prompted ");

        jCheckBox175.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox175.setText("(upekkhasahagata nanavippayutta asankharika kriya citta)");
        jCheckBox175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox175ActionPerformed(evt);
            }
        });

        jLabel176.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel176.setForeground(new java.awt.Color(204, 102, 0));
        jLabel176.setText("Wholesome functional consciousness accompanied by equanimity, disassociated with knowledge, unprompted");

        jCheckBox176.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox176.setText("(upekkhasahagata nanavippayutta sasankharika kriya citta)");
        jCheckBox176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox176ActionPerformed(evt);
            }
        });

        jLabel177.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel177.setForeground(new java.awt.Color(204, 102, 0));
        jLabel177.setText("Wholesome functional consciousness accompanied by equanimity, disassociated with knowledge, prompted");

        jButton21.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton21.setText("Get Mental Factors");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTextPane12.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane25.setViewportView(jTextPane12);

        jButton22.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton22.setText("Refresh");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel29.setText("Number of mental factors: ");

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("0");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox170)
                            .addComponent(jCheckBox169)
                            .addComponent(jCheckBox168)
                            .addComponent(jCheckBox167)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel171)
                                    .addComponent(jLabel172)
                                    .addComponent(jLabel173)))
                            .addComponent(jCheckBox174)
                            .addComponent(jCheckBox173)
                            .addComponent(jCheckBox176)
                            .addComponent(jCheckBox175)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel175)
                                    .addComponent(jLabel177)
                                    .addComponent(jLabel176)))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel174))))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel170)))
                .addGap(64, 64, 64)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(jButton21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton22)))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel170)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox167, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox168, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox169, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox170)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel174))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton21)
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox173, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox174, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox175, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel177)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox176)
                .addContainerGap(1489, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("<html>1.3.3 Functional Consciousness <i>(kriya citt)</i></html>", jPanel35);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("<html>1.3 Beautiful Consciousness <i>(kamawachara sobana citt)</i></html>", jPanel13);

        jTabbedPane3.addTab("<html>1 Sense-Sphere <i>(kamawachara citt)</i></html>", jTabbedPane2);

        jPanel36.setBackground(new java.awt.Color(172, 247, 172));
        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox90.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox90.setText("(vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta)");
        jCheckBox90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox90ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel67.setForeground(new java.awt.Color(204, 102, 0));
        jLabel67.setText("First jhana wholesome consciousness together with initial application, sustained application, zest, happiness, and one-pointedness");

        jCheckBox91.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox91.setText("(vicara piti sukha ekaggata sahita dutiyajjhana kusala citta)");
        jCheckBox91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox91ActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel68.setForeground(new java.awt.Color(204, 102, 0));
        jLabel68.setText("Second jhana wholesome consciousness together with sustained application, zest, happiness, and one-pointedness");

        jCheckBox92.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox92.setText("(piti sukha ekaggata sahita tatiyajjhana kusala citta)");
        jCheckBox92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox92ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel69.setForeground(new java.awt.Color(204, 102, 0));
        jLabel69.setText("Third jhana wholesome consciousness together with zest, happiness, and one-pointedness");

        jCheckBox93.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox93.setText("(sukha ekaggata sahita catutthajjhana kusala citta)");
        jCheckBox93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox93ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel70.setForeground(new java.awt.Color(204, 102, 0));
        jLabel70.setText("Fourth jhana wholesome consciousness together with happiness and one-pointedness");

        jCheckBox94.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox94.setText("(upekkh ekaggata sahita pancamajjhana kusala citta)");
        jCheckBox94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox94ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel93.setForeground(new java.awt.Color(204, 102, 0));
        jLabel93.setText("Fifth jhana wholesome consciousness together with equanimity and one-pointedness");

        jTextPane13.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane1.setViewportView(jTextPane13);

        jButton23.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton23.setText("Get Mental Factors");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton24.setText("Refresh");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel56.setText("Number of mental factors:");

        jLabel57.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel57.setForeground(new java.awt.Color(51, 0, 255));
        jLabel57.setText("0    ");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox91)
                            .addComponent(jCheckBox90)
                            .addComponent(jCheckBox92)
                            .addComponent(jCheckBox94)
                            .addComponent(jCheckBox93)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel70))))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel67)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel57))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24)))
                .addContainerGap(647, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox90)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox91)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox92)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox94)))
                .addContainerGap(1640, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel36);

        jTabbedPane7.addTab("<html>2.1 Wholesome Consciousness <i>(kusal citt)</i></html>", jScrollPane7);

        jPanel38.setBackground(new java.awt.Color(172, 247, 172));
        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextPane15.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane11.setViewportView(jTextPane15);

        jButton27.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton27.setText("Get Mental Factors");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton28.setText("Refresh");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jCheckBox181.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox181.setText("(vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta)");
        jCheckBox181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox181ActionPerformed(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel186.setForeground(new java.awt.Color(204, 102, 0));
        jLabel186.setText("First jhana functional consciousness together with initial application, sustained application, zest, happiness, and one-pointedness");

        jCheckBox182.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox182.setText("(vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta)");
        jCheckBox182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox182ActionPerformed(evt);
            }
        });

        jLabel187.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel187.setForeground(new java.awt.Color(204, 102, 0));
        jLabel187.setText("Second jhana functional consciousness together with sustained application, zest, happiness, and one-pointedness");

        jCheckBox183.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox183.setText("(piti sukha ekaggata sahita tatiyajjhana vipaka citta)");
        jCheckBox183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox183ActionPerformed(evt);
            }
        });

        jLabel188.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel188.setForeground(new java.awt.Color(204, 102, 0));
        jLabel188.setText("Third jhana functional consciousness together with zest, happiness, and one-pointedness");

        jCheckBox184.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox184.setText("(sukha ekaggata sahita catutthajjhana vipaka citta)");
        jCheckBox184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox184ActionPerformed(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel189.setForeground(new java.awt.Color(204, 102, 0));
        jLabel189.setText("Fourth jhana functional consciousness together with happiness and one-pointedness");

        jCheckBox185.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox185.setText("(upekkh ekaggata sahita pancamajjhana vipaka citta)");
        jCheckBox185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox185ActionPerformed(evt);
            }
        });

        jLabel190.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel190.setForeground(new java.awt.Color(204, 102, 0));
        jLabel190.setText("Fifth jhana functional consciousness together with equanimity and one-pointedness");

        jLabel60.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel60.setText("Number of mental factors:");

        jLabel61.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel61.setForeground(new java.awt.Color(0, 0, 255));
        jLabel61.setText("0     ");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox181))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox182)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel187))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox183)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel188))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox184)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel189))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox185)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel190))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel186)))
                .addGap(23, 23, 23)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel60)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel61))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28)))
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27)
                            .addComponent(jButton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox181)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox182)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel188)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox183)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel189)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox185)))
                .addGap(1678, 1678, 1678))
        );

        jTabbedPane7.addTab("<html>2.2 Resultant Consciousness <i>(vipaka citt)</i></html>", jPanel38);

        jPanel37.setBackground(new java.awt.Color(172, 247, 172));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextPane14.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane10.setViewportView(jTextPane14);

        jButton25.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton25.setText("Get Mental Factors");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton26.setText("Refresh");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jCheckBox156.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox156.setText("(vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta)");
        jCheckBox156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox156ActionPerformed(evt);
            }
        });

        jLabel157.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel157.setForeground(new java.awt.Color(204, 102, 0));
        jLabel157.setText("First jhana resultant consciousness together with initial application, sustained application, zest, happiness, and one-pointedness");

        jCheckBox157.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox157.setText("(vicara piti sukha ekaggata sahita dutiyajjhana kriya citta)");
        jCheckBox157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox157ActionPerformed(evt);
            }
        });

        jLabel158.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel158.setForeground(new java.awt.Color(204, 102, 0));
        jLabel158.setText("Second jhana resultant consciousness together with sustained application, zest, happiness, and one-pointedness");

        jCheckBox158.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox158.setText("(piti sukha ekaggata sahita tatiyajjhana kriya citta)");
        jCheckBox158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox158ActionPerformed(evt);
            }
        });

        jLabel159.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel159.setForeground(new java.awt.Color(204, 102, 0));
        jLabel159.setText("Third jhana resultant consciousness together with zest, happiness, and one-pointedness");

        jCheckBox159.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox159.setText("(sukha ekaggata sahita catutthajjhana kriya citta)");
        jCheckBox159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox159ActionPerformed(evt);
            }
        });

        jLabel160.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel160.setForeground(new java.awt.Color(204, 102, 0));
        jLabel160.setText("Fourth jhana resultant consciousness together with happiness and one-pointedness");

        jCheckBox162.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox162.setText("(upekkh ekaggata sahita pancamajjhana kriya citta)");
        jCheckBox162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox162ActionPerformed(evt);
            }
        });

        jLabel161.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel161.setForeground(new java.awt.Color(204, 102, 0));
        jLabel161.setText("Fifth jhana resultant consciousness together with equanimity and one-pointedness");

        jLabel58.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel58.setText("Number of mental factors:");

        jLabel59.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel59.setForeground(new java.awt.Color(0, 0, 255));
        jLabel59.setText("0     ");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox157)
                            .addComponent(jCheckBox156)
                            .addComponent(jCheckBox158)
                            .addComponent(jCheckBox159)
                            .addComponent(jCheckBox162)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel158)
                                    .addComponent(jLabel159)
                                    .addComponent(jLabel160)
                                    .addComponent(jLabel161))))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel157)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel58)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel59))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26))
                    .addComponent(jScrollPane10))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton25)
                            .addComponent(jButton26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox156)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox157)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox158)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox159)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox162)))
                .addContainerGap(1658, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("<html>2.3 Functional Consciousness <i>(kriya citt)</i></html>", jPanel37);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 2043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("<html>2 Fine-Material Sphere <i>(roopavachara citt)</i></html>", jPanel15);

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel39.setBackground(new java.awt.Color(172, 247, 172));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox95.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox95.setText("(akasanancayatana kusala citta)");
        jCheckBox95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox95ActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel107.setForeground(new java.awt.Color(204, 102, 0));
        jLabel107.setText("Wholesome consciousness pertaining to the base of infinite space");

        jCheckBox96.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox96.setText("(vinnanancayatana kusala citta)");
        jCheckBox96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox96ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel108.setForeground(new java.awt.Color(204, 102, 0));
        jLabel108.setText("Wholesome consciousness pertaining to the base of infinite consciousness");

        jCheckBox97.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox97.setText("(akincannayatana kusala citta)");
        jCheckBox97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox97ActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel109.setForeground(new java.awt.Color(204, 102, 0));
        jLabel109.setText("Wholesome consciousness pertaining to the base of nothingness");

        jCheckBox126.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox126.setText("(nevasannanasannayatana kusala citta)");
        jCheckBox126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox126ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel110.setForeground(new java.awt.Color(204, 102, 0));
        jLabel110.setText("Wholesome consciousness pertaining to the base of neither-perception-nor-non-perception");

        jButton29.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton29.setText("Get Mental Factors");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTextPane16.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane26.setViewportView(jTextPane16);

        jButton30.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton30.setText("Refresh");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel75.setText("Number of mental factors:");

        jLabel76.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel76.setForeground(new java.awt.Color(51, 51, 255));
        jLabel76.setText("0       ");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox126)
                            .addComponent(jCheckBox97)
                            .addComponent(jCheckBox96)
                            .addComponent(jCheckBox95)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel108))))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel107))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel109))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel110)))
                .addGap(54, 54, 54)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton30))
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(708, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton29)
                            .addComponent(jButton30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox95)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox96)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox97)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox126)))
                .addContainerGap(1659, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel39);

        jScrollPane12.setViewportView(jScrollPane13);

        jTabbedPane8.addTab("<html>3.1 Wholesome  Consciousness <i>(kusal citt)</i></html>", jScrollPane12);

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel40.setBackground(new java.awt.Color(172, 247, 172));
        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox136.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox136.setText("(akasanancayatana vipaka citta)");
        jCheckBox136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox136ActionPerformed(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel132.setForeground(new java.awt.Color(204, 102, 0));
        jLabel132.setText("Resultant consciousness pertaining to the base of infinite space");

        jCheckBox137.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox137.setText("(vinnanancayatana vipaka citta)");
        jCheckBox137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox137ActionPerformed(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel133.setForeground(new java.awt.Color(204, 102, 0));
        jLabel133.setText("Resultant consciousness pertaining to the base of infinite consciousness");

        jCheckBox140.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox140.setText("(akincannayatana vipaka citta)");
        jCheckBox140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox140ActionPerformed(evt);
            }
        });

        jLabel147.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel147.setForeground(new java.awt.Color(204, 102, 0));
        jLabel147.setText("Resultant consciousness pertaining to the base of nothingness");

        jCheckBox141.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox141.setText("(nevasannanasannayatana vipaka citta)");
        jCheckBox141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox141ActionPerformed(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel148.setForeground(new java.awt.Color(204, 102, 0));
        jLabel148.setText("Resultant consciousness pertaining to the base of neither- perception-nor-non-perception");

        jButton31.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton31.setText("Get Mental Factors");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jTextPane17.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane28.setViewportView(jTextPane17);

        jButton32.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton32.setText("Refresh");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel111.setText("Number of mental factors:");

        jLabel112.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel112.setForeground(new java.awt.Color(51, 0, 255));
        jLabel112.setText("0     ");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox140)
                    .addComponent(jCheckBox141)
                    .addComponent(jCheckBox137)
                    .addComponent(jCheckBox136)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel132))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel133))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel147))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel148)))
                .addGap(42, 42, 42)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jButton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel112))
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jCheckBox136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel132)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel147)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31)
                            .addComponent(jButton32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1689, Short.MAX_VALUE))
        );

        jScrollPane27.setViewportView(jPanel40);

        jScrollPane14.setViewportView(jScrollPane27);

        jTabbedPane8.addTab("<html>3.2 Resultant Consciousness<i>(vipaka citt)</i></html>", jScrollPane14);

        jPanel41.setBackground(new java.awt.Color(172, 247, 172));
        jPanel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox154.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox154.setText("(akasanancayatana kriya citta)");
        jCheckBox154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox154ActionPerformed(evt);
            }
        });

        jLabel155.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel155.setForeground(new java.awt.Color(204, 102, 0));
        jLabel155.setText("Functional consciousness pertaining to the base of infinite space");

        jCheckBox155.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox155.setText("(vinnanancayatana kriya citta)");
        jCheckBox155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox155ActionPerformed(evt);
            }
        });

        jLabel162.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel162.setForeground(new java.awt.Color(204, 102, 0));
        jLabel162.setText("Functional consciousness pertaining to the base of infinite consciousness");

        jCheckBox163.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox163.setText("(akincannayatana kriya citta)");
        jCheckBox163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox163ActionPerformed(evt);
            }
        });

        jLabel179.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel179.setForeground(new java.awt.Color(204, 102, 0));
        jLabel179.setText("Functional consciousness pertaining to the base of nothingness");

        jCheckBox164.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox164.setText("(nevasannanasannayatana kriya citta)");
        jCheckBox164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox164ActionPerformed(evt);
            }
        });

        jLabel180.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel180.setForeground(new java.awt.Color(204, 102, 0));
        jLabel180.setText("Functional consciousness pertaining to the base of neither- perception-nor-non-perception");

        jButton33.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton33.setText("Get Mental Factors");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jTextPane18.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane30.setViewportView(jTextPane18);

        jButton34.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton34.setText("Refresh");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel113.setText("Number of mental factors:");

        jLabel115.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel115.setForeground(new java.awt.Color(51, 0, 204));
        jLabel115.setText("0      ");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox154)
                                    .addComponent(jCheckBox155)
                                    .addComponent(jCheckBox163)
                                    .addComponent(jCheckBox164)))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel155))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel162))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel179)))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel180)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel113)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel115))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34))
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1038, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton33)
                        .addComponent(jButton34))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addComponent(jCheckBox154)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox155)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel179)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox163)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel180)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox164))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel115))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1672, Short.MAX_VALUE))
        );

        jScrollPane29.setViewportView(jPanel41);

        jTabbedPane8.addTab("<html>3.3 Functional Consciousness<i>(kriya citt)</i></html>", jScrollPane29);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 2026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("<html>3 Immaterial Sphere <i>(aroopavachara citt)</i></html>", jPanel16);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel44.setBackground(new java.awt.Color(172, 247, 172));
        jPanel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox132.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox132.setText("(prathama dhyana shrothapathi mharga citta)");
        jCheckBox132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox132ActionPerformed(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel121.setForeground(new java.awt.Color(204, 51, 0));
        jLabel121.setText("The first Jhana, path consciousness of stream-entry");

        jCheckBox138.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox138.setText("(dwitheeya dhyana shrothapathi mharga citta)");
        jCheckBox138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox138ActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel123.setForeground(new java.awt.Color(204, 51, 0));
        jLabel123.setText("The second Jhana, path consciousness of stream-entry");

        jCheckBox139.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox139.setText("(thrutheeya dhyana shrothapathi mharga citta)");
        jCheckBox139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox139ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel124.setForeground(new java.awt.Color(204, 51, 0));
        jLabel124.setText("The third Jhana, path consciousness of stream-entry");

        jCheckBox142.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox142.setText("(chathurtha dhyana shrothapathi mharga citta)");
        jCheckBox142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox142ActionPerformed(evt);
            }
        });

        jLabel129.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel129.setForeground(new java.awt.Color(204, 51, 0));
        jLabel129.setText("The fourth Jhana, path consciousness of stream-entry");

        jCheckBox151.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox151.setText("(panchama dhyana shrothapathi mharga citta)");
        jCheckBox151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox151ActionPerformed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel131.setForeground(new java.awt.Color(204, 51, 0));
        jLabel131.setText("The fifth Jhana, path consciousness of stream-entry");

        jCheckBox152.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox152.setText("(prathama dhyana sakadagami mharga citta)");
        jCheckBox152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox152ActionPerformed(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel134.setForeground(new java.awt.Color(204, 51, 0));
        jLabel134.setText("The first Jhana, path consciousness of once-returning");

        jCheckBox153.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox153.setText("(dwitheeya dhyana sakadagami mharga citta)");
        jCheckBox153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox153ActionPerformed(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel136.setForeground(new java.awt.Color(204, 51, 0));
        jLabel136.setText("The second Jhana, path consciousness of once-returning");

        jCheckBox160.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox160.setText("(thrutheeya dhyana sakadagami mharga citta)");
        jCheckBox160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox160ActionPerformed(evt);
            }
        });

        jLabel146.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel146.setForeground(new java.awt.Color(204, 51, 0));
        jLabel146.setText("The third Jhana, path consciousness of once-returning");

        jCheckBox161.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox161.setText("(chathurtha dhyana sakadagami mharga citta)");
        jCheckBox161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox161ActionPerformed(evt);
            }
        });

        jLabel149.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel149.setForeground(new java.awt.Color(204, 51, 0));
        jLabel149.setText("The fourth Jhana, path consciousness of once-returning");

        jCheckBox165.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox165.setText("(panchama dhyana sakadagami mharga citta)");
        jCheckBox165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox165ActionPerformed(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel152.setForeground(new java.awt.Color(204, 51, 0));
        jLabel152.setText("The fifth Jhana, path consciousness of once-returning");

        jCheckBox166.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox166.setText("(prathama dhyana anagami mharga citta)");
        jCheckBox166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox166ActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel153.setForeground(new java.awt.Color(204, 51, 0));
        jLabel153.setText("The first Jhana, path consciousness of non-returning");

        jCheckBox177.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox177.setText("(dwitheeya dhyana anagami mharga citta)");
        jCheckBox177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox177ActionPerformed(evt);
            }
        });

        jLabel154.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel154.setForeground(new java.awt.Color(204, 51, 0));
        jLabel154.setText("The second Jhana, path consciousness of non-returning");

        jCheckBox178.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox178.setText("(thrutheeya dhyana anagami mharga citta)");
        jCheckBox178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox178ActionPerformed(evt);
            }
        });

        jLabel234.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel234.setForeground(new java.awt.Color(204, 51, 0));
        jLabel234.setText("The third Jhana, path consciousness of non-returning");

        jCheckBox179.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox179.setText("(chathurtha dhyana anagami mharga citta)");
        jCheckBox179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox179ActionPerformed(evt);
            }
        });

        jLabel235.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel235.setForeground(new java.awt.Color(204, 51, 0));
        jLabel235.setText("The fourth Jhana, path consciousness of non-returning");

        jCheckBox229.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox229.setText("(panchama dhyana anagami mharga citta)");
        jCheckBox229.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox229ActionPerformed(evt);
            }
        });

        jLabel236.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel236.setForeground(new java.awt.Color(204, 51, 0));
        jLabel236.setText("The fifth Jhana, path consciousness of non-returning");

        jCheckBox230.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox230.setText("(prathama dhyana arahath mharga citta)");
        jCheckBox230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox230ActionPerformed(evt);
            }
        });

        jLabel237.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel237.setForeground(new java.awt.Color(204, 51, 0));
        jLabel237.setText("The first Jhana, path consciousness of Arahantship");

        jCheckBox231.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox231.setText("(dwitheeya dhyana arahath mharga citta)");
        jCheckBox231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox231ActionPerformed(evt);
            }
        });

        jLabel238.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel238.setForeground(new java.awt.Color(204, 51, 0));
        jLabel238.setText("The second Jhana, path consciousness of Arahantship");

        jCheckBox232.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox232.setText("(thrutheeya dhyana arahath mharga citta)");
        jCheckBox232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox232ActionPerformed(evt);
            }
        });

        jLabel239.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel239.setForeground(new java.awt.Color(204, 51, 0));
        jLabel239.setText("The third Jhana, path consciousness of Arahantship");

        jCheckBox233.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox233.setText("(chathurtha dhyana arahath mharga citta)");
        jCheckBox233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox233ActionPerformed(evt);
            }
        });

        jLabel240.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel240.setForeground(new java.awt.Color(204, 51, 0));
        jLabel240.setText("The fourth Jhana, path consciousness of Arahantship");

        jCheckBox234.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox234.setText("(panchama dhyana arahath mharga citta)");
        jCheckBox234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox234ActionPerformed(evt);
            }
        });

        jLabel241.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel241.setForeground(new java.awt.Color(204, 51, 0));
        jLabel241.setText("The fifth Jhana, path consciousness of Arahantship");

        jButton38.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton38.setText("Get Mental Factors");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jTextPane21.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane36.setViewportView(jTextPane21);

        jButton39.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton39.setText("Refresh");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel116.setText("Number of mental factors:");

        jLabel117.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel117.setForeground(new java.awt.Color(51, 51, 255));
        jLabel117.setText("0     ");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox165)
                            .addComponent(jCheckBox142)
                            .addComponent(jCheckBox139)
                            .addComponent(jCheckBox138)
                            .addComponent(jCheckBox132)
                            .addComponent(jCheckBox161)
                            .addComponent(jCheckBox160)
                            .addComponent(jCheckBox153)
                            .addComponent(jCheckBox152)
                            .addComponent(jCheckBox151)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel123)
                                        .addComponent(jLabel124)
                                        .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel129)
                                    .addComponent(jLabel134)
                                    .addComponent(jLabel136)))))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel121)))
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox229)
                                    .addComponent(jCheckBox230)
                                    .addComponent(jCheckBox179)
                                    .addComponent(jCheckBox178)
                                    .addComponent(jCheckBox177)
                                    .addComponent(jCheckBox166)
                                    .addComponent(jCheckBox231)
                                    .addComponent(jCheckBox232)
                                    .addComponent(jCheckBox233)
                                    .addComponent(jCheckBox234)
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel237))))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel234)
                                    .addComponent(jLabel154)
                                    .addComponent(jLabel235))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel117))
                                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel153)
                        .addGap(0, 527, Short.MAX_VALUE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel240)
                        .addContainerGap(519, Short.MAX_VALUE))))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel131)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel236))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel152)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel241))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel238)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel146)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel239)))))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(jLabel153))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox132)
                            .addComponent(jCheckBox166, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(jLabel154))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox138)
                            .addComponent(jCheckBox177))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel234)
                            .addComponent(jLabel124))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox178)
                            .addComponent(jCheckBox139))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel235))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox142)
                            .addComponent(jCheckBox179))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel236)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox229))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel131)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox151)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel134)
                            .addComponent(jLabel237))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox152)
                            .addComponent(jCheckBox230))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel238)
                            .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jCheckBox153))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox231)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel146)
                            .addComponent(jLabel239))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox160)
                            .addComponent(jCheckBox232))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel149)
                            .addComponent(jLabel240))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox161)
                            .addComponent(jCheckBox233))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel152)
                            .addComponent(jLabel241))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox165)
                            .addComponent(jCheckBox234)))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton39)
                            .addComponent(jButton38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(jLabel117))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel44);

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("<html>4.1 Path Consciousness <i>(lokuthara-mharga)</i></html>", jPanel48);

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel43.setBackground(new java.awt.Color(172, 247, 172));
        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox193.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox193.setText("prathama dhyana shrothapathi phala citta");
        jCheckBox193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox193ActionPerformed(evt);
            }
        });

        jLabel210.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel210.setForeground(new java.awt.Color(204, 102, 0));
        jLabel210.setText("The first Jhana, fruition consciousness of stream-entry");

        jCheckBox194.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox194.setText("dwitheeya dhyana shrothapathi phala citta");
        jCheckBox194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox194ActionPerformed(evt);
            }
        });

        jLabel211.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel211.setForeground(new java.awt.Color(204, 102, 0));
        jLabel211.setText("The second Jhana, fruition consciousness of stream-entry");

        jCheckBox195.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox195.setText("thrutheeya dhyana shrothapathi phala citta");
        jCheckBox195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox195ActionPerformed(evt);
            }
        });

        jLabel212.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel212.setForeground(new java.awt.Color(204, 102, 0));
        jLabel212.setText("The third Jhana, fruition consciousness of stream-entry");

        jCheckBox196.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox196.setText("chathurtha dhyana shrothapathi phala citta");
        jCheckBox196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox196ActionPerformed(evt);
            }
        });

        jLabel213.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel213.setForeground(new java.awt.Color(204, 102, 0));
        jLabel213.setText("The fourth Jhana, fruition consciousness of stream-entry");

        jCheckBox197.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox197.setText("panchama dhyana shrothapathi phala citta");
        jCheckBox197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox197ActionPerformed(evt);
            }
        });

        jLabel215.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel215.setForeground(new java.awt.Color(204, 102, 0));
        jLabel215.setText("The fifth Jhana, fruition consciousness of stream-entry");

        jCheckBox198.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox198.setText("prathama dhyana sakadagami phala citta");
        jCheckBox198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox198ActionPerformed(evt);
            }
        });

        jLabel216.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel216.setForeground(new java.awt.Color(204, 102, 0));
        jLabel216.setText("The first Jhana, fruition consciousness of once-returning");

        jCheckBox199.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox199.setText("dwitheeya dhyana sakadagami phala citta");
        jCheckBox199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox199ActionPerformed(evt);
            }
        });

        jLabel217.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel217.setForeground(new java.awt.Color(204, 102, 0));
        jLabel217.setText("The second Jhana, fruition consciousness of once-returning");

        jCheckBox208.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox208.setText("thrutheeya dhyana sakadagami phala citta");
        jCheckBox208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox208ActionPerformed(evt);
            }
        });

        jLabel218.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel218.setForeground(new java.awt.Color(204, 102, 0));
        jLabel218.setText("The third Jhana, fruition consciousness of once-returning");

        jCheckBox209.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox209.setText("chathurtha dhyana sakadagami phala citta");
        jCheckBox209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox209ActionPerformed(evt);
            }
        });

        jLabel219.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel219.setForeground(new java.awt.Color(204, 102, 0));
        jLabel219.setText("The fourth Jhana, fruition consciousness of once-returning");

        jCheckBox210.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox210.setText("panchama dhyana sakadagami phala citta");
        jCheckBox210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox210ActionPerformed(evt);
            }
        });

        jLabel220.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel220.setForeground(new java.awt.Color(204, 102, 0));
        jLabel220.setText("The fifth Jhana, fruition consciousness of once-returning");

        jCheckBox211.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox211.setText("prathama dhyana anagami phala citta");
        jCheckBox211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox211ActionPerformed(evt);
            }
        });

        jLabel221.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel221.setForeground(new java.awt.Color(204, 102, 0));
        jLabel221.setText("The first Jhana, fruition consciousness of non-returning");

        jCheckBox218.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox218.setText("dwitheeya dhyana anagami phala citta");
        jCheckBox218.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox218ActionPerformed(evt);
            }
        });

        jLabel222.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel222.setForeground(new java.awt.Color(204, 102, 0));
        jLabel222.setText("The second Jhana, fruition consciousness of non-returning");

        jCheckBox219.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox219.setText("thrutheeya dhyana anagami phala citta");
        jCheckBox219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox219ActionPerformed(evt);
            }
        });

        jLabel223.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel223.setForeground(new java.awt.Color(204, 102, 0));
        jLabel223.setText("The third Jhana, fruition consciousness of non-returning");

        jCheckBox220.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox220.setText("chathurtha dhyana anagami phala citta");
        jCheckBox220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox220ActionPerformed(evt);
            }
        });

        jLabel224.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel224.setForeground(new java.awt.Color(204, 102, 0));
        jLabel224.setText("The fourth Jhana, fruition consciousness of non-returning");

        jCheckBox221.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox221.setText("panchama dhyana anagami phala citta");
        jCheckBox221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox221ActionPerformed(evt);
            }
        });

        jLabel225.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel225.setForeground(new java.awt.Color(204, 102, 0));
        jLabel225.setText("The fifth Jhana, fruition consciousness of non-returning");

        jCheckBox222.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox222.setText("prathama dhyana arahath phala citta");
        jCheckBox222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox222ActionPerformed(evt);
            }
        });

        jLabel226.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel226.setForeground(new java.awt.Color(204, 102, 0));
        jLabel226.setText("The first Jhana, fruition consciousness of Arahantship");

        jCheckBox223.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox223.setText("dwitheeya dhyana arahath phala citta");
        jCheckBox223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox223ActionPerformed(evt);
            }
        });

        jLabel227.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel227.setForeground(new java.awt.Color(204, 102, 0));
        jLabel227.setText("The second Jhana, fruition consciousness of Arahantship");

        jCheckBox224.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox224.setText("thrutheeya dhyana arahath phala citta");
        jCheckBox224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox224ActionPerformed(evt);
            }
        });

        jLabel231.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel231.setForeground(new java.awt.Color(204, 102, 0));
        jLabel231.setText("The third Jhana, fruition consciousness of Arahantship");

        jCheckBox227.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox227.setText("chathurtha dhyana arahath phala citta");
        jCheckBox227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox227ActionPerformed(evt);
            }
        });

        jLabel232.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel232.setForeground(new java.awt.Color(204, 102, 0));
        jLabel232.setText("The fourth Jhana, fruition consciousness of Arahantship");

        jCheckBox228.setFont(new java.awt.Font("Lucida Grande", 3, 12));
        jCheckBox228.setText("panchama dhyana arahath phala citta");
        jCheckBox228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox228ActionPerformed(evt);
            }
        });

        jLabel233.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel233.setForeground(new java.awt.Color(204, 102, 0));
        jLabel233.setText("The fifth Jhana, fruition consciousness of Arahantship");

        jButton36.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton36.setText("Get Mental Factors");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jTextPane20.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jScrollPane34.setViewportView(jTextPane20);

        jButton37.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton37.setText("Refresh");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel118.setText("Number of mental factors:");

        jLabel119.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel119.setForeground(new java.awt.Color(51, 0, 255));
        jLabel119.setText("0        ");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox195)
                                    .addComponent(jCheckBox197)
                                    .addComponent(jCheckBox199)
                                    .addComponent(jCheckBox193)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel216)
                                            .addComponent(jLabel213)))))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel210))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel211))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox208)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel218))
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel219))))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox209))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel220))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox210)))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox223)
                                    .addComponent(jCheckBox222)
                                    .addComponent(jCheckBox221)
                                    .addComponent(jCheckBox220)
                                    .addComponent(jCheckBox219)
                                    .addComponent(jCheckBox228)
                                    .addComponent(jCheckBox224)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel232))
                                    .addComponent(jCheckBox227)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel226))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel222))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel231))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel233))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox198))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel215))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel212))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox194))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox196))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel217)))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel223)
                                        .addComponent(jLabel224))
                                    .addGap(14, 14, 14))
                                .addGroup(jPanel43Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox218)
                                        .addComponent(jCheckBox211))))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel227))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel225)))))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel119)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton37)
                            .addComponent(jButton36))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jLabel119))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel210)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox193)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel212)
                                    .addComponent(jLabel223))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox195)
                                    .addComponent(jCheckBox219))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel213)
                                    .addComponent(jLabel224))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox196)
                                    .addComponent(jCheckBox220))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel215)
                                    .addComponent(jLabel225))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox197)
                                    .addComponent(jCheckBox221))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel216)
                                    .addComponent(jLabel226))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox198)
                                    .addComponent(jCheckBox222))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel217)
                                    .addComponent(jLabel227))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox199)
                                    .addComponent(jCheckBox223)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel221)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox211)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel222)
                                    .addComponent(jLabel211))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox194)
                                    .addComponent(jCheckBox218))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel231)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox224))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel218)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox208)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel232)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox227)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel233))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel219)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox209)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel220)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox210)
                    .addComponent(jCheckBox228))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel43);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("<html>4.2 Fruition consciousness <i>(lokuthara-pahala)</i></html>", jPanel49);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("<html>4 Supramundane <i>(lokuthra citt)</i></html>", jPanel42);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thoughts", jPanel2);

        jPanel1.setBackground(new java.awt.Color(168, 244, 168));

        jPanel3.setBackground(new java.awt.Color(168, 244, 168));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel2.setText("Ethically Variables - 13");

        jPanel4.setBackground(new java.awt.Color(191, 219, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("<html>Universals <i>(sarwa chitha sadarana)-7</i></html>");

        jCheckBox1.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox1.setText("<html>Contact <i>(phassa)</i></html>");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox2.setText("<html>Feeling <i>(vedhana)</i></html>");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox3.setText("<html>Perception <i>(sangya)</i></html>");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox4.setText("<html>Volition <i>(chethana)</i></html>");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox5.setText("<html>One-pointedness <i>(ekagatha)</i></html>");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox6.setText("<html>Psychic life <i>(jeewitheedriya)</i></html>");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox7.setText("<html>Attention <i>(manasikaraya)</i></html>");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(191, 219, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("<html>Occasionals <i>(prakeernaka)-6</i></html>");

        jCheckBox8.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox8.setText("<html>Initial application <i>(vithakka)</i></html>");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox9.setText("<html>Sustained application <i>(vichara)</i></html>");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox10.setText("<html>Decision <i>(adhimokkha)</i></html>");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox11.setText("<html>Energy <i>(veeriya)</i></html>");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox12.setText("<html>Zest <i>(preethi)</i></html>");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox13.setText("<html>Desire <i>(chandha)</i></html>");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(168, 244, 168));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel5.setText("<html>Unwholesome <i>(akushala)</i>-14</html>");

        jPanel7.setBackground(new java.awt.Color(243, 187, 215));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel6.setText("<html>Unwholesome Universal <i>(akusalasadarana)</i>-4</html>");

        jCheckBox14.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox14.setText("<html>Delusion <i>(moha)</i></html>");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox15.setText("<html>Shamelessness <i>(ahirika)</i></html>");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox16.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox16.setText("<html>Fearlessness of wrong <i>(anoththaptha)</i></html>");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox17.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox17.setText("<html>Restlessness <i>(udhacha)</i></html>");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(243, 187, 215));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setAutoscrolls(true);

        jPanel28.setBackground(new java.awt.Color(244, 190, 217));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox21.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jCheckBox21.setText("<html>Greed <i>(lobha)</i></html>");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jCheckBox22.setText("<html>Wrong view <i>(dhitti)</i></html>");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jCheckBox23.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jCheckBox23.setText("<html>Conceit <i>(mana)</i></html>");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Lucida Grande", 1, 12));
        jLabel125.setText("<html>Greed-group <i>(lobha)</i>-3</html>");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel29.setBackground(new java.awt.Color(244, 190, 217));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox24.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox24.setText("<html>Hatred <i>(dhosa)</i></html>");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox25.setText("<html>Jealousy <i>(issa)</i></html>");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        jCheckBox26.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox26.setText("<html>Avarice <i>(michariya)</i></html>");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });

        jCheckBox27.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox27.setText("<html>Worry <i>(kukucha)</i></html>");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel128.setText("<html>Hatred-group <i>(dosa)</i>-4</html>");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel30.setBackground(new java.awt.Color(244, 190, 217));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox28.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox28.setText("<html>Sloth <i>(theena)</i></html>");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });

        jCheckBox29.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox29.setText("<html>Torpor <i>(middha)</i></html>");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(244, 190, 217));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox30.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox30.setText("<html>Doubt <i>(vichikicha)</i></html>");
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(168, 244, 168));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel8.setText("<html>Beautiful <i>(sobhana)-25</i></html>");

        jPanel10.setBackground(new java.awt.Color(248, 227, 142));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setAutoscrolls(true);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel10.setText("<html>Beautiful Universal <i>(sobhana sadharana)-19</i></html>");

        jCheckBox32.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox32.setText("<html>Confidence <i>(saddha)</i></html>");
        jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox32ActionPerformed(evt);
            }
        });

        jCheckBox33.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox33.setText("<html>Mindfulness <i>(sathi)</i></html>");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });

        jCheckBox34.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox34.setText("<html>Shame <i>(hiri)</i></html>");
        jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox34ActionPerformed(evt);
            }
        });

        jCheckBox35.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox35.setText("<html>Dread <i>(othappa)</i></html>");
        jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox35ActionPerformed(evt);
            }
        });

        jCheckBox36.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox36.setText("<html>Non-greed <i>(alobha)</i></html>");
        jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox36ActionPerformed(evt);
            }
        });

        jCheckBox37.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox37.setText("<html>Non-hatred <i>(adhosa)</i></html>");
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });

        jCheckBox38.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox38.setText("<html>Equanimity <i>(thathramajanthatha)</i></html>");
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });

        jCheckBox39.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox39.setText("<html>Tranquility of mental states <i>(kaya passadhi)</i></html>");
        jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox39ActionPerformed(evt);
            }
        });

        jCheckBox40.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox40.setText("<html>Tranquility of mind <i>(chitha passadhi)</i></html>");
        jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox40ActionPerformed(evt);
            }
        });

        jCheckBox41.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox41.setText("<html>Lightness of mental states <i>(kaya lahutha)</i></html>");
        jCheckBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox41ActionPerformed(evt);
            }
        });

        jCheckBox52.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox52.setText("<html>Lightness of mind <i>(chitha lahutha)</i></html>");
        jCheckBox52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox52ActionPerformed(evt);
            }
        });

        jCheckBox53.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox53.setText("<html>Pliancy of mental states <i>(kaya mutdutha)</i></html>");
        jCheckBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox53ActionPerformed(evt);
            }
        });

        jCheckBox54.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox54.setText("<html>Pliancy of mind <i>(chittha mutdutha)</i></html>");
        jCheckBox54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox54ActionPerformed(evt);
            }
        });

        jCheckBox55.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox55.setText("<html>Adaptability of mental states <i>(kaya kammagatha)</i></html>");
        jCheckBox55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox55ActionPerformed(evt);
            }
        });

        jCheckBox56.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox56.setText("<html>Adaptability of mind <i>(chittha kammagatha)</i></html>");
        jCheckBox56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox56ActionPerformed(evt);
            }
        });

        jCheckBox57.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox57.setText("<html>Proficiency of mental body <i>(kaya pragungyatha)</i></html>");
        jCheckBox57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox57ActionPerformed(evt);
            }
        });

        jCheckBox58.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox58.setText("<html>Proficiency of consciousness <i>(chitta pragungyatha)</i></html>");
        jCheckBox58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox58ActionPerformed(evt);
            }
        });

        jCheckBox59.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox59.setText("<html>Rectitude of mental body <i>(kayujjukatha)</i></html>");
        jCheckBox59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox59ActionPerformed(evt);
            }
        });

        jCheckBox60.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox60.setText("<html>Rectitude of consciousness <i>(chithayujjuktha)</i></html>");
        jCheckBox60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(248, 227, 142));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("<html>Abstinences <i>(virathi)-3</i></html>");

        jCheckBox18.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox18.setText("<html>Right speech <i>(samma wacha)</i></html>");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox19.setText("<html>Right action <i>(samma kamantha)</i></html>");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox20.setText("<html>Right livelihood <i>(samma arjeewa)</i></html>");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(248, 227, 142));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel13.setText("<html>Non - Delusion <i>(amoha)-1</i></html>");

        jCheckBox63.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox63.setText("<html>Wisdom faculty <i>(pragnya)</i></html>");
        jCheckBox63.setToolTipText("");
        jCheckBox63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(248, 227, 142));
        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel25.setForeground(new java.awt.Color(153, 204, 255));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel12.setText("<html>Illimitables <i>(apramanya)-2</i></html>");

        jCheckBox61.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox61.setText("<html>Compassion <i>(karuna)</i></html>");
        jCheckBox61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox61ActionPerformed(evt);
            }
        });

        jCheckBox62.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jCheckBox62.setText("<html>Appreciative joy <i>(mudhitha)</i></html>");
        jCheckBox62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox62ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton1.setText("Get Thoughts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jTextPane2.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jScrollPane17.setViewportView(jTextPane2);

        jLabel126.setText("Number of thoughts:");

        jLabel127.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel127.setForeground(new java.awt.Color(204, 0, 0));
        jLabel127.setText("0");

        jButton7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jButton7.setText("Expand Output");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7)
                                            .addComponent(jLabel126))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel126)
                            .addComponent(jLabel127))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1532, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 1467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mental Factors", jPanel27);

        jPanel32.setBackground(new java.awt.Color(168, 244, 168));

        jPanel46.setBackground(new java.awt.Color(235, 186, 111));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel24.setText("<html><p>BMind Simulator provides opportunity for simulating behavior of mind according to Abhidhamma in Theravada Buddhism.<br> This is a result of a collaborative project based at Faculty of Computing, General Sir John Kotelawala Defense University, Sri Lanka. </p></html>");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel25.setText("Contributors:");

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel26.setText("<html> <ul> <li>Prof. Asoka Karunananda, General Sir John Kotelawala Defence University, Ratmalana, Sri Lanka</li>                         <li>Prof. George Rzevski, Centre for Complexity Science Applications, The Open University, UK</li>                      <li>Prof. Philippe Goldin, University of California, Davis, United States</li>    <li>Dr. Subha Fernando and Mrs. Harindra R. Fernando, Department of Computational Mathematics, University of Moratuwa, Sri Lanka</li>    </ul> </html>");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel27.setText("<html> <p>This simulator could be useful for psychologists, counselors, meditators, and those who are interested in behaviour of mind in general.                                                </p> </html>");

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel28.setText("<html> &copy; 2015 - Kotelawala Defence University, Sri Lanka</html>");

        jLabel78.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel78.setText("Developed By:");

        jLabel82.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel82.setText("Mrs. Harindra R. Fernando");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wonderfulmindv1_1/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel23)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel32);

        jPanel33.setBackground(new java.awt.Color(168, 244, 168));

        jPanel47.setBackground(new java.awt.Color(235, 186, 111));

        jLabel62.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel62.setText("<html> <p>     BMind simulator facilitates learning and researching about Buddhist Theory of Mind. It is based on Buddhist text of Abhidhamma, <br>where mind is defined as a flow of thoughts.     Each thought (<em>citta</em>) is comprised of a set of mental factors (<em>cetasika</em>). </p></html>");

        jLabel63.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel63.setText("The simulator provides two views ");

        jLabel64.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel64.setText("<html> <ul> <li>Thoughts </li><li>Mental Factors </li></ul> </html>");

        jLabel65.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel65.setText("<html><p> Thoughts – This view shows thoughts under four categories: <em>Sense-Sphere</em>, <em>Fine-material sphere</em>, <em>Immaterial sphere </em>and    <br><em>Supramundane sphere. </em>Here you can select various Thoughts and identify the Mental Factors within the selected Thought. </p></html>");

        jLabel66.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel66.setText("<html> &copy; 2015 - Kotelawala Defence University, Sri Lanka</html>");

        jLabel71.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel71.setText("<html>  <p>     Mental Factor – This view shows mental factors under three major categories: <em>Ethically Variables, Unwholesome <br>and Beautiful</em>. Here you can modulate Mental Factors and examine possible Thoughts. </p> </html>");

        jLabel72.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel72.setText("Follow the");

        jLabel41.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel41.setText("Please try the current version of BMind and send your feedback to deanr&d@kdu.ac.lk");

        jLabel73.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel73.setText("Your feedback will be immensely useful to improve the tool. ");

        jButton41.setBackground(new java.awt.Color(234, 185, 112));
        jButton41.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jButton41.setText("Guided Tour");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel77.setText("to familiarize yourself with BMind.");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wonderfulmindv1_1/Logo.png"))); // NOI18N

        jLabel86.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel86.setText("The following sources will also be useful for your experiments.");

        jButton43.setBackground(new java.awt.Color(234, 185, 112));
        jButton43.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jButton43.setText("Guide to Experiment – English.pdf");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(234, 185, 112));
        jButton45.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jButton45.setText("Comprehensive Manual of Abhidhamma.pdf ");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(234, 185, 112));
        jButton46.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jButton46.setText("Theory of BMind - Research Paper.pdf");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel14))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45)
                    .addComponent(jButton46))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Help", jPanel33);

        jPanel45.setBackground(new java.awt.Color(167, 242, 167));

        jButton40.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jButton40.setText("Open feedback");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel74.setText("Your feedback will be immensely useful to improve the tool. ");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(jButton40)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40)
                    .addComponent(jLabel74))
                .addContainerGap(977, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Feedback", jPanel45);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1343, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1170, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Mind Factors");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (redArray.size() == 0 && !dashboardView.restart) {
            dashboardView.restart = true;
            getSelectedValues();
            TextOutput textOutput = new TextOutput();
            textOutput.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            textOutput.setBounds(350, 100, 708, 600);
            textOutput.getContentPane().setBackground(Color.DARK_GRAY);
            textOutput.reloadtextPane(redArray, blueArray, orangeArray);
            textOutput.setVisible(true);
        } else {
            TextOutput textOutput = new TextOutput();
            textOutput.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            textOutput.setBounds(350, 100, 708, 600);
            textOutput.getContentPane().setBackground(Color.DARK_GRAY);
            textOutput.reloadtextPane(redArray, blueArray, orangeArray);
            textOutput.setVisible(true);
        }

        if (orangeArray.size() > 0) {
            // popupGauge(orangeArray);
            // popupBarChart(orangeArray, false);
            popUpStackedBarChart(orangeArray, false);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    public static void popupGauge(ArrayList<String> orangeArray) {
        Utilities.setPercentages();
        String lastCittValue = orangeArray.get(orangeArray.size() - 1);
        System.out.println("lastCittValue: " + lastCittValue);
        String ethicalyPercent = Utilities.ethicallyVariablesArray.get(lastCittValue);
        String unwholePercent = Utilities.unwholesomeFactorsArray.get(lastCittValue);
        String beautiPercent = Utilities.beautifulFactorsArray.get(lastCittValue);

        float ethicalyPercentInt = (Float.parseFloat(ethicalyPercent) / 13) * 100;
        float unwholePercentInt = (Float.parseFloat(unwholePercent) / 14) * 100;
        float beautiPercentInt = (Float.parseFloat(beautiPercent) / 25) * 100;

        System.out.println("ethicalyPercentInt: " + ethicalyPercentInt + " unwholePercentInt:" + unwholePercentInt + " beautiPercentInt:" + beautiPercentInt);

        DefaultPieDataset dpdset1 = new DefaultPieDataset();
        dpdset1.setValue("Included: " + ethicalyPercent, new Float(ethicalyPercentInt));
        int notethicalyPercent = 13 - Integer.parseInt(ethicalyPercent);
        dpdset1.setValue("Not Included: " + notethicalyPercent, new Float(100 - ethicalyPercentInt));

        DefaultPieDataset dpdset2 = new DefaultPieDataset();
        dpdset2.setValue("Included: " + unwholePercent, new Float(unwholePercentInt));
        int notunwholePercent = 14 - Integer.parseInt(unwholePercent);
        dpdset2.setValue("Not Included: " + notunwholePercent, new Float(100 - unwholePercentInt));

        DefaultPieDataset dpdset3 = new DefaultPieDataset();
        dpdset3.setValue("Included: " + beautiPercent, new Float(beautiPercentInt));
        int notbeautiPercent = 25 - Integer.parseInt(beautiPercent);
        dpdset3.setValue("Not Included: " + notbeautiPercent, new Float(100 - beautiPercentInt));

        JFreeChart chart = ChartFactory.createPieChart("Ethically Variables", dpdset1, true, true, true);
        JFreeChart chart2 = ChartFactory.createPieChart("Unwholesome Factors", dpdset2, true, true, true);
        JFreeChart chart3 = ChartFactory.createPieChart("Beautiful Factors", dpdset3, true, true, true);

        PiePlot p = (PiePlot) chart.getPlot();
        p.setSectionPaint(0, new Color(191, 219, 246));

        PiePlot p2 = (PiePlot) chart2.getPlot();
        p2.setSectionPaint(0, new Color(243, 187, 215));

        PiePlot p3 = (PiePlot) chart3.getPlot();
        p3.setSectionPaint(0, new Color(248, 227, 142));

        ChartPanel panel = new ChartPanel(chart);
        ChartPanel panel2 = new ChartPanel(chart2);
        ChartPanel panel3 = new ChartPanel(chart3);

        panel.setSize(60, 50);
        panel2.setSize(60, 50);
        panel3.setSize(60, 50);

        JFrame frame = new JFrame("Mental Factors Combinations");

        dashboardView.jPanel50.setLayout(new BoxLayout(dashboardView.jPanel50, BoxLayout.Y_AXIS));
        dashboardView.jPanel50.add(panel);
        dashboardView.jPanel50.add(panel2);
        dashboardView.jPanel50.add(panel3);
        dashboardView.jPanel50.setSize(60, 150);
        dashboardView.jPanel50.setVisible(true);

        // BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        //frame.setLayout(boxLayout);
        //frame.setBounds(1000, 0, 280, 600);
        // frame.getContentPane().add(panel);
        // frame.getContentPane().add(panel2);
        //frame.getContentPane().add(panel3);
        // frame.setVisible(true);
    }
    private void jCheckBox115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox115ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab112(evt);
    }//GEN-LAST:event_jCheckBox115ActionPerformed

    private void jCheckBox116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox116ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab112(evt);
    }//GEN-LAST:event_jCheckBox116ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane4, jLabel33);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jCheckBox171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox171ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab113(evt);
    }//GEN-LAST:event_jCheckBox171ActionPerformed

    private void jCheckBox172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox172ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab113(evt);
    }//GEN-LAST:event_jCheckBox172ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane5, jLabel35);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        dashboardView.refreshThoughts();

    }//GEN-LAST:event_jButton9ActionPerformed

    public void refreshThoughts() {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //   dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane1, jLabel32);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox48ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox48ActionPerformed

    private void jCheckBox47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox47ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox47ActionPerformed

    private void jCheckBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox46ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox46ActionPerformed

    private void jCheckBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox45ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox45ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jCheckBox43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox43ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox43ActionPerformed

    private void jCheckBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox42ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox42ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed

        dashboardView.clearOtherTab111(evt);//
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox73ActionPerformed

        dashboardView.clearOtherTab121(evt);
    }//GEN-LAST:event_jCheckBox73ActionPerformed

    private void jCheckBox74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox74ActionPerformed
        dashboardView.clearOtherTab121(evt);
    }//GEN-LAST:event_jCheckBox74ActionPerformed

    private void jCheckBox75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox75ActionPerformed
        dashboardView.clearOtherTab121(evt);

    }//GEN-LAST:event_jCheckBox75ActionPerformed

    private void jCheckBox76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox76ActionPerformed
        dashboardView.clearOtherTab121(evt);
    }//GEN-LAST:event_jCheckBox76ActionPerformed

    private void jCheckBox77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox77ActionPerformed
        dashboardView.clearOtherTab121(evt);
    }//GEN-LAST:event_jCheckBox77ActionPerformed

    private void jCheckBox78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox78ActionPerformed
        dashboardView.clearOtherTab121(evt);

    }//GEN-LAST:event_jCheckBox78ActionPerformed

    private void jCheckBox79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox79ActionPerformed
        dashboardView.clearOtherTab121(evt);

    }//GEN-LAST:event_jCheckBox79ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane6, jLabel38);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jCheckBox106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox106ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab122(evt);
    }//GEN-LAST:event_jCheckBox106ActionPerformed

    private void jCheckBox107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox107ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab122(evt);
    }//GEN-LAST:event_jCheckBox107ActionPerformed

    private void jCheckBox108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox108ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab122(evt);
    }//GEN-LAST:event_jCheckBox108ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane8, jLabel49);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jCheckBox118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox118ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox118ActionPerformed

    private void jCheckBox119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox119ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox119ActionPerformed

    private void jCheckBox120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox120ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox120ActionPerformed

    private void jCheckBox121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox121ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox121ActionPerformed

    private void jCheckBox122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox122ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox122ActionPerformed

    private void jCheckBox123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox123ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox123ActionPerformed

    private void jCheckBox124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox124ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox124ActionPerformed

    private void jCheckBox125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox125ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab123(evt);
    }//GEN-LAST:event_jCheckBox125ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane9, jLabel51);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jCheckBox98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox98ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox98ActionPerformed

    private void jCheckBox99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox99ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox99ActionPerformed

    private void jCheckBox100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox100ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox100ActionPerformed

    private void jCheckBox101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox101ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox101ActionPerformed

    private void jCheckBox102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox102ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox102ActionPerformed

    private void jCheckBox103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox103ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox103ActionPerformed

    private void jCheckBox104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox104ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox104ActionPerformed

    private void jCheckBox105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox105ActionPerformed
        dashboardView.clearOtherTab131(evt);
    }//GEN-LAST:event_jCheckBox105ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane10, jLabel53);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jCheckBox143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox143ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox143ActionPerformed

    private void jCheckBox144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox144ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox144ActionPerformed

    private void jCheckBox145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox145ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox145ActionPerformed

    private void jCheckBox146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox146ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox146ActionPerformed

    private void jCheckBox147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox147ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox147ActionPerformed

    private void jCheckBox148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox148ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox148ActionPerformed

    private void jCheckBox149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox149ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox149ActionPerformed

    private void jCheckBox150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox150ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab132(evt);
    }//GEN-LAST:event_jCheckBox150ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane11, jLabel55);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jCheckBox167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox167ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);

    }//GEN-LAST:event_jCheckBox167ActionPerformed

    private void jCheckBox168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox168ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox168ActionPerformed

    private void jCheckBox169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox169ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox169ActionPerformed

    private void jCheckBox170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox170ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox170ActionPerformed

    private void jCheckBox173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox173ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox173ActionPerformed

    private void jCheckBox174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox174ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox174ActionPerformed

    private void jCheckBox175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox175ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox175ActionPerformed

    private void jCheckBox176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox176ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab133(evt);
    }//GEN-LAST:event_jCheckBox176ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane12, jLabel30);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jCheckBox90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox90ActionPerformed

        dashboardView.clearOtherTab21(evt);
    }//GEN-LAST:event_jCheckBox90ActionPerformed

    private void jCheckBox91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox91ActionPerformed

        dashboardView.clearOtherTab21(evt);
    }//GEN-LAST:event_jCheckBox91ActionPerformed

    private void jCheckBox92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox92ActionPerformed

        dashboardView.clearOtherTab21(evt);
    }//GEN-LAST:event_jCheckBox92ActionPerformed

    private void jCheckBox93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox93ActionPerformed

        dashboardView.clearOtherTab21(evt);
    }//GEN-LAST:event_jCheckBox93ActionPerformed

    private void jCheckBox94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox94ActionPerformed

        dashboardView.clearOtherTab21(evt);
    }//GEN-LAST:event_jCheckBox94ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesRoopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane13, jLabel57);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesRoopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane14, jLabel59);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jCheckBox156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox156ActionPerformed

        dashboardView.clearOtherTab22(evt);
    }//GEN-LAST:event_jCheckBox156ActionPerformed

    private void jCheckBox157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox157ActionPerformed

        dashboardView.clearOtherTab22(evt);
    }//GEN-LAST:event_jCheckBox157ActionPerformed

    private void jCheckBox158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox158ActionPerformed

        dashboardView.clearOtherTab22(evt);
    }//GEN-LAST:event_jCheckBox158ActionPerformed

    private void jCheckBox159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox159ActionPerformed

        dashboardView.clearOtherTab22(evt);
    }//GEN-LAST:event_jCheckBox159ActionPerformed

    private void jCheckBox162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox162ActionPerformed

        dashboardView.clearOtherTab22(evt);
    }//GEN-LAST:event_jCheckBox162ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        //  dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesRoopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane15, jLabel61);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jCheckBox181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox181ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab23(evt);
    }//GEN-LAST:event_jCheckBox181ActionPerformed

    private void jCheckBox182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox182ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab23(evt);
    }//GEN-LAST:event_jCheckBox182ActionPerformed

    private void jCheckBox183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox183ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab23(evt);
    }//GEN-LAST:event_jCheckBox183ActionPerformed

    private void jCheckBox184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox184ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab23(evt);
    }//GEN-LAST:event_jCheckBox184ActionPerformed

    private void jCheckBox185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox185ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab23(evt);
    }//GEN-LAST:event_jCheckBox185ActionPerformed

    private void jCheckBox95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox95ActionPerformed

        dashboardView.clearOtherTab31(evt);
    }//GEN-LAST:event_jCheckBox95ActionPerformed

    private void jCheckBox96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox96ActionPerformed

        dashboardView.clearOtherTab31(evt);
    }//GEN-LAST:event_jCheckBox96ActionPerformed

    private void jCheckBox97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox97ActionPerformed

        dashboardView.clearOtherTab31(evt);
    }//GEN-LAST:event_jCheckBox97ActionPerformed

    private void jCheckBox126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox126ActionPerformed

        dashboardView.clearOtherTab31(evt);
    }//GEN-LAST:event_jCheckBox126ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        //dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesAroopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane16, jLabel76);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jCheckBox136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox136ActionPerformed

        dashboardView.clearOtherTab32(evt);
    }//GEN-LAST:event_jCheckBox136ActionPerformed

    private void jCheckBox137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox137ActionPerformed

        dashboardView.clearOtherTab32(evt);
    }//GEN-LAST:event_jCheckBox137ActionPerformed

    private void jCheckBox140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox140ActionPerformed

        dashboardView.clearOtherTab32(evt);
    }//GEN-LAST:event_jCheckBox140ActionPerformed

    private void jCheckBox141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox141ActionPerformed

        dashboardView.clearOtherTab32(evt);
    }//GEN-LAST:event_jCheckBox141ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        //dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesAroopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane17, jLabel112);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jCheckBox154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox154ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab33(evt);
    }//GEN-LAST:event_jCheckBox154ActionPerformed

    private void jCheckBox155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox155ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab33(evt);
    }//GEN-LAST:event_jCheckBox155ActionPerformed

    private void jCheckBox163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox163ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab33(evt);
    }//GEN-LAST:event_jCheckBox163ActionPerformed

    private void jCheckBox164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox164ActionPerformed
        // TODO add your handling code here:
        dashboardView.clearOtherTab33(evt);
    }//GEN-LAST:event_jCheckBox164ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesAroopavachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane18, jLabel115);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton34ActionPerformed

    public static void getMentalFactorsValuesSup4(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {
        ArrayList<String> commArray = new ArrayList<String>();
        ArrayList<String> englishArray = new ArrayList<String>();
        System.out.println("****" + selected);
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();
                            /* dashboardView.appendToPane(
                             jTextPane,
                             dashboardView
                             .getEnglishTermForChithacika(obj)
                             + "\n", Color.BLUE);
                             dashboardView.appendToPane(
                             jTextPane, "(" + obj
                             + ")\n\n", Color.RED);
                             obj = obj
                             + dashboardView
                             .getEnglishTermForChithacika(obj);*/
                            relavantCitt.add(obj);

                            commArray.add(obj);

                            englishArray.add(dashboardView
                                    .getEnglishTermForChithacika(obj));
                            // outFromTheLoop = true;
                            dashboardView.jLabel119.setText(relavantCitt.size() + "");
                            // /break;
                        }
                    }

                }
            }
        }
        Collections.sort(commArray, new CompCommMentalFact());
        Collections.sort(englishArray, new CompEngMentalFact());
        for (int i = 0; i < commArray.size(); i++) {
            dashboardView.appendToPane(
                    dashboardView.jTextPane20,
                    englishArray.get(i)
                    + "\n", Color.BLUE);

            //System.out.println(">"+commArray.get(i)+"<");
            dashboardView.appendToPane(
                    dashboardView.jTextPane20, "(" + commArray.get(i)
                    + ")\n\n", Color.RED);
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesKamawachara(dashboardView
                    .getValuesForChithasikaCheckBox(), jTextPane19, jLabel11);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jCheckBox132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox132ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox132ActionPerformed

    private void jCheckBox138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox138ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox138ActionPerformed

    private void jCheckBox139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox139ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox139ActionPerformed

    private void jCheckBox142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox142ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox142ActionPerformed

    private void jCheckBox151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox151ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox151ActionPerformed

    private void jCheckBox152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox152ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox152ActionPerformed

    private void jCheckBox153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox153ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox153ActionPerformed

    private void jCheckBox160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox160ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox160ActionPerformed

    private void jCheckBox161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox161ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox161ActionPerformed

    private void jCheckBox165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox165ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox165ActionPerformed

    private void jCheckBox166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox166ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox166ActionPerformed

    private void jCheckBox177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox177ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox177ActionPerformed

    private void jCheckBox178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox178ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox178ActionPerformed

    private void jCheckBox179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox179ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox179ActionPerformed

    private void jCheckBox229ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox229ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox229ActionPerformed

    private void jCheckBox230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox230ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox230ActionPerformed

    private void jCheckBox231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox231ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox231ActionPerformed

    private void jCheckBox232ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox232ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox232ActionPerformed

    private void jCheckBox233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox233ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox233ActionPerformed

    private void jCheckBox234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox234ActionPerformed

        dashboardView.clearOtherTab41(evt);
    }//GEN-LAST:event_jCheckBox234ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // dashboardView.refreshThoughts();
        try {
            dashboardView.getMentalFactorsValuesSupreme3(dashboardView
                    .getValuesForChithasikaCheckBox());
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed

        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        //System.out.println("Tab: " + jTabbedPane1.getSelectedIndex());
        if (jTabbedPane1.getSelectedIndex() == 1) {
            boolean status = Utilities.universalsNotSelected(jPanel4);
            if (!status) {
                JOptionPane.showMessageDialog(null, "First select all Ethically Variables Universals.");
                Utilities.selectUniversal(jPanel4);
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        FeedbackForm1 feedbackForm1 = new FeedbackForm1();
        feedbackForm1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        feedbackForm1.setLocationRelativeTo(null);
        feedbackForm1.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        try {
            // TODO add your handling code here:
            uri = new URI("https://www.youtube.com/watch?v=q47o63_aLb8&feature=youtu.be");
        } catch (URISyntaxException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
        open(uri);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jCheckBox193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox193ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox193ActionPerformed

    private void jCheckBox194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox194ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox194ActionPerformed

    private void jCheckBox195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox195ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox195ActionPerformed

    private void jCheckBox196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox196ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox196ActionPerformed

    private void jCheckBox197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox197ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox197ActionPerformed

    private void jCheckBox198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox198ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox198ActionPerformed

    private void jCheckBox199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox199ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox199ActionPerformed

    private void jCheckBox208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox208ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox208ActionPerformed

    private void jCheckBox209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox209ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox209ActionPerformed

    private void jCheckBox210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox210ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox210ActionPerformed

    private void jCheckBox211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox211ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox211ActionPerformed

    private void jCheckBox218ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox218ActionPerformed
        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox218ActionPerformed

    private void jCheckBox219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox219ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox219ActionPerformed

    private void jCheckBox220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox220ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox220ActionPerformed

    private void jCheckBox221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox221ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox221ActionPerformed

    private void jCheckBox222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox222ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox222ActionPerformed

    private void jCheckBox223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox223ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox223ActionPerformed

    private void jCheckBox224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox224ActionPerformed

        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox224ActionPerformed

    private void jCheckBox227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox227ActionPerformed
        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox227ActionPerformed

    private void jCheckBox228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox228ActionPerformed
        dashboardView.clearOtherTab42(evt);
    }//GEN-LAST:event_jCheckBox228ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        //dashboardView.refreshThoughts();
        //System.out.println(dashboardView.getValuesForChithasikaCheckBox());
        try {
            dashboardView.getMentalFactorsValuesSup4(dashboardView
                    .getValuesForChithasikaCheckBox());
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        dashboardView.refreshThoughts();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        if (!Utilities.netIsAvailable()) {
             JOptionPane.showMessageDialog(null, "Please check the internet connectivity");
        } else {
            try {
                URI uri = new URI("http://www.kdu.ac.lk/computing_fac/images/simulator/Guide_to_Experiments-English.pdf");
                Utilities.open(uri);
            } catch (URISyntaxException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
         if (!Utilities.netIsAvailable()) {
             JOptionPane.showMessageDialog(null, "Please check the internet connectivity");
        } else {
            try {
                URI uri = new URI("http://www.kdu.ac.lk/computing_fac/images/simulator/Comprehensive_Manual_of_Abhidhamma.pdf");
                Utilities.open(uri);
            } catch (URISyntaxException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
         if (!Utilities.netIsAvailable()) {
             JOptionPane.showMessageDialog(null, "Please check the internet connectivity");
        } else {
            try {
                URI uri = new URI("https://www.researchgate.net/publication/281175290_On_computing_the_behavior_of_the_mind_from_an_eastern_philosophical_perspective");
                Utilities.open(uri);
            } catch (URISyntaxException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    public String getValuesForChithasikaCheckBox() {
        selectedThoughts = "";
        if (jCheckBox140.isSelected()) {
            String str = jCheckBox140.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox141.isSelected()) {
            String str = jCheckBox141.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox115.isSelected()) {
            String str = jCheckBox115.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox116.isSelected()) {
            String str = jCheckBox116.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox143.isSelected()) {
            String str = jCheckBox143.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox144.isSelected()) {
            String str = jCheckBox144.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox148.isSelected()) {
            String str = jCheckBox148.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox149.isSelected()) {
            String str = jCheckBox149.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox150.isSelected()) {
            String str = jCheckBox150.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox154.isSelected()) {
            String str = jCheckBox154.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox155.isSelected()) {
            String str = jCheckBox155.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox163.isSelected()) {
            String str = jCheckBox163.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox164.isSelected()) {
            String str = jCheckBox164.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox100.isSelected()) {
            String str = jCheckBox100.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox101.isSelected()) {
            String str = jCheckBox101.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox102.isSelected()) {
            String str = jCheckBox102.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox103.isSelected()) {
            String str = jCheckBox103.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox104.isSelected()) {
            String str = jCheckBox104.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox105.isSelected()) {
            String str = jCheckBox105.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox118.isSelected()) {
            String str = jCheckBox118.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox106.isSelected()) {
            String str = jCheckBox106.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox107.isSelected()) {
            String str = jCheckBox107.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox108.isSelected()) {
            String str = jCheckBox108.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox181.isSelected()) {
            String str = jCheckBox181.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox182.isSelected()) {
            String str = jCheckBox182.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox184.isSelected()) {
            String str = jCheckBox184.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox185.isSelected()) {
            String str = jCheckBox185.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox132.isSelected()) {
            String str = jCheckBox132.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox138.isSelected()) {
            String str = jCheckBox138.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox139.isSelected()) {
            String str = jCheckBox139.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox142.isSelected()) {
            String str = jCheckBox142.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox151.isSelected()) {
            String str = jCheckBox151.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox152.isSelected()) {
            String str = jCheckBox152.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox166.isSelected()) {
            String str = jCheckBox166.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox177.isSelected()) {
            String str = jCheckBox177.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox178.isSelected()) {
            String str = jCheckBox178.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox179.isSelected()) {
            String str = jCheckBox179.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox229.isSelected()) {
            String str = jCheckBox229.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox230.isSelected()) {
            String str = jCheckBox230.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox231.isSelected()) {
            String str = jCheckBox231.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox232.isSelected()) {
            String str = jCheckBox232.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox233.isSelected()) {
            String str = jCheckBox233.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox234.isSelected()) {
            String str = jCheckBox234.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox153.isSelected()) {
            String str = jCheckBox153.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox160.isSelected()) {
            String str = jCheckBox160.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox161.isSelected()) {
            String str = jCheckBox161.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox165.isSelected()) {
            String str = jCheckBox165.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox119.isSelected()) {
            String str = jCheckBox119.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox193.isSelected()) {
            String str = jCheckBox193.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox194.isSelected()) {
            String str = jCheckBox194.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox195.isSelected()) {
            String str = jCheckBox195.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox196.isSelected()) {
            String str = jCheckBox196.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox197.isSelected()) {
            String str = jCheckBox197.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox198.isSelected()) {
            String str = jCheckBox198.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox199.isSelected()) {
            String str = jCheckBox199.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox208.isSelected()) {
            String str = jCheckBox208.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox209.isSelected()) {
            String str = jCheckBox209.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox210.isSelected()) {
            String str = jCheckBox210.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox211.isSelected()) {
            String str = jCheckBox211.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox218.isSelected()) {
            String str = jCheckBox218.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox219.isSelected()) {
            String str = jCheckBox219.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox220.isSelected()) {
            String str = jCheckBox220.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox221.isSelected()) {
            String str = jCheckBox221.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox222.isSelected()) {
            String str = jCheckBox222.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox223.isSelected()) {
            String str = jCheckBox223.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox224.isSelected()) {
            String str = jCheckBox224.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox227.isSelected()) {
            String str = jCheckBox227.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox228.isSelected()) {
            String str = jCheckBox228.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox120.isSelected()) {
            String str = jCheckBox120.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox121.isSelected()) {
            String str = jCheckBox121.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox122.isSelected()) {
            String str = jCheckBox122.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox123.isSelected()) {
            String str = jCheckBox123.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox124.isSelected()) {
            String str = jCheckBox124.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox125.isSelected()) {
            String str = jCheckBox125.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox126.isSelected()) {
            String str = jCheckBox126.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox136.isSelected()) {
            String str = jCheckBox136.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox137.isSelected()) {
            String str = jCheckBox137.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox144.isSelected()) {
            String str = jCheckBox144.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox145.isSelected()) {
            String str = jCheckBox145.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox146.isSelected()) {
            String str = jCheckBox146.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox147.isSelected()) {
            String str = jCheckBox147.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox167.isSelected()) {
            String str = jCheckBox167.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox162.isSelected()) {
            String str = jCheckBox162.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox154.isSelected()) {
            String str = jCheckBox154.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox155.isSelected()) {
            String str = jCheckBox155.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox156.isSelected()) {
            String str = jCheckBox156.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox157.isSelected()) {
            String str = jCheckBox157.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox158.isSelected()) {
            String str = jCheckBox158.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox159.isSelected()) {
            String str = jCheckBox159.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox173.isSelected()) {
            String str = jCheckBox173.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox174.isSelected()) {
            String str = jCheckBox174.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox175.isSelected()) {
            String str = jCheckBox175.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox176.isSelected()) {
            String str = jCheckBox176.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox168.isSelected()) {
            String str = jCheckBox168.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox169.isSelected()) {
            String str = jCheckBox169.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox170.isSelected()) {
            String str = jCheckBox170.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox171.isSelected()) {
            String str = jCheckBox171.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox172.isSelected()) {
            String str = jCheckBox171.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox181.isSelected()) {
            String str = jCheckBox181.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox182.isSelected()) {
            String str = jCheckBox182.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox183.isSelected()) {
            String str = jCheckBox183.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox42.isSelected()) {
            String str = jCheckBox42.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox43.isSelected()) {
            String str = jCheckBox43.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox44.isSelected()) {
            String str = jCheckBox44.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox45.isSelected()) {
            String str = jCheckBox45.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox46.isSelected()) {
            String str = jCheckBox47.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox47.isSelected()) {
            String str = jCheckBox47.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox48.isSelected()) {
            String str = jCheckBox48.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox73.isSelected()) {
            String str = jCheckBox73.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox74.isSelected()) {
            String str = jCheckBox74.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox75.isSelected()) {
            String str = jCheckBox75.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox76.isSelected()) {
            String str = jCheckBox76.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox77.isSelected()) {
            String str = jCheckBox77.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox78.isSelected()) {
            String str = jCheckBox78.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox79.isSelected()) {
            String str = jCheckBox79.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }

        if (jCheckBox90.isSelected()) {
            String str = jCheckBox90.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox91.isSelected()) {
            String str = jCheckBox91.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox92.isSelected()) {
            String str = jCheckBox92.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox93.isSelected()) {
            String str = jCheckBox93.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox94.isSelected()) {
            String str = jCheckBox94.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox95.isSelected()) {
            String str = jCheckBox95.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox96.isSelected()) {
            String str = jCheckBox96.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox97.isSelected()) {
            String str = jCheckBox97.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox98.isSelected()) {
            String str = jCheckBox98.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox99.isSelected()) {
            String str = jCheckBox99.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        if (jCheckBox31.isSelected()) {
            String str = jCheckBox31.getText();
            selectedThoughts = selectedThoughts + ":" + str;
        }
        selectedThoughts = selectedThoughts.replace("(", "");
        selectedThoughts = selectedThoughts.replace(")", "");
        return selectedThoughts;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed

        dashboardView.refreshAll();
        beautifulUniversal = false;
        dashboardView.relavantCittTemp = new TreeSet<String>();
        lastCount = 0;
        selectedTempStrings = "";
        counter = 0;

        counterForLoop = 0;
        counterForLoop2 = 0;

        allCitt = new TreeSet<String>();
        common = new ArrayList<String>();

        allCitt2 = new TreeSet<String>();
        common2 = new ArrayList<String>();

        redArray = new ArrayList<String>();
        blueArray = new ArrayList<String>();
        orangeArray = new ArrayList<String>();

    }// GEN-LAST:event_jButton4ActionPerformed

    public void getSelectedValues() {
        if (jCheckBox1.isSelected()) {
            String[] temp = jCheckBox1.getText().split("\\(");
            //System.out.println(temp[0] + temp[1]);
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox2.isSelected()) {
            String[] temp = jCheckBox2.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox3.isSelected()) {
            String[] temp = jCheckBox3.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox4.isSelected()) {
            String[] temp = jCheckBox4.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox5.isSelected()) {
            String[] temp = jCheckBox5.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox6.isSelected()) {
            String[] temp = jCheckBox6.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox7.isSelected()) {
            String[] temp = jCheckBox7.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox8.isSelected()) {
            String[] temp = jCheckBox8.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox9.isSelected()) {
            String[] temp = jCheckBox9.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox10.isSelected()) {
            String[] temp = jCheckBox10.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox11.isSelected()) {
            String[] temp = jCheckBox11.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox12.isSelected()) {
            String[] temp = jCheckBox12.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox13.isSelected()) {
            String[] temp = jCheckBox13.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox14.isSelected()) {
            String[] temp = jCheckBox14.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox15.isSelected()) {
            String[] temp = jCheckBox15.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox16.isSelected()) {
            String[] temp = jCheckBox16.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox17.isSelected()) {
            String[] temp = jCheckBox17.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox18.isSelected()) {
            String[] temp = jCheckBox18.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox19.isSelected()) {
            String[] temp = jCheckBox19.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox20.isSelected()) {
            String[] temp = jCheckBox20.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox21.isSelected()) {
            String[] temp = jCheckBox21.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox22.isSelected()) {
            String[] temp = jCheckBox22.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox23.isSelected()) {
            String[] temp = jCheckBox23.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox24.isSelected()) {
            String[] temp = jCheckBox24.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox25.isSelected()) {
            String[] temp = jCheckBox25.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox26.isSelected()) {
            String[] temp = jCheckBox26.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox27.isSelected()) {
            String[] temp = jCheckBox27.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox28.isSelected()) {
            String[] temp = jCheckBox28.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox29.isSelected()) {
            String[] temp = jCheckBox29.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox115.isSelected()) {
            String[] temp = jCheckBox115.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox116.isSelected()) {
            String[] temp = jCheckBox116.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox30.isSelected()) {
            String[] temp = jCheckBox30.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox32.isSelected()) {
            String[] temp = jCheckBox32.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox33.isSelected()) {
            String[] temp = jCheckBox33.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox34.isSelected()) {
            String[] temp = jCheckBox34.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox35.isSelected()) {
            String[] temp = jCheckBox35.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox36.isSelected()) {
            String[] temp = jCheckBox36.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox37.isSelected()) {
            String[] temp = jCheckBox37.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox38.isSelected()) {
            String[] temp = jCheckBox38.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox39.isSelected()) {
            String[] temp = jCheckBox39.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox40.isSelected()) {
            String[] temp = jCheckBox40.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox41.isSelected()) {
            String[] temp = jCheckBox41.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox52.isSelected()) {
            String[] temp = jCheckBox52.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox53.isSelected()) {
            String[] temp = jCheckBox53.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox54.isSelected()) {
            String[] temp = jCheckBox54.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox55.isSelected()) {
            String[] temp = jCheckBox55.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox56.isSelected()) {
            String[] temp = jCheckBox56.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox57.isSelected()) {
            String[] temp = jCheckBox57.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox58.isSelected()) {
            String[] temp = jCheckBox58.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox59.isSelected()) {
            String[] temp = jCheckBox59.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox60.isSelected()) {
            String[] temp = jCheckBox60.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox61.isSelected()) {
            String[] temp = jCheckBox61.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox62.isSelected()) {
            String[] temp = jCheckBox62.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        if (jCheckBox63.isSelected()) {
            String[] temp = jCheckBox63.getText().split("\\(");
            // String str = temp[1].replace(" ", "");
            String str = temp[1];
            str = str.replace(")", "");
            str = str.replace("</i></html>", "");
            selectedTexts = selectedTexts + ":" + str;
        }
        selectedTexts = selectedTexts.substring(1);
        //System.out.print(selectedTexts);
        try {
            if (selectedTexts.equals("")) {
                JOptionPane
                        .showMessageDialog(
                                null,
                                "You have to select mental factors before get the thoughts",
                                "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                getCittValues(selectedTexts);
                selectedTexts = "";
            }

        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        //System.out.println(jCheckBox1.getText());
        dashboardView.restart = true;
        getSelectedValues();

        if (orangeArray.size() > 0) {
            // popupGauge(orangeArray);
            //popupBarChart(orangeArray, false);
            popUpStackedBarChart(orangeArray, false);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    public void popupBarChart(ArrayList<String> orangeArray, boolean isDefault) {
        dashboardView.jPanel50.removeAll();
        dashboardView.jPanel50.revalidate();
        CategoryDataset dataset = BarChartDemo1.createDataset(orangeArray, isDefault);
        JFreeChart chart = BarChartDemo1.createChart(dataset, isDefault, orangeArray);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPanel.setPreferredSize(new Dimension(190, 170));
        dashboardView.jPanel50.setLayout(new BoxLayout(dashboardView.jPanel50, BoxLayout.Y_AXIS));
        dashboardView.jPanel50.setSize(190, 170);

        dashboardView.jPanel50.add(chartPanel);
        dashboardView.jPanel50.setVisible(true);
    }

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox20ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsVirathi();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);

            Utilities.energyEnable(jCheckBox11);
            // Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox19ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsVirathi();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);

            Utilities.energyEnable(jCheckBox11);
            // Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox18ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsVirathi();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);
            Utilities.energyEnable(jCheckBox11);
            //Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox30ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox30);
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
            Utilities.slothTropper(jCheckBox28, jCheckBox29, jCheckBox30);
        }

    }// GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox29ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsTheenMiddaya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox28ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsTheenMiddaya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox27ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsDhosaChatusthakaya();
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox26ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsDhosaChatusthakaya();
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox25ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsDhosaChatusthakaya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox24ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsDhosaChatusthakaya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox23ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox23);
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
            Utilities.wrongViewAndConsientCannotTogether(jCheckBox22, jCheckBox23);
            Utilities.whenManaSelected(jCheckBox23, jCheckBox21);
        }

    }// GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox22ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox22);
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
            Utilities.wrongViewAndConsientCannotTogether(jCheckBox22, jCheckBox23);
            Utilities.whenDhittiSelected(jCheckBox22, jCheckBox21);
        }

    }// GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox21ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox21);
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
            Utilities.greedHatredTogetherCannot(jPanel28, jPanel29);
            Utilities.selectUnwholesomeOccasionalFirstSelectUnwholesomeUniversals(jPanel7, jCheckBox11, jPanel10, jPanel11, jPanel25, jPanel26);
            Utilities.whenLobhaSelected(jCheckBox21, jCheckBox22, jCheckBox23);
        }

    }// GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox17ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperations();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
        }

    }// GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox16ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperations();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
        }

    }// GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox15ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperations();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
        }

    }// GEN-LAST:event_jCheckBox15ActionPerformed

    public void removeObjects() {
        int size = dashboardView.relavantCittTemp.size();
        //System.out.println("lastCount: " + lastCount);
        //System.out.println("size: " + size);
        int g = lastCount - size;
        //System.out.println("lastCount-size:" + g);
        int j = size - 1;
        //System.out.println("size-1: " + j);
        Iterator<String> iterator = dashboardView.relavantCittTemp.iterator();
        LinkedList<String> removeCandidates = new LinkedList<String>(
                dashboardView.relavantCittTemp);

        removeCandidates.subList(0, size - lastCount).clear();
        //System.out.println("removeCandidates size:>>>>"
        //  + removeCandidates.size());

        dashboardView.relavantCittTemp = new TreeSet<String>(removeCandidates);
        // lastCount = 0;
        // lastCount = dashboardView.relavantCittTemp.size();
        //System.out.println(">>>>" + dashboardView.relavantCittTemp.size());
    }

    public void checkTheDuplicationToAllowSelection(JCheckBox jChk) {

        if (jChk.isSelected()) {
            counter++;
            String[] temp = jChk.getText().split("\\(");
            String str = temp[1];
            str = str.replace(")", "");
            selectedTempStrings = selectedTempStrings + ":" + str;
            selectedTempStrings = selectedTempStrings.substring(1);
            //System.out.print(selectedTempStrings);
            try {
                if (selectedTempStrings.equals("")) {
                    JOptionPane
                            .showMessageDialog(
                                    null,
                                    "You have to select mental factors before get the thoughts",
                                    "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    boolean exist = getCittValuesTemp(selectedTempStrings);
                    //System.out.println(exist);
                    if (exist && counter > 1) {
                        JOptionPane.showMessageDialog(null,
                                "These mental factors cannot co-exist", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        jChk.setSelected(false);
                        removeObjects();
                        jLabel127.setText("0");

                        common = new ArrayList<String>();
                        common2 = new ArrayList<String>();

                        // //System.out.println( jChk.getParent());
                        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
                        boolean isSelected = false;
                        for (Component comp : jChk.getParent().getComponents()) {
                            if (comp instanceof javax.swing.JCheckBox) {
                                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                                checkboxesForPanel11.add(check);
                                // //System.out.println(comp);
                                if (check.isSelected()) {
                                    isSelected = true;
                                }
                            }
                        }
                        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
                            comp.setSelected(false);
                        }

                    }
                    selectedTempStrings = "";
                }

            } catch (OWLOntologyCreationException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(
                        Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        } else {
            dashboardView.relavantCittTemp = new TreeSet<String>();
            lastCount = 0;
            selectedTempStrings = "";
            counter = 0;
        }

    }

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox14ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperations();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.unwholesomeWithAnyBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jCheckBox11);
        }

    }// GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox13ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox13);
        }

    }// GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox12ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox12);
            Utilities.zestCannotBewithBeutifulAndUnwholesome(jCheckBox13, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox12);
        }

    }// GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox11ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox11);
        }

    }// GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox10ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox10);
        }

    }// GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox9ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox9);
        }

    }// GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox8ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox8);
        }
    }// GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox7ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }
    }// GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox6ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox6);
    }// GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox5ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();

        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox5);
    }// GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox4ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox4);
    }// GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox3ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox3);
    }// GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox2ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox2);
    }// GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.checkBoxOperationsSarwaChithaSadarana();
            dashboardView.setSelectedValue();
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox1);
    }// GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox32ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox32ActionPerformed

    private void jCheckBox61ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox61ActionPerformed

        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsApramanya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);

            Utilities.energyEnable(jCheckBox11);
            //Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

        // dashboardView.checkTheDuplicationToAllowSelection(jCheckBox61);
    }// GEN-LAST:event_jCheckBox61ActionPerformed

    private void jCheckBox63ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox63ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            dashboardView.checkTheDuplicationToAllowSelection(jCheckBox63);
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);

            Utilities.energyEnable(jCheckBox11);
            //Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox63ActionPerformed

    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox33ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox33ActionPerformed

    private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox34ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox34ActionPerformed

    private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox35ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox35ActionPerformed

    private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox36ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox36ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox37ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox38ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox38ActionPerformed

    private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox39ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }
    }// GEN-LAST:event_jCheckBox39ActionPerformed

    private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox40ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox40ActionPerformed

    private void jCheckBox41ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox41ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox41ActionPerformed

    private void jCheckBox52ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox52ActionPerformed
        // TODO add your handling code here
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox52ActionPerformed

    private void jCheckBox53ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox53ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox53ActionPerformed

    private void jCheckBox54ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox54ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox54ActionPerformed

    private void jCheckBox55ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox55ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox55ActionPerformed

    private void jCheckBox56ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox56ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox56ActionPerformed

    private void jCheckBox57ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox57ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox57ActionPerformed

    private void jCheckBox58ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox58ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox58ActionPerformed

    private void jCheckBox59ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox59ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox59ActionPerformed

    private void jCheckBox60ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox60ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            beautifulUniversal = true;
            dashboardView.checkBoxOperationsSobanaSadarana();
            Utilities.energyEnable(jCheckBox11);
            Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox60ActionPerformed

    private void jCheckBox62ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox62ActionPerformed
        if (restart) {
            JOptionPane.showMessageDialog(null, "Click on Refresh to Start a new session",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
        } else {
            dashboardView.checkBoxOperationsApramanya();
            jLabel127.setText("0");
            dashboardView.setSelectedValue();
            Utilities.selectBeautifulFactors(jPanel10, jPanel11, jPanel25, jPanel26, jCheckBox11, jPanel7, jPanel28, jPanel29, jPanel30, jPanel31);

            Utilities.energyEnable(jCheckBox11);
            //Utilities.unselectUnwholesomeUniversalIfSelected(jPanel7, jPanel28, jPanel29, jPanel30, jPanel31, jPanel10, jPanel11, jPanel25, jPanel26);
        }

    }// GEN-LAST:event_jCheckBox62ActionPerformed

    public void clearOtherTab111(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel17.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab112(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel18.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab113(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel20.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab121(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel21.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab122(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel22.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab123(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel23.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab131(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel24.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab132(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        jLabel11.setText("0");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel34.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane19.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab133(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel35.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab21(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel36.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab22(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel37.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab23(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel38.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab31(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel39.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab32(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel40.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab33(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel41.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab41(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel44.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel43.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    public void clearOtherTab42(ActionEvent evt) {
        jLabel35.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel38.setText("");
        jLabel49.setText("");
        jLabel51.setText("");
        jLabel53.setText("");
        jLabel55.setText("");
        jLabel30.setText("");

        jLabel57.setText("");
        jLabel59.setText("");
        jLabel61.setText("");

        jLabel76.setText("");
        jLabel112.setText("");
        jLabel115.setText("");

        jLabel117.setText("");
        jLabel119.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel24 = new ArrayList<javax.swing.JCheckBox>();
        List<String> status = new ArrayList<String>();
        for (Component comp : jPanel43.getComponents()) {

            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel24.add(check);
                // //System.out.println(check==evt.getSource());
                if (check == evt.getSource()) {
                    status.add("Yes");
                } else {
                    status.add("No");
                }
            }
        }

        int j = 0;
        for (javax.swing.JCheckBox comp : checkboxesForPanel24) {
            // //System.out.println(status.get(j));
            if (status.get(j).equals("Yes")) {
                comp.setSelected(true);
            } else {
                comp.setSelected(false);
            }
            j++;
        }

        List<javax.swing.JCheckBox> checkboxesForPanel18 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel17.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel18.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel18) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel20 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel18.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel20.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel20) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel21 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel20.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel21.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel21) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel22 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel21.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel22.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel22) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPane23 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel22.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPane23.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPane23) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel244 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel23.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel244.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel244) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel34 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel24.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel34.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel34) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel35 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel34.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel35.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel35) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel36 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel35.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel36.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel36) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel37 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel36.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel37.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel37) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel38 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel37.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel38.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel38) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel39 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel38.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel39.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel39) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel40 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel39.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel40.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel40) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel41 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel40.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel41.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel41) {
            comp.setSelected(false);
        }

        List<javax.swing.JCheckBox> checkboxesForPanel42 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel41.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel42.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel42) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel43 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel44.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel43.add(check);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel43) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jTextPane6.setText("");
        jTextPane8.setText("");
        jTextPane9.setText("");
        jTextPane10.setText("");
        jTextPane11.setText("");
        jTextPane12.setText("");
        jTextPane13.setText("");
        jTextPane14.setText("");
        jTextPane15.setText("");
        jTextPane16.setText("");
        jTextPane17.setText("");
        jTextPane18.setText("");
        jTextPane21.setText("");
        jTextPane20.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed"
        // desc=" Look and feel setting code (optional) ">
		/*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase
         * /tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                dashboardView = new DashboardView();
                dashboardView.setTitle("Mental Factors and Thoughts Combination");
                //dashboardView.setTabNames();
                dashboardView.restart = false;
                //dashboardView.setExtendedState(Frame.MAXIMIZED_BOTH);

                dashboardView.setVisible(true);
                dashboardView.checkBoxOperations();
                //dashboardView.popupBarChart(dashboardView.orangeArray, true);
                popUpStackedBarChart(dashboardView.orangeArray, true);
            }
        });
    }

    public static void popUpStackedBarChart(ArrayList<String> orangeArray, boolean isDefault) {
        dashboardView.jPanel50.removeAll();
        dashboardView.jPanel50.revalidate();
        final CategoryDataset dataset = StackedBarChartDemo4.createDataset(orangeArray, isDefault);
        final JFreeChart chart = StackedBarChartDemo4.createChart(dataset, orangeArray, isDefault);

        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPanel.setPreferredSize(new Dimension(190,190));
        dashboardView.jPanel50.setLayout(new BoxLayout(dashboardView.jPanel50, BoxLayout.Y_AXIS));
        dashboardView.jPanel50.setSize(190, 190);

        dashboardView.jPanel50.add(chartPanel);
        dashboardView.jPanel50.setVisible(true);
    }

    public void setSelectedValue() {
        // jTextArea2.setText("");
        jTextPane2.setText("");
        // jTextPane3.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        String selected = "";
        for (Component comp : jPanel11.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check1 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check1);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        // Universals (sarwa chitha sadarana) (7)
        List<javax.swing.JCheckBox> checkboxesForPanel28 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check2 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel28.add(check2);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel28) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel29 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check2 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel29.add(check2);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel29) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel30 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check2 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel30.add(check2);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel30) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel31 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check2 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel31.add(check2);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel31) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        // Occasionals (prakeernaka) (6)
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel5.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check3 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check3);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }

        // Unwholesome Occasionals (10)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check4 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check4);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }

        // Beautiful Factors - sobhana sadharana (19)
        List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check5 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel10.add(check5);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }

        // Abstinences (virathi) (3)
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel4.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check6 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check6);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }

        // Illimitables (apramanya) (3)
        List<javax.swing.JCheckBox> checkboxesForPanel25 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel25.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check7 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel25.add(check7);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel25) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
        // Non - Delusion (1)
        List<javax.swing.JCheckBox> checkboxesForPanel26 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel26.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check8 = (javax.swing.JCheckBox) comp;
                checkboxesForPanel26.add(check8);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel26) {
            if (comp.isSelected()) {
                selected = comp.getText() + "\n " + selected;
                // dashboardView.appendToPane(dashboardView.jTextPane3,
                // comp.getText() + "\n", Color.RED);
            }
        }
		// jTextPane3.setText(selected);

        // JOptionPane.showMessageDialog(null, "All should come together :\n" +
        // selected + " to get the output", "Alert", JOptionPane.PLAIN_MESSAGE);
    }

    public void refreshAll() {
        // jTextPane3.setText("");

        // popupBarChart(orangeArray, true);
        popUpStackedBarChart(orangeArray, true);
        jLabel127.setText("");
        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel11.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            comp.setSelected(false);
        }
        isSelected = false;
        // Universals (sarwa chitha sadarana) (7)
        List<javax.swing.JCheckBox> checkboxesForPanel28 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel28.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel28) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel29 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel29.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel29) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel30 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel30.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel30) {
            comp.setSelected(false);
        }
        List<javax.swing.JCheckBox> checkboxesForPanel31 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel31.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel31) {
            comp.setSelected(false);
        }

        // Occasionals (prakeernaka) (6)
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel5.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
            comp.setSelected(false);
        }

        // Unwholesome Occasionals (10)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            comp.setSelected(false);
        }

        // Beautiful Factors - sobhana sadharana (19)
        List<javax.swing.JCheckBox> checkboxesForPanel10 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel10.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel10) {
            comp.setSelected(false);
        }

        // Abstinences (virathi) (3)
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel4.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            comp.setSelected(false);
        }

        // Illimitables (apramanya) (3)
        List<javax.swing.JCheckBox> checkboxesForPanel25 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel25.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel25.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel25) {
            comp.setSelected(false);
        }
        // Non - Delusion (1)
        List<javax.swing.JCheckBox> checkboxesForPanel26 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel26.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel26.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel26) {
            comp.setSelected(false);
        }

        jTextPane1.setText("");
        jTextPane2.setText("");

        beautifulUniversal = false;
        dashboardView.relavantCittTemp = new TreeSet<String>();
        lastCount = 0;
        selectedTempStrings = "";
        counter = 0;

        counterForLoop = 0;
        counterForLoop2 = 0;

        allCitt = new TreeSet<String>();
        common = new ArrayList<String>();

        allCitt2 = new TreeSet<String>();
        common2 = new ArrayList<String>();

        redArray = new ArrayList<String>();
        blueArray = new ArrayList<String>();
        orangeArray = new ArrayList<String>();
        dashboardView.restart = false;

        JOptionPane.showMessageDialog(null, "First select all Ethically Variables Universals.");
        Utilities.selectUniversal(jPanel4);
    }

    public void checkBoxOperationsVirathi() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel11.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkBoxOperationsApramanya() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel11 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel25.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel11.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel11) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkBoxOperationsSarwaChithaSadarana() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel4 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel4.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel4.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel4) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void unwholesomeOccaToUnwholseUni() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        boolean isOccasionalSelected = false;
        for (Component comp : jPanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }

        for (Component comp : jPanel5.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isOccasionalSelected = true;
                }
            }
        }

        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (isSelected && !isOccasionalSelected) {
                comp.setSelected(false);
            }
        }

        if (isSelected && !isOccasionalSelected) {
            JOptionPane
                    .showMessageDialog(
                            null,
                            "Cannot select Unwholesome Universal when it is already selected Unwholesome Occasaionals",
                            "Wraning", JOptionPane.WARNING_MESSAGE);
        }
        isSelected = false;

    }

    public void unwholseUniToUnwholesomeOcca() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel28 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel29 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel30 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel31 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        boolean isOccasionalSelected = false;
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel28.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel29.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (Component comp : jPanel5.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isOccasionalSelected = true;
                }
            }
        }
        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel30.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (Component comp : jPanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel31.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel28) {
            if (isSelected && !isOccasionalSelected) {
                comp.setSelected(false);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel29) {
            if (isSelected && !isOccasionalSelected) {
                comp.setSelected(false);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel30) {
            if (isSelected && !isOccasionalSelected) {
                comp.setSelected(false);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel31) {
            if (isSelected && !isOccasionalSelected) {
                comp.setSelected(false);
            }
        }
        if (isSelected && !isOccasionalSelected) {
            JOptionPane
                    .showMessageDialog(
                            null,
                            "Cannot select Unwholesome Occasaionals when it is already selected Unwholesome Universal",
                            "Wraning", JOptionPane.WARNING_MESSAGE);
        }
        isSelected = false;

    }

    public void checkBoxOperationsUnOcca() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel28 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel29 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel30 = new ArrayList<javax.swing.JCheckBox>();
        List<javax.swing.JCheckBox> checkboxesForPanel31 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel28.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }

        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel29.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }

        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel30.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }

        for (Component comp : jPanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel31.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }

        // isSelected = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel31) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel30) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel29) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel28) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        if (isSelected) {
            // JOptionPane.showMessageDialog(null, "All should come together",
            // "Alert", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void checkBoxOperationsOcca() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel28 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel28.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel28.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel28) {

            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel29 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel29.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel29) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel30 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel30.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel30) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        List<javax.swing.JCheckBox> checkboxesForPanel31 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel31.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel31.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel31) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }

        // Occasionals (prakeernaka) (6)
        List<javax.swing.JCheckBox> checkboxesForPanel5 = new ArrayList<javax.swing.JCheckBox>();
        for (Component comp : jPanel5.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel5.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        for (javax.swing.JCheckBox comp : checkboxesForPanel5) {
            if (isSelected) {
                comp.setSelected(isSelected);
            }
        }
        if (isSelected) {
            // JOptionPane.showMessageDialog(null, "All should come together",
            // "Alert", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public boolean checkTheDuplicationToAllowSelectionSecond(JCheckBox jChk) {
        boolean exist = false;
        if (jChk.isSelected()) {
            counter++;
            String[] temp = jChk.getText().split("\\(");
            String str = temp[1];
            str = str.replace(")", "");
            selectedTempStrings = selectedTempStrings + ":" + str;
            selectedTempStrings = selectedTempStrings.substring(1);
            //System.out.print(selectedTempStrings);
            try {
                if (selectedTempStrings.equals("")) {
                    JOptionPane
                            .showMessageDialog(
                                    null,
                                    "You have to select mental factors before get the thoughts",
                                    "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    exist = getCittValuesTemp(selectedTempStrings);
                    //System.out.println(exist);
                    if (exist && counter > 1) {

                        common = new ArrayList<String>();
                        common2 = new ArrayList<String>();
                        removeObjects();
                        return exist;

                    }
                    selectedTempStrings = "";
                }

            } catch (OWLOntologyCreationException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(
                        Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashboardView.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        } else {
            dashboardView.relavantCittTemp = new TreeSet<String>();
            lastCount = 0;
            selectedTempStrings = "";
            counter = 0;
            return exist;
        }
        return exist;
    }

    public void checkBoxOperationsSobanaSadarana() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel10.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkBoxOperations() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel7.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkBoxOperationsDhosaChatusthakaya() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel29.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkBoxOperationsTheenMiddaya() {
        // Unwholesome Universal (4)
        List<javax.swing.JCheckBox> checkboxesForPanel7 = new ArrayList<javax.swing.JCheckBox>();
        boolean isSelected = false;
        for (Component comp : jPanel30.getComponents()) {
            if (comp instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox check = (javax.swing.JCheckBox) comp;
                checkboxesForPanel7.add(check);
                // //System.out.println(comp);
                if (check.isSelected()) {
                    isSelected = true;
                }
            }
        }
        boolean exists = false;
        for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
            if (isSelected) {
                comp.setSelected(true);

            }
            exists = dashboardView
                    .checkTheDuplicationToAllowSelectionSecond(comp);
            if (exists && counter < 0) {

                break;
            }
        }
        if (exists) {
            for (javax.swing.JCheckBox comp : checkboxesForPanel7) {
                comp.setSelected(false);

            }
            JOptionPane.showMessageDialog(null, "These mental factors cannot co-exist",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void getMentalFactorsValuesSupreme3(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {
        ArrayList<String> commArray = new ArrayList<String>();
        ArrayList<String> englishArray = new ArrayList<String>();
        System.out.println("****" + selected);
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        // InputStream in = Dashboard.class.getResourceAsStream(BASE_URL);
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();

                            /* dashboardView.appendToPane(
                             jTextPane,
                             dashboardView
                             .getEnglishTermForChithacika(obj)
                             + "\n", Color.BLUE);
                             dashboardView.appendToPane(
                             jTextPane, "(" + obj
                             + ")\n\n", Color.RED);
                             obj = obj
                             + dashboardView
                             .getEnglishTermForChithacika(obj);*/
                            relavantCitt.add(obj);

                            commArray.add(obj);

                            englishArray.add(dashboardView
                                    .getEnglishTermForChithacika(obj));
                            // outFromTheLoop = true;
                            dashboardView.jLabel117.setText(relavantCitt.size() + "");
                            // /break;
                        }
                    }

                }
            }
        }
        Collections.sort(commArray, new CompCommMentalFact());
        Collections.sort(englishArray, new CompEngMentalFact());
        for (int i = 0; i < commArray.size(); i++) {
            dashboardView.appendToPane(
                    dashboardView.jTextPane21,
                    englishArray.get(i)
                    + "\n", Color.BLUE);

            //System.out.println(">"+commArray.get(i)+"<");
            dashboardView.appendToPane(
                    dashboardView.jTextPane21, "(" + commArray.get(i)
                    + ")\n\n", Color.RED);
        }

    }

    public static void getMentalFactorsValuesSupreme2(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {

        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();

                            obj = obj
                                    + dashboardView
                                    .getEnglishTermForChithacika(obj);
                            relavantCitt.add(obj);
                            // outFromTheLoop = true;
                            // /break;
                        }
                    }

                }
            }
        }

        // //System.out.println(">>>>>>>>>>>>>" + totalNoOfCitt + "<<<<<<<<<<<");
        // //System.out.println(">>>>>>>>>>>>>" + relavantCitt.size() +
        // "<<<<<<<<<<<");
        // dashboardView.setTextAreaWithResults(relavantCitt);
        // dashboardView.setMentalFactorsText(relavantCitt);
    }

    public static void getMentalFactorsValuesAroopavachara(String selected, JTextPane jtextpane, JLabel label)
            throws OWLOntologyCreationException, FileNotFoundException {
        ArrayList<String> commArray = new ArrayList<String>();
        ArrayList<String> englishArray = new ArrayList<String>();
        System.out.println("****" + selected);
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();

                            /* dashboardView.appendToPane(
                             jTextPane,
                             dashboardView
                             .getEnglishTermForChithacika(obj)
                             + "\n", Color.BLUE);
                             dashboardView.appendToPane(
                             jTextPane, "(" + obj
                             + ")\n\n", Color.RED);
                             obj = obj
                             + dashboardView
                             .getEnglishTermForChithacika(obj);*/
                            relavantCitt.add(obj);

                            commArray.add(obj);

                            englishArray.add(dashboardView
                                    .getEnglishTermForChithacika(obj));
                            // outFromTheLoop = true;
                            label.setText(relavantCitt.size() + "");
                            // /break;
                        }
                    }

                }
            }
        }
        Collections.sort(commArray, new CompCommMentalFact());
        Collections.sort(englishArray, new CompEngMentalFact());
        for (int i = 0; i < commArray.size(); i++) {
            dashboardView.appendToPane(
                    jtextpane,
                    englishArray.get(i)
                    + "\n", Color.BLUE);

            //System.out.println(">"+commArray.get(i)+"<");
            dashboardView.appendToPane(
                    jtextpane, "(" + commArray.get(i)
                    + ")\n\n", Color.RED);
        }

    }

    public static void getMentalFactorsValuesKamawachara(String selected, JTextPane jTextPane, JLabel label)
            throws OWLOntologyCreationException, FileNotFoundException {
        ArrayList<String> commArray = new ArrayList<String>();
        ArrayList<String> englishArray = new ArrayList<String>();
        System.out.println("****" + selected);
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class.getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();

                            /* dashboardView.appendToPane(
                             jTextPane,
                             dashboardView
                             .getEnglishTermForChithacika(obj)
                             + "\n", Color.BLUE);
                             dashboardView.appendToPane(
                             jTextPane, "(" + obj
                             + ")\n\n", Color.RED);
                             obj = obj
                             + dashboardView
                             .getEnglishTermForChithacika(obj);*/
                            relavantCitt.add(obj);

                            commArray.add(obj);

                            englishArray.add(dashboardView
                                    .getEnglishTermForChithacika(obj));
                            // outFromTheLoop = true;
                            label.setText(relavantCitt.size() + "");
                            // /break;
                        }
                    }

                }
            }
        }
        Collections.sort(commArray, new CompCommMentalFact());
        Collections.sort(englishArray, new CompEngMentalFact());
        for (int i = 0; i < commArray.size(); i++) {
            dashboardView.appendToPane(
                    jTextPane,
                    englishArray.get(i)
                    + "\n", Color.BLUE);

            //System.out.println(">"+commArray.get(i)+"<");
            dashboardView.appendToPane(
                    jTextPane, "(" + commArray.get(i)
                    + ")\n\n", Color.RED);
        }

    }

    public static void getMentalFactorsValuesRoopavachara(String selected, JTextPane jtextpane, JLabel label)
            throws OWLOntologyCreationException, FileNotFoundException {
        ArrayList<String> commArray = new ArrayList<String>();
        ArrayList<String> englishArray = new ArrayList<String>();

        System.out.println("****" + selected);
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();
                            /* dashboardView.appendToPane(
                             jTextPane,
                             dashboardView
                             .getEnglishTermForChithacika(obj)
                             + "\n", Color.BLUE);
                             dashboardView.appendToPane(
                             jTextPane, "(" + obj
                             + ")\n\n", Color.RED);
                             obj = obj
                             + dashboardView
                             .getEnglishTermForChithacika(obj);*/
                            relavantCitt.add(obj);

                            commArray.add(obj);

                            englishArray.add(dashboardView
                                    .getEnglishTermForChithacika(obj));
                            // outFromTheLoop = true;
                            label.setText(relavantCitt.size() + "");
                            // /break;
                        }
                    }

                }
            }
        }
        Collections.sort(commArray, new CompCommMentalFact());
        Collections.sort(englishArray, new CompEngMentalFact());
        for (int i = 0; i < commArray.size(); i++) {
            dashboardView.appendToPane(
                    jtextpane,
                    englishArray.get(i)
                    + "\n", Color.BLUE);

            //System.out.println(">"+commArray.get(i)+"<");
            dashboardView.appendToPane(
                    jtextpane, "(" + commArray.get(i)
                    + ")\n\n", Color.RED);
        }

    }

    public static void getMentalFactorsValuesSup3(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {

        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class
                .getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        Set<String> relavantCitt = new TreeSet<String>();

        for (int j = 0; j < requestedChithacika.length; j++) {

            String selectedValue = requestedChithacika[j];
            // selectedValue = selectedValue.replace(" ", "_");
            // //System.out.println("selectedValue: " +
            // requestedChithacika.length);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        // //System.out.println(">>> selectedValue: " +
                        // selectedValue + "<<<<<<<< individual: "+indi);
                        indi = indi.replace("_", " ");
                        if (selectedValue.equals(indi)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();
                            dashboardView.appendToPane(
                                    dashboardView.jTextPane21,
                                    dashboardView
                                    .getEnglishTermForChithacika(obj)
                                    + "\n", Color.BLUE);
                            dashboardView.appendToPane(
                                    dashboardView.jTextPane21, "(" + obj
                                    + ")\n\n", Color.RED);

                            obj = obj
                                    + dashboardView
                                    .getEnglishTermForChithacika(obj);
                            relavantCitt.add(obj);
                            // outFromTheLoop = true;
                            // /break;
                        }
                    }

                }
            }
        }

    }

    private static void appendToPane(JTextPane tp, String msg, Color c) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,
                StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily,
                "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment,
                StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }

    String getEnglishTermForChithacika(String chithasika) {
        String reultantChittacika = "";
        if (chithasika.equals("phassa")) {
            reultantChittacika = reultantChittacika + "Contact";
        }
        if (chithasika.equals("vedhana")) {
            reultantChittacika = reultantChittacika + "Feeling";
        }
        if (chithasika.equals("sangya")) {
            reultantChittacika = reultantChittacika + "Perception";
        }
        if (chithasika.equals("chethana")) {
            reultantChittacika = reultantChittacika + "Volition";
        }
        if (chithasika.equals("ekagatha")) {
            reultantChittacika = reultantChittacika + "One-pointedness";
        }
        if (chithasika.equals("jeewitheedriya")) {
            reultantChittacika = reultantChittacika + "Psychic life";
        }
        if (chithasika.equals("manasikaraya")) {
            reultantChittacika = reultantChittacika + "Attention";
        }
        if (chithasika.equals("vithakka")) {
            reultantChittacika = reultantChittacika + "Initial application";
        }
        if (chithasika.equals("vichara")) {
            reultantChittacika = reultantChittacika + "Sustained application";
        }
        if (chithasika.equals("adhimokkha")) {
            reultantChittacika = reultantChittacika + "Decision";
        }
        if (chithasika.equals("veeriya")) {
            reultantChittacika = reultantChittacika + "Energy";
        }
        if (chithasika.equals("preethi")) {
            reultantChittacika = reultantChittacika + "Zest";
        }
        if (chithasika.equals("chandha")) {
            reultantChittacika = reultantChittacika + "Desire";
        }
        if (chithasika.equals("moha")) {
            reultantChittacika = reultantChittacika + "Delusion";
        }
        if (chithasika.equals("ahirika")) {
            reultantChittacika = reultantChittacika + "Shamelessness";
        }
        if (chithasika.equals("anoththaptha")) {
            reultantChittacika = reultantChittacika + "Fearlessness of wrong";
        }
        if (chithasika.equals("udhacha")) {
            reultantChittacika = reultantChittacika + "Restlessness";
        }
        if (chithasika.equals("lobha")) {
            reultantChittacika = reultantChittacika + "Greed";
        }
        if (chithasika.equals("dhitti")) {
            reultantChittacika = reultantChittacika + "Wrong view";
        }
        if (chithasika.equals("mana")) {
            reultantChittacika = reultantChittacika + "Conceit";
        }
        if (chithasika.equals("dhosa")) {
            reultantChittacika = reultantChittacika + "Hatred";
        }
        if (chithasika.equals("issa")) {
            reultantChittacika = reultantChittacika + "Jealousy";
        }
        if (chithasika.equals("michariya")) {
            reultantChittacika = reultantChittacika + "Avarice";
        }
        if (chithasika.equals("kukucha")) {
            reultantChittacika = reultantChittacika + "Worry";
        }
        if (chithasika.equals("theena")) {
            reultantChittacika = reultantChittacika + "Sloth";
        }
        if (chithasika.equals("middha")) {
            reultantChittacika = reultantChittacika + "Torpor";
        }
        if (chithasika.equals("vichikicha")) {
            reultantChittacika = reultantChittacika + "Doubt";
        }
        if (chithasika.equals("saddha")) {
            reultantChittacika = reultantChittacika + "Confidence";
        }
        if (chithasika.equals("sathi")) {
            reultantChittacika = reultantChittacika + "Mindfulness";
        }
        if (chithasika.equals("hiri")) {
            reultantChittacika = reultantChittacika + "Shame";
        }
        if (chithasika.equals("othappa")) {
            reultantChittacika = reultantChittacika + "Dread";
        }
        if (chithasika.equals("alobha")) {
            reultantChittacika = reultantChittacika + "Non-greed";
        }
        if (chithasika.equals("adhosa")) {
            reultantChittacika = reultantChittacika + "Non-hatred";
        }
        if (chithasika.equals("thathramajanthatha")) {
            reultantChittacika = reultantChittacika + "Equanimity";
        }
        if (chithasika.equals("kaya passadhi")) {
            reultantChittacika = reultantChittacika
                    + "Tranquility of mental states";
        }
        if (chithasika.equals("chitha passadhi")) {
            reultantChittacika = reultantChittacika + "Tranquility of mind";
        }
        if (chithasika.equals("kaya lahutha")) {
            reultantChittacika = reultantChittacika
                    + "Lightness of mental states";
        }
        if (chithasika.equals("chitha lahutha")) {
            reultantChittacika = reultantChittacika + "Lightness of mind";
        }
        if (chithasika.equals("kaya mutdutha")) {
            reultantChittacika = reultantChittacika
                    + "Pliancy of mental states";
        }
        if (chithasika.equals("chittha mutdutha")) {
            reultantChittacika = reultantChittacika + "Pliancy of mind";
        }
        if (chithasika.equals("kaya kammagatha")) {
            reultantChittacika = reultantChittacika
                    + "Adaptability of mental states";
        }
        if (chithasika.equals("chittha kammagatha")) {
            reultantChittacika = reultantChittacika + "Adaptability of mind";
        }
        if (chithasika.equals("kaya pragungyatha")) {
            reultantChittacika = reultantChittacika
                    + "Proficiency of metal states";
        }
        if (chithasika.equals("chitta pragungyatha")) {
            reultantChittacika = reultantChittacika + "Proficiency of mind";
        }
        if (chithasika.equals("kayujjukatha")) {
            reultantChittacika = reultantChittacika
                    + "Rectitude of mental states";
        }
        if (chithasika.equals("chithayujjuktha")) {
            reultantChittacika = reultantChittacika + "Rectitude of mind";
        }
        if (chithasika.equals("samma wacha")) {
            reultantChittacika = reultantChittacika + "Right speech";
        }
        if (chithasika.equals("samma kamantha")) {
            reultantChittacika = reultantChittacika + "Right actions";
        }
        if (chithasika.equals("samma arjeewa")) {
            reultantChittacika = reultantChittacika + "Right livelihood";
        }
        if (chithasika.equals("karuna")) {
            reultantChittacika = reultantChittacika + "Compassion";
        }
        if (chithasika.equals("mudhitha")) {
            reultantChittacika = reultantChittacika + "Appreciative Joy";
        }
        if (chithasika.equals("pragnya")) {
            reultantChittacika = reultantChittacika + "Wisdom Faculty";
        }
        return reultantChittacika;
    }

    public static boolean getCittValuesTemp(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {
        boolean esist = false;
        dashboardView.lastCount = dashboardView.relavantCittTemp.size();
        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class.getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);

        for (int j = 0; j < requestedChithacika.length; j++) {
            Set<String> relavantCitt = new TreeSet<String>();
            dashboardView.counterForLoop2++;
            String selectedValue = requestedChithacika[j];
            // //System.out.println("selectedValue: " + selectedValue);

            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);
                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);
                        if (selectedValue.equals(obj)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");

                            Set<String> titles = new TreeSet<String>();
                            str = str.replace("_", " ");
							// dashboardView.appendToPane(dashboardView.jTextPane2,
                            // str + " ", Color.RED);
                            // dashboardView.appendToPane(dashboardView.jTextPane2,
                            // dashboardView.dashboardView.getEnglishTermForCitt(individual)
                            // + "\n", Color.BLUE);
                            // dashboardView.appendToPane(dashboardView.jTextPane2,
                            // "\n (" + individual + ")\n\n" + "\n",
                            // Color.ORANGE);

                            // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: "
                            // + individual);
                            // individual = str +
                            // dashboardView.getEnglishTermForCitt(individual) +
                            // "\n (" + individual + ")\n\n";
                            // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: "
                            // + individual);
                            if (dashboardView.counterForLoop2 == 1) {
                                dashboardView.allCitt2.add(individual);
                            } else {
                                relavantCitt.add(individual);
                            }
                            // //System.out.println("allCitt2 ******"+dashboardView.allCitt2.size());
                            // //System.out.println("relavantCitt ******"+relavantCitt.size());
                            dashboardView.common2 = new ArrayList<String>(
                                    dashboardView.allCitt2);
                            dashboardView.common2.retainAll(relavantCitt);

                            if (dashboardView.counterForLoop2 == 1) {
                                dashboardView.common2 = new ArrayList<String>(
                                        dashboardView.allCitt);
                            }

                            if (dashboardView.common2.size() != 0) {
                                esist = false;
                                //System.out.println("******" + esist);
                            } else {
                                esist = true;

                                //System.out.println(">>>>" + esist);
                            }
							// //System.out.println("allCitt2 ******"+dashboardView.common2.size());
							/*
                             * if (!esist) { esist =
                             * dashboardView.relavantCittTemp.add(individual);
                             * //dashboardView.lastCount++;
                             * 
                             * } else { if
                             * (dashboardView.relavantCittTemp.add(individual))
                             * { // dashboardView.lastCount++; }
                             * 
                             * }
                             */

                            // dashboardView.jLabel127.setText(relavantCitt.size()
                            // + "");
                            outFromTheLoop = true;
                            //System.out.println(dashboardView.relavantCittTemp
                            // .size());
                            break;
                            // return esist;
                        }
                    }

                }
            }
        }

        // //System.out.println(">>>>>>>>>>>>>" + totalNoOfCitt + "<<<<<<<<<<<");
        // //System.out.println(">>>>>>>>>>>>>" + relavantCitt.size() +
        // "<<<<<<<<<<<");
        // dashboardView.setTextAreaWithResults(relavantCitt);>>>>>>
        return esist;
    }

    public void getCittValues(String selected)
            throws OWLOntologyCreationException, FileNotFoundException {

        // prepare ontology and reasoner
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // OWLOntology ontology =
        // manager.loadOntologyFromOntologyDocument(IRI.create(BASE_URL));
        File file = new File(BASE_URL);
        in = DashboardView.class.getResourceAsStream("Citta7.owl");
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(in);
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory
                .getInstance();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology,
                new SimpleConfiguration());
        OWLDataFactory factory = manager.getOWLDataFactory();
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager
                .getOntologyFormat(ontology);
        pm.setDefaultPrefix(PREFIX + "#");

        // get class and its individuals
        OWLClass personClass = factory.getOWLClass("citta", pm);
        Set<OWLClass> classes = reasoner.getSubClasses(personClass, false)
                .getFlattened();
        // //System.out.println(classes.size());
        int totalNoOfCitt = 0;// To count total number of citt.
        String[] requestedChithacika = selected.split(":");// To split the
        // selected
        // chithasika
        // values.
        //NEW
        Set<String> wordList = new TreeSet<String>();
        for (int j = 0; j < requestedChithacika.length; j++) {
            String aa = requestedChithacika[j].trim();
            wordList.add(aa);

        }
		//NEW/

        // ArrayList relavantCitt = new ArrayList();//To store matched citt
        // values.
        // //System.out.println(requestedChithacika);
        // Set<String> relavantCitt = new TreeSet<String>();
        Set<String> relavantCitt2 = new TreeSet<String>();

        // NEW
        boolean notMatchWithSelected = true;

        for (int j = 0; j < requestedChithacika.length; j++) {

            ++dashboardView.counterForLoop;
            Set<String> relavantCitt = new TreeSet<String>();
            String selectedValue = requestedChithacika[j];
            //System.out.println("selectedValue: " + selectedValue);
            selectedValue = selectedValue.trim();
            for (OWLClass person : classes) {
                String str = person.toString();
                str = str.replace(PREFIX + "#", "");
                str = str.replace("<", "");
                str = str.replace(">", "");
                // //System.out.println("CLASS *******************  " + str);
                for (OWLIndividual o : person.getIndividuals(ontology)) {

                    String individual = o.toString();
                    String indi = individual;
                    indi = indi.replace(PREFIX + "#", "");
                    indi = indi.replace("<", "");
                    indi = indi.replace(">", "");
                    // //System.out.println("INDIVIDUAL #################  " +
                    // indi);
                    totalNoOfCitt = totalNoOfCitt + 1;
                    // get a given individual
                    // OWLNamedIndividual martin =
                    // factory.getOWLNamedIndividual(individual, pm);
                    // list all object property values for the individual
                    Map<OWLObjectPropertyExpression, Set<OWLIndividual>> assertedValues = o
                            .getObjectPropertyValues(ontology);
                    // //System.out.println("GGGGGGGGG " + assertedValues);
                    // NEW/
                    Set<String> titles2 = new TreeSet<String>();

                    for (OWLObjectPropertyExpression key2 : assertedValues
                            .keySet()) {

                        String obj2 = key2.toString();
                        obj2 = obj2.replace(PREFIX + "#", "");
                        obj2 = obj2.replace("<", "");
                        obj2 = obj2.replace(">", "");
                        obj2 = obj2.replace("property_", "");
                        obj2 = obj2.replace("_", " ");
                        titles2.add(obj2);
                    }
					// NEW

                    // NEW/
                    // The no of cheithasika selected should match with the
                    // number of chitasika associated with the citt vales
                    //Collections.sort(wordList);
                    //Collections.sort(titles2);
                    notMatchWithSelected = titles2.equals(wordList);
                    //notMatchWithSelected = compareList(wordList,titles2) ;
                    //&& wordList.containsAll(titles2);
                    ////System.out.println("GGGGGGG "
                    //+ titles2.size());
                    ////System.out.println("GGGGGGG "
                    //+ wordList.size());
                    if (titles2.size() == wordList.size()) {
                        //System.out.println("titles2(((((((((" + titles2);
                        //System.out.println("wordList(((((((((" + wordList);
                        //System.out.println("(((((((((" + notMatchWithSelected);
                    }

                    // NEW
                    int i = 0;

                    for (OWLObjectPropertyExpression key : assertedValues
                            .keySet()) {
                        // //System.out.println(key);

                        boolean outFromTheLoop = false;
                        String obj = key.toString();
                        obj = obj.replace(PREFIX + "#", "");
                        obj = obj.replace("<", "");
                        obj = obj.replace(">", "");
                        obj = obj.replace("property_", "");
                        obj = obj.replace("_", " ");
                        // //System.out.println("PROPERTY <<<<<<<<<<<<<<<<: " +
                        // obj);

                        if (selectedValue.equals(obj)) {
                            // //System.out.println(">>> selectedValue: " +
                            // selectedValue + "<<<<<<<< obj: "+obj);
                            individual = individual.replace(PREFIX + "#", "");
                            individual = individual.replace("<", "");
                            individual = individual.replace(">", "");
                            individual = individual.replace("_", " ");
                            String indTemp = individual;

                            str = str.replace("_", " ");
							// //System.out.println(">>>> "+relavantCitt.size()+" <<<<<<");

                            // NEW
                            if (notMatchWithSelected) {

                                if (dashboardView.counterForLoop == 1) {
                                    dashboardView.allCitt.add(indTemp + "::"
                                            + str);
                                } else {
                                    relavantCitt.add(indTemp + "::" + str);
                                }
                                //System.out.println(indTemp + "::"
                                //    + str);
                                dashboardView.common = new ArrayList<String>(
                                        dashboardView.allCitt);
                                dashboardView.common.retainAll(relavantCitt);
                                ////System.out.println("*****"+dashboardView.common.size()+"<<<<<");
                                ////System.out.println("*****"+relavantCitt.size()+"<<<<<");

                            }

                            // NEW
                            i++;
                            outFromTheLoop = true;
                            // break;
                        }
                        individual = individual.replace(PREFIX + "#", "");
                        individual = individual.replace("<", "");
                        individual = individual.replace(">", "");
                        individual = individual.replace("_", " ");
                        String indTemp = individual;
                        //System.out.println(indTemp + "::"
                        // + str);//#########
                    }

                    /*
                     * relavantCitt2.retainAll(relavantCitt); for
                     * (Iterator<String> it = relavantCitt2.iterator();
                     * it.hasNext();) { String string = it.next();
                     * dashboardView.appendToPane(dashboardView.jTextPane2, str
                     * + " ", Color.RED);
                     * dashboardView.appendToPane(dashboardView.jTextPane2,
                     * dashboardView.dashboardView.getEnglishTermForCitt(string)
                     * + "\n", Color.BLUE);
                     * dashboardView.appendToPane(dashboardView.jTextPane2,
                     * "\n (" + string + ")\n\n" + "\n", Color.ORANGE);
                     * dashboardView.jLabel127.setText(relavantCitt2.size() +
                     * ""); }
                     */
                }
            }
        }
        // //System.out.println(">>>>>>>>>>>>>" + totalNoOfCitt + "<<<<<<<<<<<");
        // //System.out.println(">>>>>>>>>>>>>" + relavantCitt.size() +
        // "<<<<<<<<<<<");
        // dashboardView.setTextAreaWithResults(relavantCitt);>>>>>>

        if (dashboardView.counterForLoop == 1 && notMatchWithSelected) {
            dashboardView.common = new ArrayList<String>(dashboardView.allCitt);
        }

        ////System.out.println("dashboardView.common.size()>>>>>>>>>>>>>" + dashboardView.common.size() + "<<<<<<<<<<<");
        boolean check = false;
        for (int i = 0; i < dashboardView.common.size(); i++) {
            String a = dashboardView.common.get(i);
            String aa[] = a.split("::");
            String str = aa[1];
            String string = aa[0];
            check = true;
            //dashboardView.appendToPane(dashboardView.jTextPane2, str + " ",
            // Color.RED);
            redArray.add(str);
            String english = dashboardView.getEnglishTermForCitt(string);
            //dashboardView.appendToPane(dashboardView.jTextPane2,
            // english
            //  + "", Color.BLUE);
            blueArray.add(english);
            //dashboardView.appendToPane(dashboardView.jTextPane2, "\n (" + string + ")\n" + "\n", Color.decode("#FF0000"));
            String temp = string.replace("(", "");
            temp = temp.replace(")", "");
            orangeArray.add(string);
            dashboardView.jLabel127.setText(dashboardView.common.size() + "");

            dashboardView.jTextPane2.setText("");
            Collections.sort(orangeArray, new CustomComparator());
            for (int j = 0; j < blueArray.size(); j++) {
                String string1 = blueArray.get(j);
                String string2 = orangeArray.get(j);
                dashboardView.appendToPane(dashboardView.jTextPane2,
                        string1
                        + "", Color.BLUE);
                dashboardView.appendToPane(dashboardView.jTextPane2, "\n (" + string2 + ")\n" + "\n", Color.decode("#FF0000"));
            }
            Collections.sort(blueArray, new CustomComparatorEnglish());
        }
        if (!check) {

            JOptionPane
                    .showMessageDialog(
                            null,
                            "Selected mental factors combination does not form any thought",
                            "Warning", JOptionPane.WARNING_MESSAGE);
            dashboardView.refreshAll();
            dashboardView.restart = false;

        }
    }

    String getEnglishTermForCitt(String citta) {
        // String reultantCitt = "\n\t";
        String reultantCitt = "\n";
        if (citta
                .equals("somanassasahagata ditthigatasampayutta asankharika citta")) {
            reultantCitt = "One consciousness, accompanied by joy, associated with wrong view, unprompted";
        }//
        if (citta
                .equals("somanassasahagata ditthigatasampayutta sasankharika citta")) {
            reultantCitt = "One consciousness, accompanied by joy, associated with wrong view, prompted";
        }//
        if (citta
                .equals("somanassasahagata ditthigatavippayutta asankharika citta")) {
            reultantCitt = "One consciousness, accompanied by joy, dissociated from wrong view, unprompted";
        }//
        if (citta
                .equals("somanassasahagata ditthigatavippayutta sasankharika citta")) {
            reultantCitt = "One consciousness, accompanied by joy, dissociated from wrong view, prompted";
        }//
        if (citta
                .equals("upeksha sahagatha drushtigatha vipprayuktha asasankarika citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, associated with wrong view, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata ditthigatavippayutta sasankharika citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, associated with wrong view, prompted";
        }//
        if (citta
                .equals("upekkhasahagata ditthigatasampayutta asankharika citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, dissociated from wrong view, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata ditthigatasampayutta sasankharika citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, dissociated from wrong view, prompted";
        }//
        if (citta
                .equals("upekkhasahagata ditthigatavippayutta asankharika citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, dissociated from wrong view, unprompted";
        }//

        if (citta
                .equals("domanassasahagata patighasampayutta asankharika citta")) {
            reultantCitt = "One consciousness, accompanied by displeasure, associated with aversion, unprompted";
        }//
        if (citta
                .equals("domanassasahagata patighasampayutta sasankharika citta")) {
            reultantCitt = "One consciousness, accompanied by displeasure, associated with aversion, prompted";
        }//

        if (citta.equals("upekkhasahagata vicikicchasampayutta citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, associated with doubt";
        }//
        if (citta.equals("upekkhasahagata uddhaccasampayutta citta")) {
            reultantCitt = "One consciousness, accompanied by equanimity, associated with restlessness";
        }//

        if (citta.equals("upekkhasahagata cakkhuvinnana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant eye-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata sotavinnana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant ear-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata ghanavinnana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant nose-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata jivhavinnana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant tongue-consciousness accompanied by equanimity";
        }//
        if (citta.equals("dukkhasahagata kayavinnana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant body-consciousness accompanied by displeasure";
        }//
        if (citta.equals("upekkhasahagata sampaticchana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant receiving consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata santirana akusala vipaka citta")) {
            reultantCitt = "Unwholesome resultant investigating consciousness accompanied by equanimity";
        }//

        if (citta.equals("upekkhasahagata cakkhuvinnana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant eye-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata sotavinnana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant ear-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata ghanavinnana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant nose-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata jivhavinnana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant tongue-consciousness accompanied by equanimity";
        }//
        if (citta.equals("sukhasahagata kayavinnana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant body-consciousness accompanied by pleasure";
        }//
        if (citta.equals("upekkhasahagata sampaticchana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant receiving-consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata santirana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant investigating-consciousness accompanied by equanimity";
        }//
        if (citta.equals("somanassasahagata santirana kusala vipaka citta")) {
            reultantCitt = "Wholesome resultant investigating-consciousness accompanied by joy";
        }//

        if (citta.equals("upekkhasahagata pancadvaravajjana kriya citta")) {
            reultantCitt = "Rootless functional five-sense-door adverting consciousness accompanied by equanimity";
        }//
        if (citta.equals("upekkhasahagata manodvaravajjana kriya citta")) {
            reultantCitt = "Rootless functional five-sense-door adverting consciousness accompanied by equanimity";
        }//
        if (citta.equals("somanassasahagata hasituppada kriya citta")) {
            reultantCitt = "Rootless functional smile-producing consciousness accompanied by joy";
        }//
////////////////////////Kusal//////////////////////
        if (citta
                .equals("somanassasahagata nanasampayutta asankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by joy, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanasampayutta sasankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by joy, associated with knowledge, prompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta asankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by joy, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta sasankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by joy, disassociated with knowledge, prompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta asankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by equanimity, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta sasankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by equanimity, associated with knowledge, prompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta asankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by equanimity, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta sasankharika kusal citta")) {
            reultantCitt = "Wholesome consciousness accompanied by equanimity, disassociated with knowledge, prompted";
        }//
////////////////////////Vipaka//////////////////////
        if (citta
                .equals("somanassasahagata nanasampayutta asankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by joy, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanasampayutta sasankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by joy, associated with knowledge, prompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta asankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by joy, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta sasankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by joy, disassociated with knowledge, prompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta asankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by equanimity, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta sasankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by equanimity, associated with knowledge, prompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta asankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta sasankharika vipaka citta")) {
            reultantCitt = "Wholesome-resultant consciousness accompanied by equanimity, disassociated with knowledge, prompted ";
        }//
////////////////////////Kriya//////////////////////
        if (citta
                .equals("somanassasahagata nanasampayutta asankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by joy, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanasampayutta sasankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by joy, associated with knowledge, prompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta asankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("somanassasahagata nanavippayutta sasankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by joy, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta asankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by equanimity, associated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanasampayutta sasankharika kriya citta")) {
            reultantCitt = "Wholesome-functional consciousness accompanied by equanimity, associated with knowledge,  prompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta asankharika kriya citta")) {
            reultantCitt = "Wholesome functional consciousness accompanied by equanimity, disassociated with knowledge, unprompted";
        }//
        if (citta
                .equals("upekkhasahagata nanavippayutta sasankharika kriya citta")) {
            reultantCitt = "Wholesome functional consciousness accompanied by equanimity, disassociated with knowledge, prompted";
        }//
//////////////////ROOPAVACHARA?????
        /////////////Kusal///////
        if (citta
                .equals("vitakka vicara piti sukha ekaggata sahita pathamajjhana kusala citta")) {
            reultantCitt = "First jhana wholesome consciousness together with initial application, sustained application, zest, happiness, and one-pointedness";
        }//
        if (citta
                .equals("vicara piti sukha ekaggata sahita dutiyajjhana kusala citta")) {
            reultantCitt = "Second jhana wholesome consciousness together with sustained application, zest, happiness, and one-pointedness";
        }//
        if (citta
                .equals("piti sukha ekaggata sahita tatiyajjhana kusala citta")) {
            reultantCitt = "Third jhana wholesome consciousness together with zest, happiness, and one-pointedness";
        }//
        if (citta.equals("sukha ekaggata sahita catutthajjhana kusala citta")) {
            reultantCitt = "Fourth jhana wholesome consciousness together with happiness and one-pointedness";
        }//
        if (citta.equals("upekkh ekaggata sahita pancamajjhana kusala citta")) {
            reultantCitt = "Fifth jhana wholesome consciousness together with equanimity and one-pointedness";
        }//

//////////////////ROOPAVACHARA?????
/////////////Vipaka///////
        if (citta
                .equals("vitakka vicara piti sukha ekaggata sahita pathamajjhana vipaka citta")) {
            reultantCitt = "First jhana resultant consciousness together with initial application, sustained application, zest, happiness, and one-pointedness";
        }//
        if (citta
                .equals("vicara piti sukha ekaggata sahita dutiyajjhana vipaka citta")) {
            reultantCitt = "Second jhana resultant consciousness together with sustained application, zest, happiness, and one-pointedness";
        }//
        if (citta
                .equals("piti sukha ekaggata sahita tatiyajjhana vipaka citta")) {
            reultantCitt = "Third jhana resultant consciousness together with zest, happiness and one-pointedness";
        }//
        if (citta.equals("sukha ekaggata sahita catutthajjhana vipaka citta")) {
            reultantCitt = "Fourth jhana resultant consciousness together with happiness and one-pointedness";
        }//
        if (citta.equals("upekkh ekaggata sahita pancamajjhana vipaka citta")) {
            reultantCitt = "Fifth jhana resultant consciousness together with equanimity and one-pointedness";
        }//
//////////////////ROOPAVACHARA?????
/////////////Kriya///////
        if (citta
                .equals("vitakka vicara piti sukha ekaggata sahita pathamajjhana kriya citta")) {
            reultantCitt = "First jhana functional consciousness together with initial application, sustained application, zest, happiness and one-pointedness";
        }//
        if (citta
                .equals("vicara piti sukha ekaggata sahita dutiyajjhana kriya citta")) {
            reultantCitt = "Second jhana functional consciousness together with sustained application, zest, happiness, and one-pointedness";
        }//
        if (citta
                .equals("piti sukha ekaggata sahita tatiyajjhana kriya citta")) {
            reultantCitt = "Third jhana functional consciousness together with zest, happiness and one-pointedness";
        }//
        if (citta.equals("sukha ekaggata sahita catutthajjhana kriya citta")) {
            reultantCitt = "Fourth jhana functional consciousness together with happiness and one-pointedness";
        }//
        if (citta.equals("upekkh ekaggata sahita pancamajjhana kriya citta")) {
            reultantCitt = "Fifth jhana functional consciousness together with equanimity and one-pointedness";
        }//
//////////////////ROOPAVACHARA?????

        if (citta.equals("akasanancayatana kusala citta")) {
            reultantCitt = "Wholesome consciousness pertaining to the base of infinite space";
        }//
        if (citta.equals("vinnanancayatana kusala citta")) {
            reultantCitt = "Wholesome consciousness pertaining to the base of infinite consciousness.";
        }//
        if (citta.equals("akincannayatana kusala citta")) {
            reultantCitt = "Wholesome consciousness pertaining to the base of nothingness";
        }//
        if (citta.equals("nevasannanasannayatana kusala citta")) {
            reultantCitt = "Wholesome consciousness pertaining to the base of neither-perception-nor-non-perception";
        }//

        if (citta.equals("akasanancayatana vipaka citta")) {
            reultantCitt = "Resultant consciousness pertaining to the base of infinite space";
        }//
        if (citta.equals("vinnanancayatana vipaka citta")) {
            reultantCitt = "Resultant consciousness pertaining to the base of infinite consciousness";
        }//
        if (citta.equals("akincannayatana vipaka citta")) {
            reultantCitt = "Resultant consciousness pertaining to the base of nothingness";
        }
        if (citta.equals("nevasannanasannayatana vipaka citta")) {
            reultantCitt = "Resultant consciousness pertaining to the base of neither- perception-nor-non-perception";
        }//

        if (citta.equals("akasanancayatana kriya citta")) {
            reultantCitt = "Functional consciousness pertaining to the base of infinite space";
        }//
        if (citta.equals("vinnanancayatana kriya citta")) {
            reultantCitt = "Functional consciousness pertaining to the base of infinite consciousness";
        }//
        if (citta.equals("akincannayatana kriya citta")) {
            reultantCitt = "Functional consciousness pertaining to the base of nothingness";
        }//
        if (citta.equals("nevasannanasannayatana kriya citta")) {
            reultantCitt = "Functional consciousness pertaining to the base of neitherperception-nor-non-perception";
        }//

        if (citta.equals("prathama dhyana shrothapathi mharga citta")) {
            reultantCitt = "The first Jhana, path consciousness of stream-entry";
        }
        if (citta.equals("dwitheeya dhyana shrothapathi mharga citta")) {
            reultantCitt = "The second Jhana, path consciousness of stream-entry";
        }
        if (citta.equals("thrutheeya dhyana shrothapathi mharga citta")) {
            reultantCitt = "The third Jhana, path consciousness of stream-entry";
        }
        if (citta.equals("chathurtha dhyana shrothapathi mharga citta")) {
            reultantCitt = "The fourth Jhana, path consciousness of stream-entry";
        }
        if (citta.equals("panchama dhyana shrothapathi mharga citta")) {
            reultantCitt = "The fifth Jhana, path consciousness of stream-entry";
        }
        if (citta.equals("prathama dhyana sakadagami mharga citta")) {
            reultantCitt = "The first Jhana, path consciousness of once-returning";
        }
        if (citta.equals("dwitheeya dhyana sakadagami mharga citta")) {
            reultantCitt = "The second Jhana, path consciousness of once-returning";
        }
        if (citta.equals("thrutheeya dhyana sakadagami mharga citta")) {
            reultantCitt = "The third Jhana, path consciousness of once-returning";
        }
        if (citta.equals("chathurtha dhyana sakadagami mharga citta")) {
            reultantCitt = "The fourth Jhana, path consciousness of once-returning";
        }
        if (citta.equals("panchama dhyana sakadagami mharga citta")) {
            reultantCitt = "The fifth Jhana, path consciousness of once-returning";
        }
        if (citta.equals("prathama dhyana anagami mharga citta")) {
            reultantCitt = "The first Jhana, path consciousness of non-returning";
        }
        if (citta.equals("dwitheeya dhyana anagami mharga citta")) {
            reultantCitt = "The second Jhana, path consciousness of non-returning";
        }
        if (citta.equals("thrutheeya dhyana anagami mharga citta")) {
            reultantCitt = "The third Jhana, path consciousness of non-returning";
        }
        if (citta.equals("chathurtha dhyana anagami mharga citta")) {
            reultantCitt = "The fourth Jhana, path consciousness of non-returning";
        }
        if (citta.equals("panchama dhyana anagami mharga citta")) {
            reultantCitt = "The fifth Jhana, path consciousness of non-returning";
        }
        if (citta.equals("prathama dhyana arahath mharga citta")) {
            reultantCitt = "The first Jhana, path consciousness of Arahantship";
        }
        if (citta.equals("dwitheeya dhyana arahath mharga citta")) {
            reultantCitt = "The second Jhana, path consciousness of Arahantship";
        }
        if (citta.equals("thrutheeya dhyana arahath mharga citta")) {
            reultantCitt = "The third Jhana, path consciousness of Arahantship";
        }
        if (citta.equals("chathurtha dhyana arahath mharga citta")) {
            reultantCitt = "The fourth Jhana, path consciousness of Arahantship";
        }
        if (citta.equals("panchama dhyana arahath mharga citta")) {
            reultantCitt = "The fifth Jhana, path consciousness of Arahantship";
        }

        if (citta.equals("prathama dhyana shrothapathi phala citta")) {
            reultantCitt = "The first Jhana, fruition consciousness of stream-entry";
        }
        if (citta.equals("dwitheeya dhyana shrothapathi phala citta")) {
            reultantCitt = "The second Jhana, fruition consciousness of stream-entry";
        }
        if (citta.equals("thrutheeya dhyana shrothapathi phala citta")) {
            reultantCitt = "The third Jhana, fruition consciousness of stream-entry";
        }
        if (citta.equals("chathurtha dhyana shrothapathi phala citta")) {
            reultantCitt = "The fourth Jhana, fruition consciousness of stream-entry";
        }
        if (citta.equals("panchama dhyana shrothapathi phala citta")) {
            reultantCitt = "The fifth Jhana, fruition consciousness of stream-entry";
        }
        if (citta.equals("prathama dhyana sakadagami phala citta")) {
            reultantCitt = "The first Jhana, fruition consciousness of once-returning";
        }
        if (citta.equals("dwitheeya dhyana sakadagami phala citta")) {
            reultantCitt = "The second Jhana, fruition consciousness of once-returning";
        }
        if (citta.equals("thrutheeya dhyana sakadagami phala citta")) {
            reultantCitt = "The third Jhana, fruition consciousness of once-returning";
        }
        if (citta.equals("chathurtha dhyana sakadagami phala citta")) {
            reultantCitt = "The fourth Jhana, fruition consciousness of once-returning";
        }
        if (citta.equals("panchama dhyana sakadagami phala citta")) {
            reultantCitt = "The fifth Jhana, fruition consciousness of once-returning";
        }
        if (citta.equals("prathama dhyana anagami phala citta")) {
            reultantCitt = "The first Jhana, fruition consciousness of non-returning";
        }
        if (citta.equals("dwitheeya dhyana anagami phala citta")) {
            reultantCitt = "The second Jhana, fruition consciousness of non-returning";
        }
        if (citta.equals("thrutheeya dhyana anagami phala citta")) {
            reultantCitt = "The third Jhana, fruition consciousness of non-returning";
        }
        if (citta.equals("chathurtha dhyana anagami phala citta")) {
            reultantCitt = "The fourth Jhana, fruition consciousness of non-returning";
        }
        if (citta.equals("panchama dhyana anagami phala citta")) {
            reultantCitt = "The fifth Jhana, fruition consciousness of non-returning";
        }
        if (citta.equals("prathama dhyana arahath phala citta")) {
            reultantCitt = "The first Jhana, fruition consciousness of Arahantship";
        }
        if (citta.equals("dwitheeya dhyana arahath phala citta")) {
            reultantCitt = "The second Jhana, fruition consciousness of Arahantship";
        }
        if (citta.equals("thrutheeya dhyana arahath phala citta")) {
            reultantCitt = "The third Jhana, fruition consciousness of Arahantship";
        }
        if (citta.equals("chathurtha dhyana arahath phala citta")) {
            reultantCitt = "The fourth Jhana, fruition consciousness of Arahantship";
        }
        if (citta.equals("panchama dhyana arahath phala citta")) {
            reultantCitt = "The fifth Jhana, fruition consciousness of Arahantship";
        }

        reultantCitt = "\n" + reultantCitt;
        return reultantCitt;
    }

    /**
     * Helper class for extracting labels, comments and other anotations in
     * preffered languages. Selects the first literal annotation matching the
     * given languages in the given order.
     */
    public static class LocalizedAnnotationSelector {

        private final List<String> langs;
        private final OWLOntology ontology;
        private final OWLDataFactory factory;

        /**
         * Constructor.
         *
         * @param ontology ontology
         * @param factory data factory
         * @param langs list of prefered languages; if none is provided the
         * Locale.getDefault() is used
         */
        public LocalizedAnnotationSelector(OWLOntology ontology,
                OWLDataFactory factory, String... langs) {
            this.langs = (langs == null) ? Arrays.asList(Locale.getDefault()
                    .toString()) : Arrays.asList(langs);
            this.ontology = ontology;
            this.factory = factory;
        }

        /**
         * Provides the first label in the first matching language.
         *
         * @param ind individual
         * @return label in one of preferred languages or null if not available
         */
        public String getLabel(OWLNamedIndividual ind) {
            return getAnnotationString(ind,
                    OWLRDFVocabulary.RDFS_LABEL.getIRI());
        }

        @SuppressWarnings("UnusedDeclaration")
        public String getComment(OWLNamedIndividual ind) {
            return getAnnotationString(ind,
                    OWLRDFVocabulary.RDFS_COMMENT.getIRI());
        }

        public String getAnnotationString(OWLNamedIndividual ind,
                IRI annotationIRI) {
            return getLocalizedString(ind.getAnnotations(ontology,
                    factory.getOWLAnnotationProperty(annotationIRI)));
        }

        private String getLocalizedString(Set<OWLAnnotation> annotations) {
            List<OWLLiteral> literalLabels = new ArrayList<OWLLiteral>(
                    annotations.size());
            for (OWLAnnotation label : annotations) {
                if (label.getValue() instanceof OWLLiteral) {
                    literalLabels.add((OWLLiteral) label.getValue());
                }
            }
            for (String lang : langs) {
                for (OWLLiteral literal : literalLabels) {
                    if (literal.hasLang(lang)) {
                        return literal.getLiteral();
                    }
                }
            }
            for (OWLLiteral literal : literalLabels) {
                // if (!literal.hasLang()) return literal.getLiteral();
            }
            return null;
        }
    }

    private void setMentalFactorsText(Set set) {
        // jTextArea1.setText("");
        jTextPane4.setText("");
        ArrayList list = new ArrayList();

        String result = "";
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String obj = it.next();
            list.add(obj);

        }
        Collections.sort(list);
        if (set.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                result = result + "\n" + list.get(i);
            }

        } else {
            result = "No relavant chithasika for the selected citt values";
        }
        // jTextArea1.setText(result);
        jTextPane4.setText(result);
    }

    private void setTextAreaWithResults(Set set) {
        // jTextArea2.setText("");
        jTextPane2.setText("");
        ArrayList list = new ArrayList();

        String result = "";
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String obj = it.next();
            list.add(obj);

        }
        Collections.sort(list);
        if (set.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                result = result + "\n" + list.get(i);
            }

        } else {
            result = "No relavant citt for the selected chithacika values";
        }
        // jTextArea2.setText(result);
    }

    private static void printIndented(Tree<OWLAxiom> node, String indent) {
        OWLAxiom axiom = node.getUserObject();
        // //System.out.println(indent + renderer.render(axiom));
        if (!node.isLeaf()) {
            for (Tree<OWLAxiom> child : node.getChildren()) {
                printIndented(child, indent + "    ");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox132;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox138;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox143;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox147;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox150;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox153;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox155;
    private javax.swing.JCheckBox jCheckBox156;
    private javax.swing.JCheckBox jCheckBox157;
    private javax.swing.JCheckBox jCheckBox158;
    private javax.swing.JCheckBox jCheckBox159;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox160;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox162;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox165;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox168;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox171;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox173;
    private javax.swing.JCheckBox jCheckBox174;
    private javax.swing.JCheckBox jCheckBox175;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox177;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox181;
    private javax.swing.JCheckBox jCheckBox182;
    private javax.swing.JCheckBox jCheckBox183;
    private javax.swing.JCheckBox jCheckBox184;
    private javax.swing.JCheckBox jCheckBox185;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox193;
    private javax.swing.JCheckBox jCheckBox194;
    private javax.swing.JCheckBox jCheckBox195;
    private javax.swing.JCheckBox jCheckBox196;
    private javax.swing.JCheckBox jCheckBox197;
    private javax.swing.JCheckBox jCheckBox198;
    private javax.swing.JCheckBox jCheckBox199;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox208;
    private javax.swing.JCheckBox jCheckBox209;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox210;
    private javax.swing.JCheckBox jCheckBox211;
    private javax.swing.JCheckBox jCheckBox218;
    private javax.swing.JCheckBox jCheckBox219;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox220;
    private javax.swing.JCheckBox jCheckBox221;
    private javax.swing.JCheckBox jCheckBox222;
    private javax.swing.JCheckBox jCheckBox223;
    private javax.swing.JCheckBox jCheckBox224;
    private javax.swing.JCheckBox jCheckBox227;
    private javax.swing.JCheckBox jCheckBox228;
    private javax.swing.JCheckBox jCheckBox229;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox230;
    private javax.swing.JCheckBox jCheckBox231;
    private javax.swing.JCheckBox jCheckBox232;
    private javax.swing.JCheckBox jCheckBox233;
    private javax.swing.JCheckBox jCheckBox234;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane14;
    private javax.swing.JTextPane jTextPane15;
    private javax.swing.JTextPane jTextPane16;
    private javax.swing.JTextPane jTextPane17;
    private javax.swing.JTextPane jTextPane18;
    private javax.swing.JTextPane jTextPane19;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane20;
    private javax.swing.JTextPane jTextPane21;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    // End of variables declaration//GEN-END:variables
}
