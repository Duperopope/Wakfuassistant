/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ZA<T extends ZC>
implements acu_0,
afZ<aaj_0> {
    protected final ArrayList<T> bUG = new ArrayList();
    protected final ArrayList<T> bUH = new ArrayList();
    protected final ArrayList<T> bUI = new ArrayList();

    @NotNull
    public ArrayList<T> ax(float f2, float f3) {
        this.bUG.clear();
        ArrayList<T> arrayList = this.bUI;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ZC zC = (ZC)arrayList.get(i);
            if (!zC.aA(f2, f3)) continue;
            this.bUG.add(zC);
        }
        return this.bUG;
    }

    @Nullable
    public T ay(float f2, float f3) {
        return ZA.e(this.ax(f2, f3));
    }

    @NotNull
    public ArrayList<T> aX(int n, int n2) {
        this.bUH.clear();
        for (ZC zC : this.bUI) {
            if (zC.bcC() != n || zC.bcD() != n2) continue;
            this.bUH.add(zC);
        }
        return this.bUH;
    }

    @Nullable
    public T aY(int n, int n2) {
        return ZA.e(this.aX(n, n2));
    }

    @Nullable
    private static <T extends ZC> T e(@NotNull ArrayList<T> arrayList) {
        ZC zC = null;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ZC zC2 = (ZC)arrayList.get(i);
            if (zC != null && zC2.bpS() <= zC.bpS()) continue;
            zC = zC2;
        }
        return (T)zC;
    }

    public final void f(ArrayList<? super T> arrayList) {
        int n = this.bUI.size();
        for (int i = 0; i < n; ++i) {
            arrayList.add(this.bUI.get(i));
        }
    }

    @Override
    public final void a(agb agb2, ArrayList<acx_0> arrayList) {
        int n = this.bUI.size();
        for (int i = 0; i < n; ++i) {
            arrayList.add((acx_0)this.bUI.get(i));
        }
    }

    protected void a(T t, int n, int n2, int n3) {
        agX.c(t);
    }

    public void bpg() {
        int n = this.bUI.size();
        for (int i = 0; i < n; ++i) {
            ZC zC = (ZC)this.bUI.get(i);
            zC.bB(zC.bqe());
            zC.bpV();
            zC.bpC();
        }
    }

    public void a(ZH zH) {
        ArrayList<T> arrayList = this.bUI;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ZC zC = (ZC)arrayList.get(i);
            if (zC == zH) continue;
            zC.setSelected(false);
        }
    }

    public final ArrayList<T> bph() {
        return this.bUI;
    }

    public abstract void bpi();
}

