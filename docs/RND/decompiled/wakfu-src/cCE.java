/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.AvatarImageLoad
 *  com.ankamagames.steam.client.friends.AvatarImageLoader
 *  com.ankamagames.steam.client.friends.SteamFriendsHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.steam.client.friends.AvatarImageLoad;
import com.ankamagames.steam.client.friends.AvatarImageLoader;
import com.ankamagames.steam.client.friends.SteamFriendsHandler;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class cCE
implements aeh_2 {
    private static final Logger mAF = Logger.getLogger(cCE.class);
    public static final cCE mAG = new cCE();
    public static final String mAH = "userName";
    public static final String mAI = "avatarIconUrl";
    public static final String mAJ = "hintActivated";
    public static final String mAK = "connected";
    private boolean mAL;
    private boolean mnm;
    private boolean mAM;
    private cCD mAN;

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (mAH.equals(string)) {
            SteamFriendsHandler steamFriendsHandler = bMX.kAi.efq();
            return steamFriendsHandler != null ? steamFriendsHandler.getPersonaName() : null;
        }
        if (mAJ.equals(string)) {
            return this.mAL;
        }
        if (mAK.equals(string)) {
            return this.mnm;
        }
        if (string.equals(mAI)) {
            return this.eJF();
        }
        return null;
    }

    public void jI(boolean bl) {
        this.mAL = bl;
        fse_1.gFu().a((aef_2)this, mAJ);
    }

    public void jJ(boolean bl) {
        this.mnm = bl;
        fse_1.gFu().a((aef_2)this, mAK);
    }

    private awk_1 eJF() {
        if (this.mAN != null && this.mAN.eJE()) {
            return this.mAN.eJF();
        }
        if (!this.mAM) {
            try {
                this.mAN = new cCD();
                AvatarImageLoader.INSTANCE.getFriendAvatar((AvatarImageLoad)this.mAN);
                this.mAM = true;
            }
            catch (RuntimeException runtimeException) {
                mAF.error((Object)"Exception during Steam avatar loading", (Throwable)runtimeException);
                this.mAM = true;
            }
        }
        return null;
    }
}

