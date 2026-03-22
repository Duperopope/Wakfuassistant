/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Os
 */
public class os_0
extends nv_0 {
    private long aZA;
    private long aDh;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aZA);
        azg_12.gK(this.aDh);
        return this.a((byte)6, azg_12.bTe());
    }

    @Override
    public final int d() {
        return 1162;
    }

    public void da(long l) {
        this.aZA = l;
    }

    public void db(long l) {
        this.aDh = l;
    }
}

