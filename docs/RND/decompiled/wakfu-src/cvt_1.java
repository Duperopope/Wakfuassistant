/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from cVT
 */
final class cvt_1
extends Record {
    final bgi_1 nQZ;
    final bgx_1 nRa;

    private cvt_1(bgi_1 bgi_12, bgx_1 bgx_12) {
        this.nQZ = bgi_12;
        this.nRa = bgx_12;
    }

    static cvt_1 ap(bgt_0 bgt_02) {
        bgi_1 bgi_12 = new bgi_1(bgt_02.dno());
        return new cvt_1(bgi_12, new bgx_1(bgi_12));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cvt_1.class, "searchView;selectionView", "nQZ", "nRa"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cvt_1.class, "searchView;selectionView", "nQZ", "nRa"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cvt_1.class, "searchView;selectionView", "nQZ", "nRa"}, this, object);
    }

    public bgi_1 eUV() {
        return this.nQZ;
    }

    public bgx_1 eUW() {
        return this.nRa;
    }
}

