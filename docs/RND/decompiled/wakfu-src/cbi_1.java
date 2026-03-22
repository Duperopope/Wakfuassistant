/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cbi
 */
public class cbi_1
implements afy_0 {
    private final JCheckBox lIH = new JCheckBox("Limit Zoom", false);

    public cbi_1() {
        this.lIH.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == 1) {
                aeQ.bwP().bwQ();
            } else {
                aUQ aUQ2 = aue_0.cVJ().cVO();
                if (aUQ2 != null && evm_2.b(aUQ2.cWq(), evn_2.ote)) {
                    aeQ.bwP().bwR();
                }
            }
        });
    }

    @Override
    public void b(WL wL) {
    }

    @Override
    public void c(WL wL) {
    }

    @Override
    public JComponent bxL() {
        return this.lIH;
    }

    @Override
    public String getName() {
        return "Limit Max Zoom";
    }
}

