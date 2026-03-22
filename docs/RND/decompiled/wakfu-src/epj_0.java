/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePj
 */
public final class epj_0
extends ero_0 {
    private static final aox_1 rcW = new enz_0(new eny_0("PA et Pm a consommer", new enx_0("PA a consommer (-1 = tout)", eNA.qYC), new enx_0("PM a consommer (-1 = tout)", eNA.qYC)));
    private int rcX;
    private int rcY;

    @Override
    public aox_1 bEt() {
        return rcW;
    }

    public epj_0() {
        this.bby();
    }

    public epj_0 fDD() {
        epj_0 epj_02 = new epj_0();
        return epj_02;
    }

    @Override
    public void E(QD qD) {
        int n;
        this.rcX = this.bgE.c(exx_2.rGj);
        this.rcY = this.bgE.c(exx_2.rGk);
        if (this.rcX == 0 && this.rcY == 0) {
            return;
        }
        int n2 = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        if (n2 >= 0) {
            this.rcX = Math.min(this.rcX, n2);
        }
        if ((n = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu)) >= 0) {
            this.rcY = Math.min(this.rcY, n);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        if (this.bgE == null) {
            return;
        }
        eoc_0 eoc_02 = eoc_0.a(this.bgJ, new fqO((byte)this.rcX, (byte)this.rcY, 0), this.bgE);
        eoc_02.e(this.bgE);
        eoc_02.a(QF.bhD);
        eoc_02.a(null, false);
    }

    @Override
    public boolean aZE() {
        return true;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDD();
    }
}

