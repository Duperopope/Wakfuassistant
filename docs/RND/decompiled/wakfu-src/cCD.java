/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.AvatarImageLoad
 *  com.ankamagames.steam.client.friends.AvatarType
 */
import com.ankamagames.steam.client.friends.AvatarImageLoad;
import com.ankamagames.steam.client.friends.AvatarType;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class cCD
extends AvatarImageLoad {
    private awk_1 mAE;

    cCD() {
        super(bMX.kAi.efo(), AvatarType.MEDIUM);
    }

    public void onImageLoaded(int n, int n2, int n3, short[] sArray) {
        abg_2.bUP().i(() -> {
            WritableRaster writableRaster = Raster.createInterleavedRaster(1, n2, n3, 4, null);
            writableRaster.setDataElements(0, 0, n2, n3, sArray);
            BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
            bufferedImage.setData(writableRaster);
            axc_2 axc_22 = axc_2.a(bufferedImage);
            awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX("SteamAvatar-" + n), axc_22, true);
            axc_22.bsI();
            this.mAE = awk_12;
            fse_1.gFu().a((aef_2)cCE.mAG, "avatarIconUrl");
        });
    }

    public boolean eJE() {
        return this.mAE != null;
    }

    public awk_1 eJF() {
        return this.mAE;
    }
}

