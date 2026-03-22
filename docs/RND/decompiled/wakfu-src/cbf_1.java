/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbF
 */
class cbf_1
implements ItemListener {
    final /* synthetic */ cbe_2 lJv;

    cbf_1(cbe_2 cbe_22) {
        this.lJv = cbe_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (fbj_1.getInstance().isVisible() == this.lJv.lJu.isSelected()) {
            return;
        }
        fbj_1.getInstance().setVisible(this.lJv.lJu.isSelected());
    }
}

