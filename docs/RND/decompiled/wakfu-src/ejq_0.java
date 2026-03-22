/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJq
 */
final class ejq_0 {
    private final String qzD;
    private final ejn_0 qzE;
    private final long qzF;

    ejq_0(String string, ejn_0 ejn_02, long l) {
        this.qzD = string == null ? "" : string;
        this.qzE = ejn_02;
        this.qzF = l;
    }

    public boolean a(ejq_0 ejq_02) {
        return this.qzD.equals(ejq_02.qzD) && this.qzE == ejq_02.qzE;
    }

    public long bYU() {
        return this.qzF;
    }

    public String toString() {
        return String.format("Action{recipientName=%s,actionType=%s,time=%s", this.qzD, this.qzE.name(), this.qzF);
    }
}

