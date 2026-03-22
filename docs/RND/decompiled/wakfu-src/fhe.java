/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fhe {
    protected static final Logger snX = Logger.getLogger(fhe.class);
    protected long aDh;
    protected Map<Long, ffV> maw = new HashMap<Long, ffV>();
    private final List<fhh> snY = new ArrayList<fhh>();
    private final List<Sp> snZ = new ArrayList<Sp>();

    public fhe() {
    }

    public fhe(exP exP2) {
        this.aDh = exP2.Sn();
    }

    public fhe(long l) {
        this.aDh = l;
    }

    public boolean aW(ffV ffV2) {
        if (ffV2 == null) {
            snX.warn((Object)("Try to add a null item to equipment inventory, characterId=" + this.aDh));
            return false;
        }
        this.maw.put(ffV2.LV(), ffV2);
        for (fhh fhh2 : this.snY) {
            fhh2.ah(ffV2);
        }
        this.a(Sn.a(Sj.bnO, ffV2));
        return true;
    }

    public boolean b(long l, fib fib2) {
        fft_0 fft_02;
        ffV ffV2;
        Object t = fcL.rUh.sw(this.aDh);
        if (t == null) {
            return false;
        }
        Object t2 = fcI.ac(((exP)t).Xi(), l);
        if (t2 != null && (ffV2 = (fft_02 = ((exP)t2).dod()).tb(l)) != null && fft_02.a(ffV2, fib2) != null) {
            return this.aW(ffV2);
        }
        return false;
    }

    public boolean C(Long l) {
        return this.maw.containsKey(l);
    }

    public Optional<ffV> B(@Nullable Long l) {
        return Optional.ofNullable(this.maw.get(l));
    }

    public Optional<ffV> A(Long l) {
        Optional<ffV> optional = Optional.ofNullable(this.maw.remove(l));
        if (optional.isPresent()) {
            ffV ffV2 = optional.get();
            for (fhh fhh2 : this.snY) {
                fhh2.ai(ffV2);
            }
            this.a(Sn.b(Sj.bnO, ffV2));
        }
        return optional;
    }

    public Optional<ffV> cO(ffV ffV2) {
        return this.A(ffV2.LV());
    }

    public boolean pb(int n) {
        for (Map.Entry<Long, ffV> entry : this.maw.entrySet()) {
            if (entry.getValue().avr() != n) continue;
            return true;
        }
        return false;
    }

    public ffV UH(int n) {
        for (Map.Entry<Long, ffV> entry : this.maw.entrySet()) {
            ffV ffV2 = entry.getValue();
            if (ffV2.avr() != n) continue;
            return ffV2;
        }
        return null;
    }

    public ArrayList<ffV> pd(int n) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        for (Map.Entry<Long, ffV> entry : this.maw.entrySet()) {
            ffV ffV2 = entry.getValue();
            if (ffV2.avr() != n) continue;
            arrayList.add(ffV2);
        }
        return arrayList;
    }

    public ImmutableMap<Long, ffV> fXE() {
        return ImmutableMap.copyOf(this.maw);
    }

    public boolean c(Function<ffV, Boolean> function) {
        for (ffV ffV2 : this.maw.values()) {
            if (function.apply(ffV2).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public void b(fhe fhe2) {
        this.maw = new HashMap<Long, ffV>(fhe2.maw);
    }

    public int fXF() {
        return this.maw.size();
    }

    public void a(fhh fhh2) {
        if (!this.snY.contains(fhh2)) {
            this.snY.add(fhh2);
        }
    }

    public void b(fhh fhh2) {
        this.snY.remove(fhh2);
    }

    public long KU() {
        return this.aDh;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void a(Sp sp) {
        if (!this.snZ.contains(sp)) {
            this.snZ.add(sp);
        }
    }

    public void b(Sp sp) {
        this.snZ.remove(sp);
    }

    public void a(Sl sl) {
        for (Sp sp : this.snZ) {
            try {
                sp.b(sl);
            }
            catch (Exception exception) {
                snX.error((Object)("Error during process of inventory event " + String.valueOf(sl) + " with observer " + String.valueOf(sp)), (Throwable)exception);
            }
        }
    }

    public int aVo() {
        return this.maw.size();
    }

    public boolean D(Long l) {
        return this.C(l);
    }
}

