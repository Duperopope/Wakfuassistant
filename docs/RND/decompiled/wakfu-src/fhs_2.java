/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHs
 */
public class fhs_2
implements Iterable<fhv_1> {
    private static final Logger uxr = Logger.getLogger(fhs_2.class);
    public static final char uxs = '.';
    public static final String uxt = "~";
    private static final String uxu = "\\\\.";
    public static final String uxv = "#";
    private String cHc;
    private HashMap<String, fhv_1> uxw;
    private final HashMap<String, fsf_1> uxx = new HashMap();
    private fhu_1 tCd;
    private HashMap<String, fry_1> uxy = null;
    private fhs_2 uxz = null;
    private ArrayList<fhs_2> aXA = null;
    private THashMap<String, String> uxA = new THashMap();

    public fhs_2(String string, fhu_1 fhu_12) {
        this.cHc = string;
        this.tCd = fhu_12;
    }

    public void a(String string, fhv_1 fhv_12) {
        if (this.uxw == null) {
            this.uxw = new HashMap();
        }
        if (fhv_12 != null && string != null && this.uxw.get(string) != fhv_12) {
            fhv_12.setId(string);
            this.uxw.put(string, fhv_12);
        }
    }

    public fhv_1 uH(String string) {
        return this.L(string, true);
    }

    public fhv_1 L(String string, boolean bl) {
        fhs_2 fhs_22;
        fhv_1 fhv_12;
        String[] stringArray = StringUtils.split((String)string, (String)uxu, (int)2);
        String string2 = string;
        String string3 = null;
        String string4 = null;
        int n = -1;
        if (stringArray.length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            string4 = stringArray[1];
        }
        if ((stringArray = StringUtils.split((String)string2, (String)uxv, (int)2)).length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            n = Bw.b((Object)stringArray[1], -1);
        }
        if ((stringArray = StringUtils.split((String)string2, (String)uxt, (int)2)).length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            string3 = stringArray[1];
        }
        fhv_1 fhv_13 = fhv_12 = this.uxw != null ? this.uxw.get(string2) : null;
        if (fhv_12 == null && this.uxz != null && bl) {
            fhv_12 = this.uxz.uH(string2);
        }
        if (fhv_12 instanceof fjh_2 && n != -1) {
            fhv_12 = ((fjh_2)((Object)fhv_12)).getWidget(string3, n);
        }
        if (string4 != null && fhv_12 instanceof fcv_1 && (fhs_22 = ((fcv_1)fhv_12).getInnerElementMap()) != null) {
            fhv_12 = fhs_22.uH(string4);
        }
        return fhv_12;
    }

    @Nullable
    public <T extends fhv_1> T getElementRecursively(String string, Predicate<fhv_1> predicate) {
        LinkedList<fhs_2> linkedList = new LinkedList<fhs_2>();
        linkedList.add(this);
        while (!linkedList.isEmpty()) {
            fhs_2 fhs_22 = (fhs_2)linkedList.remove(0);
            fhv_1 fhv_12 = fhs_22.uH(string);
            if (fhv_12 != null && predicate.test(fhv_12)) {
                return (T)fhv_12;
            }
            if (fhs_22.aXA == null) continue;
            linkedList.addAll(fhs_22.aXA);
        }
        return null;
    }

    public fhu_1 gqC() {
        return this.tCd;
    }

    public void a(fhu_1 fhu_12) {
        if (fhu_12 != this.tCd) {
            this.tCd = fhu_12;
            for (int i = this.aXA.size() - 1; i >= 0; --i) {
                this.aXA.get(i).a(this.tCd);
            }
        }
    }

    public String gAt() {
        if (this.uxz != null) {
            return this.uxz.gAt();
        }
        return this.cHc;
    }

    public String getId() {
        return this.cHc;
    }

    public boolean uI(String string) {
        if (string == null) {
            return false;
        }
        if (string.equalsIgnoreCase(this.cHc) || fyw_0.gqw().aA(this.cHc, string)) {
            this.uJ(string);
            return true;
        }
        return false;
    }

    private void uJ(String string) {
        String string2 = this.cHc;
        this.tCd.aO(this.cHc, string);
        this.cHc = string;
        if (this.aXA != null) {
            for (int i = this.aXA.size() - 1; i >= 0; --i) {
                fhs_2 fhs_22 = this.aXA.get(i);
                if (fhs_22.getId() == null) continue;
                String string3 = this.cHc + fhs_22.getId().substring(string2.length());
                fhs_22.uJ(string3);
            }
        }
    }

    public boolean uK(String string) {
        if (string == null) {
            return false;
        }
        return this.uH(string) != null;
    }

    public boolean aL(String string, String string2) {
        if (string == null && string2 == null || string != null && string.equalsIgnoreCase(string2)) {
            return true;
        }
        if (this.uxw == null || this.uxw.containsKey(string2) || !this.uxw.containsKey(string)) {
            return false;
        }
        fhv_1 fhv_12 = this.uxw.remove(string);
        if (string2 != null) {
            this.uxw.put(string2, fhv_12);
        }
        return true;
    }

    @Override
    @NotNull
    public Iterator<fhv_1> iterator() {
        return this.uxw.values().iterator();
    }

    public void uL(String string) {
        if (this.uxw != null) {
            this.uxw.remove(string);
        }
    }

    public void l(fhv_1 fhv_12) {
        if (fhv_12 == null || this.uxw == null) {
            return;
        }
        String string = fhv_12.getId();
        if (string == null) {
            for (Map.Entry<String, fhv_1> entry : this.uxw.entrySet()) {
                if (entry.getValue() != fhv_12) continue;
                string = entry.getKey();
                break;
            }
        }
        if (string != null) {
            this.uxw.remove(string);
        }
    }

    private void h(fhs_2 fhs_22) {
        if (this.aXA == null) {
            this.aXA = new ArrayList(5);
        }
        this.aXA.add(fhs_22);
    }

    private void i(fhs_2 fhs_22) {
        if (this.aXA == null) {
            return;
        }
        this.aXA.remove(fhs_22);
    }

    public ArrayList<fhs_2> gAu() {
        return this.aXA;
    }

    public void j(fhs_2 fhs_22) {
        if (this.uxz != null) {
            this.uxz.i(this);
        }
        this.uxz = fhs_22;
        if (this.uxz != null) {
            this.uxz.h(this);
        }
    }

    public fhs_2 gAv() {
        return this.uxz;
    }

    public void b(fsf_1 fsf_12) {
        this.uxx.put(fsf_12.getName(), fsf_12);
    }

    public fsf_1 getProperty(String string) {
        fsf_1 fsf_12 = this.uxx.get(string);
        if (fsf_12 == null && this.uxz != null) {
            fsf_12 = this.uxz.getProperty(string);
        }
        return fsf_12;
    }

    public Collection<fsf_1> getProperties() {
        return this.uxx.values();
    }

    public void clear() {
        if (this.uxw != null) {
            this.uxw.clear();
            this.uxw = null;
        }
        if (this.uxy != null) {
            this.uxy.clear();
        }
        for (fsf_1 fsf_12 : this.uxx.values()) {
            fse_1.gFu().c(fsf_12);
        }
        if (this.aXA != null) {
            for (int i = this.aXA.size() - 1; i >= 0; --i) {
                this.aXA.get(i).clear();
            }
            this.aXA.clear();
            this.aXA = null;
        }
        this.uxx.clear();
        this.cHc = null;
        this.uxz = null;
    }

    public void a(String string, fry_1 fry_12) {
        if (this.uxy == null) {
            this.uxy = new HashMap();
        }
        this.uxy.put(string, fry_12);
    }

    public fry_1 uM(String string) {
        fry_1 fry_12 = null;
        if (this.uxy != null) {
            fry_12 = this.uxy.get(string);
        }
        if (fry_12 == null && this.uxz != null) {
            fry_12 = this.uxz.uM(string);
        }
        return fry_12;
    }

    public boolean uN(String string) {
        boolean bl = false;
        if (this.uxy != null) {
            bl = this.uxy.containsKey(string);
        }
        if (!bl && this.uxz != null) {
            bl = this.uxz.uN(string);
        }
        return bl;
    }

    public void uO(String string) {
        fry_1 fry_12 = null;
        if (this.uxy != null) {
            fry_12 = this.uxy.remove(string);
        }
        if (this.uxz != null && fry_12 == null) {
            this.uxz.uO(string);
        }
    }

    public void aM(String string, String string2) {
        if (this.uxA == null) {
            this.uxA = new THashMap();
        }
        this.uxA.put((Object)string, (Object)string2);
    }

    public String aN(String string, String string2) {
        String string3 = (String)this.uxA.get((Object)string);
        fhs_2 fhs_22 = this.uxz;
        while (string3 == null && fhs_22 != null) {
            string3 = fhs_22.aN(string, string2);
            fhs_22 = fhs_22.uxz;
        }
        return string3 == null ? string2 : string3;
    }
}

