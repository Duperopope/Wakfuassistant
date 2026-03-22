/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLN
 */
public class fln_2
extends flg_2 {
    private static final Logger uIY = Logger.getLogger(fln_2.class);
    private int uIZ;
    private int uJa;
    private int uJb;
    private int uJc;
    private static final ObjectPool uJd = new ayv_2(new flo_2());

    public static fln_2 a(flp_2 flp_22, fhv_1 fhv_12, fzq_0 fzq_02, fsn_1 fsn_12, EntitySprite entitySprite) {
        fln_2 fln_22;
        try {
            fln_22 = (fln_2)uJd.borrowObject();
            fln_22.uth = uJd;
        }
        catch (Exception exception) {
            uIY.error((Object)"Probl\u00e8me au borrowObject.");
            fln_22 = new fln_2();
            fln_22.aVI();
        }
        fln_22.NQ(flp_22.ofv);
        fln_22.aca(flp_22.tPo);
        fln_22.abZ(flp_22.ofK);
        fln_22.qu(flp_22.bVF);
        fln_22.qv(flp_22.bVG);
        fln_22.oZ(flp_22.gBF());
        fln_22.x(fhv_12);
        fln_22.b(fzq_02);
        fln_22.setItemValue(fsn_12);
        fln_22.d(entitySprite);
        return fln_22;
    }

    public int gEe() {
        return this.uIZ;
    }

    public int gEf() {
        return this.uJa;
    }

    public int gEg() {
        return this.uJb;
    }

    public int gEh() {
        return this.uJc;
    }

    public fsn_1 gEi() {
        return (fsn_1)this.getItemValue();
    }

    private void d(EntitySprite entitySprite) {
        this.uIZ = (int)entitySprite.bsS();
        this.uJa = (int)entitySprite.bsT();
        this.uJb = entitySprite.getWidth();
        this.uJc = entitySprite.getHeight();
    }
}

