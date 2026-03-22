/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aYE
implements afl {
    static final Logger hxM = Logger.getLogger(aYE.class);
    private static final aYE hxN = new aYE();

    public static aYE cYs() {
        return hxN;
    }

    private aYE() {
    }

    public void a(WL wL) {
        bmi_0 bmi_02 = new bmi_0();
        fqC.a(bmi_02);
        aqb_1.bGD().a(new aMd(), new ayf_0(this, bmi_02));
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.effectGroups", new Object[0]);
    }
}

