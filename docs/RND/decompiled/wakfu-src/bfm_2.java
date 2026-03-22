/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.Optional;
import lombok.Generated;

/*
 * Renamed from bfm
 */
final class bfm_2
extends Enum<bfm_2> {
    public static final /* enum */ bfm_2 hRQ = new bfm_2(1, exx_2.rGx, "huppermage.last.rune.fire", 5371, "Fire");
    public static final /* enum */ bfm_2 hRR = new bfm_2(2, exx_2.rGy, "huppermage.last.rune.water", 5372, "Water");
    public static final /* enum */ bfm_2 hRS = new bfm_2(3, exx_2.rGz, "huppermage.last.rune.earth", 5373, "Earth");
    public static final /* enum */ bfm_2 hRT = new bfm_2(4, exx_2.rGA, "huppermage.last.rune.air", 5374, "Air");
    private static final bfm_2[] hRU;
    private final int hRV;
    private final exx_2 hRW;
    private final String hRX;
    private final int hRY;
    private final String hRZ;
    private static final /* synthetic */ bfm_2[] hSa;

    public static bfm_2[] values() {
        return (bfm_2[])hSa.clone();
    }

    public static bfm_2 valueOf(String string) {
        return Enum.valueOf(bfm_2.class, string);
    }

    private static Optional<bfm_2> BL(int n) {
        for (bfm_2 bfm_22 : hRU) {
            if (bfm_22.hRV != n) continue;
            return Optional.of(bfm_22);
        }
        return Optional.empty();
    }

    @Generated
    public int dfP() {
        return this.hRV;
    }

    @Generated
    public exx_2 dfQ() {
        return this.hRW;
    }

    @Generated
    public String clY() {
        return this.hRX;
    }

    @Generated
    public int LR() {
        return this.hRY;
    }

    @Generated
    public String dfR() {
        return this.hRZ;
    }

    @Generated
    private bfm_2(int n2, exx_2 exx_22, String string2, int n3, String string3) {
        this.hRV = n2;
        this.hRW = exx_22;
        this.hRX = string2;
        this.hRY = n3;
        this.hRZ = string3;
    }

    private static /* synthetic */ bfm_2[] dfS() {
        return new bfm_2[]{hRQ, hRR, hRS, hRT};
    }

    static {
        hSa = bfm_2.dfS();
        hRU = bfm_2.values();
    }
}

