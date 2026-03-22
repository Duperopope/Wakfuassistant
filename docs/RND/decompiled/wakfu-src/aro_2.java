/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from arO
 */
public final class aro_2 {
    private static final boolean cVk = false;
    private static final aro_2 cVl = new aro_2();
    private ArrayList<ays_2> cVm;
    private float cVn;
    private float cVo;
    private HashMap<String, Integer> cVp;
    private int cVq;
    private arp_2 cVr;

    public static aro_2 bIf() {
        return cVl;
    }

    public void a(ays_2 ays_22) {
    }

    public final void bIg() {
        if (this.cVp != null) {
            this.cVp.clear();
        }
        this.cVq = 0;
    }

    public void a(Geometry geometry) {
    }

    public void b(art_1 art_12) {
    }

    public void bIh() {
    }

    private aro_2() {
        this.bIg();
    }

    private void a(art_1 art_12, ays_2 ays_22) {
        float f2 = 200.0f * (float)ays_22.bSP() / (float)ays_22.bSQ();
        art_12.a(this.cVn, this.cVo, f2, 14.0f, -12582912);
        art_12.a(this.cVn + f2, this.cVo, 200.0f - f2, 14.0f, -16760832);
        this.cVr.fY(ays_22.bSO().getSimpleName() + "(" + ays_22.bSP() + "/" + ays_22.bSQ() + ")");
        this.cVo -= 16.0f;
    }
}

