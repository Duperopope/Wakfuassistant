/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ftp
 */
public final class ftp_0
extends Enum<ftp_0>
implements aoq_1 {
    public static final /* enum */ ftp_0 tfH = new ftp_0(0);
    public static final /* enum */ ftp_0 tfI = new ftp_0(1);
    @NotNull
    public static final ftp_0[] tfJ;
    private final byte tfK;
    private static final /* synthetic */ ftp_0[] tfL;

    public static ftp_0[] values() {
        return (ftp_0[])tfL.clone();
    }

    public static ftp_0 valueOf(String string) {
        return Enum.valueOf(ftp_0.class, string);
    }

    private ftp_0(int n2) {
        this((byte)n2);
    }

    private ftp_0(byte by) {
        this.tfK = by;
    }

    public byte aJr() {
        return this.tfK;
    }

    @NotNull
    public static Optional<ftp_0> hJ(byte by) {
        for (ftp_0 ftp_02 : tfJ) {
            if (ftp_02.aJr() != by) continue;
            return Optional.of(ftp_02);
        }
        return Optional.empty();
    }

    @Override
    @NotNull
    public String aXA() {
        return String.valueOf(this.aJr());
    }

    @Override
    @NotNull
    public String aXB() {
        return this.name();
    }

    @Override
    @Nullable
    public String aXC() {
        return null;
    }

    private static /* synthetic */ ftp_0[] glY() {
        return new ftp_0[]{tfH, tfI};
    }

    static {
        tfL = ftp_0.glY();
        tfJ = ftp_0.values();
    }
}

