/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from acH
 */
public class ach_0 {
    protected acG[] chk;
    protected final ArrayList<acG> chl = new ArrayList(300);
    int bap;
    int baq;

    public final void bp(int n, int n2) {
        this.bap = n * 18;
        this.baq = n2 * 18;
    }

    protected final int btP() {
        return this.bap;
    }

    protected final int btQ() {
        return this.baq;
    }

    final acG t(int n, int n2, int n3) {
        try {
            int n4 = this.u(n, n2, n3);
            if (n4 < 0) {
                return null;
            }
            if (n4 >= this.chk.length) {
                return null;
            }
            return this.chk[n4];
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final int u(int n, int n2, int n3) {
        return n - this.bap + (n2 - this.baq + n3 * 18) * 18;
    }

    final void d(apl_1 apl_12) {
        this.bap = apl_12.aIz() * 18;
        this.baq = apl_12.aIz() * 18;
        this.chk = ach_0.a(this.chl, 324, apl_12);
    }

    final void cm(float f2) {
        int n = this.chl.size();
        for (int i = 0; i < n; ++i) {
            this.chl.get(i).ck(f2);
        }
    }

    final void cn(float f2) {
        int n = this.chl.size();
        for (int i = 0; i < n; ++i) {
            this.chl.get(i).cl(f2);
        }
    }

    public static acG[] a(ArrayList<acG> arrayList, int n, apl_1 apl_12) {
        arrayList.clear();
        ach_0.a(arrayList, apl_12);
        return ach_0.b(arrayList, n, apl_12);
    }

    private static void a(ArrayList<acG> arrayList, apl_1 apl_12) {
        int n = apl_12.aIz() & 0xFFFF;
        for (int i = 0; i < n; ++i) {
            boolean bl = apl_12.bFS();
            int n2 = apl_12.aIA();
            int n3 = apl_12.aIA();
            int n4 = apl_12.aIA();
            acG acG2 = new acG(n2, n3, n4, bl);
            arrayList.add(acG2);
        }
    }

    private static acG[] b(ArrayList<acG> arrayList, int n, apl_1 apl_12) {
        short s = apl_12.aIz();
        int n2 = apl_12.aIz();
        acG[] acGArray = new acG[n * s];
        for (int i = 0; i < n2; ++i) {
            int n3 = apl_12.bFO();
            int n4 = apl_12.bFO();
            acGArray[n3] = arrayList.get(n4);
        }
        return acGArray;
    }
}

