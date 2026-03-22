/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intellij.uiDesigner.core.GridConstraints
 *  com.intellij.uiDesigner.core.GridLayoutManager
 *  com.intellij.uiDesigner.core.Spacer
 */
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.KeyStroke;

/*
 * Renamed from cbo
 */
public class cbo_1
extends JDialog {
    private JPanel lIO;
    public JSlider lIP;
    public JLabel lIQ;
    public JSlider lIR;
    public JLabel lIS;
    public JCheckBox lIT;
    public JSlider lIU;
    public JLabel lIV;
    public JCheckBox lIW;
    public JSlider lIX;
    public JSlider lIY;
    public JSlider lIZ;
    public JLabel lJa;
    public JLabel lJb;
    public JLabel lJc;
    bzs_1 lJd;
    private boolean lJe;

    private void byZ() {
        this.lIO = new JPanel();
        this.lIO.setLayout((LayoutManager)new GridLayoutManager(4, 1, new Insets(10, 10, 10, 10), -1, -1));
        JPanel jPanel = new JPanel();
        jPanel.setLayout((LayoutManager)new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.lIO.add((Component)jPanel, new GridConstraints(1, 0, 1, 1, 0, 3, 3, 3, null, null, null, 0, false));
        Spacer spacer = new Spacer();
        jPanel.add((Component)spacer, new GridConstraints(3, 0, 1, 1, 0, 2, 1, 4, null, null, null, 0, false));
        JLabel jLabel = new JLabel();
        jLabel.setText("Vent");
        jPanel.add((Component)jLabel, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lIP = new JSlider();
        jPanel.add((Component)this.lIP, new GridConstraints(0, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lIQ = new JLabel();
        this.lIQ.setText("0");
        jPanel.add((Component)this.lIQ, new GridConstraints(0, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Pluie");
        jPanel.add((Component)jLabel2, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lIR = new JSlider();
        jPanel.add((Component)this.lIR, new GridConstraints(1, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lIS = new JLabel();
        this.lIS.setText("0");
        jPanel.add((Component)this.lIS, new GridConstraints(1, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lIU = new JSlider();
        jPanel.add((Component)this.lIU, new GridConstraints(2, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lIV = new JLabel();
        this.lIV.setText("0");
        jPanel.add((Component)this.lIV, new GridConstraints(2, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Neige");
        jPanel.add((Component)jLabel3, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lIT = new JCheckBox();
        this.lIT.setText("D\u00e9sactiver la m\u00e9t\u00e9o");
        this.lIO.add((Component)this.lIT, new GridConstraints(0, 0, 1, 1, 8, 0, 3, 0, null, null, null, 0, false));
        this.lIW = new JCheckBox();
        this.lIW.setText("Param\u00e9trer les nuages");
        this.lIO.add((Component)this.lIW, new GridConstraints(2, 0, 1, 1, 8, 0, 3, 0, null, null, null, 0, false));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout((LayoutManager)new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.lIO.add((Component)jPanel2, new GridConstraints(3, 0, 1, 1, 0, 3, 3, 3, null, null, null, 0, false));
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Bias");
        jPanel2.add((Component)jLabel4, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        Spacer spacer2 = new Spacer();
        jPanel2.add((Component)spacer2, new GridConstraints(3, 0, 1, 1, 0, 2, 1, 4, null, null, null, 0, false));
        this.lIX = new JSlider();
        jPanel2.add((Component)this.lIX, new GridConstraints(0, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lJa = new JLabel();
        this.lJa.setText("0");
        jPanel2.add((Component)this.lJa, new GridConstraints(0, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Scale");
        jPanel2.add((Component)jLabel5, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Sharp");
        jPanel2.add((Component)jLabel6, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lIY = new JSlider();
        jPanel2.add((Component)this.lIY, new GridConstraints(1, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lIZ = new JSlider();
        jPanel2.add((Component)this.lIZ, new GridConstraints(2, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.lJb = new JLabel();
        this.lJb.setText("0");
        jPanel2.add((Component)this.lJb, new GridConstraints(1, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.lJc = new JLabel();
        this.lJc.setText("0");
        jPanel2.add((Component)this.lJc, new GridConstraints(2, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
    }

    public JComponent bza() {
        return this.lIO;
    }

    public cbo_1(bzs_1 bzs_12) {
        this.byZ();
        this.lJe = true;
        this.lJd = bzs_12;
        this.setContentPane(this.lIO);
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new cbp_1(this));
        this.lIO.registerKeyboardAction(new cbr_1(this), KeyStroke.getKeyStroke(27, 0), 1);
        this.lIP.addChangeListener(new cbs_1(this));
        this.lIR.addChangeListener(new cbt_1(this));
        this.lIU.addChangeListener(new cbu_1(this));
        this.lIT.addItemListener(new cbv_1(this));
        this.lIW.addItemListener(new cbw_1(this));
        this.lIX.addChangeListener(new cbx_1(this));
        this.lIY.addChangeListener(new cby_1(this));
        this.lIZ.addChangeListener(new cbq_1(this));
    }

    void a(JLabel jLabel, float f2) {
        jLabel.setText(Float.toString(f2));
        jLabel.updateUI();
    }

    static float a(JSlider jSlider) {
        return (float)jSlider.getValue() / 100.0f;
    }

    void egh() {
        if (this.lJe) {
            this.dispose();
        } else {
            this.setVisible(false);
        }
    }

    public void close() {
        this.egh();
    }

    public void iU(boolean bl) {
        this.lJe = bl;
    }

    public static cbo_1 a(bzs_1 bzs_12, boolean bl) {
        cbo_1 cbo_12 = new cbo_1(bzs_12);
        cbo_12.setTitle("Param\u00e8tre m\u00e9t\u00e9o");
        cbo_12.iU(bl);
        cbo_12.setModal(bl);
        cbo_12.pack();
        cbo_12.setAlwaysOnTop(true);
        cbo_12.setVisible(true);
        return cbo_12;
    }

    public static void main(String[] stringArray) {
        cbo_1.a(new byz_2(), true);
        System.exit(0);
    }
}

