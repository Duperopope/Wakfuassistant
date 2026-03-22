/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beg
 */
public abstract class beg_2<T extends beh_2>
implements Iterable<T> {
    private static final Logger hMW = Logger.getLogger(beg_2.class);
    protected final ArrayList<T> hMX = new ArrayList();

    public final boolean dem() {
        return this.hMX.isEmpty();
    }

    public void b(bdj_2 bdj_22, T t) {
        this.a(bdj_22, t);
        this.hMX.add(t);
        ((beh_2)t).p(bdj_22);
    }

    public final T den() {
        if (this.dem()) {
            return null;
        }
        return (T)((beh_2)this.hMX.get(this.hMX.size() - 1));
    }

    public final T b(T t) {
        return this.a(t, true);
    }

    public boolean c(T t) {
        return this.hMX.contains(t);
    }

    @Override
    public final Iterator<T> iterator() {
        return this.hMX.iterator();
    }

    public final T a(T t, boolean bl) {
        if (this.dem()) {
            hMW.error((Object)"changement d'apparance mais liste vide");
            return null;
        }
        T t2 = this.den();
        assert (t2 != null);
        beh_2 beh_22 = null;
        int n = 0;
        Iterator<T> iterator = this.hMX.iterator();
        while (iterator.hasNext()) {
            beh_2 beh_23 = (beh_2)iterator.next();
            if (!beh_23.equals(t)) continue;
            ++n;
            iterator.remove();
            beh_22 = beh_23;
            if (bl) continue;
            break;
        }
        if (n == 0) {
            hMW.info((Object)"Appearance change remove requested, but no entry found for the linked Object");
        }
        return (T)beh_22;
    }

    public void c(bdj_2 bdj_22, T t) {
        this.a(bdj_22, t, true);
    }

    public void a(bdj_2 bdj_22, T t, boolean bl) {
        T t2 = this.den();
        T t3 = this.a(t, bl);
        this.a(t2, t3, bdj_22);
    }

    public void e(bdj_2 bdj_22) {
        this.hMX.clear();
    }

    public int aVo() {
        return this.hMX.size();
    }

    public T deo() {
        return (T)this.b((beh_2)this.hMX.get(0));
    }

    protected abstract void a(bdj_2 var1, T var2);

    public abstract void a(T var1, T var2, bdj_2 var3);

    public void a(bdj_2 bdj_22, beg_2<T> beg_22) {
        this.a(bdj_22, beg_22, (bef_1<T>)null);
    }

    public void a(bdj_2 bdj_22, beg_2<T> beg_22, @Nullable bef_1<T> bef_12) {
        try {
            if (bdj_22 == null) {
                return;
            }
            for (beh_2 beh_22 : this) {
                if (bef_12 != null && !bef_12.a(beh_22)) continue;
                beg_22.b(bdj_22, beh_22.deb());
            }
        }
        catch (Exception exception) {
            hMW.error((Object)("Error while recopying HMIActions of type " + String.valueOf(this) + " : "), (Throwable)exception);
        }
    }
}

