/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aGd
 */
final class agd_2
implements afw_2 {
    public static final boolean dKs = false;
    private static final Logger dKt = Logger.getLogger(agd_2.class);
    private final Collection<afx_2> dKu = new ArrayList<afx_2>();
    private final LinkedList<aft_2> dKv = new LinkedList();

    agd_2() {
    }

    public LinkedList<aft_2> cbo() {
        return this.dKv;
    }

    @Override
    public void b(aft_2 aft_22) {
        this.dKv.add(aft_22);
    }

    public aft_2 xW(int n) {
        aft_2 aft_22 = this.xS(n);
        if (aft_22 != null) {
            this.dKv.remove(aft_22);
        }
        return aft_22;
    }

    @Override
    public aft_2 xS(int n) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.caO() != n) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public aft_2 cQ(int n, int n2) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.avZ() != n2 || aft_22.caP() != n) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public aft_2 xU(int n) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.caP() != n) continue;
            return aft_22;
        }
        return null;
    }

    public aft_2 xX(int n) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.Qy() != (long)n) continue;
            return aft_22;
        }
        return null;
    }

    public Iterable<Long> cbp() {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (aft_2 aft_22 : this.dKv) {
            long l = aft_22.Qy();
            if (l == Long.MIN_VALUE || arrayList.contains(l)) continue;
            arrayList.add(l);
        }
        return arrayList;
    }

    public aft_2 N(int n, int n2, int n3) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.Qy() != (long)n || aft_22.caP() != n2 || aft_22.avZ() != n3) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public void a(afx_2 afx_22) {
        this.dKu.add(afx_22);
    }

    @Override
    public void b(afx_2 afx_22) {
        this.dKu.remove(afx_22);
    }

    @Override
    public void cba() {
        if (this.dKv == null || this.dKv.isEmpty()) {
            this.cbq();
            return;
        }
        aft_2 aft_22 = this.dKv.getFirst();
        this.a(aft_22, true);
    }

    @Override
    public void a(aft_2 aft_22, boolean bl) {
        if (this.dKv != null && this.dKv.contains(aft_22)) {
            aft_2 aft_23;
            Iterator iterator = this.dKv.iterator();
            while (iterator.hasNext() && (aft_23 = (aft_2)iterator.next()) != aft_22) {
                if (aft_23.caU()) continue;
                if (bl) {
                    aft_23.a((afv_2)this);
                } else {
                    iterator.remove();
                }
                this.a(aft_23, "Forced execution");
            }
        }
        if (bl) {
            aft_22.a((afv_2)this);
        } else {
            this.xW(aft_22.caO());
        }
        this.a(aft_22, "In Group order");
    }

    private void a(aft_2 aft_22, String string) {
        try {
            aft_22.dM(true);
            aft_22.run();
        }
        catch (Throwable throwable) {
            dKt.error((Object)("[_FL_] ACTION FAILURE (" + string + ") " + agd_2.e(aft_22) + " - with " + this.dKv.size() + " when crush"), throwable);
            this.a(aft_22);
        }
    }

    private static String e(aft_2 aft_22) {
        return aft_22.getClass().getSimpleName() + " : " + aft_22.caO() + " #" + aft_22.hashCode();
    }

    @Override
    public void a(aft_2 aft_22) {
        aft_22.b(this);
        this.xW(aft_22.caO());
        this.cba();
    }

    @Override
    public void bLI() {
        dKt.info((Object)("Kill des actions de la pile (" + this.dKv.size() + ")"));
        ArrayList<aft_2> arrayList = new ArrayList<aft_2>();
        for (aft_2 aft_22 : this.dKv) {
            aft_22.b(this);
            arrayList.add(aft_22);
        }
        this.dKv.clear();
        for (aft_2 aft_22 : arrayList) {
            if (aft_22 instanceof aga_2) {
                int n = ((aga_2)aft_22).cbl();
                if (n == -1) continue;
                afs_1.can().xG(n);
                continue;
            }
            if (!(aft_22 instanceof agb_1)) continue;
            agb_1 agb_12 = (agb_1)aft_22;
            abb_2.bUA().b(agb_12);
        }
        this.cbq();
    }

    private void cbq() {
        for (afx_2 afx_22 : this.dKu.toArray(new afx_2[this.dKu.size()])) {
            afx_22.b(this);
        }
    }

    @Override
    public void cbb() {
        while (!this.dKv.isEmpty()) {
            aft_2 aft_22 = this.dKv.remove();
            aft_22.b(this);
            this.a(aft_22, "Executing all actions");
        }
    }

    @Override
    public aft_2 xT(int n) {
        for (aft_2 aft_22 : this.dKv) {
            if (aft_22.caW() != n) continue;
            return aft_22;
        }
        return null;
    }

    public /* synthetic */ List caZ() {
        return this.cbo();
    }
}

