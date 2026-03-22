/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.OptionalInt;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqu
 */
abstract class bqu_1
implements aeh_2 {
    public static final String iZX = "iconUrl";
    public static final String iZY = "description";
    public static final String iZZ = "canBeOpenInEncyclopedia";
    public static final String jaa = "itemRefId";

    bqu_1() {
    }

    protected abstract int dEj();

    protected abstract String dEk();

    protected abstract long aBF();

    protected abstract boolean dEl();

    protected abstract OptionalInt dEm();

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iZX, iZY, iZZ, jaa}, (Object)string2, n)) {
            case 0 -> auc_0.cVq().zx(this.dEj());
            case 1 -> aum_0.cWf().cQ(this.aBF()) + "x " + this.dEk();
            case 2 -> this.dEl();
            case 3 -> this.dEm().orElse(0);
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iZX, iZY, iZZ};
    }
}

