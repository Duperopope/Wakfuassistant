/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bXl
 */
final class bxl_2
implements anz_1 {
    private final int lwB;
    private final int lwC;
    private final short lwD;

    bxl_2(@NotNull acd_1 acd_12) {
        this.lwB = acd_12.getX();
        this.lwC = acd_12.getY();
        this.lwD = acd_12.bdi();
    }

    bxl_2(anz_1 anz_12) {
        this.lwB = anz_12.bcC();
        this.lwC = anz_12.bcD();
        this.lwD = anz_12.bcE();
    }

    @Override
    public float getWorldX() {
        return this.bcC();
    }

    @Override
    public float getWorldY() {
        return this.bcD();
    }

    @Override
    public float getAltitude() {
        return this.bcE();
    }

    @Override
    public int bcC() {
        return this.lwB;
    }

    @Override
    public int bcD() {
        return this.lwC;
    }

    @Override
    public short bcE() {
        return this.lwD;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bxl_2 bxl_22 = (bxl_2)object;
        if (this.lwB != bxl_22.lwB) {
            return false;
        }
        if (this.lwC != bxl_22.lwC) {
            return false;
        }
        return this.lwD == bxl_22.lwD;
    }

    public int hashCode() {
        int n = this.lwB;
        n = 31 * n + this.lwC;
        n = 31 * n + this.lwD;
        return n;
    }
}

