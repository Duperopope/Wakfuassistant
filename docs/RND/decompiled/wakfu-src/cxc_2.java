/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$markAsReadCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$markAsReadRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi;
import com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cXC
 */
public class cxc_2
implements adi_1 {
    private static final cxc_2 nWz = new cxc_2();
    private alx_2 ikv;
    private static final Logger nWA = Logger.getLogger(cxc_2.class);

    private cxc_2() {
    }

    public static cxc_2 eXo() {
        return nWz;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16193: {
                bsx_2 bsx_22 = (bsx_2)fse_1.gFu().getProperty("pollView").getValue();
                if (bsx_22 == null) {
                    return false;
                }
                String string = bsx_22.bZo();
                if (BH.aU(string)) {
                    return false;
                }
                aue_0.cVJ().b(nWz);
                aet_1.ht(string);
                cxc_2.oK(bsx_22.emR());
                return false;
            }
            case 16929: {
                bsx_2 bsx_23 = (bsx_2)fse_1.gFu().getProperty("pollView").getValue();
                if (bsx_23 == null) {
                    return false;
                }
                aue_0.cVJ().b(nWz);
                cxc_2.oK(bsx_23.emR());
                return false;
            }
        }
        return true;
    }

    private static void oK(long l) {
        CmsPollInGameApi.markAsReadRequest markAsReadRequest2 = CmsPollInGameApi.markAsReadRequest().item(Long.valueOf(l));
        CmsPollInGameApi.markAsReadCallback markAsReadCallback2 = CmsPollInGameApi.markAsReadCallback().on200(apiResponse -> nWA.info((Object)("Poll " + l + " answered"))).onDefault(apiResponse -> nWA.error((Object)("Error " + apiResponse.getStatusCode() + "  when answering poll: " + (String)apiResponse.getData()))).onException(throwable -> nWA.error((Object)"Error when answering poll", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)markAsReadRequest2, (ApiCallback.Callback)markAsReadCallback2);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = string -> {
                if (string.equals("pollNotificationDialog")) {
                    aue_0.cVJ().b(nWz);
                }
            };
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("pollNotificationDialog");
            cAY.eHc().nP(600012L);
            fyw_0.gqw().d("wakfu.pollNotifications", cgm_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("pollNotificationDialog");
            fse_1.gFu().vX("pollView");
            cAY.eHc().nP(600013L);
            fyw_0.gqw().tc("wakfu.pollNotifications");
        }
    }

    public static void aC(List<CmsPollInGame> list) {
        if (list.isEmpty()) {
            return;
        }
        Optional<CmsPollInGame> optional = list.stream().filter(cxc_2::a).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        CmsPollInGame cmsPollInGame = optional.get();
        bsx_2 bsx_22 = new bsx_2(cmsPollInGame);
        fse_1.gFu().f("pollView", bsx_22);
        aue_0.cVJ().a(nWz);
    }

    private static boolean a(CmsPollInGame cmsPollInGame) {
        if (BH.aU(cmsPollInGame.getCriterion())) {
            return true;
        }
        ang_2 ang_22 = cxc_2.b(cmsPollInGame);
        if (ang_22 == null) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return ang_22.b(bgt_02, bgt_02.aZw(), null, bgt_02.bdV());
    }

    private static ang_2 b(CmsPollInGame cmsPollInGame) {
        try {
            return ehu_0.rY(cmsPollInGame.getCriterion());
        }
        catch (Exception exception) {
            nWA.error((Object)("Error when compiling the poll " + cmsPollInGame.getItemId() + " criterion"), (Throwable)exception);
            return null;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

