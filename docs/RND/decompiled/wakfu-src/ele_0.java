/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLe
 */
public class ele_0
extends eKY {
    private short qFq;
    private short qFr;

    public ele_0(int n) {
        super(n);
    }

    public ele_0(int n, byte by) {
        super(n, by);
    }

    public void dX(short s) {
        this.qFq = s;
    }

    public void dY(short s) {
        this.qFr = s;
    }

    @Override
    public short bfd() {
        return (short)(this.fzk() + this.fzj());
    }

    @Override
    public short fzj() {
        return this.qFq;
    }

    @Override
    public short fzk() {
        return this.qFr;
    }
}

