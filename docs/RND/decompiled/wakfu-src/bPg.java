/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.PromoteSectionOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.PromoteSectionOneOf;

class bPg {
    static final /* synthetic */ int[] kOo;

    static {
        kOo = new int[PromoteSectionOneOf.DiscriminatorEnum.values().length];
        try {
            bPg.kOo[PromoteSectionOneOf.DiscriminatorEnum.PROMOTESECTIONARTICLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPg.kOo[PromoteSectionOneOf.DiscriminatorEnum.PROMOTESECTIONCAROUSEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPg.kOo[PromoteSectionOneOf.DiscriminatorEnum.PROMOTESECTIONIMAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPg.kOo[PromoteSectionOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

