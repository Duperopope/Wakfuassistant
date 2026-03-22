/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbk
 */
class cbk_1
implements ItemListener {
    cbk_1(cbj_1 cbj_12) {
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        agZ.bzy().cr(itemEvent.getStateChange() == 1);
    }
}

