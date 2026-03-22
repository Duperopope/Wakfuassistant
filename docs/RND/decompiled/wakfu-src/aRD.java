/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public class aRD
extends aRY {
    private static final Pattern eLg = Pattern.compile("\"");
    private static aqo_0 eLh;
    private static final int eLi = 0xFF0000;
    protected static final String[] eLj;
    public static final awx_2 eLk;
    private final boolean eLl;
    private final String eLm;

    public static void a(aqo_0 aqo_02) {
        eLh = aqo_02;
    }

    public static aqo_0 cCT() {
        return eLh;
    }

    public aRD() {
        this.eLm = "";
        this.eLl = false;
    }

    public aRD(boolean bl) {
        this.eLm = "";
        this.eLl = bl;
    }

    public aRD(String string) {
        this.eLm = string;
        this.eLl = false;
    }

    public aRD(String string, boolean bl) {
        this.eLm = string;
        this.eLl = bl;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ahv_2 ahv_22 = new ahv_2();
        for (are_0 are_02 : eLh.cBT()) {
            if ((this.eLm.isEmpty() || !are_02.eLn.toLowerCase().contains(eLg.matcher(this.eLm).replaceAll("").toLowerCase())) && !this.eLm.isEmpty()) continue;
            are_02.a(ahv_22, this.eLl);
        }
        String string = ahv_22.ceL();
        if (!string.isEmpty()) {
            aqh_0.cBI().jH(string);
        } else {
            aqh_0.cBI().n("La commande n'existe pas.", 0xFF0000);
        }
    }

    public String toString() {
        return "HelpCommand{m_command='" + this.eLm + "'}";
    }

    static {
        eLj = new String[]{"None", "Root", "Admin", "Staff", "Moderator"};
        eLk = new awx_2(0.0f, 0.7f, 0.0f, 1.0f);
    }
}

