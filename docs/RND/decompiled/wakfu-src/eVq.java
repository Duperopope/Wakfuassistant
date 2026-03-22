/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class eVq
implements Comparator<eST> {
    eVq() {
    }

    public int a(eST eST2, eST eST3) {
        acd_1 acd_12 = eST2.aZw();
        acd_1 acd_13 = eST3.aZw();
        return acd_12.getX() - acd_13.getX() + (acd_12.getY() - acd_13.getY());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eST)object, (eST)object2);
    }
}

