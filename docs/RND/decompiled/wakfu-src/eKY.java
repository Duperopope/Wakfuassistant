/*
 * Decompiled with CFR 0.152.
 */
public abstract class eKY
implements eLa {
    private final int qFa;
    protected short bol;
    private final byte qFb;

    public eKY(int n) {
        this(n, -1);
    }

    public eKY(int n, byte by) {
        this.qFa = n;
        this.qFb = by;
    }

    @Override
    public byte eDo() {
        return this.qFb;
    }

    @Override
    public int dut() {
        return this.qFa;
    }

    @Override
    public short bfd() {
        return this.bol;
    }
}

