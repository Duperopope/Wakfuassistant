/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bSV
 */
public class bsv_1
implements bss_1 {
    private static final Logger llv = Logger.getLogger(bsv_1.class);
    private static final String llw = "pattern";
    private static final String llx = "store";
    protected afh llu;
    protected String bxo;

    @Override
    public bss_1 eni() {
        return new bsv_1();
    }

    @Override
    public void l(apd_1 apd_12) {
        String string;
        apd_1 apd_13 = apd_12.fq(llw);
        if (apd_13 != null) {
            this.bxo = apd_13.bCt();
        } else {
            llv.warn((Object)String.format("[PREFS] - %s defined without pattern, ignored (entry related %s).", this.getClass(), apd_12));
        }
        apd_1 apd_14 = apd_12.fq(llx);
        if (apd_14 != null && (string = apd_14.bCt()) != null && !string.isBlank()) {
            try {
                this.llu = afh.valueOf(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                llv.error((Object)String.format("[PREFS] - Unable to fetch %s related of this %s (entry related %s)", afh.class, this.getClass(), apd_12));
            }
        }
    }

    public void a(aez_0 aez_02, aeb_1 aeb_12) {
        if (this.bxo == null) {
            return;
        }
        aeb_1 aeb_13 = this.llu != null ? aez_02.b(this.llu) : aeb_12;
        if (aeb_13 == null) {
            return;
        }
        aeb_12.bxf().stream().filter(string -> string.matches(this.bxo)).forEach(aeb_13::es);
    }

    public String toString() {
        return "RemovePropertyPatternAction{m_pattern='" + this.bxo + "'m_store='" + String.valueOf((Object)this.llu) + "'}";
    }
}

