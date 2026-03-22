/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from afs
 */
public class afs_0
implements afy_0,
axp_1 {
    private final JCheckBox cqn = new JCheckBox("Lights", false);

    public afs_0() {
        this.cqn.addItemListener(new aft_0(this));
    }

    @Override
    public void b(WL wL) {
        this.cqn.setSelected(acq_0.cge.btz());
    }

    @Override
    public void c(WL wL) {
    }

    @Override
    public JComponent bxL() {
        return this.cqn;
    }

    @Override
    public String getName() {
        return "Switch Lights";
    }

    @Override
    public void cl(boolean bl) {
        this.cqn.setSelected(bl);
    }
}

