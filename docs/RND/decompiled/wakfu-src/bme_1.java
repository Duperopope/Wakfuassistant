/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bME
 */
public final class bme_1
implements Comparator<bmt_0> {
    public int a(bmt_0 bmt_02, bmt_0 bmt_03) {
        return bmt_02.cvD() - bmt_03.cvD();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmt_0)object, (bmt_0)object2);
    }
}

