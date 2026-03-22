/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * Renamed from cbg
 */
public class cbg_2
implements acb_0,
afy_0 {
    private final JPanel lIE = new JPanel(new FlowLayout());
    private final JCheckBox lIF = new JCheckBox("Heure:", false);
    private final JSlider lIG = new JSlider(0, 100);

    public cbg_2() {
        this.lIG.setPaintTicks(true);
        this.lIG.setMajorTickSpacing(25);
        this.lIE.add((Component)this.lIF, 0);
        this.lIE.add((Component)this.lIG, 1);
        this.lIF.addActionListener(new cbh_1(this));
    }

    @Override
    public void b(WL wL) {
        acz_0.cgH.a(this);
    }

    @Override
    public void c(WL wL) {
        acz_0.cgH.a(null);
    }

    @Override
    public JComponent bxL() {
        return this.lIE;
    }

    @Override
    public String getName() {
        return "Switch Heure du jour";
    }

    @Override
    public float e(ut_0 ut_02) {
        if (!this.lIF.isSelected()) {
            float f2 = ut_02.bjf();
            this.lIG.setValue((int)f2);
            return f2;
        }
        return this.lIG.getValue();
    }
}

