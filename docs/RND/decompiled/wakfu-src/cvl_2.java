/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from cVL
 */
class cvl_2
implements abz_1 {
    final /* synthetic */ cvj_2 nQy;

    cvl_2(cvj_2 cvj_22) {
        this.nQy = cvj_22;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 27) {
            if (this.nQy.nQv && this.nQy.nQs.dyi()) {
                cfd_2.selectChoice(null, this.nQy.nQs.dyf().get(0));
            } else {
                this.nQy.eUH();
            }
        }
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return false;
    }
}

