/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 */
import javax.annotation.Nullable;
import org.apache.log4j.Logger;

/*
 * Renamed from bdl
 */
public final class bdl_1
extends Enum<bdl_1> {
    public static final /* enum */ bdl_1 hKz = new bdl_1(ffS.sgB.shb, "Chapeau", "Chapeau02", "CheveuxHaut");
    public static final /* enum */ bdl_1 hKA = new bdl_1(ffS.sgC.shb, "Cheveux", "Natte");
    public static final /* enum */ bdl_1 hKB = new bdl_1(ffS.sgD.shb, "Barbe");
    public static final /* enum */ bdl_1 hKC = new bdl_1(ffS.sgE.shb, "Epaulette-G", "Epaulette-D");
    public static final /* enum */ bdl_1 hKD = new bdl_1(ffS.sgG.shb, "CorpsHabit", "Jupe", "CuisseHabit");
    public static final /* enum */ bdl_1 hKE = new bdl_1(ffS.sgM.shb, "BassinPeau");
    public static final /* enum */ bdl_1 hKF = new bdl_1(ffS.sgN.shb, "JambeHabit", "PiedHabit01", "PiedHabit02", "CuisseHabit");
    public static final /* enum */ bdl_1 hKG = new bdl_1(ffS.sgO.shb, "Cape", "CapeBas");
    public static final /* enum */ bdl_1 hKH = new bdl_1(ffS.sgQ.shb, "Arme");
    public static final /* enum */ bdl_1 hKI = new bdl_1(ffS.sgR.shb, "Bouclier");
    public static final /* enum */ bdl_1 hKJ = new bdl_1(ffS.sgS.shb, "Accessoire", "Accessoire-0", "Accessoire-1", "Accessoire-2");
    private static final Logger hKK;
    private static final aat_1<bdl_1> hKL;
    private static final aaf_1 hKM;
    private final short hKN;
    public final String[] hKO;
    public final int[] hKP;
    private static final /* synthetic */ bdl_1[] hKQ;

    public static bdl_1[] values() {
        return (bdl_1[])hKQ.clone();
    }

    public static bdl_1 valueOf(String string) {
        return Enum.valueOf(bdl_1.class, string);
    }

    private bdl_1(short s, String ... stringArray) {
        this.hKN = s;
        this.hKO = stringArray;
        this.hKP = arn_2.o(stringArray);
    }

    @Nullable
    public static bdl_1 bi(short s) {
        return hKL.aL(s);
    }

    private static /* synthetic */ bdl_1[] ddw() {
        return new bdl_1[]{hKz, hKA, hKB, hKC, hKD, hKE, hKF, hKG, hKH, hKI, hKJ};
    }

    static {
        hKQ = bdl_1.ddw();
        hKK = Logger.getLogger(bdl_1.class);
        hKL = new aat_1();
        for (bdl_1 bdl_12 : bdl_1.values()) {
            assert (!hKL.aJ(bdl_12.hKN));
            hKL.a(bdl_12.hKN, bdl_12);
        }
        hKM = new aaf_1();
        hKM.wm(ffS.sgJ.shb);
        hKM.wm(ffS.sgI.shb);
        hKM.wm(ffS.sgX.shb);
        hKM.wm(ffS.sgZ.shb);
        hKM.wm(ffS.sgL.shb);
        hKM.wm(ffS.sgF.shb);
    }
}

