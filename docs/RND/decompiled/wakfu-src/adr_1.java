/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from aDR
 */
public final class adr_1<T>
implements Comparator<T> {
    private final List<Comparator<T>> dEp = new ArrayList<Comparator<T>>();

    public adr_1(Comparator<T> ... comparatorArray) {
        Collections.addAll(this.dEp, comparatorArray);
    }

    @Override
    public int compare(T t, T t2) {
        for (Comparator<T> comparator : this.dEp) {
            int n = comparator.compare(t, t2);
            if (n == 0) continue;
            return n;
        }
        return 0;
    }
}

