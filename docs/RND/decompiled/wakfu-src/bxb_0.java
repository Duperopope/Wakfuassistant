/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bxb
 */
public abstract class bxb_0
extends bCA
implements bDh {
    long ePP;
    private fnn jAM;
    protected boolean jAN;
    private final fi_1 jAO = new bxc_0(this);

    protected abstract void eZ(ByteBuffer var1);

    @Override
    public final long Xi() {
        return this.ePP;
    }

    @Override
    public boolean dNb() {
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jAM = null;
        this.dQz().dQJ();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.a(RJ.bmu);
        this.ePP = 0L;
        this.dQz().clear();
        this.bmd.reset();
        assert (this.jAM == null);
    }

    @Override
    public boolean dNc() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dNd() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected final fi_1 bey() {
        return this.jAO;
    }

    @Override
    protected fi_1 dNe() {
        return fi_1.oX;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.blg || rw_02 == rw_0.blk || rw_02 == rw_0.blm) {
            this.c(rw_02);
            return true;
        }
        return false;
    }

    @Override
    public final rw_0[] dNf() {
        rw_0[] rw_0Array = this.dNg();
        rw_0[] rw_0Array2 = new rw_0[3 + rw_0Array.length];
        rw_0Array2[0] = rw_0.blk;
        rw_0Array2[1] = rw_0.blg;
        rw_0Array2[2] = rw_0.blm;
        System.arraycopy(rw_0Array, 0, rw_0Array2, 3, rw_0Array.length);
        return rw_0Array2;
    }

    protected abstract rw_0[] dNg();

    @Override
    public final cpm_1[] dNh() {
        cpm_1[] cpm_1Array = this.dNi();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.Xi() != bgt_02.Sn() && !cpq_1.og(this.ePP)) {
            return cpm_1Array;
        }
        cpm_1[] cpm_1Array2 = new cpm_1[3 + cpm_1Array.length];
        cpm_1Array2[0] = cps_1.niU.eLI();
        cpm_1Array2[1] = cps_1.niV.eLI();
        cpm_1Array2[2] = cps_1.niW.eLI();
        System.arraycopy(cpm_1Array, 0, cpm_1Array2, 3, cpm_1Array.length);
        return cpm_1Array2;
    }

    protected abstract cpm_1[] dNi();

    @Override
    public final void a(uu_1 uu_12) {
        throw new UnsupportedOperationException("Pas de persistance des donn\u00e9es des RoomContent dans le client");
    }

    @Override
    public final boolean b(uu_1 uu_12) {
        this.b(new acd_1(uu_12.acO, uu_12.acP, uu_12.acQ));
        this.a(abi_1.wG(uu_12.WR));
        this.jAN = uu_12.aet;
        this.a(uu_12.aev);
        return true;
    }

    protected abstract void a(ox_1 var1);

    @Override
    public void a(fnn fnn2) {
        this.jAM = fnn2;
    }

    @Override
    public bDh dNj() {
        return this;
    }

    @Override
    public bDh dNk() {
        return this;
    }

    @Override
    public boolean bej() {
        return true;
    }

    @Override
    public void a(vs_2 vs_22) {
    }

    @Override
    public boolean dNl() {
        return this.jAN;
    }

    @Override
    public void dNm() {
        abi_1 abi_12 = fda.p(this.bcB());
        this.a(abi_12);
        this.aVQ();
    }

    @Override
    public abi_1 bcB() {
        return super.bcB();
    }

    static /* synthetic */ acd_1 a(bxb_0 bxb_02) {
        return bxb_02.bmd;
    }
}

