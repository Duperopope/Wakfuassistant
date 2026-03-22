/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import org.apache.log4j.Logger;

public class aeJ {
    final aeM cnS;
    static final Logger cnT = Logger.getLogger(aeJ.class);
    public static final String cnU = "png";
    final Entity3D cnV = (Entity3D)Entity3D.cXb.bSK();
    aro_1 bVk;
    protected String bdC;
    boolean cnW;
    private final axm_1 cnX;

    public aeJ(axm_1 axm_12, aeM aeM2) {
        this.cnS = aeM2;
        this.cnX = axm_12;
    }

    public final void a(aro_1 aro_12, String string, String ... stringArray) {
        if (this.bVk != null) {
            this.bVk.reset();
        }
        this.bVk = new aro_1(aro_12);
        this.bVk.a(Material.daH);
        this.bdC = string;
        for (int i = 0; i < stringArray.length; ++i) {
            this.bVk.tI(stringArray[i].hashCode());
        }
    }

    protected boolean bwK() {
        this.bVk.bHm();
        if (this.bVk.aLB() && !this.bVk.bHx()) {
            this.bVk.setAnimation(this.bdC);
            if (this.bVk.bHk()) {
                return false;
            }
            this.bVk.a(0, this.cnV, 0);
            return true;
        }
        return false;
    }

    public void a(String string, aeL aeL2) {
        this.cnX.a(new aeK(this, string, aeL2));
    }

    public void cancel() {
        this.cnW = true;
    }

    public final void bwL() {
        this.cnV.bsI();
        if (this.bVk != null) {
            this.bVk.reset();
        }
    }
}

