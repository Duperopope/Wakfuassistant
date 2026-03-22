/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fTJ
 */
public class ftj_1
extends ftz_2<ftk_1> {
    static final String vgY = "doc";
    private final fhq_2 vgZ;

    public ftj_1(PrintWriter printWriter, String string, String string2, fhq_2 fhq_22) {
        super(printWriter, string, string2);
        this.E(fhi_1.class);
        this.E(fhq_2.class);
        this.E(fhl_2.class);
        this.E(awx_2.class);
        this.vgv = printWriter;
        this.vgZ = fhq_22;
    }

    public String gHu() {
        return vgY;
    }

    public fhq_2 gqB() {
        return this.vgZ;
    }

    public void j(fhq_2 fhq_22) {
        this.a(new ftk_1(fhq_22, vgY, "method" + this.laa++, (ftk_1)this.vgu, false));
    }

    @Override
    public void gHf() {
        ftd_2 ftd_22 = new ftd_2(null, ((ftk_1)this.vgu).aLO(), null, ((ftk_1)this.vgu).gHi());
        super.gHf();
        ((ftk_1)this.vgu).a(ftd_22);
    }

    @Override
    public void a(ftk_1 ftk_12) {
        this.a(ftk_12);
    }

    @Override
    public void gHh() {
        for (Object object : this.vgt) {
            for (ftb_2 ftb_22 : ((fta_1)object).gHk()) {
                Class<?> clazz = ftb_22.gBQ();
                if (clazz == null) continue;
                this.E(clazz);
            }
        }
        if (this.vgr != null) {
            this.vgv.println("package " + this.vgr + ";");
        }
        this.vgv.println();
        for (Object object : this.vgs) {
            this.vgv.println("import " + ((Class)object).getCanonicalName() + ";");
        }
        this.vgv.println();
        this.vgv.println("public class " + this.vgq + " implements ThemeLoader {");
        this.vgv.println();
        for (Object object : this.vgt) {
            ((ftk_1)object).a(this.vgv);
            this.vgv.println();
        }
        this.vgv.println("}");
        this.vgv.flush();
    }
}

