/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bSX
 */
public class bsx_1
extends bsq_1 {
    private static final Logger llA = Logger.getLogger(bsx_1.class);
    private static final String llB = "value";
    private String axs;

    @Override
    public void l(apd_1 apd_12) {
        super.l(apd_12);
        apd_1 apd_13 = apd_12.fq(llB);
        if (apd_13 != null) {
            this.axs = apd_13.bCt();
        }
    }

    @Override
    public bss_1 eni() {
        return new bsx_1();
    }

    @Override
    protected void a(afe afe2, aez_0<?, ?> aez_02) {
        if (afe2.d(aez_02) != null) {
            aez_02.a(afe2, this.axs);
        }
    }

    @Override
    protected void a(String string, aeb_1 aeb_12) {
        llA.error((Object)String.format("Unable to set property without KeyInterface associated (Key provided : %s)", string));
    }

    public String toString() {
        return "SetPropertyAction{m_name='" + this.p + "'{m_value='" + this.axs + "'}";
    }
}

