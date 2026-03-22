/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

public class fnz
extends fnp {
    static final int sJB = 28;
    private boolean sJC = false;
    private ffV sJD;
    private ffV sJE;

    public void geA() {
        if (this.sJD != null) {
            this.sJC = true;
        }
    }

    public boolean geB() {
        return this.sJC;
    }

    public ffV nF(boolean bl) {
        if (bl) {
            return this.sJD;
        }
        return this.sJE;
    }

    public Optional<fnB> geC() {
        if (this.sJD == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(fnB.Xq(this.sJD.avr()));
    }

    public static boolean dg(ffV ffV2) {
        if (ffV2 == null) {
            return false;
        }
        if (ffV2.dOg() == null) {
            return false;
        }
        return fnB.Xq(ffV2.avr()) != null;
    }

    public fnA m(ffV ffV2, boolean bl) {
        if (ffV2 == null) {
            return fnA.sJO;
        }
        if (this.sJD != null) {
            return fnA.sJG;
        }
        if (!fnz.dg(ffV2)) {
            return fnA.sJH;
        }
        if (bl) {
            this.sJD = ffV2;
        }
        return fnA.sJF;
    }

    public fnA w(boolean bl, boolean bl2) {
        if (bl) {
            if (this.sJC) {
                return fnA.sJM;
            }
            if (this.sJE != null) {
                return fnA.sJJ;
            }
            if (this.sJD == null) {
                return fnA.sJI;
            }
            if (!this.geo()) {
                return fnA.sJL;
            }
            if (bl2) {
                this.sJD = null;
            }
            return fnA.sJF;
        }
        if (this.sJE == null) {
            return fnA.sJI;
        }
        if (bl2) {
            this.sJE = null;
        }
        return fnA.sJF;
    }

    public fnA a(boolean bl, ffV ffV2, boolean bl2) {
        if (bl) {
            if (this.sJE != null) {
                return fnA.sJJ;
            }
            if (bl2) {
                this.sJD = ffV2;
            }
        } else {
            if (fnB.Xq(this.sJD.avr()) != fnB.Xq(ffV2.avr())) {
                return fnA.sJP;
            }
            if (this.sJE != null) {
                return fnA.sJJ;
            }
            if (bl2) {
                this.sJE = ffV2;
            }
        }
        return fnA.sJF;
    }

    @Override
    public boolean b(fnH fnH2, int n, int n2) {
        if (this.sJD == null) {
            return false;
        }
        if (!this.gen().contains(fnH2) && this.f(fnH2)) {
            return false;
        }
        return super.b(fnH2, n, n2);
    }

    public boolean f(fnH fnH2) {
        fnJ fnJ2 = fnH2.dOh();
        ArrayList<fnH> arrayList = this.a(fnJ2);
        int n = fnJ2.sKu * this.geD();
        return arrayList.size() >= n;
    }

    private int geD() {
        int n = 0;
        if (this.sJD != null) {
            ++n;
        }
        if (this.sJE != null) {
            ++n;
        }
        return n;
    }

    @Override
    protected yl_2 gep() {
        uq_1 uq_12 = new uq_1();
        uq_12.acW = this.sJC;
        uq_12.acX = this.sJD != null ? this.sJD.avr() : -1;
        uq_12.acY = this.sJD != null ? this.sJD.LV() : -1L;
        uq_12.acZ = this.sJE != null ? this.sJE.avr() : -1;
        uq_12.ada = this.sJE != null ? this.sJE.LV() : -1L;
        return uq_12;
    }

    private ffV Xp(int n) {
        Object r = fgD.fXh().Vd(n);
        if (r != null) {
            ffV ffV2 = ffV.k(r);
            ffV2.ak((short)1);
            return ffV2;
        }
        return null;
    }

    @Override
    protected void a(yl_2 yl_22) {
        ffV ffV2;
        Object r;
        uq_1 uq_12 = (uq_1)yl_22;
        this.sJC = uq_12.acW;
        this.aZp();
        if (uq_12.acX != -1) {
            r = fgD.fXh().Vd(uq_12.acX);
            ffV2 = ffV.a(uq_12.acY, r);
            if (!fnz.dg(ffV2)) {
                sIM.error((Object)("La gemme primaire n'est pas un item de la bonne cat\u00e9gorie (refItemId=" + uq_12.acX + "), on la remplace par la gemme par d\u00e9faut"));
                ffV2.aZp();
                this.sJD = this.Xp(fnB.geF().dut());
            } else {
                this.sJD = ffV2;
                this.sJD.ak((short)1);
            }
        } else {
            this.sJD = null;
        }
        if (uq_12.acZ != -1) {
            if (uq_12.acZ != uq_12.acX) {
                sIM.error((Object)"Le type de gemme secondaire n'est pas le meme que le type primaire, on r\u00e9initialise cette gemme");
                uq_12.acZ = uq_12.acX;
            }
            if (!fnz.dg(ffV2 = ffV.a(uq_12.ada, r = fgD.fXh().Vd(uq_12.acZ)))) {
                sIM.error((Object)("La gemme secondaire n'est pas un item de la bonne cat\u00e9gorie (refItemId=" + uq_12.acZ + "), on la remplace par la gemme par d\u00e9faut"));
                ffV2.aZp();
                this.sJE = this.Xp(this.sJD.avr());
            } else {
                this.sJE = ffV2;
                this.sJE.ak((short)1);
            }
        } else {
            this.sJE = null;
        }
    }

    @Override
    public boolean ge(int n, int n2) {
        if (n >= this.cox && n < this.cox + 6) {
            return n2 >= this.coy && n2 < this.coy + 6;
        }
        return false;
    }

    public void aZp() {
        if (this.sJD != null) {
            this.sJD.aZp();
            this.sJD = null;
        }
        if (this.sJE != null) {
            this.sJE.aZp();
            this.sJE = null;
        }
    }
}

