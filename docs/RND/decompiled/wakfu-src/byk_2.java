/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 */
import com.ankama.shopi.client.model.CartPaymentModeOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.VirtualPaymentModeId;

/*
 * Renamed from bYk
 */
class byk_2 {
    static final /* synthetic */ int[] lyQ;
    static final /* synthetic */ int[] lyR;
    static final /* synthetic */ int[] lyS;

    static {
        lyS = new int[CartPaymentModeOneOf.DiscriminatorEnum.values().length];
        try {
            byk_2.lyS[CartPaymentModeOneOf.DiscriminatorEnum.CARTFREEPAYMENTMODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyS[CartPaymentModeOneOf.DiscriminatorEnum.CARTVIRTUALPAYMENTMODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyS[CartPaymentModeOneOf.DiscriminatorEnum.CARTNONVIRTUALPAYMENTMODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyS[CartPaymentModeOneOf.DiscriminatorEnum.CARTMOBILEPAYMENTMODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyS[CartPaymentModeOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        lyR = new int[VirtualPaymentModeId.values().length];
        try {
            byk_2.lyR[VirtualPaymentModeId.SW.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyR[VirtualPaymentModeId.OG.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyR[VirtualPaymentModeId.GO.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyR[VirtualPaymentModeId.WV.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyR[VirtualPaymentModeId.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        lyQ = new int[ReferenceOneOf.DiscriminatorEnum.values().length];
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.KARDREFERENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.GAMEACTIONREFERENCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.CLASSICREFERENCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.SERVERREFERENCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.WAVENITEMREFERENCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.ACCOUNTSTATUSREFERENCE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.VIRTUALSUBSCRIPTIONREFERENCE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.VODREFERENCE.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.WEBTOONREFERENCE.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.OGRINEREFERENCE.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.GOULTINEREFERENCE.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            byk_2.lyQ[ReferenceOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

