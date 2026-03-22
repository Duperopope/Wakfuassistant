/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class ffS
extends Enum<ffS>
implements aoq_1 {
    public static final /* enum */ ffS sgB = new ffS(0, "desc.equipment.head", "equipHeadBackground", 134);
    public static final /* enum */ ffS sgC = new ffS(1, "", "");
    public static final /* enum */ ffS sgD = new ffS(2, "", "");
    public static final /* enum */ ffS sgE = new ffS(3, "desc.equipment.shoulder", "equipShouldersBackground", 138);
    public static final /* enum */ ffS sgF = new ffS(4, "desc.equipment.neck", "equipNeckBackground", 120);
    public static final /* enum */ ffS sgG = new ffS(5, "desc.equipment.chest", "equipChestBackground", 136);
    public static final /* enum */ ffS sgH = new ffS(6, "desc.equipment.arms", "");
    public static final /* enum */ ffS sgI = new ffS(7, "desc.equipment.leftHand", "equipLeftHandBackground", 103);
    public static final /* enum */ ffS sgJ = new ffS(8, "desc.equipment.rightHand", "equipRightHandBackground", 103);
    public static final /* enum */ ffS sgK = new ffS(9, "desc.equipment.skirt", "");
    public static final /* enum */ ffS sgL = new ffS(10, "desc.equipment.belt", "equipBeltBackground", 133);
    public static final /* enum */ ffS sgM = new ffS(11, "desc.equipment.trousers", "");
    public static final /* enum */ ffS sgN = new ffS(12, "desc.equipment.legs", "equipLegsBackground", 119);
    public static final /* enum */ ffS sgO = new ffS(13, "desc.equipment.back", "equipBackBackground", 132);
    public static final /* enum */ ffS sgP = new ffS(14, "", "");
    public static final /* enum */ ffS sgQ = new ffS(15, "desc.equipment.firstWeapon", "equipFirstWeaponBackground", 100);
    public static final /* enum */ ffS sgR = new ffS(16, "desc.equipment.secondWeapon", "equipSecondWeaponBackground", 100);
    public static final /* enum */ ffS sgS = new ffS(17, "desc.equipment.accessory", "equipInsigneBackground", 646);
    public static final /* enum */ ffS sgT = new ffS(18, "", "");
    public static final /* enum */ ffS sgU = new ffS(19, "", "");
    public static final /* enum */ ffS sgV = new ffS(20, "", "");
    public static final /* enum */ ffS sgW = new ffS(21, "", "");
    public static final /* enum */ ffS sgX = new ffS(22, "desc.equipment.pet", "equipPetBackground", 582);
    @Deprecated
    public static final /* enum */ ffS sgY = new ffS(23, "desc.equipment.costume", "equipCostumeBackground");
    public static final /* enum */ ffS sgZ = new ffS(24, "desc.equipment.mount", "equipMountBackground", 611);
    public static final List<ffS> sha;
    public final byte shb;
    public final String shc;
    public final String shd;
    public final short she;
    private static final /* synthetic */ ffS[] shf;

    public static ffS[] values() {
        return (ffS[])shf.clone();
    }

    public static ffS valueOf(String string) {
        return Enum.valueOf(ffS.class, string);
    }

    private ffS(int n2, String string2, String string3) {
        this(n2, string2, string3, -1);
    }

    private ffS(int n2, String string2, String string3, int n3) {
        this.shb = (byte)n2;
        this.shc = string2;
        this.shd = string3;
        this.she = (short)n3;
    }

    public byte aJr() {
        return this.shb;
    }

    public short fVM() {
        return this.she;
    }

    public static byte fVN() {
        byte by = -1;
        for (ffS ffS2 : ffS.values()) {
            if (ffS2.shb <= by) continue;
            by = ffS2.shb;
        }
        return (byte)(by + 1);
    }

    @Override
    public String aXA() {
        return this.toString();
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Nullable
    public static ffS gj(byte by) {
        for (ffS ffS2 : ffS.values()) {
            if (ffS2.shb != by) continue;
            return ffS2;
        }
        return null;
    }

    @Override
    public String aXC() {
        return this.aXB();
    }

    private static /* synthetic */ ffS[] fVO() {
        return new ffS[]{sgB, sgC, sgD, sgE, sgF, sgG, sgH, sgI, sgJ, sgK, sgL, sgM, sgN, sgO, sgP, sgQ, sgR, sgS, sgT, sgU, sgV, sgW, sgX, sgY, sgZ};
    }

    static {
        shf = ffS.fVO();
        sha = List.of(sgB, sgO, sgF, sgE, sgG, sgL, sgI, sgJ, sgN, sgR, sgQ, sgS, sgZ, sgX);
    }
}

