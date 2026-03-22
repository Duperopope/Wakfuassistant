/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from fit
 */
public class fit_0 {
    public static final fit_0 srO = new fit_0();
    private final Map<Long, fgj_0> srP = new HashMap<Long, fgj_0>();

    public void a(long l, fgj_0 fgj_02) {
        this.srP.put(l, fgj_02);
    }

    public fgj_0 tG(long l) {
        return this.srP.get(l);
    }

    public fgj_0 tH(long l) {
        return this.srP.remove(l);
    }
}

