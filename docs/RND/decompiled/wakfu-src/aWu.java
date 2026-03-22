/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class aWu
extends aUV {
    private long bhQ;
    private int huR;
    private boolean huS;
    private boolean huT;
    private ym_1 huP;
    private int bap;
    private int baq;
    private int crE;

    public aWu(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long cbk() {
        bgy bgy2 = this.iD(this.bhQ);
        if (bgy2 == null) {
            return 0L;
        }
        bmx_0 bmx_02 = aWt.a(bgy2, this.huP);
        if (bmx_02 == null) {
            return 0L;
        }
        if (this.cWs()) {
            ahv_2 ahv_22;
            bsj_0 bsj_02 = bgy2.dkZ();
            if (bsj_02 != null) {
                bgy2.fgh().a((exP)bgy2, (fqE)bmx_02, (int)((ety_0)bsj_02).baf().bhJ(), bsj_02.b(this.bap, this.baq, this.crE));
            }
            if ((ahv_22 = this.cXm()) != null) {
                hsg.ap(ahv_22.ceL());
            }
            return 0L;
        }
        return 0L;
    }

    @Nullable
    private ahv_2 cXm() {
        bgy bgy2 = this.iD(this.bhQ);
        bmt_0 bmt_02 = bmb_0.eeV().If(this.huR);
        if (bmt_02 == null) {
            dJP.error((Object)("Sort inconnu " + this.huR));
            return null;
        }
        ahv_2 ahv_22 = new ahv_2().ceC().e(aPc.ewv);
        if (bmt_02.eeF() && bgy2.cyi() && !bgy2.bvY()) {
            ahv_22.c(aum_0.cWf().c("fight.spellCast.shadow", new ahv_2().ceu().c(bgy2.aZk()).cev().ceL()));
        } else {
            ahv_22.c(aum_0.cWf().c("fight.spellCast", new ahv_2().ceu().c(bgy2.aZk()).cev().ceL(), new ahv_2().ceu().c(bmt_02.getName()).ceL()));
        }
        ahv_22.ceD();
        if (this.huS) {
            this.b(ahv_22);
        } else if (this.huT) {
            this.a(ahv_22);
        }
        return ahv_22;
    }

    private void a(ahv_2 ahv_22) {
        if (aue_0.cVJ().cVK().bqo() == this.cja().d()) {
            ahv_22.ceu().e(aPc.eww);
            ahv_22.c(" (").c(aum_0.cWf().c("critical.miss", new Object[0])).c(")");
        }
    }

    private void b(ahv_2 ahv_22) {
        if (aue_0.cVJ().cVK().bqo() == this.cja().d()) {
            ahv_22.ceC().e(aPc.eww);
            ahv_22.c(" (").c(aum_0.cWf().c("critical", new Object[0])).c(")");
            ahv_22.ceD();
        }
    }

    public void iG(long l) {
        this.bhQ = l;
    }

    public void Ac(int n) {
        this.huR = n;
    }

    public void fd(boolean bl) {
        this.huS = bl;
    }

    public void fe(boolean bl) {
        this.huT = bl;
    }

    public void a(ym_1 ym_12) {
        this.huP = ym_12;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public void wV(int n) {
        this.crE = n;
    }
}

