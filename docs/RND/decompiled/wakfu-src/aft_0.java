/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from aft
 */
class aft_0
implements ItemListener {
    aft_0(afs_0 afs_02) {
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        acq_0.cge.bZ(itemEvent.getStateChange() == 1);
    }
}

