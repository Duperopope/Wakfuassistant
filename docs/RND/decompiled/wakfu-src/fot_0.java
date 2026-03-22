/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fot
 */
public class fot_0
implements fos_0 {
    private final int sLw;
    private final int sLx;
    private final String sLy;
    private final int sLz;
    @NotNull
    private final fjk sLA;

    public static fot_0 f(int n, int n2, int n3, int n4, int n5) {
        return new fot_0(n, n2, n3, n4, n5);
    }

    private fot_0(int n, int n2, int n3, int n4, int n5) {
        this.sLw = n;
        this.sLx = n2;
        this.sLy = String.valueOf(n3);
        this.sLz = n4;
        this.sLA = fjk.gP((byte)n5);
    }

    @Override
    public int d() {
        return this.sLw;
    }

    @Override
    public int AK() {
        return this.sLx;
    }

    @Override
    public String aXE() {
        return this.sLy;
    }

    @Override
    public int bBE() {
        return this.sLz;
    }

    @Override
    @NotNull
    public fjk gfA() {
        return this.sLA;
    }

    public String toString() {
        return "NewMountSkinDefinition{m_id=" + this.sLw + ", m_itemRefId=" + this.sLx + ", m_gfxId='" + this.sLy + "', m_particleId=" + this.sLz + ", m_mountBreed=" + String.valueOf(this.sLA) + "}";
    }
}

