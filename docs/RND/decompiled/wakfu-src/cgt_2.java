/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.apache.log4j.Logger;

/*
 * Renamed from cGT
 */
@fyf_0
public class cgt_2 {
    public static final String PACKAGE = "wakfu.reportBug";
    private static final Logger mYT = Logger.getLogger(cgt_2.class);

    public static void closeReportBugDialog(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            dae_0.cV((short)19362);
        }
    }

    public static boolean validateReportBugForm(fix_2 fix_22) {
        fix_22.gBS();
        fsf_1 fsf_12 = fix_22.getProperty("editableBugReport");
        if (fsf_12 != null) {
            String string = fsf_12.wc("title");
            String string2 = fsf_12.wc("description");
            if (string != null && string.length() >= 5 && string2 != null && string2.length() >= 5) {
                return true;
            }
            fiq_2.gCw().d(fik_2.gBZ().l("ReportBug.invalidForm", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return false;
        }
        return false;
    }

    public static void sendReportBug(fiq_1 fiq_12, fix_2 fix_22, can_2 can_22) {
        if ((fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) && fix_22.isValid()) {
            String string;
            BufferedReader bufferedReader;
            File file;
            aef_2 aef_22;
            can_22.ks("");
            can_22.nL(0L);
            can_22.oI("");
            aie_0.cfn();
            aue_0 aue_02 = aie_0.cfo();
            if (aue_02 != null) {
                can_22.ks(aub_0.cVb().cVp());
                aef_22 = aue_02.cVO();
                if (aef_22 != null) {
                    can_22.nL(((euv_1)((Object)aef_22)).xl());
                    can_22.oI(((euv_1)((Object)aef_22)).eGs());
                }
            }
            can_22.db(0L);
            can_22.dm("");
            can_22.Lw(0);
            can_22.Lx(0);
            aef_22 = aue_0.cVJ().cVK();
            if (aef_22 != null) {
                can_22.db(((exP)((Object)aef_22)).Sn());
                can_22.dm(((exP)((Object)aef_22)).aZk());
                can_22.Lw(((exP)((Object)aef_22)).bcC());
                can_22.Lx(((exP)((Object)aef_22)).bcD());
            }
            can_22.e(aie_0.cfn().bmB().bAI());
            can_22.oK(exH.pdr);
            fsf_1 fsf_12 = fix_22.getProperty("editableBugReport");
            Object object = "";
            try {
                file = new File(cgt_2.pO("logs/bugsLog.log.1"));
                file.mkdirs();
                bufferedReader = new BufferedReader(new FileReader(file));
                while ((string = bufferedReader.readLine()) != null) {
                    object = (String)object + string;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                mYT.warn((Object)("Ouverture/lecture Log (logs/bugsLog.log.1) n'existe pas, on passe au suivant : " + exception.toString()));
            }
            try {
                file = new File(cgt_2.pO("logs/bugsLog.log"));
                file.mkdirs();
                bufferedReader = new BufferedReader(new FileReader(file));
                while ((string = bufferedReader.readLine()) != null) {
                    object = (String)object + string;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                mYT.warn((Object)("Erreur ouverture/lecture Log (logs/bugsLog.log): " + exception.toString()));
            }
            can_22.oJ((String)object);
            dct dct2 = new dct();
            dct2.lK(18677);
            dct2.a(can_22);
            aaw_1.bUq().h(dct2);
        }
    }

    private static String pO(String string) {
        String string2 = System.getProperty("preferenceStorePath");
        return BH.aU(string2) ? string : string2 + "/" + string;
    }
}

