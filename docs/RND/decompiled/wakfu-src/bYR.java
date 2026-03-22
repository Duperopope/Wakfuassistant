/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class bYR {
    public static final bYR lBo = new bYR();
    private static final int lBp = 4;
    private static final long lBq = 5000L;
    private static final int lBr = 4;
    private static final long lBs = 5000L;
    private static final int lBt = 10;
    private final LinkedList<azx_1<Integer, Long>> lBu = new LinkedList();

    public static bYR epA() {
        return lBo;
    }

    public bYR() {
        for (int i = 0; i < 10; ++i) {
            this.lBu.add(new azx_1<Integer, Long>(0, 0L));
        }
    }

    private boolean z(int n, long l) {
        azx_1 azx_12;
        if (this.lBu.get(3).aHI() + 5000L > l) {
            return true;
        }
        int n2 = 0;
        Iterator iterator = this.lBu.iterator();
        while (iterator.hasNext() && (Long)(azx_12 = (azx_1)iterator.next()).aHI() + 5000L >= l) {
            if ((Integer)azx_12.getFirst() != n) continue;
            ++n2;
        }
        return n2 + 1 >= 4;
    }

    public boolean JF(int n) {
        return this.A(n, System.currentTimeMillis());
    }

    private boolean A(int n, long l) {
        this.B(n, l);
        return this.z(n, l);
    }

    private void B(int n, long l) {
        azx_1<Integer, Long> azx_12 = this.lBu.removeLast();
        azx_12.Q(n);
        azx_12.N(l);
        this.lBu.addFirst(azx_12);
    }
}

