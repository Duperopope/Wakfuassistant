/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class exn
implements Comparator<fkw> {
    exn() {
    }

    public int a(fkw fkw2, fkw fkw3) {
        if (fkw2 == fkw3) {
            return 0;
        }
        if (fkw2.gcp() && fkw3.gcp()) {
            return 0;
        }
        if (fkw2.gcp()) {
            return 1;
        }
        if (fkw3.gcp()) {
            return -1;
        }
        if (fkw2.gco() != fkw3.gco()) {
            return fkw3.gco() - fkw2.gco();
        }
        if (fkw2.elc() != fkw3.elc()) {
            return fkw3.elc() - fkw2.elc();
        }
        return fkw2.Sn() <= fkw3.Sn() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fkw)object, (fkw)object2);
    }
}

