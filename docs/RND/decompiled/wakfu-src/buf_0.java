/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buF
 */
class buf_0 {
    private final short jqn;
    private final byte jqo;
    private final int jqp;

    protected buf_0(short s, byte by, int n) {
        this.jqn = s;
        this.jqo = by;
        this.jqp = n;
    }

    public short aWP() {
        return this.jqn;
    }

    public byte aWO() {
        return this.jqo;
    }

    public int dJk() {
        return this.jqp;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        buf_0 buf_02 = (buf_0)object;
        if (this.jqn != buf_02.jqn) {
            return false;
        }
        if (this.jqo != buf_02.jqo) {
            return false;
        }
        return this.jqp == buf_02.jqp;
    }

    public int hashCode() {
        int n = this.jqn;
        n = 31 * n + this.jqo;
        n = 31 * n + this.jqp;
        return n;
    }

    public String toString() {
        return "Definition{m_breedId=" + this.jqn + ", m_sex=" + this.jqo + ", m_smileyEnumId=" + this.jqp + "}";
    }
}

