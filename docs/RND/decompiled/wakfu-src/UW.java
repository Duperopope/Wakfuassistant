/*
 * Decompiled with CFR 0.152.
 */
public abstract class UW<TCharacter extends UX>
extends ff_1 {
    protected final TCharacter bxt;

    protected UW(TCharacter TCharacter) {
        this.bxt = TCharacter;
    }

    public long KU() {
        if (this.bxt != null) {
            return ((UX)this.bxt).KU();
        }
        return -1L;
    }

    public long aZj() {
        if (this.bxt != null) {
            return ((UX)this.bxt).aZj();
        }
        return -1L;
    }

    public abstract long ae(byte var1);

    public String getName() {
        if (this.bxt != null) {
            return ((UX)this.bxt).getName();
        }
        return "";
    }

    public abstract void af(byte var1);

    @Override
    public fi_1[] zj() {
        return new fi_1[0];
    }

    public abstract void a(byte var1, long var2);

    public TCharacter bkk() {
        return this.bxt;
    }
}

