/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccx
 */
public class ccx_0
implements adi_1 {
    private static final Logger lOX = Logger.getLogger(ccx_0.class);
    private final cci_0 lOY;

    public ccx_0(cci_0 cci_02) {
        this.lOY = cci_02;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 28: {
                nl_0 nl_02 = (nl_0)aam_22;
                this.lOY.cV(nl_02.aVT());
                fiu_1.uCW.N("serverSelectionLock", true);
                return false;
            }
            case 37: {
                No no = (No)aam_22;
                boolean bl = no.aVV();
                byte[] byArray = no.aVW();
                if (!bl) {
                    this.lOY.dN(byArray);
                }
                return false;
            }
            case 338: {
                Nm nm = (Nm)aam_22;
                this.lOY.ee(nm.aVU());
                return false;
            }
            case 304: {
                nq_0 nq_02 = (nq_0)aam_22;
                String string = aqf_0.jC(nq_02.getMessage());
                switch (nq_02.aVY()) {
                    case 0: {
                        aqh_0.cBI().jG(string);
                        break;
                    }
                    case 1: {
                        aqh_0.cBI().jF(string);
                        break;
                    }
                    case 2: {
                        aqh_0.cBI().jI(string);
                        break;
                    }
                    default: {
                        lOX.error((Object)("Type de message inconnu " + nq_02.aVY()));
                    }
                }
                return false;
            }
            case 348: {
                nt_0 nt_02 = (nt_0)aam_22;
                String string = aqf_0.jC(nt_02.getMessage());
                switch (nt_02.aVY()) {
                    case 0: {
                        aqh_0.cBI().jG(string);
                        break;
                    }
                    case 1: {
                        aqh_0.cBI().jF(string);
                        break;
                    }
                    case 2: {
                        aqh_0.cBI().jI(string);
                        break;
                    }
                    case 3: {
                        aqh_0.cBI().n(string, nt_02.AM());
                        break;
                    }
                    default: {
                        lOX.error((Object)("Type de message inconnu " + nt_02.aVY()));
                    }
                }
                return false;
            }
            case 303: {
                nz_0 nz_02 = (nz_0)aam_22;
                byte by = nz_02.aWq();
                na_1 na_12 = new na_1();
                na_12.E(by);
                this.lOY.etu().d(na_12);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

