/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cSJ
 */
public class csj_2
implements adi_1 {
    private static final Logger nGt = Logger.getLogger(csj_2.class);
    private static final csj_2 nGu = new csj_2();

    public static csj_2 eOt() {
        return nGu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            aba_2 aba_22 = (aba_2)aam_22;
            if (aba_22.bUy() == -1) {
                bfR.hWV.dhE();
            }
            return false;
        }
        aam_22.d();
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cdv_0.euj().e(this);
        }
    }

    @Override
    public long Sn() {
        return 5L;
    }

    @Override
    public void dC(long l) {
    }
}

