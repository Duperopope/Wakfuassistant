/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bqQ
 */
public abstract class bqq_0
implements aoy_1 {
    protected static final Logger jbv = Logger.getLogger(bqq_0.class);
    private final int jbw;

    protected bqq_0(int n) {
        this.jbw = n;
    }

    public abstract void bGy();

    protected abstract void D(ArrayList<amx_1> var1);

    public boolean E(ArrayList<amx_1> arrayList) {
        if (sn_0.a(this, arrayList)) {
            this.D(arrayList);
            return true;
        }
        jbv.error((Object)("L'action client (" + String.valueOf(this.getClass()) + ") n'a pas les param\u00e8tres du bon type id=" + this.jbw));
        return false;
    }

    public int d() {
        return this.jbw;
    }
}

