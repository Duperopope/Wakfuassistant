/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * Renamed from aeX
 */
public class aex_0
extends aev_1
implements aee_1 {
    protected static final Map<List<afh>, aex_0> cpb = new LinkedHashMap<List<afh>, aex_0>();
    protected final List<afh> cpc;
    protected final Map<afh, aeb_1> cpd = new EnumMap<afh, aeb_1>(afh.class);
    protected final Map<String, String> cpe = new HashMap<String, String>();
    protected final Map<String, String> cpf = Collections.synchronizedMap(new HashMap());
    protected final Map<String, String> cpg = Collections.synchronizedMap(new HashMap());
    protected final aey_1 cph = aex_12 -> {
        String string = aex_12.aYh();
        this.r(string, this.ep(string));
    };
    protected final Map<afh, aec_1> cpi = new HashMap<afh, aec_1>();
    protected final afg cpj = new aey_0(this);

    public static aex_0 a(aez_0<?, ?> aez_02, List<afh> list) {
        int n = list.size();
        for (List<afh> list2 : cpb.keySet()) {
            if (list2.size() != n) continue;
            boolean bl = true;
            for (int i = 0; i < n && bl; ++i) {
                bl = list.get(i) == list2.get(i);
            }
            if (!bl) continue;
            return cpb.get(list2);
        }
        aex_0 aex_02 = new aex_0(aez_02, list);
        cpb.put(list, aex_02);
        return aex_02;
    }

    protected final List<aeb_1> bxe() {
        ArrayList<aeb_1> arrayList = new ArrayList<aeb_1>();
        for (afh afh2 : this.cpc) {
            aeb_1 aeb_12 = this.cpd.get((Object)afh2);
            if (aeb_12 == null) continue;
            arrayList.add(aeb_12);
        }
        return arrayList;
    }

    protected aec_1 a(afh afh2) {
        if (!this.cpi.containsKey((Object)afh2)) {
            aec_1 aec_12 = aeb_12 -> {
                if (this.cpd.get((Object)afh2) == aeb_12) {
                    return;
                }
                this.a(afh2, aeb_12);
            };
            this.cpi.put(afh2, aec_12);
            return aec_12;
        }
        return this.cpi.get((Object)afh2);
    }

    protected void r(String string, String string2) {
        this.a(string, this.cpe.get(string), string2);
    }

    @Override
    protected void a(String string, String string2, String string3) {
        if (string2 != null && string2.equals(string3)) {
            return;
        }
        if (Objects.equals(this.cpe.get(string), string3)) {
            return;
        }
        this.cpe.put(string, string3);
        super.a(string, string2, string3);
    }

    protected aex_0(aez_0<?, ?> aez_02, List<afh> list) {
        this.cpc = list;
        for (afh object : list) {
            aeb_1 aeb_12 = aez_02.b(object);
            if (aeb_12 == null) continue;
            if (aeb_12.isInitialized()) {
                this.a(object, aeb_12);
                continue;
            }
            aeb_12.a(this.a(object));
        }
        aez_02.a(this.cpj);
        for (aeb_1 aeb_13 : this.cpd.values()) {
            aeb_13.a(this.cph);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(afh afh2, aeb_1 aeb_12) {
        Map<String, String> map = this.bxg();
        this.cpd.put(afh2, aeb_12);
        Map<String, String> map2 = this.cpf;
        synchronized (map2) {
            for (Map.Entry<String, String> entry : this.cpf.entrySet()) {
                aeb_12.s(entry.getKey(), entry.getValue());
            }
            this.cpf.clear();
        }
        map2 = this.cpg;
        synchronized (map2) {
            for (Map.Entry<String, String> entry : this.cpg.entrySet()) {
                aeb_12.t(entry.getKey(), entry.getValue());
            }
            this.cpg.clear();
        }
        map2 = this.bxg();
        this.a(map, map2);
    }

    protected void b(afh afh2, aeb_1 aeb_12) {
        Map<String, String> map = this.bxg();
        this.cpd.remove((Object)afh2, aeb_12);
        Map<String, String> map2 = this.bxg();
        this.a(map, map2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String ep(String string) {
        for (aeb_1 aeb_12 : this.bxe()) {
            if (!aeb_12.n(string, true)) continue;
            return aeb_12.ep(string);
        }
        Map<String, String> map = this.cpf;
        synchronized (map) {
            return this.cpf.getOrDefault(string, this.er(string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<String> bxf() {
        HashSet<String> hashSet = new HashSet<String>();
        for (aeb_1 aeb_12 : this.bxe()) {
            hashSet.addAll(aeb_12.bxf());
        }
        Map<String, String> map = this.cpf;
        synchronized (map) {
            hashSet.addAll(this.cpf.keySet());
        }
        map = this.cpg;
        synchronized (map) {
            hashSet.addAll(this.cpg.keySet());
        }
        return hashSet;
    }

    @Override
    public Map<String, String> bxg() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : this.bxf()) {
            hashMap.put(string, this.ep(string));
        }
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean n(String string, boolean bl) {
        for (aeb_1 aeb_12 : this.bxe()) {
            if (!aeb_12.n(string, bl)) continue;
            return true;
        }
        Map<String, String> map = this.cpf;
        synchronized (map) {
            if (this.cpf.containsKey(string)) {
                return true;
            }
        }
        if (bl) {
            return false;
        }
        map = this.cpg;
        synchronized (map) {
            return this.cpg.containsKey(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean eq(String string) {
        for (aeb_1 aeb_12 : this.bxe()) {
            if (!aeb_12.eq(string)) continue;
            return true;
        }
        Map<String, String> map = this.cpg;
        synchronized (map) {
            return this.cpg.containsKey(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String er(String string) {
        for (aeb_1 aeb_12 : this.bxe()) {
            if (!aeb_12.eq(string)) continue;
            return aeb_12.er(string);
        }
        Map<String, String> map = this.cpg;
        synchronized (map) {
            return this.cpg.getOrDefault(string, "");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void es(String string) {
        String string2 = this.ep(string);
        for (aeb_1 aeb_12 : this.bxe()) {
            aeb_12.es(string);
        }
        Map<String, String> map = this.cpf;
        synchronized (map) {
            this.cpf.remove(string);
        }
        this.a(string, string2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void s(String string, String string2) {
        String string3 = this.ep(string);
        if (string3 != null && string3.equals(string2)) {
            return;
        }
        List<aeb_1> list = this.bxe();
        if (list.isEmpty()) {
            Map<String, String> map = this.cpf;
            synchronized (map) {
                this.cpf.put(string, string2);
            }
            return;
        }
        list.get(0).s(string, string2);
        this.a(string, string3, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void t(String string, String string2) {
        String string3 = this.er(string);
        if (string3 != null && string3.equals(string2)) {
            return;
        }
        List<aeb_1> list = this.bxe();
        if (list.isEmpty()) {
            Map<String, String> map = this.cpg;
            synchronized (map) {
                this.cpg.put(string, string2);
            }
            return;
        }
        list.get(0).t(string, string2);
        if (this.hE(string)) {
            this.a(string, string3, string2);
        }
    }
}

