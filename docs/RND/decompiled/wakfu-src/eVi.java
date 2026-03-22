/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class eVi
extends Enum<eVi> {
    public static final /* enum */ eVi rzw = new eVi(0);
    public static final /* enum */ eVi rzx = new eVi(1);
    public static final /* enum */ eVi rzy = new eVi(2);
    public static final /* enum */ eVi rzz = new eVi(3);
    public static final /* enum */ eVi rzA = new eVi(4);
    public static final /* enum */ eVi rzB = new eVi(5);
    public static final /* enum */ eVi rzC = new eVi(6);
    public static final /* enum */ eVi rzD = new eVi(7);
    private final byte rzE;
    private static final /* synthetic */ eVi[] rzF;

    public static eVi[] values() {
        return (eVi[])rzF.clone();
    }

    public static eVi valueOf(String string) {
        return Enum.valueOf(eVi.class, string);
    }

    private eVi(byte by) {
        this.rzE = by;
    }

    public byte aJr() {
        return this.rzE;
    }

    public static Optional<eVi> eL(byte by) {
        for (eVi eVi2 : eVi.values()) {
            if (by != eVi2.rzE) continue;
            return Optional.of(eVi2);
        }
        return Optional.empty();
    }

    private static /* synthetic */ eVi[] fMY() {
        return new eVi[]{rzw, rzx, rzy, rzz, rzA, rzB, rzC, rzD};
    }

    static {
        rzF = eVi.fMY();
    }
}

