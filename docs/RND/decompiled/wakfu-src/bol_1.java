/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bOL
 */
public class bol_1
implements Comparator<bLd> {
    private static final bol_1 kNG = new bol_1();

    public int a(bLd bLd2, bLd bLd3) {
        return bLd2.tL() - bLd3.tL();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bLd)object, (bLd)object2);
    }
}

