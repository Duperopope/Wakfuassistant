/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbl
 */
class cbl_1
implements ItemListener {
    cbl_1(cbj_1 cbj_12) {
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        fmw_1.uJG.cr(itemEvent.getStateChange() == 1);
    }
}

