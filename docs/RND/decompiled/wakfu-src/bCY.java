/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public abstract class bCY<T extends bCA>
implements bDh {
    protected final T jJQ;
    private long ePP;
    protected boolean jAN;

    bCY(T t) {
        this.jJQ = t;
    }

    @Override
    public bDb dQz() {
        return ((bCA)this.jJQ).dQz();
    }

    @Override
    public final void a(vs_2 vs_22) {
        this.ePP = vs_22.Ut;
        ((RH)this.jJQ).aZw().Q(vs_22.acO, vs_22.acP, vs_22.acQ);
        ((bCA)this.jJQ).a(abi_1.wG(vs_22.WR));
        this.jAN = vs_22.aet;
    }

    @Override
    public void a(uu_1 uu_12) {
        throw new UnsupportedOperationException("Pas de persistance des donn\u00e9es des RoomContent dans le client");
    }

    @Override
    public final boolean b(uu_1 uu_12) {
        ((bCA)this.jJQ).b(new acd_1(uu_12.acO, uu_12.acP, uu_12.acQ));
        ((bCA)this.jJQ).a(abi_1.wG(uu_12.WR));
        this.a(uu_12.aev);
        this.jAN = uu_12.aet;
        return true;
    }

    protected abstract void a(ox_1 var1);

    @Override
    public int bcC() {
        return ((bCA)this.jJQ).bcC();
    }

    @Override
    public int bcD() {
        return ((bCA)this.jJQ).bcD();
    }

    @Override
    public short bcE() {
        return ((bCA)this.jJQ).bcE();
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
    public boolean beq() {
        return ((RH)this.jJQ).beq();
    }

    @Override
    public long Xi() {
        return this.ePP;
    }

    @Override
    public void aVQ() {
        ((ni_1)this.jJQ).aVQ();
    }

    @Override
    public void a(fnn fnn2) {
    }

    @Override
    public Collection<ng_1> aVG() {
        return ((ni_1)this.jJQ).aVG();
    }

    @Override
    public void ht(boolean bl) {
        ((bCA)this.jJQ).ht(bl);
    }

    @Override
    public final rw_0[] dNf() {
        rw_0[] rw_0Array = ((bCA)this.jJQ).dNf();
        rw_0[] rw_0Array2 = new rw_0[3 + rw_0Array.length];
        rw_0Array2[0] = rw_0.blk;
        rw_0Array2[1] = rw_0.blg;
        rw_0Array2[2] = rw_0.blm;
        System.arraycopy(rw_0Array, 0, rw_0Array2, 3, rw_0Array.length);
        return rw_0Array2;
    }

    @Override
    public final cpm_1[] dNh() {
        cpm_1[] cpm_1Array = ((bCA)this.jJQ).dNh();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.ePP != bgt_02.Sn() && !cpq_1.og(this.ePP)) {
            return cpm_1Array;
        }
        cpm_1[] cpm_1Array2 = new cpm_1[3 + cpm_1Array.length];
        cpm_1Array2[0] = cps_1.niU.eLI();
        cpm_1Array2[1] = cps_1.niV.eLI();
        cpm_1Array2[2] = cps_1.niW.eLI();
        System.arraycopy(cpm_1Array, 0, cpm_1Array2, 3, cpm_1Array.length);
        return cpm_1Array2;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.blg || rw_02 == rw_0.blk || rw_02 == rw_0.blm) {
            ((bCA)this.jJQ).c(rw_02);
            return true;
        }
        return false;
    }

    @Override
    public boolean dNl() {
        return this.jAN;
    }

    @Override
    public void aZp() {
        ((RH)this.jJQ).aZp();
    }

    @Override
    public void dNm() {
        abi_1 abi_12 = fda.p(((RH)this.jJQ).bcB());
        ((bCA)this.jJQ).a(abi_12);
        ((ni_1)this.jJQ).aVQ();
    }

    @Override
    public abi_1 bcB() {
        return ((RH)this.jJQ).bcB();
    }

    @Override
    public boolean c(abi_1 abi_12) {
        return ((RH)this.jJQ).beG().contains(abi_12);
    }
}

