/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fTz
 */
public abstract class ftz_2<T extends fta_1<T>> {
    protected final String vgq;
    protected final String vgr;
    protected final HashSet<Class<?>> vgs = new HashSet();
    protected final ArrayList<T> vgt = new ArrayList();
    protected T vgu = null;
    protected PrintWriter vgv;
    protected int laa = 0;

    public ftz_2(PrintWriter printWriter, String string, String string2) {
        this.vgq = string == null || string.length() == 0 ? "Class0" : string;
        this.vgr = string2;
        this.vgv = printWriter;
    }

    protected void bkZ() {
    }

    public void E(Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            this.vgs.add(clazz);
        }
    }

    public void a(ftb_2 ftb_22) {
        ((fta_1)this.vgu).a(ftb_22);
    }

    public String bn(Object object) {
        return ((fta_1)this.vgu).bn(object);
    }

    public Object ws(String string) {
        return ((fta_1)this.vgu).ws(string);
    }

    public String gHa() {
        return ((fta_1)this.vgu).gHa();
    }

    public void n(String string, Object object) {
        ((fta_1)this.vgu).n(string, object);
    }

    public boolean wt(String string) {
        return ((fta_1)this.vgu).wt(string);
    }

    public void wu(String string) {
        ((fta_1)this.vgu).wu(string);
    }

    public String aLN() {
        return BH.bc(this.vgq);
    }

    public boolean gHb() {
        return ((fta_1)this.vgu).isFull();
    }

    public void gHc() {
        ((fta_1)this.vgu).gHc();
    }

    public void gHd() {
        ((fta_1)this.vgu).gHd();
    }

    public void gHe() {
        ((fta_1)this.vgu).gHe();
    }

    protected void a(T t) {
        if (this.vgu != null) {
            ((fta_1)this.vgu).b(t);
        }
        this.vgu = t;
        this.vgt.add(this.vgu);
    }

    public void gHf() {
        this.vgu = ((fta_1)this.vgu).gHj();
    }

    @Nullable
    public String gHg() {
        if (this.vgu == null) {
            return null;
        }
        return ((fta_1)this.vgu).aLO();
    }

    public void gHh() {
        for (fta_1 object : this.vgt) {
            for (ftb_2 ftb_22 : object.gHk()) {
                Class<?> clazz = ftb_22.gBQ();
                if (clazz == null) continue;
                this.E(clazz);
            }
        }
        if (this.vgr != null) {
            this.vgv.println("package " + this.vgr + ";");
        }
        this.vgv.println();
        for (Class clazz : this.vgs) {
            this.vgv.println("import " + clazz.getCanonicalName() + ";");
        }
        this.vgv.println();
        this.vgv.println("public class " + this.vgq + " implements BasicElementFactory {");
        this.vgv.println();
        this.vgv.println("\tprivate Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
        this.vgv.println("\tprivate Environment env;");
        this.vgv.println();
        for (fta_1 fta_12 : this.vgt) {
            fta_12.a(this.vgv);
            this.vgv.println();
        }
        this.vgv.println("}");
        this.vgv.flush();
    }
}

