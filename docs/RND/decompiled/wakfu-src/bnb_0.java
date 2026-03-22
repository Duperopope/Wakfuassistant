/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.SteamFriendsHandler
 *  com.ankamagames.steam.client.userstats.SteamUserStatsHandler
 *  com.ankamagames.steam.wrapper.CSteamID
 */
import com.ankamagames.steam.client.friends.SteamFriendsHandler;
import com.ankamagames.steam.client.userstats.SteamUserStatsHandler;
import com.ankamagames.steam.wrapper.CSteamID;

/*
 * Renamed from bNb
 */
public class bnb_0 {
    private CSteamID kAm;
    private SteamUserStatsHandler kAn;
    private SteamFriendsHandler kAo;
    private boolean crD;

    public boolean a(CSteamID cSteamID) {
        this.crD = true;
        this.kAm = cSteamID;
        this.kAn = new SteamUserStatsHandler();
        this.kAo = new SteamFriendsHandler();
        return this.kAn.requestUserStats();
    }

    public boolean blc() {
        return this.crD;
    }

    public CSteamID efo() {
        return this.kAm;
    }

    public SteamUserStatsHandler efp() {
        return this.kAn;
    }

    public SteamFriendsHandler efq() {
        return this.kAo;
    }

    public void bmX() {
        this.kAn.cleanUp();
        this.kAo.cleanUp();
    }
}

