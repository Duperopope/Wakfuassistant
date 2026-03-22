/*
 * Decompiled with CFR 0.152.
 */
public class JF {
    private boolean aBn;
    private long aKB;

    public boolean aPj() {
        return this.aBn;
    }

    public void aA(boolean bl) {
        this.aBn = bl;
    }

    public long aPk() {
        return this.aKB;
    }

    public void cG(long l) {
        this.aKB = l;
    }

    public String toString() {
        return "EpsHeader{m_compressed=" + this.aBn + ", m_length=" + this.aKB + "}";
    }
}

