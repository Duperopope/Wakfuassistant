/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bNU
implements Comparator<bNP> {
    static final Comparator<bNP> kJw = new bNU();

    private bNU() {
    }

    public int a(bNP bNP2, bNP bNP3) {
        int n;
        int n2 = bNP2.wp();
        if (n2 == (n = bNP3.wp())) {
            String string = aum_0.cWf().a(151, (long)bNP2.cjd(), new Object[0]);
            String string2 = aum_0.cWf().a(151, (long)bNP3.cjd(), new Object[0]);
            return string.compareTo(string2);
        }
        return n2 - n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bNP)object, (bNP)object2);
    }
}

