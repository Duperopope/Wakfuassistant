/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqD
 */
public abstract class bqd_1
implements aeh_2 {
    public static final String jay = "instanceName";
    public static final String jaz = "instanceId";
    public static final String jaA = "instanceNamePopupText";
    public static final String jaB = "levelDescription";
    public static final String jaC = "lootRateDescription";
    public static final String jaD = "hasAdditionalCriteria";
    public static final String[] jaE = new String[]{"instanceName", "instanceId", "instanceNamePopupText", "levelDescription", "lootRateDescription", "hasAdditionalCriteria"};
    private final double jaF;
    private final double jaG;
    private final int jaH;
    private final int jaI;
    private final boolean jaJ;

    bqd_1(bqf_1 bqf_12) {
        this.jaF = bqf_12.cYu();
        this.jaG = bpu.X(this.jaF);
        this.jaH = bqf_12.dEr();
        this.jaI = bqf_12.dEs();
        this.jaJ = bqf_12.dEv();
    }

    protected abstract String dEn();

    protected Optional<Short> dEp() {
        return Optional.empty();
    }

    protected Optional<String> dEo() {
        return Optional.empty();
    }

    protected abstract int aYs();

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jay -> this.dEn();
            case jaz -> this.dEp().orElse(null);
            case jaA -> this.dEo().orElse(null);
            case jaB -> {
                if (this.jaH == this.jaI) {
                    yield aum_0.cWf().c("encyclopedia.world.loot.monster.level", this.jaH);
                }
                yield aum_0.cWf().c("encyclopedia.world.loot.monster.level.range", this.jaH, this.jaI);
            }
            case jaC -> bpu.h(this.jaF, this.jaG);
            case jaD -> this.jaJ;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return jaE;
    }
}

