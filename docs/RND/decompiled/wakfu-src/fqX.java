/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fqX {
    protected static final Logger sXa = Logger.getLogger(fqX.class);
    protected final TIntObjectHashMap<fqU> sXb = new TIntObjectHashMap();
    private static final fqX sXc = new fqX();
    private fqW sXd;

    protected fqX() {
    }

    public static fqX gjM() {
        return sXc;
    }

    public void a(fqW fqW2) {
        this.sXd = fqW2;
    }

    public void b(fqU fqU2) {
        if (fqU2 != null) {
            this.sXb.put((int)fqU2.gjy(), (Object)fqU2);
        }
    }

    @Nullable
    public fqU Zr(int n) {
        if (this.sXb.containsKey(n)) {
            return (fqU)this.sXb.get(n);
        }
        fqU fqU2 = this.Al(n);
        if (fqU2 == null) {
            return null;
        }
        this.sXb.put((int)fqU2.gjy(), (Object)fqU2);
        return fqU2;
    }

    public void Zs(int n) {
        if (this.sXd == null) {
            return;
        }
        fqU fqU2 = this.sXd.Al(n);
        if (fqU2 == null) {
            return;
        }
        this.sXb.put((int)fqU2.gjy(), (Object)fqU2);
    }

    @Nullable
    private fqU Al(int n) {
        if (this.sXd == null) {
            return null;
        }
        return this.sXd.Al(n);
    }

    public fqU Zt(int n) {
        short s = fqU.Zl(n);
        return this.Zr(s);
    }
}

