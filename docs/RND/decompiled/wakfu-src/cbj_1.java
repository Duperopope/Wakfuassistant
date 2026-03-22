/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from cbj
 */
public class cbj_1
implements afy_0 {
    private final JPanel lII = new JPanel();
    private final JCheckBox lIJ;
    private final JCheckBox lIK;

    public cbj_1() {
        this.lII.setLayout(new BoxLayout(this.lII, 1));
        this.lIK = new JCheckBox("Scene partic.", true);
        this.lIK.addItemListener(new cbk_1(this));
        this.lIK.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.lIJ = new JCheckBox("Xulor partic.", true);
        this.lIJ.addItemListener(new cbl_1(this));
        this.lIJ.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.lII.add(this.lIK);
        this.lII.add(this.lIJ);
    }

    @Override
    public void b(WL wL) {
        this.lIK.setSelected(agZ.bzy().bzz());
        this.lIJ.setSelected(fmw_1.uJG.bzz());
    }

    @Override
    public void c(WL wL) {
    }

    @Override
    public JComponent bxL() {
        return this.lII;
    }

    @Override
    public String getName() {
        return "Switch Particles";
    }
}

