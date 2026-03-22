/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from afw
 */
public class afw_0
implements afy_0 {
    private final JCheckBox cqr;
    private final JCheckBox cqs;
    private final JPanel cqt = new JPanel();
    private aaj_0 bRH;

    public afw_0() {
        this.cqt.setLayout(new BoxLayout(this.cqt, 1));
        this.cqr = new JCheckBox("Cellule walkable", false);
        this.cqr.addItemListener(itemEvent -> {
            if (this.bRH != null) {
                this.bRH.bQ(itemEvent.getStateChange() == 1);
            }
        });
        this.cqr.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.cqs = new JCheckBox("Voir partitions", false);
        this.cqs.addItemListener(itemEvent -> {
            if (this.bRH != null) {
                this.bRH.bR(itemEvent.getStateChange() == 1);
            }
        });
        this.cqs.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.cqt.add(this.cqr);
        this.cqt.add(this.cqs);
    }

    @Override
    public void b(WL wL) {
        this.bRH = wL.bmC();
        this.cqr.setSelected(this.bRH.brd());
        this.cqs.setSelected(this.bRH.bre());
    }

    @Override
    public void c(WL wL) {
    }

    @Override
    public JComponent bxL() {
        return this.cqt;
    }

    @Override
    public String getName() {
        return "Afficher Walkabilit\u00e9";
    }
}

