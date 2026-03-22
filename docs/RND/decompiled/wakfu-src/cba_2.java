/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cbA
 */
public class cba_2
implements afy_0 {
    final JCheckBox lJp;
    final bzs_1 lJq = new byz_2();
    cbo_1 lJr;

    public cba_2() {
        this.lJp = new JCheckBox("M\u00e9t\u00e9o", false);
        this.lJp.addActionListener(new cbb_2(this));
        this.lJp.addItemListener(new cbc_2(this));
    }

    @Override
    public void b(WL wL) {
    }

    @Override
    public void c(WL wL) {
        bzq_1.lCJ.a((bzs_1)null);
    }

    @Override
    public JComponent bxL() {
        return this.lJp;
    }

    @Override
    public String getName() {
        return "Switch M\u00e9t\u00e9o";
    }
}

