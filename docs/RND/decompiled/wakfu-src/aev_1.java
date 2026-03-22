/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aEv
 */
public abstract class aev_1
implements aed_1,
aew_1 {
    protected final List<aey_1> dGr = new ArrayList<aey_1>();
    protected final Map<String, List<aea_1>> dGs = new HashMap<String, List<aea_1>>();

    @Override
    public void a(aey_1 aey_12) {
        this.dGr.add(aey_12);
    }

    @Override
    public void b(aey_1 aey_12) {
        this.dGr.remove(aey_12);
    }

    @Override
    public void bZE() {
        this.dGr.clear();
    }

    @Override
    public void a(String string, aea_1 aea_12) {
        List<aea_1> list = this.dGs.containsKey(string) ? this.dGs.get(string) : new ArrayList<aea_1>();
        list.add(aea_12);
        this.dGs.put(string, list);
    }

    @Override
    public void b(String string, aea_1 aea_12) {
        if (this.dGs.containsKey(string)) {
            List<aea_1> list = this.dGs.get(string);
            list.remove(aea_12);
        }
    }

    @Override
    public void bZF() {
        this.dGs.clear();
    }

    protected void a(Map<String, String> map, Map<String, String> map2) {
        Set<String> set = Collections.unmodifiableSet(map.keySet());
        Set<String> set2 = Collections.unmodifiableSet(map2.keySet());
        HashSet<String> hashSet2 = new HashSet<String>(map.keySet());
        hashSet2.removeIf(set2::contains);
        for (String hashSet3 : hashSet2) {
            this.a(hashSet3, map.get(hashSet3), null);
        }
        HashSet<String> hashSet4 = new HashSet<String>(map2.keySet());
        hashSet4.removeIf(set::contains);
        Iterator iterator = hashSet4.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            this.a(string2, null, map2.get(string2));
        }
        HashSet<String> hashSet = new HashSet<String>(map.keySet());
        hashSet.removeIf(string -> !set2.contains(string));
        for (String string3 : hashSet) {
            this.a(string3, map.get(string3), map2.get(string3));
        }
    }

    protected void a(String string, String string2, String string3) {
        Object object;
        if (string2 != null && string2.equals(string3)) {
            return;
        }
        if (this.dGr.size() > 0) {
            object = new aex_1(this, string, string2, string3);
            for (aey_1 object2 : this.dGr) {
                object2.propertyChange((aex_1)object);
            }
        }
        if (this.dGs.containsKey(string) && (object = this.dGs.get(string)).size() > 0) {
            aez_1 aez_12 = new aez_1(this, string2, string3);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                aea_1 aea_12 = (aea_1)iterator.next();
                aea_12.onPropertyChange(aez_12);
            }
        }
    }
}

