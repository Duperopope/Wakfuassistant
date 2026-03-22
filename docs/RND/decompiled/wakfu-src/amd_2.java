/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from amD
 */
public class amd_2
extends amr_1 {
    private final Map<amu_1, amu_1> cIA;

    @Override
    public TLongLongHashMap g(Object object, Object object2, Object object3, Object object4) {
        TLongLongHashMap tLongLongHashMap = new TLongLongHashMap();
        for (Map.Entry<amu_1, amu_1> entry : this.cIA.entrySet()) {
            long l = entry.getKey().d(object, object2, object3, object4);
            long l2 = entry.getValue().d(object, object2, object3, object4);
            tLongLongHashMap.put(l, l2);
        }
        return tLongLongHashMap;
    }

    public amd_2() {
        this(new HashMap());
    }

    public amd_2(Map<? extends amx_1, ? extends amx_1> map) {
        this(map, false);
    }

    public amd_2(Map<? extends amx_1, ? extends amx_1> map, boolean bl) {
        if (bl) {
            this.cIA = map;
        } else {
            this.cIA = new HashMap<amu_1, amu_1>();
            for (Map.Entry<? extends amx_1, ? extends amx_1> entry : map.entrySet()) {
                amx_1 amx_12 = entry.getKey();
                if (amx_12.bDv() != amz_1.cJy) {
                    throw new amw_2("On essaie d'ajouter " + String.valueOf(amx_12) + " de type " + amx_12.bDv().name() + " \u00e0 une map de cl\u00e9 num\u00e9rique");
                }
                amx_1 amx_13 = entry.getValue();
                if (amx_13.bDv() != amz_1.cJy) {
                    throw new amw_2("On essaie d'ajouter " + String.valueOf(amx_13) + " de type " + amx_13.bDv().name() + " \u00e0 une map de valeur num\u00e9rique");
                }
                this.cIA.put((amu_1)amx_12, (amu_1)amx_13);
            }
        }
    }

    @Override
    public int bDw() {
        return this.cIA.size();
    }

    @Override
    public Enum bDq() {
        return amg_2.cIV;
    }
}

