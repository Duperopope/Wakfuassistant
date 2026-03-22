/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class eJy<Checker extends eJE, Observer extends eJz> {
    protected static final Logger qzX = Logger.getLogger(eJy.class);
    @Deprecated
    protected final Checker qzY;
    protected Observer qzZ;
    protected final fgj_0 qAa = new fgj_0();

    protected eJy(Checker Checker) {
        this.qzY = Checker;
    }

    public long exS() {
        return GC.cw(this.qAa.exS());
    }

    public boolean pK(long l) {
        return this.pM(l) && this.qAa.pK(l);
    }

    public boolean pL(long l) {
        return this.pN(l) && this.qAa.tt(l);
    }

    public void a(Observer Observer) {
        if (this.qzZ != null) {
            throw new UnsupportedOperationException("Listener already SET");
        }
        this.qzZ = Observer;
        this.qAa.a((fgK)Observer);
    }

    public void fxm() {
        this.qzZ = null;
        this.qAa.a(null);
    }

    public boolean pM(long l) {
        return ((eJE)this.qzY).b(this.qAa, l);
    }

    public boolean pN(long l) {
        return ((eJE)this.qzY).c(this.qAa, l);
    }

    public void clear() {
        this.qAa.ts(0L);
    }

    public abstract boolean isFull();
}

