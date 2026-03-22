/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class fpe<P extends foP> {
    protected static final Logger sNv = Logger.getLogger(fpe.class);
    protected final wk_2 sNw = new wk_2();
    private foU<P> sNx;

    protected fpe() {
    }

    public wk_2 ggf() {
        return this.sNw;
    }

    public void a(foU<P> foU2) {
        this.sNx = foU2;
    }

    private void k(P p2) {
        this.sNw.clear();
        this.sNw.aif = ((foP)p2).d();
    }

    private void l(P p2) {
        wv_1 wv_12;
        fjo_0 fjo_02 = ((foP)p2).gfQ();
        this.sNw.aig = wv_12 = new wv_1();
        wv_12.aiR = fjo_02 != null ? fjo_02.Xt() : -1;
        fjo_0 fjo_03 = ((foP)p2).gfR();
        wv_12.aiS = fjo_03 != null ? fjo_03.Xt() : -1;
        foM foM2 = ((foP)p2).gfS();
        wv_12.aiT = foM2 != null ? foM2.d() : -1;
        this.b(p2, wv_12);
    }

    private byte[] ggg() {
        return this.a(this.sNw);
    }

    public byte[] a(wk_2 wk_22) {
        int n = wk_22.DN();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        wk_22.aF(byteBuffer);
        return byteBuffer.array();
    }

    public byte[] m(P p2) {
        this.k(p2);
        this.l(p2);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        this.sNw.aip = new xb_2();
        this.a(p2, this.sNw.aip);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        this.sNw.aij = new wx_1();
        this.b(p2, this.sNw.aij);
        this.sNw.ais = new wo_1();
        this.a(p2, this.sNw.ais);
        return this.ggg();
    }

    public byte[] n(P p2) {
        this.k(p2);
        this.l(p2);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        this.sNw.aip = new xb_2();
        this.a(p2, this.sNw.aip);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        this.sNw.aij = new wx_1();
        this.b(p2, this.sNw.aij);
        this.sNw.ais = new wo_1();
        this.a(p2, this.sNw.ais);
        return this.ggg();
    }

    public byte[] o(P p2) {
        this.k(p2);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        return this.ggg();
    }

    public byte[] p(P p2) {
        this.k(p2);
        this.sNw.aii = new wm_2();
        this.b(p2, this.sNw.aii);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.aik = new wt_1();
        this.b(p2, this.sNw.aik);
        this.sNw.ail = new xh_1();
        this.b(p2, this.sNw.ail);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        this.sNw.aij = new wx_1();
        this.b(p2, this.sNw.aij);
        this.sNw.aio = new xj_1();
        this.b(p2, this.sNw.aio);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        this.sNw.ais = new wo_1();
        this.a(p2, this.sNw.ais);
        return this.ggg();
    }

    public byte[] q(P p2) {
        this.k(p2);
        this.l(p2);
        this.sNw.aii = new wm_2();
        this.b(p2, this.sNw.aii);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.aij = new wx_1();
        this.b(p2, this.sNw.aij);
        this.sNw.ail = new xh_1();
        this.b(p2, this.sNw.ail);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        this.sNw.aio = new xj_1();
        this.b(p2, this.sNw.aio);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        this.sNw.ais = new wo_1();
        this.a(p2, this.sNw.ais);
        return this.ggg();
    }

    public byte[] r(P p2) {
        this.k(p2);
        this.l(p2);
        this.sNw.aii = new wm_2();
        this.b(p2, this.sNw.aii);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.aij = new wx_1();
        this.b(p2, this.sNw.aij);
        this.sNw.ail = new xh_1();
        this.b(p2, this.sNw.ail);
        this.sNw.ain = new xd_1();
        this.b(p2, this.sNw.ain);
        this.sNw.aio = new xj_1();
        this.b(p2, this.sNw.aio);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        this.sNw.aim = new xc_2();
        this.b(p2, this.sNw.aim);
        this.sNw.ais = new wo_1();
        this.a(p2, this.sNw.ais);
        return this.ggg();
    }

    public byte[] s(P p2) {
        this.k(p2);
        this.l(p2);
        this.sNw.aii = new wm_2();
        this.b(p2, this.sNw.aii);
        this.sNw.aih = new wl_1();
        this.b(p2, this.sNw.aih);
        this.sNw.aiq = new wr_1();
        this.b(p2, this.sNw.aiq);
        this.sNw.air = new wz_1();
        this.b(p2, this.sNw.air);
        return this.ggg();
    }

    public P gq(ByteBuffer byteBuffer) {
        if (this.sNx == null) {
            throw new UnsupportedOperationException("La factory de protecteur doit \u00eatre d\u00e9finie");
        }
        P p2 = this.sNx.HB(-1);
        if (p2 != null) {
            this.a(byteBuffer, p2);
        }
        return p2;
    }

    public int gr(ByteBuffer byteBuffer) {
        this.sNw.clear();
        this.sNw.aG(byteBuffer);
        return this.sNw.aif;
    }

    public void a(ByteBuffer byteBuffer, P p2) {
        wo_1 wo_12;
        wz_1 wz_12;
        wr_1 wr_12;
        xb_2 xb_22;
        xj_1 xj_12;
        xd_1 xd_12;
        xc_2 xc_22;
        xh_1 xh_12;
        wt_1 wt_12;
        Object object;
        Object object2;
        Object object3;
        this.sNw.clear();
        this.sNw.aG(byteBuffer);
        ((foP)p2).lK(this.sNw.aif);
        wv_1 wv_12 = this.sNw.aig;
        if (wv_12 != null) {
            object3 = fjt.syH.WG(wv_12.aiR);
            object2 = fjt.syH.WG(wv_12.aiS);
            object = fpk.sNF.Yn(wv_12.aiT);
            ((foP)p2).r((fjo_0)object3);
            ((foP)p2).s((fjo_0)object2);
            ((foP)p2).d((foM)object);
            this.a(p2, wv_12);
        }
        if ((object3 = this.sNw.aih) != null) {
            try {
                this.a(p2, (wl_1)object3);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize appearance", (Throwable)exception);
            }
        }
        if ((object2 = this.sNw.aii) != null) {
            try {
                this.a(p2, (wm_2)object2);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize challenges", (Throwable)exception);
            }
        }
        if ((object = this.sNw.aij) != null) {
            try {
                this.a(p2, (wx_1)object);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize referenceMerchantInventories", (Throwable)exception);
            }
        }
        if ((wt_12 = this.sNw.aik) != null) {
            try {
                this.a(p2, wt_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize inventories", (Throwable)exception);
            }
        }
        if ((xh_12 = this.sNw.ail) != null) {
            try {
                this.a(p2, xh_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize wallet", (Throwable)exception);
            }
        }
        if ((xc_22 = this.sNw.aim) != null) {
            try {
                this.a(p2, xc_22);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize stake", (Throwable)exception);
            }
        }
        if ((xd_12 = this.sNw.ain) != null) {
            try {
                this.a(p2, xd_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize taxes", (Throwable)exception);
            }
        }
        if ((xj_12 = this.sNw.aio) != null) {
            try {
                this.a(p2, xj_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize modifiers", (Throwable)exception);
            }
        }
        if ((xb_22 = this.sNw.aip) != null) {
            try {
                this.b(p2, xb_22);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize satisfaction", (Throwable)exception);
            }
        }
        if ((wr_12 = this.sNw.aiq) != null) {
            try {
                this.a(p2, wr_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize monsterTargets", (Throwable)exception);
            }
        }
        if ((wz_12 = this.sNw.air) != null) {
            try {
                this.a(p2, wz_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize resourceTargets", (Throwable)exception);
            }
        }
        if ((wo_12 = this.sNw.ais) != null) {
            try {
                this.b(p2, wo_12);
            }
            catch (Exception exception) {
                sNv.error((Object)"Exception during unserialize ecosystem", (Throwable)exception);
            }
        }
        this.c(p2);
    }

    public abstract void b(P var1, xc_2 var2);

    public abstract void a(P var1, xc_2 var2);

    public abstract void b(P var1, wv_1 var2);

    public abstract void a(P var1, wv_1 var2);

    public abstract void b(P var1, wm_2 var2);

    public abstract void a(P var1, wm_2 var2);

    public abstract void b(P var1, wl_1 var2);

    public abstract void a(P var1, wl_1 var2);

    public abstract void b(P var1, wx_1 var2);

    public abstract void a(P var1, wx_1 var2);

    public abstract void b(P var1, wt_1 var2);

    public abstract void a(P var1, wt_1 var2);

    public abstract void b(P var1, xh_1 var2);

    public abstract void a(P var1, xh_1 var2);

    public abstract void b(P var1, xd_1 var2);

    public abstract void a(P var1, xd_1 var2);

    public abstract void b(P var1, xj_1 var2);

    public abstract void a(P var1, xj_1 var2);

    protected abstract void b(P var1, wz_1 var2);

    protected abstract void a(P var1, wz_1 var2);

    protected abstract void b(P var1, wr_1 var2);

    protected abstract void a(P var1, wr_1 var2);

    protected abstract void b(P var1, xb_2 var2);

    protected abstract void a(P var1, xb_2 var2);

    protected abstract void b(P var1, wo_1 var2);

    protected abstract void a(P var1, wo_1 var2);

    protected abstract void c(P var1);
}

