/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from bYp
 */
public class byp_2 {
    public static final byp_2 lyZ = new byp_2();
    private final Map<Integer, byo_2> lza = new HashMap<Integer, byo_2>();

    protected byp_2() {
    }

    public void a(byo_2 byo_22) {
        this.lza.put(byo_22.d(), byo_22);
    }

    public byo_2 JE(int n) {
        return this.lza.get(n);
    }
}

