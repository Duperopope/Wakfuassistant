/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class foM<T extends fpi<?>> {
    protected static final Logger sMr = Logger.getLogger(foM.class);
    private int o;
    private long aHT;
    private foP sMd;
    private T sMs;

    protected foM(int n, long l) {
        this.o = n;
        this.aHT = l;
    }

    public int d() {
        return this.o;
    }

    protected void lK(int n) {
        this.o = n;
    }

    public long aqZ() {
        return this.aHT;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    public T gfO() {
        return this.sMs;
    }

    protected void a(T t) {
        this.sMs = t;
    }

    @Nullable
    public foP doW() {
        return this.sMd;
    }

    public void f(foP foP2) {
        this.sMd = foP2;
    }

    public String toString() {
        return "AbstractTerritory {id=" + this.o + ", protector=" + (this.sMd != null ? Integer.valueOf(this.sMd.d()) : null) + "}";
    }
}

