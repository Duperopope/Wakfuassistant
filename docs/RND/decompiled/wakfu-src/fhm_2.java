/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fHm
 */
public final class fhm_2 {
    public static final fhm_2 uwB = new fhm_2();
    private final Map<String, axb_2> uwC = new HashMap<String, axb_2>();
    private final Map<String, axb_2> uwD = new HashMap<String, axb_2>();

    private fhm_2() {
    }

    public void a(fhz_1 fhz_12, axb_2 axb_22) {
        if (fhz_12 == null) {
            return;
        }
        this.b(fhz_12.getName(), axb_22);
    }

    public void b(String string, axb_2 axb_22) {
        if (BH.aU(string) || axb_22 == null) {
            return;
        }
        this.uwD.put(string, axb_22);
    }

    public axb_2 uy(@NotNull String string) {
        return this.uwC.get(string);
    }

    public axb_2 f(@NotNull String string, float f2) {
        axb_2 axb_22 = this.uwC.get(string);
        if (axb_22 == null) {
            return null;
        }
        awx_2 awx_22 = new awx_2(axb_22);
        awx_22.setAlpha(f2);
        return awx_22;
    }

    public axb_2 a(@NotNull fhz_1 fhz_12) {
        return this.uy(fhz_12.getName());
    }

    public axb_2 a(@NotNull fhz_1 fhz_12, float f2) {
        return this.f(fhz_12.getName(), f2);
    }

    public boolean uz(String string) {
        return this.uwC.containsKey(string);
    }

    public List<String> gzR() {
        return new ArrayList<String>(this.uwC.keySet());
    }

    public void clear() {
        this.uwC.clear();
        this.uwD.clear();
    }

    public Map<String, axb_2> gzS() {
        HashMap<String, axb_2> hashMap = new HashMap<String, axb_2>();
        for (Map.Entry<String, axb_2> entry : this.uwD.entrySet()) {
            axb_2 axb_22;
            String string = entry.getKey();
            if (this.c(string, axb_22 = entry.getValue())) continue;
            fhq_2.uwO.warn("Following color {} not updated because isn't valid (Cf previous log for cause)", (Object)string);
            hashMap.put(string, axb_22);
        }
        hashMap.forEach(this.uwD::remove);
        this.uwC.putAll(this.uwD);
        this.uwD.clear();
        return hashMap;
    }

    private boolean c(String string, axb_2 axb_22) {
        if (!axb_22.bPZ()) {
            return true;
        }
        String string2 = axb_22.bQa();
        if (!this.uwD.containsKey(string2) && !this.uz(string2)) {
            fhq_2.uwO.error("[THEME] Following color {} try to reference following unknown color {}", (Object)string, (Object)string2);
            return false;
        }
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(string2);
        HashMap<String, axb_2> hashMap = new HashMap<String, axb_2>();
        hashMap.put(string2, this.uwD.containsKey(string2) ? this.uwD.get(string2) : this.uy(string2));
        boolean bl = true;
        while (bl) {
            bl = false;
            for (Map.Entry entry : new HashMap(hashMap).entrySet()) {
                axb_2 axb_23 = (axb_2)entry.getValue();
                String string3 = (String)entry.getKey();
                if (!axb_23.bPZ()) continue;
                String string4 = axb_23.bQa();
                if (hashSet.contains(string4)) {
                    fhq_2.uwO.error("[THEME] Following color {} try to reference following color {} but he need itself (Cyclic dependency) [Colors used : {}]", new Object[]{string3, string4, hashSet, string});
                    return false;
                }
                if (!this.uwD.containsKey(string4) && !this.uz(string4)) {
                    fhq_2.uwO.error("[THEME] Following color {} try to reference following unknown color {}", new Object[]{string3, string4, string});
                    return false;
                }
                if (!bl) {
                    hashMap.clear();
                    bl = true;
                }
                hashSet.add(string4);
                hashMap.put(string4, this.uwD.containsKey(string4) ? this.uwD.get(string4) : this.uy(string4));
            }
        }
        return true;
    }
}

