/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cbC
 */
class cbc_2
implements ItemListener {
    final /* synthetic */ cba_2 lJs;

    cbc_2(cba_2 cba_22) {
        this.lJs = cba_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl = itemEvent.getStateChange() == 1;
        bzq_1.lCJ.a(bl ? this.lJs.lJq : null);
        if (bl) {
            if (this.lJs.lJr == null) {
                this.lJs.lJr = cbo_1.a(this.lJs.lJq, false);
            }
            this.lJs.lJr.addComponentListener(new cbd_1(this));
            this.lJs.lJr.setVisible(true);
            this.lJs.lJr.setLocation(this.lJs.lJp.getLocationOnScreen());
        } else {
            this.lJs.lJr.close();
        }
    }
}

