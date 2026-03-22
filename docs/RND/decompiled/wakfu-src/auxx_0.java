/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUXX
 */
public class auxx_0
extends aUV {
    private final bgy hsj;
    private final bth_0 hsk;

    public auxx_0(int n, int n2, int n3, int n4, long l, bth_0 bth_02) {
        super(n, n2, n3, n4);
        this.hsj = this.iD(l);
        this.hsk = bth_02;
    }

    @Override
    protected long cbk() {
        if (this.hsj == null) {
            return 0L;
        }
        if (!this.hsj.dkO()) {
            return 0L;
        }
        bdj_2 bdj_22 = this.hsj.ddI();
        return bdj_22.b(this.hsk);
    }
}

