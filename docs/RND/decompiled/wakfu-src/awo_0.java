/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWO
 */
public final class awo_0
extends aUS {
    private byte ebP;
    private byte[] hvI;
    private byte[] hvJ;
    private long btF;
    private tw_0 hvK;

    public awo_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void cWv() {
        bgy bgy2;
        bsj_0 bsj_02 = (bsj_0)this.cja();
        Object t = fcL.rUh.sw(this.btF);
        bgy bgy3 = bgg_0.dlO().ju(this.btF);
        if (bgy3 == null) {
            if (t == null) {
                dJP.error((Object)("Impossible d'ajouter le joueur " + this.btF + " au combat " + bsj_02.d() + " : ce fighter n'existe pas"));
                return;
            }
            bgg_0.dlO().aq((bgy)t);
            bgy2 = (bgy)t;
        } else {
            bgy2 = bgy3;
        }
        if (bgy2 == aue_0.cVJ().cVK()) {
            return;
        }
        if (this.hvK != null) {
            bgy2.c(this.hvK);
        }
        bsj_02.b(bgy2, this.ebP, false);
        this.a(bgy2, this.hvJ, this.hvI);
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.bd(bgy2.bcP());
        crt_2.c(bsj_02, bgy2);
        aJP.cig().a(bgy2, bsj_02.d());
        if (bdj_22.dZ("AnimApparition")) {
            bdj_22.a(new aWP(this, bdj_22, bgy2));
            btn_0.bx(bgy2);
            bdj_22.dT("AnimApparition");
        } else {
            btn_0.bx(bgy2);
            bdj_22.i(bgy2.bcB());
            bdj_22.bd(bgy2.bcP());
        }
    }

    private void a(bgy bgy2, byte[] byArray, byte[] byArray2) {
        if (bgy2 == null) {
            return;
        }
        bgy2.a((bsj_0)this.cja(), byArray, byArray2);
    }

    @Override
    protected void caV() {
    }

    public void az(byte by) {
        this.ebP = by;
    }

    public void dO(byte[] byArray) {
        this.hvI = byArray;
    }

    public void dP(byte[] byArray) {
        this.hvJ = byArray;
    }

    public void eY(long l) {
        this.btF = l;
    }

    public void c(tw_0 tw_02) {
        this.hvK = tw_02;
    }
}

