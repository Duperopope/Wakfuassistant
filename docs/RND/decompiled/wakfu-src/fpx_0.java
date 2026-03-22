/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/*
 * Renamed from fpx
 */
public class fpx_0 {
    private static final ImmutableList<Integer> sPg = Ordering.natural().immutableSortedCopy((Iterable)Lists.newArrayList((Object[])new Integer[]{30, 31, 32, 33, 34}));
    private int epQ;
    private boolean Na;

    public short ggP() {
        int n = sPg.indexOf((Object)this.epQ);
        int n2 = this.Na ? 1 : 0;
        return GC.cu(n * 2 + n2);
    }

    public static fpx_0 fy(short s) {
        fpx_0 fpx_02 = new fpx_0();
        fpx_02.epQ = (Integer)sPg.get(s / 2);
        fpx_02.Na = s % 2 != 0;
        return fpx_02;
    }

    public void Le(int n) {
        this.epQ = n;
    }

    public int Xt() {
        return this.epQ;
    }

    public void T(boolean bl) {
        this.Na = bl;
    }

    public boolean apo() {
        return this.Na;
    }
}

