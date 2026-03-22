/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fhm {
    private static final Logger sol = Logger.getLogger(fhm.class);
    private final Map<Integer, fhk> som = new LinkedHashMap<Integer, fhk>();
    private final long son;
    private final List<fho> soo = new ArrayList<fho>();

    public fhm(long l) {
        this.son = l;
    }

    public void tA(long l) {
        for (Map.Entry<Integer, fhk> entry : this.som.entrySet()) {
            byte by = entry.getKey().byteValue();
            fhk fhk2 = entry.getValue();
            for (fho fho2 : this.soo) {
                fho2.a(by, fhk2, l, this.son);
            }
        }
    }

    public void a(int n, fhk fhk2) {
        this.som.put(n, fhk2);
        this.b(n, fhk2);
    }

    public Optional<fhk> Vk(int n) {
        fhk fhk2 = this.som.remove(n);
        if (fhk2 == null) {
            return Optional.empty();
        }
        this.b(this.son, n, fhk2);
        return Optional.of(fhk2);
    }

    @NotNull
    public fhk fR(int n, int n2) {
        fhk fhk2 = new fhk();
        fhk2.bw((short)n2);
        this.a(n, fhk2);
        return fhk2;
    }

    @NotNull
    public Map<Integer, fhk> uv() {
        return Collections.unmodifiableMap(this.som);
    }

    @Nullable
    public fhk gq(byte by) {
        fhk fhk2 = this.som.get(by);
        if (fhk2 == null) {
            sol.error((Object)("Equipment sheet set of " + this.son + " does not have sheet of index " + by + " (current sheets=" + String.valueOf(this.som.keySet()) + ")"), new Throwable("for stacktrace"));
        }
        return fhk2;
    }

    public int aVo() {
        return this.som.size();
    }

    public long KU() {
        return this.son;
    }

    public void a(fho fho2) {
        if (!this.soo.contains(fho2)) {
            this.soo.add(fho2);
        }
    }

    private void b(int n, fhk fhk2) {
        for (fho fho2 : this.soo) {
            try {
                Object t = fcL.rUh.sw(this.son);
                fho2.a(n, fhk2, ((exP)t).Xi(), this.son);
            }
            catch (Exception exception) {
                sol.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void b(long l, int n, fhk fhk2) {
        for (fho fho2 : this.soo) {
            try {
                fho2.a(l, n, fhk2);
            }
            catch (Exception exception) {
                sol.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "EquipmentSheetSet{m_sheets=" + String.valueOf(this.som) + ", m_characterId=" + this.son + "}";
    }
}

