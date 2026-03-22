/*
 * Decompiled with CFR 0.152.
 */
public class aWG
extends aUU {
    private final byte[] hvy;
    private final long hvz;
    private final long hvA;
    private ero_0 hsl;

    public aWG(int n, int n2, int n3, int n4, QD<enk_0, eNl> qD, long l, long l2, byte[] byArray) {
        super(n, n2, n4, n3);
        this.hvy = byArray;
        this.hvz = l2;
        this.hvA = l;
    }

    @Override
    public long cbk() {
        bgy bgy2 = this.iD(this.hvz);
        if (bgy2 != null && bgy2.doc() != null) {
            this.hsl = (ero_0)bgy2.doc().dm(this.hvA);
        }
        if (this.hsl != null) {
            this.hsl.dr(this.hvy);
            if (this.hsl.bbd() != null) {
                this.fg(this.hsl.bbd().Sn());
            }
            if (this.hsl.bbc() != null) {
                this.hB(this.hsl.bbc().Sn());
            }
            this.hsl.bbr();
        }
        return super.cbk();
    }

    @Override
    protected void caV() {
        if (this.hsl == null) {
            return;
        }
        if (!this.hsl.fCn()) {
            return;
        }
        if (this.hsl.bbq() != null) {
            this.hsl.bbq().q(this.hsl);
        } else {
            this.hsl.fHB();
        }
    }

    public int cWC() {
        return this.hsl.getValue();
    }
}

