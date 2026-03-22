/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQS
 */
public final class eqs_0
extends ero_0 {
    private static final aox_1 rgL = new enz_0(new eny_0("Id de team", new enx_0("Id de team", eNA.qYC)));
    private byte rgM;

    @Override
    public aox_1 bEt() {
        return rgL;
    }

    public eqs_0() {
        this.bby();
    }

    public eqs_0 fFT() {
        eqs_0 eqs_02 = new eqs_0();
        return eqs_02;
    }

    @Override
    public void E(QD qD) {
        this.aQL = -1;
        this.rgM = (byte)-1;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        if (this.aQL == -1) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof ant_1)) {
            this.fHg();
            return;
        }
        this.rgM = ((ant_1)((Object)this.bgF)).bcP();
        ((ant_1)((Object)this.bgF)).az((byte)this.aQL);
    }

    @Override
    public void bbS() {
        if (this.rgM < 0 && !(this.bgF instanceof ant_1)) {
            return;
        }
        ((ant_1)((Object)this.bgF)).az(this.rgM);
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
    public void aVH() {
        this.aQL = -1;
        this.rgM = (byte)-1;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFT();
    }
}

