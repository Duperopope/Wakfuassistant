/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bJL
extends bip_1 {
    private static final Logger kmv = Logger.getLogger(bJL.class);
    private final bJK kmw;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte e(bJK bJK2) {
        InputStream inputStream;
        URL uRL;
        String string;
        try {
            string = String.format(auc_0.cVq().bS("fullSubMapPath"), bJK2.aqZ(), bJK2.d() / 100);
            try {
                string = apr_1.bA(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return 1;
            }
        }
        catch (fu_0 fu_02) {
            return 1;
        }
        try {
            uRL = fo_0.bA(string);
        }
        catch (MalformedURLException malformedURLException) {
            return 1;
        }
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        try {
            inputStream = uRL.openStream();
        }
        catch (IOException iOException) {
            return 1;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            aqr_22.gU(bufferedInputStream);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
        }
        catch (Exception exception) {
            byte by = 1;
            return by;
        }
        finally {
            try {
                bufferedInputStream.close();
            }
            catch (IOException iOException) {
                kmv.warn((Object)iOException);
            }
        }
        ArrayList<apd_1> arrayList = aqs_22.bGT().fo("mapNavigatorBackgroundPart");
        apd_1 apd_12 = arrayList.get(0);
        apd_1 apd_13 = apd_12.fq("maskLevel");
        return (byte)(apd_13.bCn() + 1);
    }

    public bJL(bJK bJK2) {
        super(bJK2.eaV(), bJK2.d(), null, null, null, bJL.e(bJK2), null, null, -1L, true);
        this.kmw = bJK2;
    }

    @Override
    public vf_0 eaW() {
        return super.eaW();
    }

    @Override
    public axb_2 dYq() {
        bJr bJr2 = (bJr)this.kmw.doW();
        if (bJr2 == null) {
            return bJN.kmC;
        }
        int n = bjx_0.klY.HE(bJr2.d());
        if (n == 30) {
            return bJN.kmD;
        }
        if (n == 31) {
            return bJN.kmE;
        }
        if (n == 32) {
            return bJN.kmF;
        }
        if (n == 33) {
            return bJN.kmG;
        }
        return bJN.kmC;
    }

    @Override
    public String byf() {
        return null;
    }

    @Override
    public String dZs() {
        return aum_0.cWf().a(66, (long)this.kmw.d(), new Object[0]);
    }

    @Override
    public String dYn() {
        short s = this.kmw.aVf();
        short s2 = this.kmw.aVe();
        if (s == -1 || s2 == -1) {
            return null;
        }
        return aum_0.cWf().c("recommended.level", s, s2);
    }

    public bJK eaX() {
        return this.kmw;
    }

    @Override
    public boolean dXU() {
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khC, this.kmw.d());
        if (biq_12 == null) {
            return false;
        }
        short s = (short)this.kmw.aqZ();
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(s);
        return bzq_22.lEI;
    }

    @Override
    public void a(bif_2 bif_22) {
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khC, this.kmw.d());
        bif_22.a(biq_12);
    }
}

