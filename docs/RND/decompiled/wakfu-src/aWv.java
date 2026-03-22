/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aWv
extends aUU
implements aWw {
    private final aWx huU = new aWx(this);
    private final ero_0 huV;
    private final boolean huW;
    private boolean bXs;
    private int aQL;
    private int huX;
    private int huY;
    private long bhQ;

    public aWv(int n, int n2, int n3, int n4, ero_0 ero_02, boolean bl) {
        super(n, n2, n3, n4);
        this.huV = ero_02;
        this.huW = bl;
        this.f(new bxp_2(this));
        this.xV(aWv.Ad(((enk_0)this.huV.bba()).avZ()));
    }

    public void cXn() {
        bsS bsS2 = this.cja();
        if (this.huV != null) {
            if (bsS2 != null) {
                this.huV.a(bsS2.bbh());
            } else {
                this.huV.a(bas_2.cZC());
            }
        }
    }

    public void cXo() {
        int n;
        this.bXs = true;
        if (this.huV == null) {
            return;
        }
        bsS bsS2 = this.cja();
        if (bsS2 != null) {
            this.huV.a(bsS2.bbh());
        } else {
            this.huV.a(bas_2.cZC());
        }
        if (this.Qy() != 0L) {
            this.huV.dj(this.Qy());
        }
        if (this.bhQ != 0L) {
            this.huV.dk(this.bhQ);
        }
        if (this.huV.bbd() != null) {
            this.fg(this.huV.bbd().Sn());
        }
        if (this.huV.bbc() != null) {
            this.hB(this.huV.bbc().Sn());
        }
        if ((n = this.cXr()) != 0) {
            this.xV(n);
        }
        this.aQL = this.huV.getValue();
        if (this.huV instanceof eov_0) {
            this.huX = ((eov_0)((Object)this.huV)).fCF();
            this.huY = ((eov_0)((Object)this.huV)).fCG();
        } else {
            this.huX = 0;
            this.huY = 0;
        }
    }

    public void dw(boolean bl) {
        this.bXs = bl;
    }

    @Override
    public long Qy() {
        if (this.bXs) {
            return super.Qy();
        }
        if (super.Qy() == Long.MIN_VALUE && this.huV != null && this.huV.bbd() != null) {
            this.fg(this.huV.bbd().Sn());
        }
        return super.Qy();
    }

    @Override
    public long Qw() {
        return this.caQ();
    }

    @Override
    public Optional<Byte> cXp() {
        eNd eNd2 = this.huV.dTh();
        return Optional.ofNullable(eNd2 != null ? Byte.valueOf(eNd2.aJr()) : null);
    }

    @Override
    public long cbk() {
        this.cXo();
        return super.cbk();
    }

    public long cXq() {
        return super.cbk();
    }

    private int cXr() {
        if (this.huV.bba() == null) {
            return 0;
        }
        return ((enk_0)this.huV.bba()).cbj();
    }

    @Override
    public void caV() {
        try {
            this.huU.cXz();
        }
        catch (Exception exception) {
            dJP.error((Object)"Exception levee", (Throwable)exception);
        }
        this.cXs();
        super.caV();
        this.huV.fHB();
    }

    private void cXs() {
        this.huV.bbr();
        QD.baX();
        this.huV.bbD();
        if (this.huW) {
            this.huV.bbM();
            this.huV.a(null, true);
        } else {
            if (this.huV.Ty()) {
                boolean bl = false;
                qu_0 qu_02 = this.huV.bbc();
                boolean bl2 = this.huV.bbC() && !this.huV.bbB();
                boolean bl3 = this.huV.aZD();
                if (bl3 || bl2) {
                    if (qu_02 != null && qu_02.baz() != null) {
                        qu_02.baz().p(this.huV);
                        bl = true;
                    }
                } else if (this.huV.bbd() != null && this.huV.bbd().baz() != null) {
                    this.huV.bbd().baz().p(this.huV);
                    bl = true;
                }
                this.huV.bbF();
                if (!bl) {
                    if (this.huV.bba() != null) {
                        dJP.warn((Object)("Unable to find a valid RunningEffectManager to apply effect d'id " + ((enk_0)this.huV.bba()).aZH()));
                    } else {
                        dJP.warn((Object)("Unable to find a valid RunningEffectManager to apply effect " + String.valueOf(this.huV)));
                    }
                }
            }
            if (this.huV.Ty() && !this.huV.bbY()) {
                this.huV.fHl();
            }
            if (!this.huV.aZQ()) {
                this.huV.a(this.huV.bbm(), false);
            }
        }
    }

    public void kO(String string) {
        if (string != null && !string.isEmpty()) {
            hse.ap(string);
        }
    }

    public void iG(long l) {
        this.bhQ = l;
    }

    private static int Ad(int n) {
        eNg eNg2 = (eNg)enf_0.fBb().pT(n);
        if (eNg2 == null) {
            return -1;
        }
        return eNg2.cbt();
    }

    @Override
    public int cWC() {
        return this.aQL;
    }

    @Override
    public byte cXt() {
        return this.huV.cXt();
    }

    @Override
    public ero_0 cXu() {
        return this.huV;
    }

    @Override
    public acd_1 aZw() {
        Object object;
        if (this.huV instanceof eqc_0 && ((eqc_0)(object = (eqc_0)this.huV)).fFg()) {
            return ((eqc_0)object).fFf();
        }
        object = this.huV.bbd();
        if (object != null) {
            return new acd_1(object.bcC(), object.bcD(), object.bcE());
        }
        return this.huV.bbe();
    }

    @Override
    public acd_1 bbe() {
        acd_1 acd_12 = this.huV.bbe();
        if (acd_12 != null) {
            return acd_12;
        }
        qu_0 qu_02 = this.huV.bbd();
        if (qu_02 != null) {
            return new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        }
        return null;
    }

    @Override
    public acd_1 cXv() {
        qu_0 qu_02 = this.huV.bbc();
        if (qu_02 != null) {
            return new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        }
        dJP.error((Object)"ATTENTION : on veut r\u00e9cup\u00e9rer la position du caster d'un effet mais celui ci est inconnu, \u00e0 d\u00e9faut on renvoie la cellule cible");
        return this.huV.bbe();
    }

    @Override
    public acd_1 cXw() {
        QE qE = this.huV.bbq();
        if (qE == null) {
            return null;
        }
        qu_0 qu_02 = qE.bci();
        if (qu_02 == null) {
            return null;
        }
        return qu_02.aZw();
    }

    @Override
    public int cXx() {
        return this.huX;
    }

    @Override
    public int cXy() {
        return this.huY;
    }

    @Override
    public int caW() {
        if (this.huV != null && this.huV.bba() != null) {
            return ((enk_0)this.huV.bba()).aZH();
        }
        return super.caW();
    }
}

