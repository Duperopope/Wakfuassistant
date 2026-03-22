/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRE
 */
public class are_0 {
    protected final String eLn;
    protected final String eLo;
    private final evp_2[] eLp;
    protected final String eLq;

    public are_0(String string, String string2, evp_2[] evp_2Array, String string3) {
        this.eLn = string;
        this.eLo = string2;
        this.eLp = evp_2Array;
        this.eLq = string3;
    }

    protected void a(ahv_2 ahv_22, boolean bl) {
        ahv_22.ceH();
        ahv_22.ceC().e(aRD.eLk).c(this.eLn).c((CharSequence)(this.eLo.isEmpty() ? "" : " " + this.eLo)).ceD();
        ahv_22.ceC().e(awx_2.dnS).ceH().c("\t - " + this.eLq).ceD();
        if (bl) {
            ahv_22.ceC().e(awx_2.dnQ).ceH().c("\t - rights : ");
            for (evp_2 evp_22 : this.eLp) {
                ahv_22.c(aRD.eLj[evp_22.d()] + " ");
            }
            ahv_22.ceD();
        }
    }

    public String toString() {
        return "Command{m_name='" + this.eLn + "', m_parameters='" + this.eLo + "', m_description='" + this.eLq + "'}";
    }
}

