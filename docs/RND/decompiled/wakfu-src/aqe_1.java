/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aqE
 */
public final class aqe_1<T extends aqz_2>
implements aqd_1<T> {
    private static final Logger cQV = Logger.getLogger(aqe_1.class);
    private final T cQW;

    public aqe_1(T t) {
        this.cQW = t;
    }

    @Override
    public T tE(int n) {
        try {
            if (aqb_1.bGD().a(n, this.cQW)) {
                return this.cQW;
            }
        }
        catch (Exception exception) {
            cQV.error((Object)("Probl\u00e8me avec " + this.cQW.getClass().getSimpleName() + " d'id=" + n), (Throwable)exception);
        }
        return null;
    }
}

