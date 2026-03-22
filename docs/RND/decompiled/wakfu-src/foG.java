/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

public abstract class foG {
    protected static final Logger sMa = Logger.getLogger(foG.class);
    protected static final float sMb = 0.05f;
    protected static final float sMc = 0.05f;
    protected final foP sMd;
    protected final TIntHashSet sMe;
    protected final TIntHashSet sMf;

    protected foG(foP foP2) {
        this.sMd = foP2;
        this.sMe = new TIntHashSet();
        this.sMf = new TIntHashSet();
    }

    public boolean XV(int n) {
        return this.sMe.contains(n);
    }

    public boolean XW(int n) {
        return this.sMf.contains(n);
    }

    public boolean XX(int n) {
        this.sMe.add(n);
        return true;
    }

    public boolean XY(int n) {
        this.sMf.add(n);
        return true;
    }

    public boolean XZ(int n) {
        this.sMe.remove(n);
        return true;
    }

    public boolean Ya(int n) {
        this.sMf.remove(n);
        return true;
    }

    public abstract boolean Hy(int var1);

    public abstract boolean Hz(int var1);

    public abstract boolean a(exP var1, int var2);

    public abstract boolean b(exP var1, int var2);

    public TIntHashSet gfH() {
        return this.sMe;
    }

    public TIntHashSet gfI() {
        return this.sMf;
    }
}

