/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

abstract class abl<T> {
    private final ArrayList<abm<T>> cdj = new ArrayList();
    private final aaz_0<abm<T>> cdk;
    protected final aah_1<T> cdl = new aah_1();

    protected abl(aaz_0<abm<T>> aaz_02) {
        this.cdk = aaz_02;
    }

    public final T rx(int n) {
        return this.cdl.vK(n);
    }

    @Nullable
    public final T ry(int n) {
        return this.cdl.wp(n);
    }

    public final void b(int n, T t) {
        this.cdl.b(n, t);
    }

    public void clear() {
        this.cdl.clear();
    }

    public final void a(float f2, float f3, int n, ArrayList<T> arrayList) {
        T t;
        int n2;
        int n3;
        int n4 = this.cdl.bTR() - n;
        if (n4 <= 0) {
            return;
        }
        this.cdk.aE(f2, f3);
        this.cdj.clear();
        for (n3 = this.cdl.bTR() - 1; n3 >= 0; --n3) {
            n2 = this.cdl.wa(n3);
            t = this.cdl.vU(n3);
            this.cdj.add(new abm<T>(n2, t));
        }
        this.cdj.sort(this.cdk);
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = this.cdj.get((int)n3).cdn;
            t = this.cdj.get((int)n3).cdo;
            assert (t == this.cdl.vK(n2));
            if (arrayList.contains(t)) continue;
            this.cdl.wp(n2);
            this.z(t);
        }
    }

    protected abstract void z(T var1);
}

