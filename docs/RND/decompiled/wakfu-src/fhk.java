/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fhk {
    protected static final Logger sog = Logger.getLogger(fhk.class);
    private final Map<ffS, Long> soh = new EnumMap<ffS, Long>(ffS.class);
    protected final List<fhl> soi = new ArrayList<fhl>();
    private final List<Sp> soj = new ArrayList<Sp>();
    private short ejt;
    private boolean sok = false;

    public void c(ffS ffS2, Long l) {
        this.soh.put(ffS2, l);
        for (fhl fhl2 : this.soi) {
            try {
                fhl2.a(ffS2, l);
            }
            catch (Exception exception) {
                sog.error((Object)("[Builds] An error occurred while calling onItemChanged of listener of class " + fhl2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
    }

    @Nullable
    public Long t(ffS ffS2) {
        return this.soh.get(ffS2);
    }

    @Nullable
    public ffS tz(long l) {
        for (Map.Entry<ffS, Long> entry : this.soh.entrySet()) {
            if (entry.getValue() != l) continue;
            return entry.getKey();
        }
        return null;
    }

    public Long u(ffS ffS2) {
        return this.a(ffS2, null);
    }

    public Long a(ffS ffS2, @Nullable fib fib2) {
        Long l = this.soh.get(ffS2);
        this.a(l, fib2);
        return l;
    }

    @Nullable
    public ffS O(Long l) {
        return this.a(l, null);
    }

    @Nullable
    public ffS a(Long l, @Nullable fib fib2) {
        if (l == null || l == 0L) {
            return null;
        }
        ffS ffS2 = this.tz(l);
        if (ffS2 == null) {
            return null;
        }
        this.soh.remove(ffS2);
        for (fhl fhl2 : this.soi) {
            try {
                fhl2.a(ffS2, l, fib2);
            }
            catch (Exception exception) {
                sog.error((Object)("[Builds] An error occurred while calling onItemRemoved of listener of class " + fhl2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
        return ffS2;
    }

    @Nullable
    public ffV a(fhe fhe2, int n) {
        for (Map.Entry<ffS, Long> entry : this.soh.entrySet()) {
            Optional<ffV> optional = fhe2.B(entry.getValue());
            if (!optional.isPresent() || optional.get().avr() != n) continue;
            return optional.get();
        }
        return null;
    }

    public List<ffV> b(fhe fhe2, int n) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        for (Map.Entry<ffS, Long> entry : this.soh.entrySet()) {
            Optional<ffV> optional = fhe2.B(entry.getValue());
            if (!optional.isPresent() || optional.get().avr() != n) continue;
            arrayList.add(optional.get());
        }
        return arrayList;
    }

    @Nullable
    public ffV a(fhe fhe2, ffS ffS2) {
        Optional<ffV> optional = fhe2.B(this.t(ffS2));
        return optional.orElse(null);
    }

    public Map<ffS, Long> fUd() {
        return this.soh;
    }

    public fhk fXJ() {
        fhk fhk2 = new fhk();
        fhk2.ejt = this.ejt;
        fhk2.soh.clear();
        fhk2.soh.putAll(this.soh);
        return fhk2;
    }

    public void i(fhk fhk2) {
        this.ejt = fhk2.ejt;
        this.soh.clear();
        this.soh.putAll(fhk2.soh);
    }

    public void j(fhk fhk2) {
        this.soh.clear();
        this.soh.putAll(fhk2.soh);
    }

    public void bw(short s) {
        this.ejt = s;
        for (fhl fhl2 : this.soi) {
            try {
                fhl2.b(this);
            }
            catch (Exception exception) {
                sog.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public short cmL() {
        return this.ejt;
    }

    public boolean al(exP exP2) {
        if (exP2 == null) {
            return false;
        }
        return this.ejt <= exP2.dnG() - 0;
    }

    public void a(fhl fhl2) {
        if (!this.soi.contains(fhl2)) {
            this.soi.add(fhl2);
        }
    }

    public boolean bt(ffV ffV2) {
        if (ffV2 == null) {
            return false;
        }
        return this.fa(ffV2.LV());
    }

    public boolean fa(long l) {
        return this.soh.containsValue(l);
    }

    public void b(fhl fhl2) {
        this.soi.remove(fhl2);
    }

    public void a(Sp sp) {
        this.soj.add(sp);
    }

    public void b(Sp sp) {
        this.soj.remove(sp);
    }

    public void a(Sl sl) {
        for (Sp sp : this.soj) {
            try {
                sp.b(sl);
            }
            catch (Exception exception) {
                sog.error((Object)("Error during process of inventory event " + String.valueOf(sl) + " with observer " + String.valueOf(sp)), (Throwable)exception);
            }
        }
    }

    public boolean k(fhk fhk2) {
        return this.ejt != fhk2.ejt || !this.soh.equals(fhk2.soh);
    }

    public String toString() {
        return "EquipmentSheet{m_items=" + String.valueOf(this.soh) + ", m_level=" + this.ejt + "}";
    }

    @Generated
    public boolean fXK() {
        return this.sok;
    }

    @Generated
    public void nd(boolean bl) {
        this.sok = bl;
    }
}

