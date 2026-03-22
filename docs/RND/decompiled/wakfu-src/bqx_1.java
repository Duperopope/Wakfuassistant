/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqx
 */
class bqx_1
implements aeh_2 {
    public static final String jaf = "machineName";
    public static final String jag = "costs";
    @NotNull
    final String jah;
    private final List<bqu_1> jai;

    bqx_1(@NotNull fds_0 fds_02, int n) {
        this.jah = aum_0.cWf().a(107, (long)fds_02.d(), new Object[0]);
        this.jai = new ArrayList<bqu_1>();
        fds_02.W((TObjectProcedure<fdt_0>)((TObjectProcedure)fdt_02 -> {
            if (!fdt_02.Uk(n)) {
                return true;
            }
            fdt_02.fTx().forEach((n, s) -> this.jai.add(new bqv_1((int)n, s.shortValue())));
            if (fdt_02.fTy() > 0) {
                this.jai.add(new bqw_1(fdt_02.fTy()));
            }
            if (fdt_02.cnp() > 0) {
                this.jai.add(new bqy_2(fdt_02.cnp()));
            }
            return true;
        }));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jaf, jag}, (Object)string2, n)) {
            case 0 -> this.jah;
            case 1 -> this.jai;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{jaf, jag};
    }
}

