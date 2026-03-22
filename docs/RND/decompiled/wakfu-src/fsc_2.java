/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSC
 */
public class fsc_2
extends fss_2<fsm_1> {
    public fsc_2(fsm_1 fsm_12, fsm_1 fsm_13, fes_2 fes_22, int n, int n2, abn abn2) {
        super(fsm_12, fsm_13, fes_22, n, n2, abn2);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            fsm_1 fsm_12 = (fsm_1)this.veb;
            fsm_1 fsm_13 = (fsm_1)this.vec;
            int n2 = (int)this.tXJ.h(fsm_12.width, fsm_13.width, this.bUi, this.bMn);
            int n3 = (int)this.tXJ.h(fsm_12.height, fsm_13.height, this.bUi, this.bMn);
            this.getWidget().setSize(n2, n3, true);
        }
        return true;
    }

    @Override
    public void cbz() {
        fsm_1 fsm_12 = (fsm_1)this.vec;
        this.getWidget().setSize(fsm_12.width, fsm_12.height, true);
        super.cbz();
    }

    public String toString() {
        return "[ResizeTween] " + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

