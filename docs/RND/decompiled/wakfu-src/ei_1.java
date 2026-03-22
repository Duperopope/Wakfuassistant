/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Map;

/*
 * Renamed from Ei
 */
public final class ei_1 {
    private final ev_1 ayl;

    public ei_1(ev_1 ev_12) {
        this.ayl = ev_12;
    }

    public void b(fp_0 fp_02) {
        try {
            Map<Short, eu_1> map = this.ayl.aJF();
            fp_02.k((short)map.size());
            for (eu_1 eu_12 : map.values()) {
                new eh_1(eu_12).b(fp_02);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save imports", iOException);
        }
    }
}

