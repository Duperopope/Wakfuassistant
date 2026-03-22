/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;

public class bNJ
implements aeh_2,
bNO {
    public static final String kIi = "name";
    public static final String kIj = "isActivated";
    public static final String kIk = "isEnabled";
    public static final String kIl = "errorText";
    public static final String[] kIm = new String[]{"name"};
    public static final byte kIn = 0;
    public static final byte kIo = 1;
    public static final byte kIp = 3;
    private final long kIq;
    private final frg_0 kIr;
    private final boolean kIs;
    private final TByteHashSet kIt;

    public bNJ(frg_0 frg_02, long l, boolean bl, TByteHashSet tByteHashSet) {
        this.kIr = frg_02;
        this.kIq = l;
        this.kIs = bl;
        this.kIt = tByteHashSet;
    }

    @Override
    public String[] bxk() {
        return kIm;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kIi)) {
            return this.getName();
        }
        if (string.equals(kIk)) {
            return this.kIs;
        }
        if (string.equals(kIj)) {
            return this.apo();
        }
        if (string.equals(kIl)) {
            Object object;
            ahv_2 ahv_22 = new ahv_2();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (this.kIt.contains((byte)3)) {
                if (ahv_22.bXe() > 0) {
                    ahv_22.ceH();
                }
                ahv_22.c(aum_0.cWf().c("error.playerNotInstanceAccessRight", new Object[0]));
            }
            ang_2 ang_22 = this.kIr.bdo();
            if (this.kIt.contains((byte)1)) {
                if (ahv_22.bXe() > 0) {
                    ahv_22.ceH();
                }
                object = csb_2.eOl().eOm();
                ahv_22.c(eLP.a((amx_1)ang_22, new eLR(bgt_02, object, this.kIr, bgt_02.bdV(), true)));
            }
            if (ahv_22.bXe() > 0) {
                object = ahv_22.ceL();
                ahv_22 = new ahv_2();
                ahv_22.ceC().ih(awx_2.dnJ.bQk());
                ahv_22.c((CharSequence)object);
                ahv_22.ceD();
            }
            return ahv_22.bXe() == 0 ? null : ahv_22.ceL();
        }
        return null;
    }

    @Override
    public long Sn() {
        return (long)this.kIr.gko() == this.kIq ? (long)this.kIr.gkn() : (long)this.kIr.gko();
    }

    public String getName() {
        return aum_0.cWf().a(83, (long)((int)this.Sn()), new Object[0]);
    }

    public String dah() {
        return aum_0.cWf().b(83, (long)((int)this.Sn()), new Object[0]);
    }

    public boolean apo() {
        return true;
    }
}

