/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpi
 */
public class bpi_0
extends bul_0<bpe_0> {
    public static final String iUE = ":";

    private bpi_0(rd_0 @Nullable [] rd_0Array, @NotNull String string) {
        super(rd_0Array, string);
    }

    public static bpi_0 mm(@NotNull String string) {
        return new bpi_0(bpi_0.mp(string), string);
    }

    @Nullable
    protected List<rd_0> f(bpe_0 bpe_02) {
        if (bpe_02.dCC().dCF() != fhr_0.sqz) {
            return null;
        }
        if (bpe_02.dCC().fZe() == null) {
            return null;
        }
        return Arrays.stream(bpe_02.dCC().fZe()).toList();
    }

    @Override
    protected boolean dCl() {
        return false;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @Override
    @Nullable
    public String dCm() {
        return iUE + this.jpa;
    }

    @Override
    @Nullable
    protected /* synthetic */ List al(Object object) {
        return this.f((bpe_0)object);
    }
}

