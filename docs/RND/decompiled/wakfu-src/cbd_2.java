/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cbd
 */
public class cbd_2
implements afy_0 {
    private final JCheckBox lID = new JCheckBox("Shader", false);

    public cbd_2() {
        this.lID.addActionListener(new cbe_1(this));
        this.lID.addItemListener(new cbf_2(this));
    }

    @Override
    public void b(WL wL) {
    }

    @Override
    public void c(WL wL) {
    }

    @Override
    public JComponent bxL() {
        return this.lID;
    }

    @Override
    public String getName() {
        return "Switch M\u00e9t\u00e9o";
    }
}

