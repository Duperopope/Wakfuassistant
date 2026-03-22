/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fau
 */
class fau_0
implements fat_0 {
    private final long rPv;
    private final long rPw;

    fau_0(long l, long l2) {
        this.rPv = l;
        this.rPw = l2;
    }

    @Override
    public long evy() {
        return this.rPw;
    }

    @Override
    public long Lx() {
        return this.rPv;
    }

    public String toString() {
        return "BuildingElementModel{m_uid=" + this.rPv + "}";
    }
}

