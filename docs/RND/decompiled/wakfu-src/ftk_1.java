/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fTK
 */
public class ftk_1
extends fta_1<ftk_1> {
    private final fhq_2 vha;

    public ftk_1(fhq_2 fhq_22, String string, String string2, ftk_1 ftk_12, boolean bl) {
        super(string, string2, ftk_12, bl);
        this.vha = fhq_22;
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.vgD.clear();
        printWriter.println("\tpublic void " + this.aLO() + "(DocumentParser " + this.vgx + ") {");
        for (ftb_2 ftb_22 : this.vgA) {
            printWriter.println("\t\t" + ftb_22.a(this));
        }
        printWriter.println("\t}");
    }
}

