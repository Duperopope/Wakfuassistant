/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from afu
 */
public class afu_0
implements afy_0,
axp_1 {
    private final JCheckBox cqo = new JCheckBox("VSync", false);
    WL cqp;

    public afu_0() {
        this.cqo.addItemListener(new afv_0(this));
    }

    @Override
    public void b(WL wL) {
        this.cqp = wL;
        wL.bmE().a(this);
        this.cqo.setSelected(wL.bmE().bRe());
    }

    @Override
    public void c(WL wL) {
        this.cqp = null;
        wL.bmE().b(this);
    }

    @Override
    public JComponent bxL() {
        return this.cqo;
    }

    @Override
    public String getName() {
        return "Switch VSync";
    }

    @Override
    public void cl(boolean bl) {
        this.cqo.setSelected(bl);
    }
}

