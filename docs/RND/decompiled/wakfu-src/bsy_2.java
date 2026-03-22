/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bSY
 */
public class bsy_2 {
    private static final Logger llC = Logger.getLogger(bsy_2.class);
    private static final String llD = "action";

    public static void a(URL uRL, aez_0 aez_02, aeb_1 aeb_12, int n) {
        Object object;
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        try {
            object = uRL.openStream();
            aqr_22.gU((InputStream)object);
            aqr_22.a(aqs_22, new ape_1[0]);
            ((InputStream)object).close();
        }
        catch (Exception exception) {
            llC.warn((Object)"Probl\u00e8me \u00e0 l'ouverture : ", (Throwable)exception);
            return;
        }
        object = bsy_2.a(aqs_22, n);
        bsy_2.a((List<bss_1>)object, aez_02, aeb_12);
    }

    private static List<bss_1> a(aqs_2 aqs_22, int n) {
        aqt_2 aqt_22 = aqs_22.bGT();
        ArrayList<apd_1> arrayList = aqt_22.fo(llD);
        ArrayList<bss_1> arrayList2 = new ArrayList<bss_1>(arrayList.size());
        for (apd_1 apd_12 : arrayList) {
            bss_1 bss_12 = bst_1.llj.a(apd_12, n);
            if (bss_12 == null) continue;
            arrayList2.add(bss_12);
        }
        return arrayList2;
    }

    private static void a(List<bss_1> list, aez_0 aez_02, aeb_1 aeb_12) {
        for (bss_1 bss_12 : list) {
            bss_12.a(aez_02, aeb_12);
        }
    }
}

