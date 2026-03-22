/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from cbD
 */
class cbd_1
extends ComponentAdapter {
    final /* synthetic */ cbc_2 lJt;

    cbd_1(cbc_2 cbc_22) {
        this.lJt = cbc_22;
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        this.lJt.lJs.lJp.setSelected(false);
    }
}

