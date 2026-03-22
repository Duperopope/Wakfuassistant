/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from axY
 */
class axy_1 {
    private JTable drS;
    private JPanel cnC;
    private JLabel drT;

    axy_1() {
        this.byZ();
    }

    private void byZ() {
        this.cnC = new JPanel();
        this.cnC.setLayout(new BorderLayout(0, 0));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(0, 0));
        this.cnC.add((Component)jPanel, "North");
        JLabel jLabel = new JLabel();
        jLabel.setText("FPS");
        jPanel.add((Component)jLabel, "West");
        this.drT = new JLabel();
        this.drT.setText("");
        jPanel.add((Component)this.drT, "Center");
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout(0, 0));
        jPanel2.setMinimumSize(new Dimension(0, 20));
        jPanel.add((Component)jPanel2, "North");
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("  ");
        jPanel2.add((Component)jLabel2, "Center");
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new BorderLayout(0, 0));
        jPanel.add((Component)jPanel3, "South");
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("  ");
        jPanel3.add((Component)jLabel3, "Center");
        JScrollPane jScrollPane = new JScrollPane();
        this.cnC.add((Component)jScrollPane, "Center");
        this.drS = new JTable();
        jScrollPane.setViewportView(this.drS);
    }

    public JComponent bza() {
        return this.cnC;
    }

    public JPanel bwz() {
        return this.cnC;
    }

    public void aPg() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        this.drS.setModel(defaultTableModel);
    }

    private void a(THashMap<String, axw_1> tHashMap, int n) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("function");
        defaultTableModel.addColumn("~calls / frame / s");
        defaultTableModel.addColumn("cumulated calls");
        float f2 = 1.0f / (float)n;
        if (!tHashMap.isEmpty()) {
            tHashMap.forEachValue((TObjectProcedure)new axz_1(this, defaultTableModel, f2));
        }
        this.drS.setModel(defaultTableModel);
    }

    public void a(THashMap<String, axw_1> tHashMap, int n, float f2) {
        DefaultTableModel defaultTableModel = (DefaultTableModel)this.drS.getModel();
        int n2 = defaultTableModel.getRowCount();
        if (n2 != tHashMap.size()) {
            this.a(tHashMap, n);
        } else {
            float f3 = 1.0f / (float)n;
            for (int i = 0; i < n2; ++i) {
                String string = (String)defaultTableModel.getValueAt(i, 0);
                axw_1 axw_12 = (axw_1)tHashMap.get((Object)string);
                defaultTableModel.setValueAt((int)((float)axw_12.aIs() * f3), i, 1);
                defaultTableModel.setValueAt(axw_12.bRI(), i, 2);
            }
        }
        this.drT.setText("" + f2);
    }
}

