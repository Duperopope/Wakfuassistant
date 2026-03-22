/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fTh
 */
public class fth_1 {
    private final String vfz;
    private final int vfA;
    private final int vfB;
    private final int vfC;
    private final int vfD;
    private final XulorParticleSystem vfE;

    public fth_1(String string, int n, int n2, int n3, int n4) {
        this(string, n, n2, n3, n4, null);
    }

    public fth_1(String string, int n, int n2, int n3, int n4, @Nullable XulorParticleSystem xulorParticleSystem) {
        this.vfz = string;
        this.vfA = n;
        this.vfB = n2;
        this.vfC = n3;
        this.vfD = n4;
        this.vfE = xulorParticleSystem;
    }

    public String getKey() {
        return this.vfz;
    }

    public int getX() {
        return this.vfA;
    }

    public int getY() {
        return this.vfB;
    }

    public int getWidth() {
        return this.vfC;
    }

    public int getHeight() {
        return this.vfD;
    }

    @Nullable
    public XulorParticleSystem gGD() {
        return this.vfE;
    }

    public void hj(int n, int n2) {
    }

    public String did() {
        return fyw_0.gqw().k(this.vfz, new Object[0]);
    }
}

