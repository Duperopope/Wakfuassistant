/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftu
 */
public class ftu_0
implements ftz_0 {
    private static final int tfW = 5;
    private final int tfX;
    @NotNull
    private ftp_0 tfY;

    public ftu_0(int n) {
        this(n, ftp_0.tfH);
    }

    public ftu_0(int n, @NotNull ftp_0 ftp_02) {
        this.tfX = n;
        this.tfY = ftp_02;
    }

    public int ctS() {
        return this.tfX;
    }

    @NotNull
    public ftp_0 gmi() {
        return this.tfY;
    }

    public void a(@NotNull ftp_0 ftp_02) {
        this.tfY = ftp_02;
    }

    @NotNull
    public static ftu_0 gA(@NotNull ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte by = byteBuffer.get();
        Optional<ftp_0> optional = ftp_0.hJ(by);
        if (optional.isEmpty()) {
            throw new IllegalArgumentException(String.format("Unexpected value, no %s exist with following id %s", ftp_0.class, by));
        }
        return new ftu_0(n, optional.get());
    }

    @Override
    public int gmf() {
        return 5;
    }

    @Override
    @NotNull
    @Contract(value="_ -> param1")
    public azg_1 j(@NotNull azg_1 azg_12) {
        azg_12.vC(this.tfX);
        azg_12.aF(this.tfY.aJr());
        return azg_12;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ftu_0 ftu_02 = (ftu_0)object;
        return this.tfX == ftu_02.tfX && this.tfY == ftu_02.tfY;
    }

    public int hashCode() {
        return Objects.hash(this.tfX, this.tfY);
    }
}

