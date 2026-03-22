/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aIu
implements Comparator<ZH> {
    aIu() {
    }

    public int a(ZH zH, ZH zH2) {
        if (zH.bpS() < zH2.bpS()) {
            return 1;
        }
        if (zH.bpS() > zH2.bpS()) {
            return -1;
        }
        return 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ZH)object, (ZH)object2);
    }
}

