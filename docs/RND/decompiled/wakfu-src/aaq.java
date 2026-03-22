/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aaq
implements Comparator<aap> {
    aaq() {
    }

    public int a(aap aap2, aap aap3) {
        return aap2.compareTo(aap3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aap)object, (aap)object2);
    }
}

