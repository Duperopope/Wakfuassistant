/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.MetadataOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.PromoteTargetOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.MetadataOneOf;
import com.ankama.shopi.client.model.PromoteTargetOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;

class bPr {
    static final /* synthetic */ int[] kPh;
    static final /* synthetic */ int[] kPi;
    static final /* synthetic */ int[] kPj;
    static final /* synthetic */ int[] kPk;
    static final /* synthetic */ int[] kPl;

    static {
        kPl = new int[ReferenceOneOf.DiscriminatorEnum.values().length];
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.KARDREFERENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.GAMEACTIONREFERENCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.CLASSICREFERENCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.SERVERREFERENCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.WAVENITEMREFERENCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.ACCOUNTSTATUSREFERENCE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.VIRTUALSUBSCRIPTIONREFERENCE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.VODREFERENCE.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.WEBTOONREFERENCE.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.OGRINEREFERENCE.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.GOULTINEREFERENCE.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPl[ReferenceOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        kPk = new int[MetadataOneOf.DiscriminatorEnum.values().length];
        try {
            bPr.kPk[MetadataOneOf.DiscriminatorEnum.STRINGMETADATA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPk[MetadataOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        kPj = new int[ArticlePaymentModeOneOf.DiscriminatorEnum.values().length];
        try {
            bPr.kPj[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPj[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLENONVIRTUALPAYMENTMODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPj[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEVIRTUALPAYMENTMODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPj[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEMOBILEPAYMENTMODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPj[ArticlePaymentModeOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        kPi = new int[PromoteTargetOneOf.DiscriminatorEnum.values().length];
        try {
            bPr.kPi[PromoteTargetOneOf.DiscriminatorEnum.ARTICLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPi[PromoteTargetOneOf.DiscriminatorEnum.CATEGORY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPi[PromoteTargetOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        kPh = new int[bpy_2.values().length];
        try {
            bPr.kPh[bpy_2.kQU.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kQV.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kQW.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kQX.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kQY.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kRa.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kRb.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kQZ.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bPr.kPh[bpy_2.kRc.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

