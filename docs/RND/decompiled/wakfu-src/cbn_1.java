/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from cbn
 */
class cbn_1
extends JPanel {
    private final JTextField lIM = this.x("perso", 0);
    private final JTextField lIN = this.x("souris", 1);

    cbn_1() {
        super(new GridBagLayout(), true);
    }

    private JTextField x(String string, int n) {
        JTextField jTextField = new JTextField();
        jTextField.setEnabled(false);
        jTextField.setDisabledTextColor(Color.BLACK);
        jTextField.setHorizontalAlignment(2);
        jTextField.setPreferredSize(new Dimension(170, 18));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = n;
        gridBagConstraints.weightx = 0.0;
        this.add((Component)new JLabel(string), gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        this.add((Component)jTextField, gridBagConstraints);
        return jTextField;
    }

    private void a(JTextField jTextField, acd_1 acd_12, Long l) {
        if (acd_12 == null) {
            jTextField.setText("null");
        } else {
            bze_2 bze_22;
            Object object = String.format("%s, %s, %s", acd_12.getX(), acd_12.getY(), acd_12.bdi());
            if (l != null) {
                object = (String)object + " @" + l;
            }
            if ((bze_22 = (bze_2)bzj_2.eqi().aF(acd_12.getX(), acd_12.getY())) != null) {
                object = (String)object + String.format(" (P %s, %s)", bze_22.getX(), bze_22.getY());
            }
            jTextField.setText((String)object);
        }
    }

    void a(acd_1 acd_12, long l) {
        this.a(this.lIM, acd_12, l);
    }

    void Y(acd_1 acd_12) {
        this.a(this.lIN, acd_12, null);
    }
}

