/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVR
 */
public final class avr_0
extends aUS {
    private long btF;

    public avr_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void cWv() {
        bsS bsS2 = this.cja();
        bsi_0 bsi_02 = (bsi_0)bsS2;
        bgy bgy2 = bgg_0.dlO().ju(this.btF);
        if (bgy2 == null) {
            dJP.error((Object)("[_FL_] Le fighter inconnu id=" + this.btF + " quitte le fight externe id=" + bsS2.d()));
            return;
        }
        bsi_02.aV(bgy2);
        bgy2.dkS();
        if (bgy2.dmc()) {
            bgg_0.dlO().av(bgy2);
        }
    }

    @Override
    protected void caV() {
    }

    public void eY(long l) {
        this.btF = l;
    }
}

