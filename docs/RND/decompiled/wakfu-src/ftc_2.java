/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

/*
 * Renamed from fTC
 */
public class ftc_2
extends ftz_2 {
    private apd_1 vgF;

    public ftc_2(PrintWriter printWriter, String string, String string2, apd_1 apd_12) {
        super(printWriter, string, string2);
        this.D(apd_12);
        this.E(fhi_2.class);
        this.E(fhv_1.class);
        this.E(fhk_1.class);
        this.E(apd_1.class);
        this.E(Stack.class);
    }

    protected void D(apd_1 apd_12) {
        this.vgu = new ftg_2<Object>(apd_12, null, null, "getElement", null, true);
        this.vgt.add(this.vgu);
    }

    public String gHl() {
        return ((ftg_2)this.vgt.get(0)).gHl();
    }

    public String gHm() {
        return ((ftg_2)this.vgt.get(0)).gHm();
    }

    public void a(apd_1 apd_12, fhi_2 fhi_22, String string) {
        this.a(new ftg_2<ftg_2>(apd_12, fhi_22, string, "method" + this.laa++, (ftg_2)this.vgu, false));
    }

    @Override
    public void gHf() {
        this.px(true);
    }

    public void px(boolean bl) {
        if (bl) {
            ftd_2 ftd_22 = new ftd_2(null, this.vgu.aLO(), null, this.vgu.gHi());
            super.gHf();
            this.vgu.a(ftd_22);
        } else {
            super.gHf();
        }
    }

    @Override
    public void gHh() {
        ftg_2 ftg_22;
        int n = this.vgt.size();
        for (int i = 0; i < n; ++i) {
            ftg_22 = (ftg_2)this.vgt.get(i);
            ArrayList<ftb_2> arrayList = ftg_22.gHk();
            int n2 = arrayList.size();
            for (int j = 0; j < n2; ++j) {
                Class<?> clazz = arrayList.get(j).gBQ();
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
        n = this.vgt.size();
        for (int i = 0; i < n; ++i) {
            ftg_22 = (ftg_2)this.vgt.get(i);
            ftg_22.a(this.vgv);
            this.vgv.println();
        }
        this.vgv.println("}");
        this.vgv.flush();
    }
}

