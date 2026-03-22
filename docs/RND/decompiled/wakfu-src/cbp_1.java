/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from cbp
 */
class cbp_1
extends WindowAdapter {
    final /* synthetic */ cbo_1 lJf;

    cbp_1(cbo_1 cbo_12) {
        this.lJf = cbo_12;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.lJf.egh();
    }
}

