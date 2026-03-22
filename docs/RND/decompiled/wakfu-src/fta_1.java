/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Renamed from fTA
 */
public abstract class fta_1<T extends fta_1>
implements ftf_2 {
    public static final int vgw = 500;
    protected String vgx;
    protected final String vgy;
    protected final T vgz;
    protected final ArrayList<ftb_2> vgA = new ArrayList();
    protected final ArrayList<T> vgB = new ArrayList();
    protected final HashMap<String, Object> vgC = new HashMap();
    protected final HashSet<String> vgD = new HashSet();
    protected int laa = 0;
    private int vgE;

    public fta_1(String string, String string2, T t, boolean bl) {
        this.vgx = string;
        this.vgy = string2;
        this.vgz = t;
    }

    void a(ftb_2 ftb_22) {
        this.vgA.add(ftb_22);
    }

    void b(T t) {
        this.vgB.add(t);
    }

    String bn(Object object) {
        Object object2 = "var";
        if (object != null) {
            object2 = (String)object2 + object.getClass().getSimpleName();
        }
        String string = object2;
        do {
            object2 = string + this.laa;
            ++this.laa;
        } while (this.vgC.containsKey(object2));
        this.vgC.put((String)object2, object);
        return object2;
    }

    public String gHi() {
        return this.vgx;
    }

    public T gHj() {
        return this.vgz;
    }

    public Object ws(String string) {
        return this.vgC.get(string);
    }

    @Override
    public String gHa() {
        String string = null;
        do {
            string = "var" + this.laa;
            ++this.laa;
        } while (this.vgC.containsKey(string));
        this.vgC.put(string, null);
        return string;
    }

    public boolean isFull() {
        return this.vgA.size() >= 500;
    }

    public void n(String string, Object object) {
        this.vgC.put(string, object);
    }

    @Override
    public boolean wt(String string) {
        return this.vgD.contains(string);
    }

    @Override
    public void wu(String string) {
        this.vgD.add(string);
    }

    public ArrayList<ftb_2> gHk() {
        return this.vgA;
    }

    public ArrayList<T> getChildren() {
        return this.vgB;
    }

    public String aLO() {
        return this.vgy;
    }

    public void gHc() {
        this.vgE = this.vgA.size();
    }

    public void gHd() {
        this.vgE = -1;
    }

    public void gHe() {
        if (this.vgE == -1) {
            return;
        }
        for (int i = this.vgA.size() - 1; i >= this.vgE; --i) {
            this.vgA.remove(i);
        }
    }

    public abstract void a(PrintWriter var1);
}

