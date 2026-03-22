/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fKb
 */
public abstract class fkb_2 {
    private static final Logger uFp = Logger.getLogger(fkb_2.class);
    protected final THashMap<String, fiw_1<?>> uFq = new THashMap();
    protected final THashMap<String, String> uFr = new THashMap();
    protected final THashMap<Class<?>, fiw_1<?>> uFs = new THashMap();

    protected fkb_2() {
        this.gCO();
    }

    protected abstract void gCO();

    public void i(String string, Class<?> clazz) {
        this.a(string, new fiv_1(clazz));
    }

    public void a(String string, fiw_1<?> fiw_12) {
        String string2 = string.toLowerCase();
        if (this.uFq.containsKey((Object)string2)) {
            uFp.error((Object)("le tag (name=" + string + ") est d\u00e9j\u00e0 utilis\u00e9 !"));
            return;
        }
        this.uFr.put((Object)string2, (Object)string);
        this.uFq.put((Object)string2, fiw_12);
        this.uFs.put(fiw_12.gBQ(), fiw_12);
    }

    public boolean vQ(String string) {
        this.uFr.remove((Object)string.toLowerCase());
        fiw_1 fiw_12 = (fiw_1)this.uFq.remove((Object)string.toLowerCase());
        if (fiw_12 != null) {
            this.uFs.remove(fiw_12.gBQ());
        }
        return null != fiw_12;
    }

    public Map<String, fiw_1<?>> gCP() {
        return this.uFq;
    }

    public fiw_1<?> vR(String string) {
        return (fiw_1)this.uFq.get((Object)string.toLowerCase());
    }

    public fiw_1<?> D(Class<?> clazz) {
        return (fiw_1)this.uFs.get(clazz);
    }
}

