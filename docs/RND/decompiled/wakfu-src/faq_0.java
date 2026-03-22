/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from faQ
 */
class faq_0
implements fao_0 {
    private final short rQf;
    private final short rQg;
    private short mgz;
    private short mgA;
    private short mgB;
    private short mgC;

    faq_0(short s, short s2) {
        this.rQf = s;
        this.rQg = s2;
    }

    faq_0(short s, short s2, short s3, short s4, short s5, short s6) {
        this(s, s2);
        this.mgz = s3;
        this.mgA = s4;
        this.mgB = s5;
        this.mgC = s6;
    }

    @Override
    public short bsM() {
        return this.rQf;
    }

    @Override
    public short bsN() {
        return this.rQg;
    }

    @Override
    public short eAq() {
        return this.mgz;
    }

    @Override
    public short eAr() {
        return this.mgA;
    }

    @Override
    public short eAs() {
        return this.mgB;
    }

    @Override
    public short eAt() {
        return this.mgC;
    }

    public boolean c(short s, short s2, short s3, short s4) {
        boolean bl = this.mgz != s || this.mgA != s2 || this.mgB != s3 || this.mgC != s4;
        this.mgz = s;
        this.mgA = s2;
        this.mgB = s3;
        this.mgC = s4;
        return bl;
    }

    public String toString() {
        return "PartitionModel{m_x=" + this.rQf + ", m_y=" + this.rQg + "}";
    }
}

