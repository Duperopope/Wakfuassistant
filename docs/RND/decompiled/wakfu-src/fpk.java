/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public final class fpk {
    public static final fpk sNF = new fpk();
    protected static final Logger sNG = Logger.getLogger(fpk.class);
    private final TIntObjectHashMap<foM> sNH = new TIntObjectHashMap();
    private fpj sNI;

    private fpk() {
    }

    public fpj ggi() {
        return this.sNI;
    }

    public void a(fpj fpj2) {
        this.sNI = fpj2;
    }

    public foM M(int n, long l) {
        if (this.sNI != null) {
            return this.sNI.M(n, l);
        }
        return null;
    }

    public boolean e(foM foM2) {
        if (foM2 == null) {
            return false;
        }
        int n = foM2.d();
        foM foM3 = (foM)this.sNH.get(n);
        if (foM3 != null && foM3 != foM2) {
            sNG.error((Object)"Tentative d'\u00e9crase de territoire.");
            return false;
        }
        this.sNH.put(n, (Object)foM2);
        return true;
    }

    public void f(foM foM2) {
        this.sNH.remove(foM2.d());
    }

    public foM Yn(int n) {
        return (foM)this.sNH.get(n);
    }

    public TIntObjectHashMap<foM> ggj() {
        return this.sNH;
    }

    public int[] ggk() {
        return this.sNH.keys();
    }

    public void clear() {
        this.sNH.clear();
    }
}

