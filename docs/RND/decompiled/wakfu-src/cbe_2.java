/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cbE
 */
public class cbe_2
implements afy_0,
fbl_2 {
    final JCheckBox lJu = new JCheckBox("Xulor", true);

    public cbe_2() {
        this.lJu.addItemListener(new cbf_1(this));
    }

    @Override
    public void b(WL wL) {
        fbj_1.getInstance().a(this);
        this.lJu.setSelected(fbj_1.getInstance().isVisible());
    }

    @Override
    public void c(WL wL) {
        fbj_1.getInstance().b(this);
    }

    @Override
    public JComponent bxL() {
        return this.lJu;
    }

    @Override
    public String getName() {
        return "Display Xulor Scene";
    }

    @Override
    public void a(fbj_1 fbj_12) {
        if (!this.lJu.isSelected()) {
            this.lJu.setSelected(true);
        }
    }

    @Override
    public void b(fbj_1 fbj_12) {
        if (this.lJu.isSelected()) {
            this.lJu.setSelected(false);
        }
    }
}

