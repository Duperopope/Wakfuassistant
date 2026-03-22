/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bON
 */
public class bon_1
implements Comparator<bLd> {
    private static final bon_1 kNL = new bon_1();

    public int a(bLd bLd2, bLd bLd3) {
        return bLd2.ecu().ghz() - bLd3.ecu().ghz();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bLd)object, (bLd)object2);
    }
}

