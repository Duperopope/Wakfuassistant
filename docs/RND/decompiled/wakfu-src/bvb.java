/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bvb
implements Comparator<buV> {
    bvb(buW buW2) {
    }

    public int a(buV buV2, buV buV3) {
        return GC.c((long)buV2.cmL(), (long)buV3.cmL());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((buV)object, (buV)object2);
    }
}

