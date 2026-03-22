/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bSU
 */
public class bsu_1
extends bsq_1 {
    private static final Logger lls = Logger.getLogger(bsu_1.class);
    private static final String llt = "store";
    protected afh llu;

    @Override
    public bss_1 eni() {
        return new bsu_1();
    }

    @Override
    public void l(apd_1 apd_12) {
        String string;
        super.l(apd_12);
        apd_1 apd_13 = apd_12.fq(llt);
        if (apd_13 != null && (string = apd_13.bCt()) != null && !string.isBlank()) {
            try {
                this.llu = afh.valueOf(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                lls.error((Object)String.format("[PREFS] - Unable to fetch %s related of this %s (entry related %s)", afh.class, this.getClass(), apd_12));
            }
        }
    }

    @Override
    protected void a(afe afe2, aez_0<?, ?> aez_02) {
        Object object = this.llu == null ? afe2.d(aez_02) : aez_02.b(this.llu);
        if (object == null) {
            return;
        }
        object.es(afe2.getKey());
    }

    @Override
    protected void a(String string, aeb_1 aeb_12) {
        aeb_12.es(string);
    }

    public String toString() {
        return "RemovePropertyAction{m_name='" + this.p + "'m_store='" + String.valueOf((Object)this.llu) + "'}";
    }
}

