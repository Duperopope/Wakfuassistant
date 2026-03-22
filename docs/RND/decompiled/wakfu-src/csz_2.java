/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from cSz
 */
class csz_2
implements abz_1 {
    final /* synthetic */ csw_2 nFO;

    csz_2(csw_2 csw_22) {
        this.nFO = csw_22;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 32) {
            this.nFO.eOk();
            return true;
        }
        if (keyEvent.getKeyCode() == 27) {
            if (this.nFO.nFG.bVp()) {
                fyw_0.gqw().tl("blindBoxDialog");
            } else {
                this.nFO.eOh();
            }
            return true;
        }
        return false;
    }
}

