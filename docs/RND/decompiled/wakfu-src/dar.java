/*
 * Decompiled with CFR 0.152.
 */
public class dar
extends daq {
    private final boolean ocg;
    private final boolean och;

    public dar(boolean bl, boolean bl2) {
        this.ocg = bl;
        this.och = bl2;
    }

    public boolean eZK() {
        return this.ocg;
    }

    public boolean eZL() {
        return this.och;
    }

    @Override
    public int d() {
        return 18920;
    }
}

