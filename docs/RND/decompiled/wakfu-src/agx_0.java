/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from agx
 */
public final class agx_0
implements afZ {
    private static final Logger cud = Logger.getLogger(agx_0.class);
    private static final agx_0 cue = new agx_0();
    private final HashMap<String, agu_0> cuf;
    private awk_1 bXx;
    private final ArrayList<agu_0> cug = new ArrayList();
    private static final boolean cuh = true;
    private static final agz_0 cui = new agy_0();

    private agx_0() {
        this.cuf = new HashMap(18);
    }

    public static agx_0 bze() {
        return cue;
    }

    public void eh(String string) {
        if (this.bXx != null) {
            this.bXx.bsI();
        }
        String string2 = fq_0.bJ(string);
        long l = arn_2.fX(string2);
        this.bXx = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, string, false);
        this.bXx.bGY();
    }

    public agu_0 b(String string, agb_0 agb_02) {
        return this.a(string, this.bXx, agb_02);
    }

    public agu_0 eF(String string) {
        return this.a(string, this.bXx);
    }

    public agu_0 a(String string, awk_1 awk_12) {
        return this.a(string, awk_12, agb_0.cum);
    }

    public agu_0 a(String string, awk_1 awk_12, agb_0 agb_02) {
        this.eG(string);
        agu_0 agu_02 = new agu_0(string, awk_12, agb_02);
        this.cuf.put(string, agu_02);
        return agu_02;
    }

    public void eG(String string) {
        agu_0 agu_02 = this.cuf.remove(string);
        if (agu_02 != null) {
            agu_02.aZp();
        }
    }

    public agu_0 eH(String string) {
        return this.cuf.get(string);
    }

    private static void a(agu_0 agu_02) {
        assert (agu_02 != null);
        agu_02.clear();
    }

    public void eI(String string) {
        agu_0 agu_02 = this.eH(string);
        if (agu_02 != null) {
            agx_0.a(agu_02);
        }
    }

    public void clear() {
        for (agu_0 agu_02 : this.cuf.values()) {
            agx_0.a(agu_02);
        }
    }

    public final void a(afV afV2, agf_0 agf_02, float f2) {
        int n = this.cug.size();
        if (n == 0) {
            return;
        }
        int n2 = (int)Math.floor(afV2.byt());
        float f3 = 43.0f;
        long l = agf_02.brp();
        for (int i = 0; i < n; ++i) {
            agu_0 agu_02 = this.cug.get(i);
            HighLightEntity highLightEntity = agu_02.fV(l);
            if (highLightEntity == null) continue;
            if (!agu_02.ctX.add(l)) {
                agf_02.a(highLightEntity);
                continue;
            }
            if (highLightEntity.bJf() == 0) {
                cud.error((Object)("probl\u00e8me d'hightlight " + agf_02.toString()));
                highLightEntity.ctT = true;
                return;
            }
            float[] fArray = agu_02.aXT();
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.uh(0);
            geometryMesh.c(fArray[0] * 0.5f, fArray[1] * 0.5f, fArray[2] * 0.5f, fArray[3] * f2);
            agf_02.a(afV2, highLightEntity, 43.0f, agu_02.bzd(), n2, agu_02.bzc(), 0);
            highLightEntity.ctT = true;
            assert (highLightEntity.bSW() >= 0);
            afV2.a(highLightEntity, true);
        }
    }

    public void a(afV afV2, int n) {
        cui.e(afV2);
        this.cug.clear();
        for (agu_0 agu_02 : this.cuf.values()) {
            agu_02.f(cui);
            if (!agu_02.isVisible() || agu_02.aJG()) continue;
            agu_02.ctX.clear();
            this.b(agu_02);
        }
    }

    private void b(agu_0 agu_02) {
        int n = this.cug.size();
        if (n == 0) {
            this.cug.add(agu_02);
            return;
        }
        if (agu_02.ctV >= this.cug.get((int)(n - 1)).ctV) {
            this.cug.add(agu_02);
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (agu_02.ctV >= this.cug.get((int)i).ctV) continue;
            this.cug.add(i, agu_02);
            break;
        }
    }

    public void a(afV afV2, float f2, float f3) {
    }

    public boolean a(long l, String string) {
        agu_0 agu_02 = this.eH(string);
        if (agu_02 == null) {
            cud.error((Object)("le layer " + string + " n'exsite pas"));
            return false;
        }
        agu_02.fW(l);
        return true;
    }

    public boolean d(acd_1 acd_12) {
        long l = agx_0.r(acd_12);
        for (agu_0 agu_02 : this.cuf.values()) {
            if (!agu_02.fa(l)) continue;
            return true;
        }
        return false;
    }

    public void b(long l, String string) {
        agu_0 agu_02 = this.eH(string);
        if (agu_02 == null) {
            cud.error((Object)("le layer " + string + " n'exsite pas"));
            return;
        }
        agu_02.eX(l);
    }

    public static long E(int n, int n2, int n3) {
        return anf_2.L(n, n2, (short)n3);
    }

    public static long r(acd_1 acd_12) {
        return agx_0.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public static acd_1 fX(long l) {
        return anf_2.gn(l);
    }
}

