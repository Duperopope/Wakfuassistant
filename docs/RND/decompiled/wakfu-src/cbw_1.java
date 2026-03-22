/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbw
 */
class cbw_1
implements ItemListener {
    final /* synthetic */ cbo_1 lJm;

    cbw_1(cbo_1 cbo_12) {
        this.lJm = cbo_12;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl = itemEvent.getStateChange() == 1;
        this.lJm.lJd.iK(bl);
    }
}

