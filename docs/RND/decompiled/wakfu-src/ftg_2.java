/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fTG
 */
public class ftg_2<T extends ftg_2>
extends fta_1<T> {
    protected fhi_2 vgO;
    protected String vgP;
    protected final String vgQ;
    protected String vgR = null;

    public ftg_2(apd_1 apd_12, fhi_2 fhi_22, String string, String string2, T t, boolean bl) {
        super(string, string2, t, bl);
        this.py(bl);
        this.vgQ = this.bn(apd_12);
        this.a(fhi_22, string);
        this.vgR = null;
    }

    protected void py(boolean bl) {
        if (bl) {
            this.a(new fte_2(fhu_1.class, "env", "environment", true));
            this.a(new ftd_2(null, "push", "elementMaps", "currentElementMap"));
        }
        this.a(new fte_2(fhs_2.class, "elementMap", "elementMaps.peek()"));
    }

    @Override
    String bn(Object object) {
        String string = super.bn(object);
        if (this.vgR == null && object instanceof fhv_1) {
            this.vgR = string;
        }
        return string;
    }

    public fhi_2 gHn() {
        return this.vgO;
    }

    public String gHl() {
        return this.vgP;
    }

    public String gHm() {
        return this.vgQ;
    }

    public String gHo() {
        return this.vgR;
    }

    @Override
    public void n(String string, Object object) {
        super.n(string, object);
        if (this.vgR == null && object instanceof fhv_1) {
            this.vgR = string;
        }
    }

    public void a(fhi_2 fhi_22, String string, boolean bl) {
        this.vgO = fhi_22;
        this.vgx = string;
        if (this.vgO != null) {
            this.vgP = this.bn(fhi_22);
        }
        if (bl) {
            this.vgP = string;
        }
        if (this.vgO != null && this.vgx != null) {
            this.n(this.vgx, this.vgO);
        }
    }

    public void a(fhi_2 fhi_22, String string) {
        this.a(fhi_22, string, false);
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.vgD.clear();
        if (this.vgx != null && this.vgO != null) {
            printWriter.println("\tpublic BasicElement " + this.aLO() + "(final " + this.vgO.getClass().getSimpleName() + " " + this.vgx + ") {");
        } else {
            printWriter.println("\t@Override");
            printWriter.println("\tpublic BasicElement " + this.aLO() + "(final Environment environment, final ElementMap currentElementMap) {");
        }
        for (ftb_2 ftb_22 : this.vgA) {
            printWriter.println("\t\t" + ftb_22.a(this));
        }
        printWriter.println("\t\treturn " + this.vgR + ";");
        printWriter.println("\t}");
    }
}

