/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class fsQ<T> {
    private static final Logger tey = Logger.getLogger(fsQ.class);
    private final ArrayList<fsX> tez = new ArrayList();
    protected final T teA;

    protected fsQ(T t) {
        this.teA = t;
    }

    protected final void m(fsd_0 fsd_02) {
        this.a(new ftd_0(fsd_02));
    }

    protected final void a(fsX fsX2) {
        for (fsX fsX3 : this.tez) {
            if (!fsX3.b(fsX2)) continue;
            return;
        }
        this.tez.add(fsX2);
    }

    public final ArrayList<fsX> glx() {
        return this.tez;
    }

    public final fsX a(fsY fsY2) {
        for (int i = 0; i < this.tez.size(); ++i) {
            if (this.tez.get(i).glC() != fsY2) continue;
            return this.tez.get(i);
        }
        return null;
    }

    public final boolean gly() {
        return !this.tez.isEmpty();
    }

    public final boolean b(fsY fsY2) {
        for (int i = 0; i < this.tez.size(); ++i) {
            if (this.tez.get(i).glC() != fsY2) continue;
            return true;
        }
        return false;
    }

    protected void glz() {
        this.tez.clear();
    }
}

