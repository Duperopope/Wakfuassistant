/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bIr
 */
public class bir_2
extends biq_1 {
    private static final Logger kge = Logger.getLogger(bir_2.class);
    private long beA;

    public bir_2(long l, String string) {
        super(l, null, string, null);
        this.dYp();
    }

    private void dYp() {
        URL uRL = null;
        try {
            uRL = new URL(auc_0.i("completeMapCoordsPath", this.Sn()));
        }
        catch (fu_0 fu_02) {
            return;
        }
        catch (MalformedURLException malformedURLException) {
            return;
        }
        aqs_2 aqs_22 = bir_2.h(uRL);
        if (aqs_22 == null) {
            return;
        }
        aqt_2 aqt_22 = aqs_22.bGT();
        apd_1 apd_12 = aqt_22.fq("soundId");
        this.beA = apd_12 != null ? apd_12.bCp() : -1L;
        ArrayList<apd_1> arrayList = aqt_22.fo("coord");
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            biq_2 biq_22 = bir_2.k(arrayList.get(i));
            this.a(biq_22);
            this.a((ffq_2)biq_22);
        }
    }

    private static aqs_2 h(URL uRL) {
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
            aqr_22.gU(bufferedInputStream);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
            bufferedInputStream.close();
        }
        catch (Exception exception) {
            kge.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + String.valueOf(uRL)));
            return null;
        }
        return aqs_22;
    }

    private static biq_2 k(apd_1 apd_12) {
        Object object;
        String string;
        int n = apd_12.fq("id").bCo();
        int n2 = apd_12.fq("startX").bCo();
        int n3 = apd_12.fq("startY").bCo();
        int n4 = apd_12.fq("endX").bCo();
        int n5 = apd_12.fq("endY").bCo();
        apd_1 apd_13 = apd_12.fq("scrollDecorator");
        byte by = apd_13 != null ? apd_13.bCn() : (byte)0;
        apd_1 apd_14 = apd_12.fq("animName1");
        String string2 = apd_14 != null ? apd_14.bCt() : null;
        apd_1 apd_15 = apd_12.fq("animName2");
        String string3 = apd_15 != null ? apd_15.bCt() : null;
        apd_1 apd_16 = apd_12.fq("highlightSoundId");
        long l = apd_16 != null ? apd_16.bCp() : -1L;
        apd_1 apd_17 = apd_12.fq("type");
        bii_2 bii_22 = bii_2.khD;
        apd_1 apd_18 = apd_12.fq("display");
        boolean bl = apd_18 == null || apd_18.bCu();
        apd_1 apd_19 = apd_12.fq("visibilityCriterion");
        String string4 = string = apd_19 != null ? apd_19.bCt() : "";
        if (apd_17 != null && (object = bii_2.mQ(apd_17.bCt())) != null) {
            bii_22 = object;
        }
        object = null;
        if (bii_22 == bii_2.khD) {
            object = n == 0 ? "???" : aum_0.cWf().a(77, (long)n, new Object[0]);
        } else if (bii_22 == bii_2.khF) {
            object = n == 0 ? "???" : aum_0.cWf().a(145, (long)n, new Object[0]);
        } else if (bii_22 == bii_2.khG && n >= 0) {
            object = n == 0 ? "???" : aum_0.cWf().a(144, (long)n, new Object[0]);
        }
        vf_0 vf_02 = bl ? bir_2.A(n2, n4, n3, n5) : null;
        return new biq_2(vf_02, n, bii_22, (String)object, string, by, string2, string3, l);
    }

    private void a(biq_2 biq_22) {
        bii_2 bii_22 = biq_22.dYl();
        long l = biq_22.Sn();
        ffi_2 ffi_22 = null;
        switch (bii_22) {
            case khF: {
                ffi_22 = new bir_2(l, biq_22.dZs());
                break;
            }
            case khE: {
                short s = (short)l;
                TLongArrayList tLongArrayList = bzp_2.eqt().mB(s);
                ffi_22 = new bin_2(s, tLongArrayList);
                break;
            }
            case khD: {
                if (l == 0L) break;
                ffi_22 = new bic_2(l, false);
            }
        }
        if (ffi_22 != null) {
            ffi_22.b(this);
            bih_2.dZf().a(bii_22, ffi_22.Sn(), (biq_1)ffi_22);
        }
    }

    private static vf_0 A(int n, int n2, int n3, int n4) {
        vf_0 vf_02 = new vf_0();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                vf_02.ap(i, j);
            }
        }
        return vf_02;
    }

    @Override
    public axb_2 dYq() {
        return awx_2.dnC;
    }

    @Override
    public String dYr() {
        try {
            return auc_0.i("completeMapPath", this.Sn());
        }
        catch (fu_0 fu_02) {
            return null;
        }
    }

    public long aYj() {
        return this.beA;
    }

    @Override
    public void a(bip_2 bip_22) {
        bip_22.dYi().dYC();
    }

    @Override
    public boolean dYs() {
        return true;
    }

    @Override
    public boolean dXU() {
        biq_1 biq_12 = this.dYt();
        return biq_12 != null;
    }

    @Override
    public void b(bip_2 bip_22) {
        biq_1 biq_12 = this.dYt();
        if (biq_12 != null) {
            bif_2.dYO().a(biq_12);
        }
    }

    private biq_1 dYt() {
        biq_1 biq_12;
        for (biq_12 = bih_2.dZf().b(bii_2.khD, aue_0.cVJ().cVK().aqZ()); biq_12 != null && biq_12.gvG() != this; biq_12 = (biq_1)biq_12.gvG()) {
        }
        return biq_12;
    }
}

