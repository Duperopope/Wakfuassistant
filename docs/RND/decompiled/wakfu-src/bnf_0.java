/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bNF
 */
public class bnf_0 {
    private final short kEb;

    private bnf_0(short s) {
        this.kEb = s;
    }

    @NotNull
    public static Optional<bnf_0> co(short s) {
        if (!bnf_0.cp(s)) {
            return Optional.empty();
        }
        return Optional.of(new bnf_0(s));
    }

    @Contract(pure=true)
    private static boolean cp(short s) {
        return s != 0 && byp_2.lyZ.JE(s) != null;
    }

    @Contract(pure=true)
    public short aIi() {
        return this.kEb;
    }

    @NotNull
    @Contract(pure=true)
    public String getDescription() {
        return aum_0.cWf().a(34, (long)this.kEb, new Object[0]);
    }

    @NotNull
    @Contract(pure=true)
    public String cC(byte by) {
        byte by2 = Bz.aHR();
        Bz.e(by);
        String string = this.getDescription();
        Bz.e(by2);
        return string;
    }

    @NotNull
    @Contract(pure=true)
    public fru_0 egk() {
        return byp_2.lyZ.JE(this.kEb).egk();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bnf_0 bnf_02 = (bnf_0)object;
        return this.kEb == bnf_02.kEb;
    }

    public int hashCode() {
        return Objects.hash(this.kEb);
    }
}

