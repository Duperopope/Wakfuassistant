/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.SteamClient
 *  com.ankamagames.steam.wrapper.CSteamID
 */
import com.ankamagames.steam.client.SteamClient;
import com.ankamagames.steam.wrapper.CSteamID;

public final class bMZ {
    private bMZ() {
    }

    public static SteamClient efm() {
        SteamClient steamClient = new SteamClient();
        if (!steamClient.init(false)) {
            return null;
        }
        abg_2.bUP().a(() -> ((SteamClient)steamClient).runCallbacks(), 1000L, -1);
        return steamClient;
    }

    public static boolean b(SteamClient steamClient) {
        return bMX.kAi.a(steamClient);
    }

    public static void efn() {
        CSteamID cSteamID = bMX.kAi.efo();
        bNa.a(cSteamID, "");
        bNa.jF("Overlay Enabled : " + bMX.kAi.efl());
    }
}

