/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class fhi {
    public static final fhi soc = new fhi();
    private final Map<Long, fhg> sod = new HashMap<Long, fhg>();

    public void a(long l, fhg fhg2) {
        this.sod.put(l, fhg2);
    }

    public boolean tw(long l) {
        return this.sod.containsKey(l);
    }

    public fhg tx(long l) {
        return this.sod.get(l);
    }

    public void ty(long l) {
        this.sod.remove(l);
    }

    public fhe aI(long l, long l2) {
        fhg fhg2 = this.sod.get(l);
        if (fhg2 == null) {
            return null;
        }
        return fhg2.tu(l2);
    }

    public final Map<Long, fhg> fXI() {
        return this.sod;
    }
}

