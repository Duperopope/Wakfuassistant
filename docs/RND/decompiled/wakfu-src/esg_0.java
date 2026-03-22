/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eSG
 */
final class esg_0
implements Comparator<qu_0> {
    esg_0() {
    }

    public int c(qu_0 qu_02, qu_0 qu_03) {
        if (!qu_02.a(exx_2.rGi)) {
            return 1;
        }
        if (!qu_03.a(exx_2.rGi)) {
            return -1;
        }
        pr_0 pr_02 = qu_02.b(exx_2.rGi);
        Float f2 = Float.valueOf((float)pr_02.aYB() / (float)pr_02.aYD() * 100.0f);
        pr_0 pr_03 = qu_03.b(exx_2.rGi);
        Float f3 = Float.valueOf((float)pr_03.aYB() / (float)pr_03.aYD() * 100.0f);
        return -f2.compareTo(f3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((qu_0)object, (qu_0)object2);
    }
}

