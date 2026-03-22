/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aJG
implements Comparator<bgy> {
    private final Comparator[] ebE = new Comparator[]{aJC.ebA, aJC.ebC, aJC.ebB};

    aJG() {
    }

    public int a(bgy bgy2, bgy bgy3) {
        int n = 0;
        int n2 = 0;
        while (n2 == 0 && n < this.ebE.length) {
            n2 = this.ebE[n++].compare(bgy2, bgy3);
        }
        return n2;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgy)object, (bgy)object2);
    }
}

