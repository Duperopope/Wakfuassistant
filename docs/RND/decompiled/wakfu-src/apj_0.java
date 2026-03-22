/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBiMap
 */
import com.google.common.collect.HashBiMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aPj
 */
public abstract class apj_0 {
    public static final String exi = "subPipe";
    public static final int exj = -1;
    private static final int exk = 100;
    private final aPl exl;
    private LinkedList<api_0> exm;
    protected final List<aPk> exn = new ArrayList<aPk>();
    private final HashBiMap<String, apj_0> exo = HashBiMap.create();

    public apj_0(aPl aPl2) {
        this.exl = aPl2;
    }

    public aPl czu() {
        return this.exl;
    }

    public int d() {
        return this.exl.d();
    }

    public String czv() {
        return this.exl.czv();
    }

    public axb_2 getColor() {
        return this.exl.getColor();
    }

    public String getName() {
        return this.exl.czD();
    }

    public boolean czw() {
        return this.exl.czw();
    }

    public boolean czx() {
        return this.exl.czw();
    }

    public Mv aUXX() {
        return this.exl.aUXX();
    }

    public LinkedList<api_0> czy() {
        return this.exm;
    }

    public void a(String string, apj_0 apj_02) {
        if (!this.exo.containsKey((Object)string)) {
            this.exo.put((Object)string, (Object)apj_02);
        }
        for (aPk aPk2 : this.exn) {
            aPk2.b(apj_02, aOZ.evn);
        }
    }

    public void d(apj_0 apj_02) {
        if (apj_02 == null) {
            return;
        }
        this.exo.inverse().remove((Object)apj_02);
        apj_02.clean();
    }

    public void g(api_0 api_02) {
        if (this.exm == null) {
            this.exm = new LinkedList();
        }
        if (this.exm.size() > 100) {
            this.exm.removeLast();
        }
        this.exm.addFirst(api_02);
        if (this.exn.isEmpty()) {
            aPb.c(api_02);
        }
        for (aPk aPk2 : this.exn) {
            aPk2.b(api_02);
        }
    }

    public void a(api_0 api_02, String string) {
        apj_0 apj_02 = (apj_0)this.exo.get((Object)string);
        if (apj_02 != null) {
            apj_02.g(api_02);
        } else {
            this.g(api_02);
        }
    }

    public abstract void jf(String var1);

    public void a(aPk aPk2) {
        if (!this.exn.contains(aPk2)) {
            this.exn.add(aPk2);
        }
    }

    public void b(aPk aPk2) {
        this.exn.remove(aPk2);
    }

    public List<aPk> aYR() {
        return this.exn;
    }

    public boolean czz() {
        return this.exn.isEmpty();
    }

    public apj_0 jg(String string) {
        return (apj_0)this.exo.get((Object)string);
    }

    public Map<String, apj_0> czA() {
        return this.exo;
    }

    public void clean() {
        if (this.exm != null) {
            this.exm.clear();
        }
        for (apj_0 apj_02 : this.exo.values()) {
            apj_02.clean();
        }
        this.exo.clear();
        this.exn.clear();
    }

    public boolean czB() {
        return aPl.exN.contains((Object)this.exl);
    }
}

