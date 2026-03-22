/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from afv
 */
class afv_0
implements ItemListener {
    final /* synthetic */ afu_0 cqq;

    afv_0(afu_0 afu_02) {
        this.cqq = afu_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (this.cqq.cqp == null) {
            return;
        }
        boolean bl = itemEvent.getStateChange() == 1;
        this.cqq.cqp.bmE().dt(bl);
    }
}

