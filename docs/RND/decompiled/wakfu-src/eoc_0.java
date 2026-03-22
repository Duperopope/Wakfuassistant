/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOc
 */
public class eoc_0
extends epe_0 {
    private static final aox_1 raq = new enz_0(new eny_0("Interdit", new enx_0[0]));
    private boolean rar = false;
    private boolean ras = false;

    public eoc_0() {
        this.bby();
    }

    public eoc_0 fBW() {
        eoc_0 eoc_02 = new eoc_0();
        return eoc_02;
    }

    public static eoc_0 a(qm_0<enk_0> qm_02, fqO fqO2, qu_0 qu_02) {
        eoc_0 eoc_02 = new eoc_0();
        eoc_02.o = enf_0.qPB.d();
        eoc_02.bgM = ((ero_0)enf_0.qPB.bkx()).baZ();
        byte by = GC.ct(fqO2.r(exx_2.rGj));
        byte by2 = GC.ct(fqO2.r(exx_2.rGk));
        byte by3 = GC.ct(fqO2.r(exx_2.rGl));
        byte by4 = GC.ct(fqO2.r(exx_2.rGQ));
        eoc_02.f(by, by2, by3, by4);
        eoc_02.bby();
        eoc_02.bgF = qu_02;
        eoc_02.bgO = -1;
        eoc_02.bgJ = qm_02;
        return eoc_02;
    }

    @Override
    public aox_1 bEt() {
        return raq;
    }

    private void f(byte by, byte by2, byte by3, byte by4) {
        this.aQL = by4 << 24 | by3 << 16 | by2 << 8 | by;
    }

    public byte fBX() {
        return (byte)((this.aQL & 0xFF0000) >> 16);
    }

    public byte fBY() {
        return (byte)((this.aQL & 0xFF00) >> 8);
    }

    public byte fBZ() {
        return (byte)(this.aQL & 0xFF);
    }

    public byte fCa() {
        return (byte)((this.aQL & 0xFF000000) >> 24);
    }

    @Override
    public void bby() {
        super.bby();
        if (this.fBZ() > 0) {
            this.oC(55);
        }
        if (this.fBY() > 0) {
            this.oC(65);
        }
        if (this.fBX() > 0) {
            this.oC(60);
        }
        if (this.fCa() > 0) {
            this.oC(73);
        }
        if (this.rar) {
            this.oC(74);
        }
        if (this.ras) {
            if (this.fBY() > 0) {
                this.oC(2188);
            }
            if (this.fBZ() > 0) {
                this.oC(2234);
            }
            if (this.fBX() > 0) {
                this.oC(2263);
            }
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        byte by = this.a(this.fBZ(), exx_2.rGj);
        byte by2 = this.a(this.fBY(), exx_2.rGk);
        byte by3 = this.a(this.fBX(), exx_2.rGl);
        byte by4 = this.a(this.fCa(), exx_2.rGQ);
        this.f(by, by2, by3, by4);
        if (by2 == 0 && by == 0 && by3 == 0) {
            this.mk(true);
        }
    }

    private byte a(byte by, pt_0 pt_02) {
        if (this.bgF != null && by > 0 && this.bgF.a(pt_02)) {
            byte by2 = (byte)this.bgF.c(pt_02);
            this.bgF.b(pt_02).oq(by);
            return (byte)(by2 - this.bgF.c(pt_02));
        }
        return 0;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public boolean Ty() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rar = false;
        this.ras = false;
    }

    public void lX(boolean bl) {
        this.rar = bl;
    }

    public void lY(boolean bl) {
        this.ras = bl;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBW();
    }
}

