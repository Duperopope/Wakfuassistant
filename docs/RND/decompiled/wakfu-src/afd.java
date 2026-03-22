/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class afd
extends Enum<afd>
implements afb {
    public static final /* enum */ afd cpy = new afd("musicVolume", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpz = new afd("ambianceSoundsVolume", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpA = new afd("uiSoundsVolume", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpB = new afd("musicMute", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpC = new afd("ambianceSoundsMute", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpD = new afd("uiSoundsMute", afh.cpT, afh.cpU);
    public static final /* enum */ afd cpE = new afd("musicContinuousMode", afh.cpT, afh.cpU);
    private final String cpF;
    private final afh[] cpG;
    private static final /* synthetic */ afd[] cpH;

    public static afd[] values() {
        return (afd[])cpH.clone();
    }

    public static afd valueOf(String string) {
        return Enum.valueOf(afd.class, string);
    }

    private afd(String string2, afh ... afhArray) {
        this.cpF = string2;
        this.cpG = afhArray;
    }

    @Override
    public String getKey() {
        return this.cpF;
    }

    @Override
    public List<aeb_1> b(aez_0<?, ?> aez_02) {
        ArrayList<aeb_1> arrayList = new ArrayList<aeb_1>();
        for (afh afh2 : this.cpG) {
            arrayList.add(aez_02.b(afh2));
        }
        return arrayList;
    }

    @Override
    public List<afh> bxq() {
        return Arrays.asList(this.cpG);
    }

    private static /* synthetic */ afd[] bxs() {
        return new afd[]{cpy, cpz, cpA, cpB, cpC, cpD, cpE};
    }

    static {
        cpH = afd.bxs();
    }
}

