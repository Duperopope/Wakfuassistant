/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boG
 */
public class bog_0
implements aeh_2 {
    public static final String iQW = "increaseCountEnabled";
    public static final String iQX = "increaseCountDescription";
    public static final String iQY = "changeColorsEnabled";
    public static final String iQZ = "changeColorsDescription";
    public static final String iRa = "changeOrderEnabled";
    public static final String iRb = "changeOrderDescription";
    public static final String[] iRc = new String[]{"increaseCountEnabled", "increaseCountDescription", "changeColorsEnabled", "changeColorsDescription", "changeOrderEnabled", "changeOrderDescription"};
    private final boi_0 iRd;
    private final boi_0 iRe;
    private byte iRf = 0;
    private final boi_0 iRg;

    public bog_0(@NotNull ffV ffV2, @Nullable bog_0 bog_02) {
        if (ffV2.dXg()) {
            this.iRd = bog_0.u(ffV2);
            this.iRe = bog_0.v(ffV2);
            this.iRg = bog_0.w(ffV2);
            this.iRf = bog_02 == null ? (byte)0 : bog_02.iRf;
        } else {
            this.iRd = null;
            this.iRe = null;
            this.iRg = null;
        }
    }

    private static boi_0 u(@NotNull ffV ffV2) {
        boolean bl = ffV2.eAZ().fYI() >= ffV2.dOg().cpA();
        return bl ? boi_0.iRl : boi_0.iRi;
    }

    private static boi_0 v(@NotNull ffV ffV2) {
        if (ffV2.eAZ().k(rd_0.bjE)) {
            return boi_0.iRl;
        }
        if (ffV2.eAZ().fYQ()) {
            return boi_0.iRj;
        }
        if (ffV2.eAZ().fYO() > 0) {
            return boi_0.iRk;
        }
        return boi_0.iRi;
    }

    private static boi_0 w(@NotNull ffV ffV2) {
        if (ffV2.eAZ().fYM()) {
            return boi_0.iRl;
        }
        if (ffV2.eAZ().fYQ()) {
            return boi_0.iRj;
        }
        return boi_0.iRi;
    }

    public byte dBh() {
        return this.iRf;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iQW -> this.iRd == boi_0.iRi;
            case iQX -> {
                boi_0 var4_4 = this.iRd;
                int var5_7 = 0;
                switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"ENABLED", "HAS_BEST"}, (boi_0)var4_4, var5_7)) {
                    case 0: {
                        yield aum_0.cWf().c("enchantment.increase.count.enabled", new Object[0]);
                    }
                    case 1: {
                        yield aum_0.cWf().c("enchantment.increase.count.has.best", new Object[0]);
                    }
                }
                yield null;
            }
            case iQY -> this.iRe == boi_0.iRi;
            case iQZ -> {
                boi_0 var4_5 = this.iRe;
                int var5_8 = 0;
                switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"ENABLED", "HAS_BEST", "IS_SUBLIMATED", "IS_ENCHANTED"}, (boi_0)var4_5, var5_8)) {
                    case 0: {
                        yield aum_0.cWf().c("enchantment.change.colors.enabled", new Object[0]);
                    }
                    case 1: {
                        yield aum_0.cWf().c("enchantment.change.colors.has.best", new Object[0]);
                    }
                    case 2: {
                        yield aum_0.cWf().c("enchantment.change.colors.is.sublimated", new Object[0]);
                    }
                    case 3: {
                        yield aum_0.cWf().c("enchantment.change.colors.is.enchanted", new Object[0]);
                    }
                }
                yield null;
            }
            case iRa -> this.iRg == boi_0.iRi;
            case iRb -> {
                boi_0 var4_6 = this.iRg;
                int var5_9 = 0;
                switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"ENABLED", "HAS_BEST", "IS_SUBLIMATED"}, (boi_0)var4_6, var5_9)) {
                    case 0: {
                        yield aum_0.cWf().c("enchantment.change.order.enabled", new Object[0]);
                    }
                    case 1: {
                        yield aum_0.cWf().c("enchantment.change.order.has.best", new Object[0]);
                    }
                    case 2: {
                        yield aum_0.cWf().c("enchantment.change.order.is.sublimated", new Object[0]);
                    }
                }
                yield null;
            }
            default -> null;
        };
    }

    public boolean a(@NotNull rc_0 rc_02) {
        return switch (rc_02) {
            default -> throw new MatchException(null, null);
            case rc_0.bjv -> {
                if (this.iRd == boi_0.iRi) {
                    yield true;
                }
                yield false;
            }
            case rc_0.bjw -> {
                if (this.iRe == boi_0.iRi) {
                    yield true;
                }
                yield false;
            }
            case rc_0.bjx -> this.iRg == boi_0.iRi;
        };
    }

    @Override
    public String[] bxk() {
        return iRc;
    }
}

