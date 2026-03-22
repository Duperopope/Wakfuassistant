/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class ZB<T extends ZH>
extends ZA<T> {
    public int az(float f2, float f3) {
        int n = 0;
        ArrayList arrayList = this.bUI;
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            ZH zH = (ZH)arrayList.get(i);
            if (zH.aA(f2, f3)) {
                zH.setSelected(true);
                ++n;
                continue;
            }
            zH.setSelected(false);
        }
        return n;
    }

    protected void a(T t, aaj_0 aaj_02) {
        if (!((ZC)t).bql()) {
            return;
        }
        acb_1 acb_12 = agi.b(aaj_02, t);
        int n = GC.A(acb_12.aPY);
        int n2 = GC.A(acb_12.aPZ);
        int n3 = agi.a((afV)aaj_02, ((ZC)t).bpX());
        if (n != ((ZC)t).getScreenX() || n2 != ((ZC)t).getScreenY() || n3 != ((ZC)t).bng()) {
            ((ZC)t).qu(n);
            ((ZC)t).qv(n2);
            ((ZC)t).qw(n3);
            ((ZC)t).bqm();
        }
    }
}

