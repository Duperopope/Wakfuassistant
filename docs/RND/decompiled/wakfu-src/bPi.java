/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.MediaOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.MediaOneOf;

class bPi {
    static final /* synthetic */ int[] kOv;

    static {
        kOv = new int[MediaOneOf.DiscriminatorEnum.values().length];
        try {
            bPi.kOv[MediaOneOf.DiscriminatorEnum.MEDIAIMAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPi.kOv[MediaOneOf.DiscriminatorEnum.MEDIAYOUTUBEVIDEO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPi.kOv[MediaOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

