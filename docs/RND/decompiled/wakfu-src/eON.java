/*
 * Decompiled with CFR 0.152.
 */
public class eON
extends eot_0 {
    protected static final float rcl = 100.0f;

    public eON() {
    }

    public eON(pt_0 pt_02) {
        super(pt_02);
    }

    public eON(pt_0 pt_02, boolean bl) {
        super(pt_02, bl);
    }

    public eON fCE() {
        eON eON2 = new eON();
        eON2.rcf = this.rcf;
        eON2.rcs = this.rcs;
        return eON2;
    }

    @Override
    public void bby() {
        super.bby();
        if (this.rcf == null) {
            return;
        }
        if (this.rcf.aYW() == 0) {
            exx_2 exx_22 = (exx_2)this.rcf;
            if (exx_22.fOJ()) {
                this.oC(exx_22.fOF());
            }
            if (this.rcf == exx_2.rGQ) {
                this.oC(2140);
            }
        }
    }

    @Override
    boolean fBQ() {
        if (super.fBQ()) {
            return true;
        }
        if (this.rcf != exx_2.rGH) {
            return false;
        }
        qu_0 qu_02 = this.fCZ();
        if (!(qu_02 instanceof exP)) {
            return false;
        }
        exP exP2 = (exP)qu_02;
        if (exP2.aFW() != 5) {
            return false;
        }
        return !this.a(eNi.qWI);
    }

    @Override
    protected void d(pr_0 pr_02) {
        this.aQL = pr_02.nt(this.aQL);
    }

    @Override
    void fDc() {
        this.fCZ().b(this.rcf).oq(this.aQL);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCE();
    }
}

