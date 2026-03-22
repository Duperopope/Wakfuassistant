/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUX
 */
public class cux_1
implements adi_1 {
    private static final Logger nOn = Logger.getLogger(cux_1.class);
    public static final cux_1 nOo = new cux_1();

    public static cux_1 eTn() {
        return nOo;
    }

    private cux_1() {
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
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17149: {
                dbs dbs2 = (dbs)aam_22;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (dbs2.faK() == Vf.bxK) {
                    bgt_02.dnQ().mz(dbs2.getName());
                }
                return false;
            }
            case 16874: {
                dbx dbx2 = (dbx)aam_22;
                bhJ bhJ2 = (bhJ)bgg_0.dlO().lI(dbx2.getName());
                if (bvk.dJZ().ai(bhJ2)) {
                    bvk.dJZ().mw(dbx2.getName());
                } else {
                    aPd.e("guild.error.cannot.invite.user", new Object[0]);
                }
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

