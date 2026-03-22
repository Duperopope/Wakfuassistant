/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aBo
 */
public final class abo_2 {
    public static final abo_2 dyC = new abo_2();
    protected static final Logger dyD = Logger.getLogger(abo_2.class);
    private final Object dyE = new Object();
    private final TIntObjectHashMap<abq_2> dyF = new TIntObjectHashMap();

    private abo_2() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(abn_2 abn_22) {
        if (abn_22 == null) {
            return;
        }
        Object object = this.dyE;
        synchronized (object) {
            int n = abn_22.d();
            abq_2 abq_22 = (abq_2)this.dyF.get(n);
            if (abq_22 == null) {
                abq_22 = new abq_2(n);
                this.dyF.put(n, (Object)abq_22);
            } else {
                ++abq_22.dvq;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(abn_2 abn_22) {
        if (abn_22 == null) {
            return;
        }
        Object object = this.dyE;
        synchronized (object) {
            int n = abn_22.d();
            abq_2 abq_22 = (abq_2)this.dyF.get(n);
            if (abq_22 != null) {
                ArrayList<Runnable> arrayList = abq_22.bVa();
                if (abq_22.dvq <= 0) {
                    this.dyF.remove(n);
                    this.r(arrayList);
                    this.q(arrayList);
                } else {
                    --abq_22.dvq;
                }
            }
        }
    }

    private void q(ArrayList<Runnable> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Runnable runnable = arrayList.get(i);
            if (runnable == null) continue;
            abg_2.bUP().i(runnable);
        }
    }

    private void r(ArrayList<Runnable> arrayList) {
        if (!this.dyF.isEmpty()) {
            this.dyF.forEachEntry((TIntObjectProcedure)new abp_2(this, arrayList));
        }
    }

    public void a(Runnable runnable, abn_2 ... abn_2Array) {
        if (abn_2Array == null) {
            return;
        }
        if (runnable == null) {
            return;
        }
        boolean bl = false;
        for (abn_2 abn_22 : abn_2Array) {
            int n = abn_22.d();
            abq_2 abq_22 = (abq_2)this.dyF.get(n);
            if (abq_22 == null) continue;
            bl = true;
            abq_22.k(runnable);
        }
        if (!bl) {
            runnable.run();
        }
    }
}

