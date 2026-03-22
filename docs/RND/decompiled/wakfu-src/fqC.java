/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.TCollections
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.TCollections;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public abstract class fqC<G extends fqB> {
    protected static final Logger sTW = Logger.getLogger(fqC.class);
    private final TIntObjectMap<G> sTX = TCollections.synchronizedMap((TIntObjectMap)new TIntObjectHashMap());
    private static fqC<? extends fqB> sTY;

    protected fqC() {
    }

    public static fqC<? extends fqB> giD() {
        return sTY;
    }

    public void a(G g) {
        this.sTX.put(((fqB)g).giC(), g);
    }

    public G Za(int n) {
        return (G)((fqB)this.sTX.get(n));
    }

    public G Zb(int n) {
        return (G)((fqB)this.sTX.remove(n));
    }

    public void giE() {
        this.sTX.clear();
    }

    public static void a(fqC<? extends fqB> fqC2) {
        sTY = fqC2;
    }
}

