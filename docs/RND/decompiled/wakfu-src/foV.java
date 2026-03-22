/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class foV<TProtector extends foP> {
    protected static final Logger sNb = Logger.getLogger(foV.class);
    private final TIntObjectHashMap<TProtector> sNc = new TIntObjectHashMap();
    final List<foY<? super TProtector>> sNd = new ArrayList<foY<? super TProtector>>();
    private final List<foY<? super TProtector>> sNe = new ArrayList<foY<? super TProtector>>();

    protected foV() {
    }

    public void a(foY<? super TProtector> foY2) {
        if (!this.sNd.contains(foY2)) {
            this.sNd.add(foY2);
        }
    }

    public void b(foY<? super TProtector> foY2) {
        this.sNe.add(foY2);
    }

    private void gfY() {
        this.sNd.removeAll(this.sNe);
        this.sNe.clear();
    }

    public boolean b(TProtector TProtector) {
        int n = ((foP)TProtector).d();
        foP foP2 = (foP)this.sNc.get(n);
        if (foP2 != null && foP2 != TProtector) {
            sNb.error((Object)("Un protecteur avec cet ID (" + n + ") est d\u00e9j\u00e0 pr\u00e9sent enregistr\u00e9, et n'est pas celui-ci."));
            return false;
        }
        if (((foP)TProtector).gfS() == null) {
            sNb.error((Object)("Tentative d'enregistrement d'un protecteur avec des donn\u00e9es incorrectes : " + String.valueOf(TProtector)));
            return false;
        }
        this.sNc.put(n, TProtector);
        try {
            this.gfY();
            int n2 = this.sNd.size();
            for (int i = 0; i < n2; ++i) {
                this.sNd.get(i).h(TProtector);
            }
            this.gfY();
        }
        catch (Exception exception) {
            sNb.error((Object)("Exception lev\u00e9e par un observer lors de l'enregistrement d'un protecteur (ID=" + n + ")"), (Throwable)exception);
        }
        return true;
    }

    public void a(fpd<? super TProtector> fpd2, Collection<? super TProtector> collection) {
        this.sNc.forEachEntry((TIntObjectProcedure)new foW(this, fpd2, collection));
    }

    @Nullable
    public TProtector Ym(int n) {
        return (TProtector)((foP)this.sNc.get(n));
    }

    public void clear() {
        if (!this.sNd.isEmpty()) {
            this.gfY();
            this.sNc.forEachValue((TObjectProcedure)new foX(this));
            this.gfY();
        }
        this.sNc.clear();
    }

    public TIntObjectIterator<TProtector> gfZ() {
        return this.sNc.iterator();
    }

    public TProtector gga() {
        ArrayList arrayList = new ArrayList(this.sNc.valueCollection());
        return (TProtector)((foP)arrayList.get(GC.mR(arrayList.size())));
    }
}

