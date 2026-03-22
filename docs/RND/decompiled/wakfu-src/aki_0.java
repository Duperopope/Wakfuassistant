/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aKI
 */
public class aki_0 {
    private static final aki_0 efx = new aki_0();
    private final List<Integer> efy = new ArrayList<Integer>();

    public static aki_0 ciX() {
        return efx;
    }

    private aki_0() {
    }

    public void c(bsj_0 bsj_02) {
        rh_0 rh_02 = bsj_02.bag();
        int n = rh_02.bgm();
        int n2 = rh_02.bgn();
        int n3 = rh_02.getWidth();
        int n4 = n + n3;
        int n5 = n2 + rh_02.getHeight();
        for (int i = n; i < n4; ++i) {
            for (int j = n2; j < n5; ++j) {
                byte by = rh_02.aa(i, j);
                if (by == -1) continue;
                short s = rh_02.Z(i, j);
                if (by == 0) {
                    this.efy.add(aki_0.a(801097, i, j, s));
                    continue;
                }
                if (by != 1) continue;
                this.efy.add(aki_0.a(801096, i, j, s));
            }
        }
    }

    private static int a(int n, float f2, float f3, float f4) {
        CellParticleSystem cellParticleSystem = agY.bzw().sl(n);
        cellParticleSystem.r(f2, f3, f4);
        cellParticleSystem.setDuration(0);
        agZ.bzy().b(cellParticleSystem);
        return cellParticleSystem.bLJ();
    }

    public void clear() {
        this.efy.forEach(n -> agZ.bzy().so((int)n));
        this.efy.clear();
    }
}

