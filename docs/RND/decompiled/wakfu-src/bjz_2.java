/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjZ
 */
public class bjz_2
implements bjy_2 {
    private static final bjz_2 ipY = new bjz_2();
    private bjy_2 ipZ;

    private bjz_2() {
    }

    public static bjz_2 dsb() {
        return ipY;
    }

    private void bkZ() {
        if (this.ipZ == null) {
            this.ipZ = new bjw_2();
        }
    }

    public boolean dsc() {
        this.bkZ();
        return this.ipZ != null;
    }

    @Override
    public String dsa() {
        this.bkZ();
        return this.ipZ.dsa();
    }

    @Override
    public void clean() {
        if (this.ipZ != null) {
            this.ipZ.clean();
        }
        this.ipZ = null;
    }
}

