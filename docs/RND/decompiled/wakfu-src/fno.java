/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public abstract class fno
implements Iterable<fnp> {
    private fnn sIK;
    protected final HashMap<Byte, fnp> sIL = new HashMap();

    protected fno() {
    }

    public void b(fnn fnn2) {
        this.sIK = fnn2;
    }

    public fnn geh() {
        return this.sIK;
    }

    public void a(byte by, fnp fnp2) {
        if (fnp2 != null && this.ha(by)) {
            short[] sArray = this.hb(by);
            fnp2.fp(sArray[0]);
            fnp2.fq(sArray[1]);
            fnp2.hc(by);
            fnp2.a(this);
            this.sIL.put(by, fnp2);
        }
    }

    public fnp gZ(byte by) {
        if (this.ha(by)) {
            return this.sIL.get(by);
        }
        return null;
    }

    @Override
    @NotNull
    public Iterator<fnp> iterator() {
        return this.sIL.values().iterator();
    }

    public fnp gd(int n, int n2) {
        for (Map.Entry<Byte, fnp> entry : this.sIL.entrySet()) {
            fnp fnp2 = entry.getValue();
            if (!fnp2.ge(n, n2)) continue;
            return fnp2;
        }
        return null;
    }

    public void clear() {
        this.sIL.clear();
    }

    public abstract byte gei();

    public abstract boolean ha(byte var1);

    public abstract short[] hb(byte var1);

    public abstract void a(fnq var1);
}

