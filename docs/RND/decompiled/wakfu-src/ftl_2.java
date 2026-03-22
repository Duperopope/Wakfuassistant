/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * Renamed from fTL
 */
public class ftl_2
extends ftc_2 {
    private static final String vhb = "doc";
    private fhi_2 vgO;

    public ftl_2(PrintWriter printWriter, String string, String string2, apd_1 apd_12, fhi_2 fhi_22, fhq_2 fhq_22) {
        super(printWriter, string, string2, apd_12);
        this.E(fhh_2.class);
        ((ftn_2)this.vgu).a(fhi_22, "element", true);
    }

    @Override
    protected void D(apd_1 apd_12) {
        this.vgu = new ftn_2(apd_12, null, null, "applyStyle", null, true);
        this.vgt.add(this.vgu);
    }

    @Override
    public void a(apd_1 apd_12, fhi_2 fhi_22, String string) {
        this.a(new ftn_2(apd_12, fhi_22, string, "method" + this.laa++, (ftn_2)this.vgu, false));
    }

    @Override
    public void px(boolean bl) {
        if (bl) {
            ftd_2 ftd_22 = new ftd_2(null, this.vgu.aLO(), null, this.vgu.gHi());
            this.vgu = this.vgu.gHj();
            this.vgu.a(ftd_22);
        } else {
            this.vgu = this.vgu.gHj();
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
        this.vgv.println("public class " + this.vgq + " implements StyleSetter {");
        this.vgv.println();
        this.vgv.println("\tprivate DocumentParser doc;");
        this.vgv.println("\tprivate Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
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

