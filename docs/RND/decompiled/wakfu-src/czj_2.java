/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZj
 */
public class czj_2
implements adi_1 {
    private static final float[] oaC = new float[]{0.0f, 0.3f, 0.6f, 0.6f};
    private static final float[] oaD = new float[]{1.0f, 0.0f, 0.0f, 0.6f};
    private static final Logger oaE = Logger.getLogger(czj_2.class);
    private static final czj_2 oaF = new czj_2();
    private ffV iWZ;
    protected bgy htx;
    private final aad_0 oaG;
    private final acd_1 oaH = new acd_1();
    private boolean nDW;

    private czj_2() {
        this.oaG = new aad_0("useItemSelectCell", oaC);
    }

    public static czj_2 eYW() {
        return oaF;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void bW(bgy bgy2) {
        this.htx = bgy2;
    }

    public void y(ffV ffV2) {
        this.iWZ = ffV2;
    }

    public ffV getItem() {
        return this.iWZ;
    }

    protected Qk bbf() {
        return this.iWZ;
    }

    private boolean eYX() {
        if (this.iWZ == null || this.htx == null) {
            return false;
        }
        acd_1 acd_12 = this.htx.eap();
        int n = this.oaH.A(acd_12);
        bgv_2 bgv_22 = (bgv_2)this.iWZ.dOg();
        switch (bgv_22.dUu()) {
            case jOF: {
                if (bgv_22.cpn() > n || n > bgv_22.cpo()) {
                    return false;
                }
                return Math.abs(acd_12.bdi() - this.oaH.bdi()) <= this.htx.bvy();
            }
            case jOE: {
                return true;
            }
        }
        return false;
    }

    protected void ah(int n, int n2, short s) {
        cja_0 cja_02 = new cja_0();
        cja_02.mZ(this.iWZ.LV());
        cja_02.a(n, n2, s);
        aue_0.cVJ().etu().d(cja_02);
    }

    protected String eNc() {
        if (this.iWZ == null) {
            return null;
        }
        return (String)this.iWZ.eu("iconUrl");
    }

    private acd_1 q(int n, int n2, boolean bl) {
        return aeO.a(aie_0.cfn().bmC(), n, n2, bl);
    }

    public acd_1 eSj() {
        return new acd_1(this.oaH);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                this.dh(dcm_02.bqM(), dcm_02.bqN());
                return false;
            }
            case 16902: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                if (!dcm_03.fch()) {
                    aue_0.cVJ().b(this);
                    return false;
                }
                if (this.htx != null && this.oaG.F(this.oaH.getX(), this.oaH.getY(), this.oaH.bdi()) && this.eYX()) {
                    int n = this.oaH.getX();
                    int n2 = this.oaH.getY();
                    short s = this.oaH.bdi();
                    if (cvu_1.a(this.htx, this.getItem(), new acd_1(this.oaH))) {
                        if (this.getItem().iterator().hasNext()) {
                            this.ah(n, n2, s);
                        }
                        aPd.f("chat.item.selfUse", aPe.a(this.iWZ));
                    }
                }
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    private boolean dh(int n, int n2) {
        acd_1 acd_12 = this.q(n, n2, true);
        if (acd_12 == null) {
            this.oaH.Q(Integer.MAX_VALUE, Integer.MAX_VALUE, (short)Short.MAX_VALUE);
            this.oaG.bqC();
            return true;
        }
        if (acd_12.equals(this.oaH)) {
            return true;
        }
        this.oaH.C(acd_12);
        this.oaG.bqC();
        if (this.eYX()) {
            this.oaG.q(oaC);
        } else {
            this.oaG.q(oaD);
        }
        if (this.iWZ != null && this.htx != null) {
            this.oaG.E(this.oaH.getX(), this.oaH.getY(), this.oaH.bdi());
        }
        return false;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (this.nDW) {
            return;
        }
        this.nDW = true;
        String string = this.eNc();
        if (string != null) {
            fhn_1.gzT().a(fzo_0.tHz, true);
            fib_2.gBU().a(string, null, 10, -30, faa_2.tLK);
        } else {
            fhn_1.gzT().bYz();
            fib_2.gBU().eKH();
        }
        aam_0 aam_02 = aie_0.cfn().bmC();
        this.dh(aam_02.bqM(), aam_02.bqN());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!this.nDW) {
            return;
        }
        this.oaG.bqC();
        fhn_1.gzT().bYz();
        fib_2.gBU().eKH();
        this.nDW = false;
        this.oaH.Q(Integer.MAX_VALUE, Integer.MAX_VALUE, (short)Short.MAX_VALUE);
    }
}

