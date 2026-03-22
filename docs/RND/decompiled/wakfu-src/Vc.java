/*
 * Decompiled with CFR 0.152.
 */
public abstract class Vc
extends ff_1 {
    protected long aXv = -1L;

    protected Vc(long l) {
        this.aXv = l;
    }

    public void clear() {
        this.aXv = -1L;
    }

    public byte[] apI() {
        return this.a(this.zj());
    }

    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    public String toString() {
        return "GroupGlobalData{m_id=" + this.aXv + "}";
    }
}

