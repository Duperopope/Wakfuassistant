/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGj
 */
public class bgj_1
extends bDy {
    private final List<fgf_0> jUS;
    private final Map<fgf_0, bDy> jUT;

    public bgj_1(List<fgf_0> list, Map<fgf_0, bDy> map) {
        this.jUS = Collections.unmodifiableList(list);
        this.jUT = Collections.unmodifiableMap(map);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"bagName", "bagInventory", "bagNameSize", "bagSizeMaxSize", "bagSize", "bagPosition", "collapsed", "canBeSorted", "collapsingIgnoreSize", "collapsible"}, (Object)string2, n)) {
            case 0 -> bgj_1.getName();
            case 1 -> this.jUS;
            case 2 -> bgj_1.getName() + " (" + this.jUS.size() + ")";
            case 3, 4 -> this.jUS.size();
            case 5 -> -1;
            case 6, 7, 8, 9 -> false;
            default -> null;
        };
    }

    @NotNull
    private static String getName() {
        return aum_0.cWf().c("inventory.search", new Object[0]);
    }

    @Override
    public void j(Consumer<fgf_0> consumer) {
        this.jUS.forEach(consumer);
    }

    @Override
    public OptionalInt lb(long l) {
        for (int i = 0; i < this.jUS.size(); ++i) {
            if (this.jUS.get(i).getItem().LV() != l) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    @Override
    public OptionalLong Gk(int n) {
        if (n < this.jUS.size()) {
            return OptionalLong.of(this.jUS.get(n).getItem().LV());
        }
        return OptionalLong.empty();
    }

    @Override
    public int aVo() {
        return this.jUS.size();
    }

    @Nullable
    public bDy a(fgf_0 fgf_02) {
        return this.jUT.get(fgf_02);
    }
}

