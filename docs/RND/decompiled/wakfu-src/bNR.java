/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class bNR
implements Comparator<bNS> {
    static final Comparator<bNS> kIW = new bNR();

    private bNR() {
    }

    public int a(bNS bNS2, bNS bNS3) {
        if (bNS2.wp() == bNS3.wp()) {
            return bNS2.getName().compareTo(bNS3.getName());
        }
        return bNS2.wp() - bNS3.wp();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bNS)object, (bNS)object2);
    }
}

