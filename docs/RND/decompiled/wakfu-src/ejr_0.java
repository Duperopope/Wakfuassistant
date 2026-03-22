/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJr
 */
final class ejr_0 {
    private final String qzG;
    private final long qzH;

    ejr_0(String string, long l) {
        this.qzG = string;
        this.qzH = l;
    }

    public String getText() {
        return this.qzG;
    }

    public long bYU() {
        return this.qzH;
    }

    public String toString() {
        return String.format("Entry{text=%s,time=%s}", this.qzG, this.qzH);
    }
}

