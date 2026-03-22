/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class eNr
extends Enum<eNr> {
    public static final /* enum */ eNr qYl = new eNr(0);
    public static final /* enum */ eNr qYm = new eNr(1);
    public static final /* enum */ eNr qYn = new eNr(2);
    private static final eNr[] qYo;
    private final int qYp;
    private static final /* synthetic */ eNr[] qYq;

    public static eNr[] values() {
        return (eNr[])qYq.clone();
    }

    public static eNr valueOf(String string) {
        return Enum.valueOf(eNr.class, string);
    }

    private eNr(int n2) {
        this.qYp = n2;
    }

    public int d() {
        return this.qYp;
    }

    @NotNull
    public Optional<it_1> fBo() {
        return Optional.ofNullable(it_1.ey(this.qYp));
    }

    @NotNull
    public static Optional<eNr> b(it_1 it_12) {
        return eNr.mL(it_12.getNumber());
    }

    @NotNull
    public static Optional<eNr> mL(int n) {
        for (eNr eNr2 : qYo) {
            if (eNr2.d() != n) continue;
            return Optional.of(eNr2);
        }
        return Optional.empty();
    }

    private static /* synthetic */ eNr[] fBp() {
        return new eNr[]{qYl, qYm, qYn};
    }

    static {
        qYq = eNr.fBp();
        qYo = eNr.values();
    }
}

