/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYL
 */
class byl_1 {
    final bye_1 lAU;
    final String lAV;
    @Nullable
    byl_1 lAW;
    fey_2 lAX;
    bym_1 lAY;
    Instant lAZ;
    @Nullable
    Instant lBa;

    boolean eps() {
        if (this.lBa != null) {
            return false;
        }
        Duration duration = this.lAZ == null ? Duration.ZERO : Duration.between(this.lAZ, Instant.now());
        return duration.toMillis() >= (long)this.lAU.eoX().epl();
    }

    byl_1 d(@NotNull bye_1 bye_12) {
        byl_1 byl_12 = new byl_1(bye_12, this.lAV);
        byl_12.lAX = this.lAX;
        byl_12.lAY = this.lAY;
        byl_12.lAZ = this.lAZ;
        byl_12.lBa = this.lBa;
        return byl_12;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        byl_1 byl_12 = (byl_1)object;
        return Objects.equals(this.lAU, byl_12.lAU);
    }

    public int hashCode() {
        return Objects.hash(this.lAU);
    }

    @Generated
    public byl_1(bye_1 bye_12, String string) {
        this.lAU = bye_12;
        this.lAV = string;
    }
}

