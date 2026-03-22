/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbv
 */
class cbv_1
implements ItemListener {
    final /* synthetic */ cbo_1 lJl;

    cbv_1(cbo_1 cbo_12) {
        this.lJl = cbo_12;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl = itemEvent.getStateChange() == 1;
        this.lJl.lJd.az(!bl);
    }
}

