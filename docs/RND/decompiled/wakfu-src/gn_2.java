/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from GN
 */
class gn_2 {
    private final Map<String, gk_2> aGX = new HashMap<String, gk_2>();
    private final Map<String, gj_2> aGY = new HashMap<String, gj_2>();
    private final Map<String, gl_2> aGZ = new HashMap<String, gl_2>();
    private final Map<String, gm_2> aHa = new HashMap<String, gm_2>();
    private final Map<String, go_2> aHb = new HashMap<String, go_2>();

    gn_2() {
    }

    void a(String string, gk_2 gk_22) {
        this.aGX.put(string, gk_22);
    }

    public Map<String, gk_2> aOo() {
        return Collections.unmodifiableMap(this.aGX);
    }

    void a(String string, gj_2 gj_22) {
        this.aGY.put(string, gj_22);
    }

    public Map<String, gj_2> aOp() {
        return Collections.unmodifiableMap(this.aGY);
    }

    void a(String string, gl_2 gl_22) {
        this.aGZ.put(string, gl_22);
    }

    public Map<String, gl_2> aOq() {
        return Collections.unmodifiableMap(this.aGZ);
    }

    void a(String string, gm_2 gm_22) {
        this.aHa.put(string, gm_22);
    }

    public Map<String, gm_2> aOr() {
        return Collections.unmodifiableMap(this.aHa);
    }

    void a(String string, go_2 go_22) {
        this.aHb.put(string, go_22);
    }

    public Map<String, go_2> aOs() {
        return Collections.unmodifiableMap(this.aHb);
    }

    public String toString() {
        return "Reports{m_gauges=" + this.aGX.size() + ", m_counters=" + this.aGY.size() + ", m_histograms=" + this.aGZ.size() + ", m_meters=" + this.aHa.size() + ", m_timers=" + this.aHb.size() + "}";
    }
}

