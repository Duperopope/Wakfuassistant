/*
 * Decompiled with CFR 0.152.
 */
public final class aff
extends Enum<aff>
implements afi {
    public static final /* enum */ aff cpI = new aff("language", afh.cpT);
    public static final /* enum */ aff cpJ = new aff("resolution", afh.cpT);
    public static final /* enum */ aff cpK = new aff("useLargeMinResolution", afh.cpT);
    public static final /* enum */ aff cpL = new aff("UIScale", afh.cpT);
    public static final /* enum */ aff cpM = new aff("hideFlyingValues", afh.cpT);
    public static final /* enum */ aff cpN = new aff("accountPreferencesLoaded", afh.cpT);
    public static final /* enum */ aff cpO = new aff("messagebox.reverseYesNoButtonOrder", afh.cpT);
    public static final /* enum */ aff cpP = new aff("enableEnchantUIParticles", afh.cpT);
    private final String cpQ;
    private final afh cpR;
    private static final /* synthetic */ aff[] cpS;

    public static aff[] values() {
        return (aff[])cpS.clone();
    }

    public static aff valueOf(String string) {
        return Enum.valueOf(aff.class, string);
    }

    private aff(String string2, afh afh2) {
        this.cpQ = string2;
        this.cpR = afh2;
    }

    @Override
    public String getKey() {
        return this.cpQ;
    }

    @Override
    public aeb_1 e(aez_0<?, ?> aez_02) {
        return aez_02.b(this.cpR);
    }

    public static afe ew(String string) {
        for (aff aff2 : aff.values()) {
            if (!aff2.getKey().equals(string)) continue;
            return aff2;
        }
        return null;
    }

    private static /* synthetic */ aff[] bxt() {
        return new aff[]{cpI, cpJ, cpK, cpL, cpM, cpN, cpO, cpP};
    }

    static {
        cpS = aff.bxt();
    }
}

