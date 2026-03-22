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
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class frf {
    private static final Logger sXy = Logger.getLogger(frf.class);
    private final Map<Integer, frd> sXz = new LinkedHashMap<Integer, frd>();
    private final List<frg> sXA = new ArrayList<frg>();

    public frf() {
        this.gjT();
    }

    public final void gjT() {
        if (!this.sXz.containsKey(0)) {
            this.sXz.put(0, new frd());
        }
    }

    public Optional<Integer> o(frd frd2) {
        for (Map.Entry<Integer, frd> entry : this.sXz.entrySet()) {
            if (!Objects.equals(entry.getValue(), frd2)) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    public void b(int n, frd frd2) {
        this.sXz.put(n, frd2);
        this.p(frd2);
    }

    public boolean Zw(int n) {
        return this.Zx(n) != null;
    }

    @Nullable
    public frd Zx(int n) {
        return this.sXz.get(n);
    }

    @NotNull
    public frd gr(int n, int n2) {
        frd frd2 = new frd();
        frd2.PP(n2);
        this.b(n, frd2);
        return frd2;
    }

    public void Zy(int n) {
        frd frd2 = this.sXz.remove(n);
        if (frd2 != null) {
            this.Zz(n);
        }
    }

    @NotNull
    public Map<Integer, frd> gjU() {
        return Collections.unmodifiableMap(this.sXz);
    }

    private void p(frd frd2) {
        for (frg frg2 : this.sXA) {
            try {
                frg2.b(frd2);
            }
            catch (Exception exception) {
                sXy.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void Zz(int n) {
        for (frg frg2 : this.sXA) {
            try {
                frg2.Ie(n);
            }
            catch (Exception exception) {
                sXy.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(frg frg2) {
        if (this.sXA.contains(frg2)) {
            return;
        }
        this.sXA.add(frg2);
    }

    public void b(frg frg2) {
        this.sXA.remove(frg2);
    }

    public void clear() {
        this.gjV();
        this.djf();
    }

    public void gjV() {
        this.sXz.clear();
        this.gjT();
    }

    private void djf() {
        this.sXA.clear();
    }

    public int aVo() {
        return this.sXz.size();
    }

    public void c(frf frf2) {
        this.gjV();
        frf2.gjU().forEach(this::b);
    }

    public String toString() {
        return "SpellDeckSet{m_spellDecks=" + String.valueOf(this.sXz) + "}";
    }
}

