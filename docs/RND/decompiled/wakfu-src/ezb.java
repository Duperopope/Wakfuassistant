/*
 * Decompiled with CFR 0.152.
 */
public class ezb {
    private long aXv;
    private final short poQ;
    private final short poR;
    private final short poS;
    private final short poT;

    public ezb(short s, short s2, short s3, short s4) {
        this.poQ = s;
        this.poS = s2;
        this.poR = s3;
        this.poT = s4;
        this.fmh();
    }

    public ezb(long l) {
        this.aXv = l;
        int n = GC.cy(l);
        int n2 = GC.cz(l);
        this.poQ = GC.mS(n);
        this.poR = GC.mT(n);
        this.poS = GC.mS(n2);
        this.poT = GC.mT(n2);
    }

    public short fmd() {
        return this.poQ;
    }

    public short fme() {
        return this.poS;
    }

    public short fmf() {
        return this.poR;
    }

    public short fmg() {
        return this.poT;
    }

    public long Sn() {
        if (this.aXv == 0L) {
            this.fmh();
        }
        return this.aXv;
    }

    private void fmh() {
        int n = GC.d(this.poQ, this.poR);
        int n2 = GC.d(this.poS, this.poT);
        this.aXv = GC.s(n, n2);
    }

    public String toString() {
        return "GuildBlazon{m_shapeId=" + this.poQ + ", m_symbolId=" + this.poR + ", m_shapeColor=" + this.poS + ", m_symbolColor=" + this.poT + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ezb)) {
            return false;
        }
        ezb ezb2 = (ezb)object;
        return this.aXv == ezb2.aXv;
    }

    public int hashCode() {
        return (int)(this.aXv ^ this.aXv >>> 32);
    }
}

