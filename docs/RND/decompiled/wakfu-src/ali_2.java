/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ali
 */
public interface ali_2 {
    public float bBu();

    public float bBv();

    default public float bBN() {
        if (this.bBu() == this.bBv()) {
            return this.bBu();
        }
        return GC.b(this.bBu(), this.bBv());
    }
}

