/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cIy
 */
public abstract class ciy_1<T extends fsd_0> {
    private final ArrayList<fsX> ndU = new ArrayList();
    protected final T ndV;

    protected ciy_1(T t) {
        this.ndV = t;
    }

    public boolean eLg() {
        return !this.ndU.isEmpty();
    }

    public ArrayList<fsX> eLh() {
        return this.ndU;
    }

    public void T(ArrayList<fsX> arrayList) {
        this.ndU.addAll(arrayList);
    }

    public T eLi() {
        return this.ndV;
    }

    public abstract ciz_1 eLe();

    public abstract void b(fst var1);

    public abstract void d(cie_1 var1);

    public abstract void c(cie_1 var1);

    public final void f(cie_1 cie_12) {
        this.c(cie_12);
    }

    protected void e(cie_1 cie_12) {
        this.c(cie_12);
    }

    public void g(cie_1 cie_12) {
        this.e(cie_12);
        for (fsX fsX2 : this.eLh()) {
            if (fsX2.glC() != fsY.teK) continue;
            cie_12.g(fsX2.eLi());
        }
    }

    public acc_1 eLj() {
        return this.ndV.gli();
    }

    public fbz_0 ekD() {
        return this.ndV.ekD();
    }
}

