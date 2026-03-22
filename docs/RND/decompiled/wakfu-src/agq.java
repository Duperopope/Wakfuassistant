/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class agq {
    private JPanel cnC;
    private JTable ctI;
    private JTable ctJ;

    agq() {
        this.byZ();
    }

    private void byZ() {
        this.cnC = new JPanel();
        this.cnC.setLayout(new BorderLayout(0, 0));
        JScrollPane jScrollPane = new JScrollPane();
        this.cnC.add((Component)jScrollPane, "Center");
        this.ctJ = new JTable();
        jScrollPane.setViewportView(this.ctJ);
        JScrollPane jScrollPane2 = new JScrollPane();
        this.cnC.add((Component)jScrollPane2, "East");
        this.ctI = new JTable();
        jScrollPane2.setViewportView(this.ctI);
    }

    public JComponent bza() {
        return this.cnC;
    }

    public JPanel bwz() {
        return this.cnC;
    }

    private void a(ArrayList<ParticleSystem> arrayList, ArrayList<ast_2> arrayList2) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("Class");
        defaultTableModel.addColumn("isAlive");
        defaultTableModel.addColumn("emitters");
        defaultTableModel.addColumn("pos");
        for (ParticleSystem object : arrayList) {
            StringBuilder stringBuilder = new StringBuilder();
            Emitter[] emitterArray = object.bLT();
            if (emitterArray != null) {
                int n = emitterArray.length;
                stringBuilder.append("cnt=").append(n).append(" {");
                for (int i = 0; i < n; ++i) {
                    if (i > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(emitterArray[i].bnq());
                }
                stringBuilder.append("}");
            } else {
                stringBuilder.append("cnt=0");
            }
            defaultTableModel.addRow(new Object[]{object.bLJ(), object.getClass().getSimpleName(), object.bnq(), stringBuilder, object.aSc() + ";" + object.aSd()});
        }
        this.ctI.setModel(defaultTableModel);
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("Pos");
        defaultTableModel.addColumn("Enabled");
        defaultTableModel.addColumn("BaseColor");
        defaultTableModel.addColumn("Range");
        for (ast_2 ast_22 : arrayList2) {
            defaultTableModel.addRow(new Object[]{ast_22.d(), ast_22.bts().aSc() + ";" + ast_22.bts().aSd(), ast_22.isEnabled(), ast_22.bKP(), Float.valueOf(ast_22.aSL())});
        }
        this.ctJ.setModel(defaultTableModel);
    }

    public void b(ArrayList<ParticleSystem> arrayList, ArrayList<ast_2> arrayList2) {
        this.a(arrayList, arrayList2);
    }
}

