/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cTi
 */
class cti_2
implements aeh_2 {
    public static final String nIn = "name";
    public static final String nIo = "level";
    public static final String nIp = "loots";
    public final String[] nIq = new String[]{"name", "level", "loots"};
    private final List<btx> nIr = new ArrayList<btx>();

    cti_2() {
    }

    @Override
    public String[] bxk() {
        return this.nIq;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nIn)) {
            return aue_0.cVJ().cVK().getName();
        }
        if (string.equals(nIo)) {
            return aue_0.cVJ().cVK().cmL();
        }
        if (string.equals(nIp)) {
            return this.nIr.isEmpty() ? null : Collections.unmodifiableCollection(this.nIr);
        }
        return null;
    }

    public void k(int n, short s) {
        this.nIr.add(new btx(n, s));
    }

    public void b(btx btx2) {
        if (!this.nIr.contains(btx2)) {
            this.nIr.add(btx2);
        }
    }
}

