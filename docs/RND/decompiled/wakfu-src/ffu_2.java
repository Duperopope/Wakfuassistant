/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fFu
 */
public class ffu_2 {
    private static final Logger upQ = Logger.getLogger(ffu_2.class);
    private final HashMap<fsn_1, XulorParticleSystem> upR = new HashMap();

    @Nullable
    public XulorParticleSystem h(fsn_1 fsn_12) {
        String string = fsn_12.getParticlePath();
        if (string == null) {
            return null;
        }
        XulorParticleSystem xulorParticleSystem = this.upR.get(fsn_12);
        if (xulorParticleSystem != null) {
            return xulorParticleSystem;
        }
        return this.a(fsn_12, string);
    }

    @Nullable
    private XulorParticleSystem a(fsn_1 fsn_12, String string) {
        XulorParticleSystem xulorParticleSystem = fmv_1.gEH().vW(string);
        if (xulorParticleSystem == null) {
            return null;
        }
        fmw_1.uJG.a(xulorParticleSystem);
        this.upR.put(fsn_12, xulorParticleSystem);
        xulorParticleSystem.bGY();
        return xulorParticleSystem;
    }

    public void a(ffw_2 ffw_22) {
        int n = ffw_22.aVo();
        for (int i = 0; i < n; ++i) {
            XulorParticleSystem xulorParticleSystem;
            fsn_1 fsn_12 = ffw_22.aaT(i);
            if (fsn_12.getParticlePath() == null || (xulorParticleSystem = this.upR.remove(fsn_12)) == null) continue;
            xulorParticleSystem.bsI();
        }
    }

    public void clear() {
        for (XulorParticleSystem xulorParticleSystem : this.upR.values()) {
            xulorParticleSystem.bsI();
        }
        this.upR.clear();
    }
}

