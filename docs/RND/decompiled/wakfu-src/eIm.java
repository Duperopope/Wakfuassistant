/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class eIm {
    private static final Logger qvV = Logger.getLogger(eIm.class);
    private int qvW = 0;
    private int qvX = -2;
    private final Map<Integer, eIj> qvY = new LinkedHashMap<Integer, eIj>();
    private final List<eIo> qvZ = new ArrayList<eIo>();

    @Nullable
    public eIj PR(int n) {
        return this.qvY.get(n);
    }

    @NotNull
    public @Unmodifiable Map<Integer, eIj> uv() {
        return Collections.unmodifiableMap(this.qvY);
    }

    public int PS(int n) {
        if (!this.qvY.containsKey(n)) {
            qvV.error((Object)("[Builds] Cannot set active sheet index to " + n + " because no build has that index"));
            return this.qvW;
        }
        int n2 = this.qvW;
        this.qvW = n;
        this.fwu();
        return n2;
    }

    public void g(eIj eIj2) {
        this.qvY.put(eIj2.wp(), eIj2);
        this.b(this, eIj2);
    }

    public int fwr() {
        int n = 1;
        while (this.qvY.containsKey(n)) {
            ++n;
        }
        return n;
    }

    public int fws() {
        int n = 0;
        for (eIj eIj2 : this.qvY.values()) {
            if (eIj2.dhe()) continue;
            ++n;
        }
        return n;
    }

    public List<eIi> dE(short s) {
        Set set = this.qvY.values().stream().filter(eIj::dhe).map(eIj::tL).collect(Collectors.toSet());
        ArrayList<eIi> arrayList = new ArrayList<eIi>();
        for (eIi eIi2 : eIi.qvN) {
            if (eIi2.cmL() + 0 > s) break;
            if (set.contains(eIi2.cmL())) continue;
            arrayList.add(eIi2);
        }
        return arrayList;
    }

    public void PT(int n) {
        eIj eIj2 = this.qvY.remove(n);
        if (eIj2 != null) {
            this.h(eIj2);
        }
    }

    @NotNull
    public eIj fwt() {
        if (!this.qvY.containsKey(this.qvW)) {
            qvV.error((Object)("[Builds] Active sheet index do not point to existing sheet : activeIndex=" + this.qvW + ", indexes=" + String.valueOf(this.qvY.keySet())));
            return this.qvY.get(0);
        }
        return this.qvY.get(this.qvW);
    }

    public int wM() {
        return this.qvW;
    }

    void PU(int n) {
        this.qvX = n;
    }

    public int wR() {
        return this.qvX;
    }

    public int aVo() {
        return this.qvY.size();
    }

    public void a(int n, eIj eIj2) {
        this.qvY.put(n, eIj2);
    }

    public short ewW() {
        return (short)this.fwt().tL();
    }

    public Optional<Integer> PV(int n) {
        for (Map.Entry<Integer, eIj> entry : this.qvY.entrySet()) {
            eIj eIj2 = entry.getValue();
            if (!eIj2.dhe() || eIj2.tL() != n) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    private void b(eIm eIm2, eIj eIj2) {
        for (eIo eIo2 : this.qvZ) {
            eIo2.a(eIm2, eIj2);
        }
    }

    private void fwu() {
        for (eIo eIo2 : this.qvZ) {
            try {
                eIo2.a(this);
            }
            catch (Exception exception) {
                qvV.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void h(eIj eIj2) {
        for (eIo eIo2 : this.qvZ) {
            try {
                eIo2.c(this, eIj2);
            }
            catch (Exception exception) {
                qvV.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public boolean a(eIo eIo2) {
        return !this.qvZ.contains(eIo2) && this.qvZ.add(eIo2);
    }

    public List<eIo> aYR() {
        return this.qvZ;
    }

    public boolean b(eIo eIo2) {
        return this.qvZ.remove(eIo2);
    }

    public void dQY() {
        this.qvZ.clear();
    }

    public void clear() {
        this.qvW = 0;
        this.qvY.clear();
        this.qvZ.clear();
    }

    public String toString() {
        return "BuildSheetSet{m_activeSheetIndex=" + this.qvW + ", m_sheets=" + String.valueOf(this.qvY) + "}";
    }
}

