/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bQR
implements Comparator<bQK> {
    bQR(bQP bQP2) {
    }

    public int a(bQK bQK2, bQK bQK3) {
        return bQK2.ejZ() - bQK3.ejZ();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bQK)object, (bQK)object2);
    }
}

