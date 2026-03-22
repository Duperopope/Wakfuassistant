/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aJE
implements Comparator<bgy> {
    aJE() {
    }

    public int a(bgy bgy2, bgy bgy3) {
        return bgy3.getName().compareTo(bgy2.getName());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgy)object, (bgy)object2);
    }
}

