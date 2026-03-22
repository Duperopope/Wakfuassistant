/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXP
 */
public final class exp_1
extends Enum<exp_1> {
    public static final /* enum */ exp_1 rIF = new exp_1(1, "ogrest_is_down", ext_1.rIS, exq_1.rIP, false);
    public static final /* enum */ exp_1 rIG = new exp_1(2, "ogrest_daily_score", ext_1.rIW, exq_1.rIP, false);
    public static final /* enum */ exp_1 rIH = new exp_1(3, "neo_boss_unlocked", ext_1.rIT, exq_1.rIQ, true);
    @NotNull
    public static final exp_1[] rII;
    private final short rIJ;
    @NotNull
    private final String rIK;
    @NotNull
    private final ext_1 rIL;
    @NotNull
    private final exq_1 rIM;
    private final boolean rIN;
    private static final /* synthetic */ exp_1[] rIO;

    public static exp_1[] values() {
        return (exp_1[])rIO.clone();
    }

    public static exp_1 valueOf(String string) {
        return Enum.valueOf(exp_1.class, string);
    }

    private exp_1(@NotNull int n2, @NotNull String string2, ext_1 ext_12, exq_1 exq_12, boolean bl) {
        this((short)n2, string2, ext_12, exq_12, bl);
    }

    private exp_1(@NotNull short s, @NotNull String string2, ext_1 ext_12, exq_1 exq_12, boolean bl) {
        this.rIJ = s;
        this.rIK = string2;
        this.rIL = ext_12;
        this.rIM = exq_12;
        this.rIN = bl;
    }

    public short aIi() {
        return this.rIJ;
    }

    @NotNull
    public String getKey() {
        return this.rIK;
    }

    @NotNull
    public ext_1 fOX() {
        return this.rIL;
    }

    @NotNull
    public exq_1 fOY() {
        return this.rIM;
    }

    public boolean fOZ() {
        return this.rIN;
    }

    @NotNull
    public static Optional<exp_1> et(short s) {
        for (exp_1 exp_12 : rII) {
            if (exp_12.aIi() != s) continue;
            return Optional.of(exp_12);
        }
        return Optional.empty();
    }

    @NotNull
    public static Optional<exp_1> ss(@NotNull String string) {
        for (exp_1 exp_12 : rII) {
            if (!exp_12.getKey().equalsIgnoreCase(string)) continue;
            return Optional.of(exp_12);
        }
        return Optional.empty();
    }

    public String toString() {
        return "GlobalVariable{m_id=" + this.rIJ + ", m_key='" + this.rIK + "', m_clientShared=" + this.rIN + "}";
    }

    private static /* synthetic */ exp_1[] fPa() {
        return new exp_1[]{rIF, rIG, rIH};
    }

    static {
        rIO = exp_1.fPa();
        rII = exp_1.values();
    }
}

