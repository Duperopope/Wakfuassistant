/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ald
 */
public abstract class ald_2
extends ahu_1 {
    protected int cEJ = 0;

    protected void sM(int n) {
        this.cEJ = n;
        for (int i = this.dQL.bTR() - 1; i >= 0; --i) {
            ahq_1 ahq_12 = (ahq_1)this.dQL.vU(i);
            ahq_12.ec(this.sN(ahq_12.bqh()));
        }
    }

    @Override
    protected final boolean sN(int n) {
        return aaE.brU().bg(this.cEJ, n);
    }
}

