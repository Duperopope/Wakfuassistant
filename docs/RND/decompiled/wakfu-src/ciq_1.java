/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cIq
 */
public class ciq_1
extends cir_1
implements cpf_1 {
    private static final Logger ndI = Logger.getLogger(ciq_1.class);

    @Inject
    public ciq_1() {
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdV;
    }

    @Override
    protected void ey(int n, int n2) {
        fsG fsG2 = this.nae.getGroundUnderMouse(n, n2);
        if (fsG2 != null) {
            this.nae.c(fsG2);
            this.kWd = new cic_1(fsG2);
        }
    }
}

