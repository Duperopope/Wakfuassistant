/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from bOM
 */
class bom_1
implements TObjectProcedure<bKT> {
    public static final bom_1 kNH = new bom_1();
    private ArrayList<bLd> gvU;
    private boolean kNI = true;
    private boolean kNJ = true;
    private boolean kNK = true;

    private bom_1() {
    }

    public void M(ArrayList<bLd> arrayList) {
        this.gvU = arrayList;
        bKU.eca().t(this);
        this.gvU = null;
    }

    public boolean c(bKT bKT2) {
        ejj_0 ejj_02 = ejj_0.dG(bKT2.ghz());
        if (ejj_02 == null) {
            return true;
        }
        switch (ejj_02) {
            case qyI: {
                if (this.kNI) break;
                return true;
            }
            case qyH: {
                if (this.kNJ) break;
                return true;
            }
            case qyF: {
                if (this.kNK) break;
                return true;
            }
            default: {
                return true;
            }
        }
        int n = Integer.MAX_VALUE;
        Optional<eki_0> optional = baj_2.hzf.iJ(aue_0.cVJ().cVO().xl());
        if (optional.isPresent()) {
            int n2 = bKT2.ghA();
            for (int i = 0; i < n2; ++i) {
                bLc bLc2 = (bLc)bKT2.YL(i);
                int n3 = bLc2.ghG();
                for (int j = 0; j < n3; ++j) {
                    bmv_2 bmv_22 = (bmv_2)bLc2.YQ(j);
                    int n4 = bmv_22.dwb();
                    if (!optional.get().tX(bmv_22.cms()) || n4 >= n || n4 > optional.get().PG(bmv_22.cms())) continue;
                    n = n4;
                }
            }
        }
        if (n != Integer.MAX_VALUE) {
            this.gvU.add(new bLd(bKT2, n));
        }
        return true;
    }

    public boolean ehI() {
        return this.kNI;
    }

    public void im(boolean bl) {
        this.kNI = bl;
    }

    public boolean ehJ() {
        return this.kNJ;
    }

    public void in(boolean bl) {
        this.kNJ = bl;
    }

    public boolean ehK() {
        return this.kNK;
    }

    public void io(boolean bl) {
        this.kNK = bl;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((bKT)object);
    }
}

