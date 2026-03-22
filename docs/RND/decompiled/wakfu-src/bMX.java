/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.SteamClient
 *  com.ankamagames.steam.client.transaction.SteamMicroTxnResponseHandler
 *  com.ankamagames.steam.client.transaction.SteamTransactionListener
 *  com.ankamagames.steam.client.userstats.SteamUserStatsListener
 *  com.ankamagames.steam.wrapper.EResult
 *  com.ankamagames.steam.wrapper.SteamApi
 *  com.ankamagames.steam.wrapper.UserAchievementStored_t
 *  com.ankamagames.steam.wrapper.UserStatsReceived_t
 *  com.ankamagames.steam.wrapper.UserStatsStored_t
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.client.SteamClient;
import com.ankamagames.steam.client.transaction.SteamMicroTxnResponseHandler;
import com.ankamagames.steam.client.transaction.SteamTransactionListener;
import com.ankamagames.steam.client.userstats.SteamUserStatsListener;
import com.ankamagames.steam.wrapper.EResult;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.steam.wrapper.UserAchievementStored_t;
import com.ankamagames.steam.wrapper.UserStatsReceived_t;
import com.ankamagames.steam.wrapper.UserStatsStored_t;
import org.apache.log4j.Logger;

public class bMX
extends bnb_0
implements SteamUserStatsListener {
    private static final Logger kAh = Logger.getLogger(bMX.class);
    public static final bMX kAi = new bMX();
    private SteamClient kAj;
    private SteamMicroTxnResponseHandler kAk;

    private bMX() {
    }

    public boolean a(SteamClient steamClient) {
        this.kAj = steamClient;
        boolean bl = this.a(this.kAj.getSteamId());
        this.efp().setListener((SteamUserStatsListener)this);
        cCE.mAG.jJ(bl);
        this.kAk = new SteamMicroTxnResponseHandler();
        this.kAk.setListener((SteamTransactionListener)new bMY(this));
        return bl;
    }

    public SteamClient efi() {
        return this.kAj;
    }

    public String efj() {
        return SteamApi.SteamApps().GetCurrentGameLanguage();
    }

    public boolean efk() {
        return this.efp().resetUserStats();
    }

    public boolean v(String string, int n) {
        return this.efp().setStat(string, n);
    }

    public boolean efl() {
        return SteamApi.SteamUtils().IsOverlayEnabled();
    }

    public void onUserStatsReceived(UserStatsReceived_t userStatsReceived_t) {
        bNa.a(userStatsReceived_t.getM_steamIDUser(), "UserStatsReceived", userStatsReceived_t.getM_eResult());
        if (userStatsReceived_t.getM_eResult() != EResult.k_EResultOK) {
            this.efp().requestUserStats();
        }
    }

    public void onUserStatsStored(UserStatsStored_t userStatsStored_t) {
        bNa.a(this.efo(), "UserStatsStored GameId=" + userStatsStored_t.getM_nGameID().longValue(), userStatsStored_t.getM_eResult());
    }

    public void onUserAchievementStored(UserAchievementStored_t userAchievementStored_t) {
        bNa.a(this.efo(), "Achievement stored : " + userAchievementStored_t.getM_rgchAchievementName());
    }

    public String toString() {
        return "SteamClientContext{m_client=" + String.valueOf(this.kAj) + "}";
    }
}

