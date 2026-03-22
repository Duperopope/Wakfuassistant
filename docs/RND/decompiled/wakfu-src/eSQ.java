/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public abstract class eSQ
extends eSS
implements esu_0,
eza_0 {
    private final ete_0 rlv = new ete_0(this);

    eSQ() {
    }

    eSQ(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public boolean fhb() {
        return this.rlv.fhb();
    }

    @Override
    public boolean c(ezz ezz2) {
        return this.rlv.c(ezz2);
    }

    @Override
    public boolean buW() {
        return this.rlv.buW();
    }

    @Override
    public void a(ezz ezz2) {
        this.rlv.a(ezz2);
    }

    @Override
    public void cZG() {
        this.rlv.cZG();
    }

    @Override
    public ezz fgZ() {
        return this.rlv.fgZ();
    }

    @Override
    public short bvy() {
        return 1;
    }

    @Override
    public void b(int n, int n2, short s) {
        this.a(n, n2, s);
        this.bpP();
    }

    @Override
    public void bpP() {
        if (this.baF() || this.baK()) {
            return;
        }
        this.bcW();
        rh_0 rh_02 = this.bbh().bag();
        if (rh_02 != null && this.bcR() && !this.buW()) {
            rh_02.a(this, this.bcC(), this.bcD());
        }
    }
}

