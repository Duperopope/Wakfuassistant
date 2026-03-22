/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fTN
 */
public class ftn_2
extends ftg_2<ftn_2> {
    private static final String vhg = "doc";
    private final boolean vhh;

    public ftn_2(apd_1 apd_12, fhi_2 fhi_22, String string, String string2, ftn_2 ftn_22, boolean bl) {
        super(apd_12, fhi_22, string, string2, ftn_22, bl);
        this.vhh = bl;
    }

    @Override
    protected void py(boolean bl) {
        if (bl) {
            this.a(new fte_2(fhq_2.class, vhg, "parser", true));
            this.a(new ftd_2(null, "push", "elementMaps", "currentElementMap"));
        }
        this.a(new fte_2(fhs_2.class, "elementMap", "elementMaps.peek()"));
    }

    public String gHu() {
        return vhg;
    }

    @Override
    public void a(fhi_2 fhi_22, String string) {
        this.vgO = fhi_22;
        this.vgx = string;
        if (this.vgO != null) {
            this.vgP = this.bn(fhi_22);
        }
        if (this.vgO != null && this.vgx != null) {
            this.n(this.vgx, this.vgO);
        }
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.vgD.clear();
        if (this.vhh) {
            printWriter.println("\t@Override");
            printWriter.println("\tpublic void " + this.aLO() + "(final ElementMap currentElementMap, final DocumentParser parser, final Widget " + this.vgx + ") {");
        } else {
            printWriter.println("\tpublic BasicElement " + this.aLO() + "(final BasicElement " + this.vgx + ") {");
        }
        for (ftb_2 ftb_22 : this.vgA) {
            printWriter.println("\t\t" + ftb_22.a(this));
        }
        if (!this.vhh) {
            printWriter.println("\t\treturn " + this.vgR + ";");
        }
        printWriter.println("\t}");
    }
}

