/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fTP
 */
public class ftp_2
extends fta_1<ftp_2> {
    public ftp_2(String string, ftp_2 ftp_22) {
        super(null, string, ftp_22, false);
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.vgD.clear();
        printWriter.println("\tpublic void " + this.aLO() + "() {");
        for (ftb_2 ftb_22 : this.vgA) {
            printWriter.println("\t\t" + ftb_22.a(this));
        }
        printWriter.println("\t}");
    }
}

