/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKp
 */
public class ekp_0 {
    private final int qBJ;
    @Nullable
    private final Integer qBK;
    @Nullable
    private final Integer qBL;

    public ekp_0(int n, @Nullable Integer n2, @Nullable Integer n3) {
        this.qBJ = n;
        this.qBK = n2;
        this.qBL = n3;
    }

    public int AK() {
        return this.qBJ;
    }

    public Optional<Integer> fxV() {
        return Optional.ofNullable(this.qBK);
    }

    public Optional<Integer> fxW() {
        return Optional.ofNullable(this.qBL);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ekp_0 ekp_02 = (ekp_0)object;
        return this.qBJ == ekp_02.qBJ && Objects.equals(this.qBK, ekp_02.qBK) && Objects.equals(this.qBL, ekp_02.qBL);
    }

    public int hashCode() {
        return Objects.hash(this.qBJ, this.qBK, this.qBL);
    }

    public String toString() {
        return "CosmeticItem{m_itemRefId=" + this.qBJ + ", m_color=" + this.qBK + ", m_accessory=" + this.qBL + "}";
    }
}

