/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.AppenderSkeleton
 *  org.apache.log4j.spi.LoggingEvent
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;
import java.util.Enumeration;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class feu
extends AppenderSkeleton {
    final JTable sed;
    final fex see = new fex();
    private static final int sef = 3000;
    private final JScrollPane seg;
    private final JFrame seh;
    private final JLabel sei;
    private final JCheckBox sej;

    public feu(String string) {
        String string2 = feu.sG(string);
        this.setName(string2);
        this.seh = new JFrame(string2);
        this.sed = new JTable(this.see);
        this.seg = new JScrollPane(this.sed);
        this.seg.setSize(new Dimension(1024, 768));
        this.seh.getContentPane().add((Component)this.seg, "Center");
        JPanel jPanel = new JPanel();
        this.sei = new JLabel();
        jPanel.add(this.sei);
        this.sej = new JCheckBox("AutoScroll enabled");
        this.sej.setSelected(true);
        jPanel.add(this.sej);
        JButton jButton = new JButton("Clear");
        jButton.addActionListener(new fev(this));
        jPanel.add(jButton);
        this.seh.getContentPane().add((Component)jPanel, "North");
        this.fUx();
        this.seh.pack();
        this.seh.setVisible(true);
        this.seh.setDefaultCloseOperation(2);
    }

    public static String sG(String string) {
        return "ItemTrackerViewer" + string;
    }

    protected void append(LoggingEvent loggingEvent) {
        String string = (String)loggingEvent.getMessage();
        String[] stringArray = string.split(",");
        String[] stringArray2 = new String[stringArray.length + 1];
        stringArray2[0] = loggingEvent.getLevel().toString();
        System.arraycopy(stringArray, 0, stringArray2, 1, stringArray.length);
        if (this.see.getRowCount() == 3000) {
            this.see.UA(0);
        }
        this.see.y(stringArray2);
        this.fUx();
    }

    private void fUx() {
        Serializable serializable;
        int n = 0;
        boolean bl = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        JTableHeader jTableHeader = this.sed.getTableHeader();
        Enumeration<TableColumn> enumeration = this.sed.getColumnModel().getColumns();
        this.sed.setAutoResizeMode(0);
        while (enumeration.hasMoreElements()) {
            serializable = enumeration.nextElement();
            n = jTableHeader.getColumnModel().getColumnIndex(((TableColumn)serializable).getIdentifier());
            n5 = (int)this.sed.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(this.sed, ((TableColumn)serializable).getIdentifier(), false, false, -1, n).getPreferredSize().getWidth();
            for (n4 = 0; n4 < this.sed.getRowCount(); ++n4) {
                int n6 = (int)this.sed.getCellRenderer(n4, n).getTableCellRendererComponent(this.sed, this.sed.getValueAt(n4, n), false, false, n4, n).getPreferredSize().getWidth();
                n5 = Math.max(n5, n6);
            }
            jTableHeader.setResizingColumn((TableColumn)serializable);
            n2 = n5 + this.sed.getIntercellSpacing().width;
            n3 += (n2 += 10);
            ((TableColumn)serializable).setWidth(n2);
        }
        this.sei.setText(this.see.getRowCount() + " line(s)" + (this.see.getRowCount() == 3000 ? " (limit reached ! rolling...)" : ""));
        serializable = this.seh.getLocation();
        this.seg.setPreferredSize(new Dimension(n3 + 30, this.seg.getHeight()));
        if (this.sej.isSelected()) {
            SwingUtilities.invokeLater(new few(this));
        }
        this.seh.pack();
        this.seh.setLocation((Point)serializable);
    }

    public void close() {
        this.seh.dispose();
    }

    public boolean requiresLayout() {
        return false;
    }
}

