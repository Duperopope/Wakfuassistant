/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from afr
 */
class afr_0
extends JPanel {
    final JTextField cql;
    final JLabel cqm = new JLabel("fps");

    afr_0() {
        super(new FlowLayout(0, 0, 0), true);
        this.cql = new JTextField();
        this.cql.setEnabled(false);
        this.cql.setDisabledTextColor(Color.BLACK);
        this.cql.setHorizontalAlignment(4);
        this.cql.setPreferredSize(new Dimension(40, 20));
        this.add(this.cql);
        this.add(this.cqm);
    }
}

