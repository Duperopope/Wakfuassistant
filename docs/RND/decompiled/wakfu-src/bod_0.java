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
 * Renamed from boD
 */
public class bod_0
implements aeh_2 {
    public static final String iQJ = "shardStyle";
    public static final String iQK = "isEnabled";
    public static final String iQL = "popupLabel";
    public static final String iQM = "position";
    public static final String[] iQN = new String[]{"shardStyle", "isEnabled", "popupLabel"};
    @NotNull
    private final fhn_0 iQO;
    private final int iQP;
    @NotNull
    private final boe_0 iQQ;

    public bod_0(@NotNull fhn_0 fhn_02, int n, @NotNull boe_0 boe_02) {
        this.iQO = fhn_02;
        this.iQP = n;
        this.iQQ = boe_02;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iQJ, iQK, iQM, iQL}, (Object)string2, n)) {
            case 0 -> bES.a(this.iQO.dBe(), this.iQO.dSU() > 0);
            case 1 -> this.iQQ == boe_0.iQR;
            case 2 -> this.iQP;
            case 3 -> {
                switch (this.iQQ.ordinal()) {
                    case 1: {
                        yield aum_0.cWf().c("enchantment.change.one.color.is.sublimated", new Object[0]);
                    }
                    case 2: {
                        yield aum_0.cWf().c("enchantment.change.one.color.is.enchanted", new Object[0]);
                    }
                    case 3: {
                        yield aum_0.cWf().c("enchantment.change.one.color.has.best", new Object[0]);
                    }
                }
                yield null;
            }
            default -> null;
        };
    }

    @NotNull
    public rd_0 dBe() {
        return this.iQO.dBe();
    }

    @NotNull
    public boe_0 dBf() {
        return this.iQQ;
    }

    public int Lz() {
        return this.iQP;
    }

    @Override
    public String[] bxk() {
        return iQN;
    }
}

