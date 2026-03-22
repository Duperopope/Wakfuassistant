/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aGf
 */
final class agf_2
implements afw_2 {
    public static final boolean dKx = true;
    private static final Logger dKy = Logger.getLogger(agd_2.class);
    private final ArrayList<afx_2> dKz = new ArrayList();
    private final List<aft_2> dKA = new ArrayList<aft_2>();
    private final List<aft_2> dKB = new ArrayList<aft_2>();
    private aft_2 dKC;

    agf_2() {
    }

    @Override
    public List<aft_2> caZ() {
        return this.dKA;
    }

    @Override
    public void b(aft_2 aft_22) {
        dKy.info((Object)("[FIGHT_DEBUG] On ajoute l'action " + this.e(aft_22) + " au groupe " + String.valueOf(this) + " Stack : " + adu_1.cN(3, 2)));
        aft_22.dM(false);
        this.dKA.add(aft_22);
        this.dKB.add(aft_22);
    }

    @Override
    public aft_2 xS(int n) {
        for (aft_2 aft_22 : this.dKA) {
            if (aft_22.caO() != n) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public aft_2 xU(int n) {
        for (aft_2 aft_22 : this.dKA) {
            if (aft_22.caP() != n) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public aft_2 cQ(int n, int n2) {
        for (aft_2 aft_22 : this.dKA) {
            if (aft_22.avZ() != n2 || aft_22.caP() != n) continue;
            return aft_22;
        }
        return null;
    }

    @Override
    public void a(afx_2 afx_22) {
        this.dKz.add(afx_22);
    }

    @Override
    public void b(afx_2 afx_22) {
        this.dKz.remove(afx_22);
    }

    @Override
    public void cba() {
        if (this.dKA.isEmpty()) {
            this.cbq();
            return;
        }
        this.a(this.dKA.get(0), true);
    }

    @Override
    public void a(aft_2 aft_22, boolean bl) {
        aft_2 aft_23;
        dKy.info((Object)("[FIGHT_DEBUG] On essaie de runner l'action " + this.e(aft_22) + " dans le groupe " + String.valueOf(this)));
        if (!this.dKA.contains(aft_22)) {
            dKy.error((Object)("On essaie d'executer une action qui n'est pas dans le groupe " + this.e(aft_22) + " dans le groupe " + String.valueOf(this)));
            return;
        }
        if (!bl) {
            if (this.dKC == null) {
                this.dKC = aft_22;
            } else {
                int n = this.dKB.indexOf(aft_22);
                int n2 = this.dKB.indexOf(this.dKC);
                if (n2 < n) {
                    this.dKC = aft_22;
                }
            }
        }
        if ((aft_23 = this.dKA.get(0)).caU()) {
            return;
        }
        aft_23.a((afv_2)this);
        this.a(aft_23, "In Group order");
    }

    private void a(aft_2 aft_22, String string) {
        if (aft_22.caU()) {
            dKy.error((Object)("On essaie d'executer une action qui l'a d\u00e9j\u00e0 \u00e9t\u00e9 : " + this.e(aft_22) + " dans le groupe " + String.valueOf(this)));
            return;
        }
        dKy.info((Object)("[FIGHT_DEBUG] RUN ACTION (" + string + ") " + this.e(aft_22)));
        try {
            aft_22.dM(true);
            aft_22.run();
        }
        catch (Throwable throwable) {
            dKy.error((Object)("[_FL_] ACTION FAILURE (" + string + ") " + this.e(aft_22) + " - " + adu_1.a(throwable) + " with " + this.dKA.size() + " when crush"));
            this.a(aft_22);
        }
        dKy.info((Object)("[FIGHT_DEBUG] ACTION COMPLETE (" + string + ") " + this.e(aft_22)));
    }

    private String e(aft_2 aft_22) {
        return aft_22.getClass().getSimpleName() + " : " + aft_22.caO() + " #" + aft_22.hashCode();
    }

    @Override
    public void a(aft_2 aft_22) {
        aft_22.b(this);
        if (this.dKC == aft_22) {
            this.dKC = null;
        }
        this.dKA.remove(aft_22);
        if (this.dKA.isEmpty()) {
            this.cbq();
        } else if (this.dKC == null || this.dKC != aft_22) {
            this.cba();
        }
    }

    @Override
    public void bLI() {
        dKy.info((Object)("Kill des actions de la pile (" + this.caZ().size() + ")"));
        ArrayList<aft_2> arrayList = new ArrayList<aft_2>();
        for (aft_2 aft_22 : this.dKA) {
            aft_22.b(this);
            arrayList.add(aft_22);
        }
        this.dKA.clear();
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
        afx_2[] afx_2Array = new afx_2[this.dKz.size()];
        for (afx_2 afx_22 : this.dKz.toArray(afx_2Array)) {
            afx_22.b(this);
        }
    }

    @Override
    public void cbb() {
        while (!this.dKA.isEmpty()) {
            aft_2 aft_22 = this.dKA.remove(0);
            aft_22.b(this);
            this.a(aft_22, "Executing all actions");
        }
    }

    @Override
    public aft_2 xT(int n) {
        for (aft_2 aft_22 : this.dKA) {
            if (aft_22.caW() != n) continue;
            return aft_22;
        }
        return null;
    }
}

