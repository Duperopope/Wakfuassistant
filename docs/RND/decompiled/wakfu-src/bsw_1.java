/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bSW
 */
public class bsw_1
extends bsp_1 {
    private static final Logger lly = LoggerFactory.getLogger(bsw_1.class);
    private static final String llz = "newName";
    protected String aDC;

    @Override
    public bss_1 eni() {
        return new bsw_1();
    }

    @Override
    public void l(apd_1 apd_12) {
        super.l(apd_12);
        apd_1 apd_13 = apd_12.fq(llz);
        if (apd_13 != null) {
            this.aDC = apd_13.bCt();
        }
    }

    @Override
    public void a(aez_0<?, ?> aez_02, aeb_1 aeb_12) {
        if (this.p == null) {
            lly.error("Unable to run {} without name of initial property", bsw_1.class);
            return;
        }
        if (this.aDC == null) {
            lly.error("Unable to run {} without name of new property", bsw_1.class);
            return;
        }
        afe afe2 = aez_02.et(this.p);
        Object object = afe2 != null ? afe2.c(aez_02) : aeb_12;
        if (object == null) {
            return;
        }
        if (!aeb_12.n(this.p, true)) {
            return;
        }
        String string = object.ep(this.p);
        aeb_1 aeb_13 = afe2 != null ? afe2.d(aez_02) : aeb_12;
        aeb_13.es(this.p);
        object = aez_02.et(this.aDC);
        aeb_13 = afe2 != null ? object.d(aez_02) : aeb_12;
        aeb_13.s(this.aDC, string);
    }

    public String toString() {
        return "RemovePropertyAction{m_name='" + this.p + "'}";
    }
}

