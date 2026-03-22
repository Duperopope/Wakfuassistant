/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.ParseException;
import org.apache.log4j.Logger;

/*
 * Renamed from cHe
 */
@fyf_0
public class che_1 {
    protected static final Logger mZl = Logger.getLogger(che_1.class);
    public static final String PACKAGE = "wakfu.split";
    public static short mZm;
    public static short lZm;
    public static long mZn;
    public static long mZo;
    private static long mZp;
    private static ffV iWZ;
    private static bmj_2 mZq;
    private static bea_0 mZr;
    private static short mZs;
    private static Long mZt;
    private static long mZu;
    private static bsu_0 mZv;
    private static String mhy;
    private static bgl_0 mZw;
    private static bgl_0 mZx;

    public static long getCurrentQuantity(fdu_1 fdu_12) {
        try {
            return My.aUV().cQ(fdu_12.getText());
        }
        catch (ParseException parseException) {
            mZl.error((Object)"Error reversing number format", (Throwable)parseException);
            return 0L;
        }
    }

    public static void decreaseSplitCountToOne(fiq_1 fiq_12, fdu_1 fdu_12) {
        che_1.a(fdu_12, 1L, true);
    }

    public static void decreaseSplitCount(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fdu_12.getText().isEmpty()) {
            return;
        }
        long l = che_1.getCurrentQuantity(fdu_12);
        che_1.a(fdu_12, --l, true);
    }

    public static void keyType(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).gDW() == '\n') {
            che_1.validSplit(fiq_12);
            return;
        }
        if (fdu_12.getText().isEmpty()) {
            return;
        }
        long l = che_1.getCurrentQuantity(fdu_12);
        che_1.a(fdu_12, l, false);
    }

    private static void a(fdu_1 fdu_12, long l, boolean bl) {
        if (l < 0L) {
            l = 0L;
            bl = true;
        } else if (l > mZp) {
            l = mZp;
            bl = true;
        }
        mZu = l;
        if (bl) {
            fdu_12.setText(My.aUV().cQ(mZu));
        }
    }

    public static void increaseSplitCount(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fdu_12.getText().isEmpty()) {
            return;
        }
        long l = che_1.getCurrentQuantity(fdu_12);
        che_1.a(fdu_12, ++l, true);
    }

    public static void increaseSplitCountToMax(fiq_1 fiq_12, fdu_1 fdu_12) {
        che_1.a(fdu_12, mZp, true);
    }

    public static void validSplit(fiq_1 fiq_12) {
        long l = 0L;
        short s = 0;
        if (che_1.eKE()) {
            l = mZu;
        } else {
            s = (short)mZu;
        }
        fyw_0.gqw().tl("splitStackDialog");
        if (s > 0 || l > 0L) {
            switch (mZs) {
                case 16135: 
                case 17012: 
                case 19598: {
                    break;
                }
                case 18339: {
                    dbl_0 dbl_02 = new dbl_0();
                    dbl_02.lK(mZs);
                    dbl_02.setItem(iWZ);
                    dbl_02.ak(s);
                    dbl_02.setSourceUniqueId(mZn);
                    dbl_02.setDestinationUniqueId(mZo);
                    dbl_02.setDestinationPosition(lZm);
                    aaw_1.bUq().h(dbl_02);
                    return;
                }
                case 17390: 
                case 19409: {
                    dae_0 dae_02 = new dae_0();
                    dae_02.gj(l);
                    dae_02.lK(mZs);
                    aaw_1.bUq().h(dae_02);
                    return;
                }
                case 17100: 
                case 19660: {
                    dbl_0 dbl_03 = new dbl_0();
                    dbl_03.lK(mZs);
                    dbl_03.setItem(iWZ);
                    dbl_03.ak(s);
                    dbl_03.setDestinationUniqueId(mZo);
                    dbl_03.setDestinationPosition(lZm);
                    aaw_1.bUq().h(dbl_03);
                    return;
                }
                case 16784: 
                case 17635: 
                case 18230: 
                case 18367: {
                    dbl_0 dbl_04 = new dbl_0();
                    dbl_04.lK(mZs);
                    dbl_04.gj(iWZ.LV());
                    dbl_04.az(s);
                    dbl_04.setDestinationPosition(lZm);
                    aaw_1.bUq().h(dbl_04);
                    return;
                }
                case 16019: {
                    dbl_0 dbl_05 = new dbl_0();
                    dbl_05.setItem(iWZ);
                    dbl_05.ak(s);
                    dbl_05.lK(mZs);
                    aaw_1.bUq().h(dbl_05);
                    return;
                }
                case 16690: {
                    dad_0 dad_02 = new dad_0();
                    dad_02.setMerchantItem(mZr);
                    dad_02.setDestinationPosition(lZm);
                    dad_02.oR(mZo);
                    dad_02.ak(s);
                    dad_02.lK(16690);
                    aaw_1.bUq().h(dad_02);
                    return;
                }
                case 16938: {
                    dck dck2 = new dck((bjm_0)fse_1.gFu().aW("pet", "petDialog"), iWZ);
                    dck2.ak(s);
                    aaw_1.bUq().h(dck2);
                    return;
                }
                case 16046: {
                    dak_0 dak_02 = new dak_0(mZq);
                    dak_02.az(s);
                    aaw_1.bUq().h(dak_02);
                    return;
                }
                case 19259: 
                case 19868: {
                    dbl_0 dbl_06 = new dbl_0();
                    dbl_06.setDestinationPosition(lZm);
                    dbl_06.setSourcePosition(mZm);
                    dbl_06.setSourceUniqueId(mZn);
                    dbl_06.setDestinationUniqueId(mZo);
                    dbl_06.setSourceCharacter(mZw);
                    dbl_06.setItem(iWZ);
                    dbl_06.ak(s);
                    dbl_06.fa(mhy);
                    dbl_06.lK(mZs);
                    aaw_1.bUq().h(dbl_06);
                    return;
                }
                case 16514: {
                    dbl_0 dbl_07 = new dbl_0();
                    dbl_07.setDestinationPosition(lZm);
                    dbl_07.setDestinationUniqueId(mZo);
                    dbl_07.setDestinationCharacter(mZx);
                    dbl_07.ak(s);
                    dbl_07.setItem(iWZ);
                    dbl_07.lK(mZs);
                    aaw_1.bUq().h(dbl_07);
                    return;
                }
                case 17579: {
                    dbj dbj2 = new dbj();
                    dbj2.f(mZv);
                    dbj2.ak(s);
                    dbj2.lK(17579);
                    aaw_1.bUq().h(dbj2);
                    return;
                }
            }
            if (bsl_0.jfZ.dFs()) {
                fyw_0.gqw().tl("splitStackDialog");
                if (s > 0) {
                    dbf_0 dbf_02 = new dbf_0();
                    dbf_02.setExchangeId(mZt);
                    dbf_02.setItem(iWZ);
                    dbf_02.NN(s);
                    dbf_02.lK(mZs);
                    aaw_1.bUq().h(dbf_02);
                }
            } else {
                dbl_0 dbl_08 = new dbl_0();
                dbl_08.setDestinationPosition(lZm);
                dbl_08.setSourcePosition(mZm);
                dbl_08.setSourceUniqueId(mZn);
                dbl_08.setDestinationUniqueId(mZo);
                dbl_08.setSourceCharacter(mZw);
                dbl_08.setItem(iWZ);
                dbl_08.ak(s);
                dbl_08.lK(mZs);
                aaw_1.bUq().h(dbl_08);
            }
        }
    }

    private static boolean eKE() {
        return mZs == 19012 || mZs == 19409 || mZs == 17390;
    }

    public static void setMaxQuantity(long l) {
        mZp = l;
        if (mZu > l) {
            mZu = l;
        }
    }

    public static void setMessageType(short s) {
        mZs = s;
    }

    public static void setExchangeId(long l) {
        mZt = l;
    }

    public static void setMerchantItem(bea_0 bea_02) {
        mZr = bea_02;
    }

    public static void setItem(ffV ffV2) {
        iWZ = ffV2;
        mZu = ffV2.bfd();
    }

    public static void setIngredientView(bmj_2 bmj_22) {
        mZq = bmj_22;
        mZu = mZq.bfd();
    }

    public static void setExchangeEntryView(bsu_0 bsu_02) {
        mZv = bsu_02;
        mZu = 1L;
    }

    public static void setSourceUniqueId(long l) {
        mZn = l;
    }

    public static void setSourcePosition(short s) {
        mZm = s;
    }

    public static void setDestinationPosition(short s) {
        lZm = s;
    }

    public static void setDestinationUniqueId(long l) {
        mZo = l;
    }

    public static short getSourcePosition() {
        return mZm;
    }

    public static short getDestinationPosition() {
        return lZm;
    }

    public static long getSourceUniqueId() {
        return mZn;
    }

    public static long getDestinationUniqueId() {
        return mZo;
    }

    public static long getMaxQuantity() {
        return mZp;
    }

    public static ffV getItem() {
        return iWZ;
    }

    public static bea_0 getMerchantItem() {
        return mZr;
    }

    public static short getMessageType() {
        return mZs;
    }

    public static Long getExchangeId() {
        return mZt;
    }

    public static bgl_0 getDestinationCharacter() {
        return mZx;
    }

    public static void setDestinationCharacter(bgl_0 bgl_02) {
        mZx = bgl_02;
    }

    public static bgl_0 getSourceCharacter() {
        return mZw;
    }

    public static void setSourceCharacter(bgl_0 bgl_02) {
        mZw = bgl_02;
    }

    public static void setTargetCompartmentId(String string) {
        mhy = string;
    }
}

