/*
 * Decompiled with CFR 0.152.
 */
public final class abk {
    public static final abk cdg = new abk();
    public static final int cdh = 19067;
    private byte cdi = 1;

    private abk() {
    }

    public byte bsX() {
        return this.cdi;
    }

    public void aq(byte by) {
        this.cdi = by;
    }

    public boolean ar(byte by) {
        return (this.cdi & by) == 0;
    }
}

