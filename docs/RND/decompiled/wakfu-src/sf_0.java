/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SF
 */
public class sf_0
implements RX {
    private final long boV;
    private final boolean boW;

    public sf_0(long l) {
        this(l, false);
    }

    public sf_0(long l, boolean bl) {
        this.boW = bl;
        this.boV = l;
    }

    public boolean isValid(RT rT) {
        boolean bl;
        boolean bl2 = bl = rT.LV() == this.boV;
        return this.boW ? !bl : bl;
    }
}

