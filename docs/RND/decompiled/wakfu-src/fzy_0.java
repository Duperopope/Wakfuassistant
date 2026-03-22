/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fzy
 */
public final class fzy_0
extends Enum<fzy_0> {
    public static final /* enum */ fzy_0 tGa = new fzy_0("default");
    public static final /* enum */ fzy_0 tGb = new fzy_0("selected", tGa);
    public static final /* enum */ fzy_0 tGc = new fzy_0("disabled");
    public static final /* enum */ fzy_0 tGd = new fzy_0(tGc);
    public static final /* enum */ fzy_0 tGe = new fzy_0("pressed");
    public static final /* enum */ fzy_0 tGf = new fzy_0(tGe);
    public static final /* enum */ fzy_0 tGg = new fzy_0("mouseHover");
    public static final /* enum */ fzy_0 tGh = new fzy_0(tGg);
    @NotNull
    private final String tGi;
    private final boolean tGj;
    @Nullable
    private final fzy_0 tGk;
    public static fzy_0[] tGl;
    private static final /* synthetic */ fzy_0[] tGm;

    public static fzy_0[] values() {
        return (fzy_0[])tGm.clone();
    }

    public static fzy_0 valueOf(String string) {
        return Enum.valueOf(fzy_0.class, string);
    }

    private fzy_0(String string2) {
        this(string2, false, null);
    }

    private fzy_0(fzy_0 fzy_02) {
        this(fzy_02.getName() + "Selected", true, fzy_02);
    }

    private fzy_0(String string2, fzy_0 fzy_02) {
        this(string2, true, fzy_02);
    }

    @NotNull
    public fzy_0 grx() {
        if (this.tGj) {
            return this;
        }
        for (fzy_0 fzy_02 : tGl) {
            if (!fzy_02.bqr() || fzy_02.gry() != this) continue;
            return fzy_02;
        }
        return tGa;
    }

    @NotNull
    public fzy_0 gry() {
        if (this.tGk == null) {
            return this;
        }
        return this.tGk;
    }

    public static fzy_0 tt(@Nullable String string) {
        if (string == null) {
            return tGa;
        }
        for (fzy_0 fzy_02 : tGl) {
            if (!string.equals(fzy_02.getName())) continue;
            return fzy_02;
        }
        return tGa;
    }

    @Generated
    private fzy_0(@Nullable String string2, boolean bl, fzy_0 fzy_02) {
        if (string2 == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.tGi = string2;
        this.tGj = bl;
        this.tGk = fzy_02;
    }

    @NotNull
    @Generated
    public String getName() {
        return this.tGi;
    }

    @Generated
    public boolean bqr() {
        return this.tGj;
    }

    private static /* synthetic */ fzy_0[] grz() {
        return new fzy_0[]{tGa, tGb, tGc, tGd, tGe, tGf, tGg, tGh};
    }

    static {
        tGm = fzy_0.grz();
        tGl = fzy_0.values();
    }
}

