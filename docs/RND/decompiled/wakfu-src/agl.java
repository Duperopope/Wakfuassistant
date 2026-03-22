/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class agl
implements agk {
    private static final Logger ctv = Logger.getLogger(agl.class);
    private final aag_0 ctw;
    private final rh_0 ctx;
    private final aci_1 cty;

    public agl(rh_0 rh_02, aag_0 aag_02) {
        this.ctx = rh_02;
        this.ctw = aag_02;
        this.cty = agl.a(this.ctx);
    }

    @Override
    public void a(float f2, float f3, acb_1 acb_12) {
        float f4;
        aci_1 aci_12 = agm.a(this.ctw, f2, f3, acb_12);
        if (aci_12 == null) {
            return;
        }
        float f5 = 40.0f;
        float f6 = (float)this.cty.cuQ - 40.0f;
        float f7 = (float)this.cty.cuR + 40.0f;
        float f8 = (float)this.cty.cuS - 40.0f;
        float f9 = (float)this.cty.cuT + 40.0f;
        if ((float)this.cty.bWJ() > (float)aci_12.bWJ() + 40.0f) {
            if ((float)aci_12.cuQ < f6) {
                acb_12.aPY -= (float)aci_12.cuQ - f6;
            }
            if ((float)aci_12.cuR > f7) {
                acb_12.aPY -= (float)aci_12.cuR - f7;
            }
        } else {
            f4 = (float)this.cty.bWL();
            acb_12.aPY = f4 - f2;
            acb_12.aPY = 0.0f;
        }
        if ((float)this.cty.bWK() > (float)aci_12.bWK() + 40.0f) {
            if ((float)aci_12.cuS < f8) {
                acb_12.aPZ -= (float)aci_12.cuS - f8;
            }
            if ((float)aci_12.cuT > f9) {
                acb_12.aPZ -= (float)aci_12.cuT - f9;
            }
        } else {
            f4 = (float)this.cty.bWM();
            acb_12.aPZ = f4 - f3;
            acb_12.aPZ = 0.0f;
        }
    }

    private boolean c(aci_1 aci_12) {
        return this.cty.cuQ >= aci_12.cuQ && this.cty.cuR <= aci_12.cuR && this.cty.cuS >= aci_12.cuS && this.cty.cuT <= aci_12.cuT;
    }

    private static aci_1 a(rh_0 rh_02) {
        aci_1 aci_12 = new aci_1(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>(16);
        short[] sArray = rh_02.bdw();
        int n = rh_02.bgm();
        int n2 = n + rh_02.getWidth();
        int n3 = rh_02.bgn();
        int n4 = n3 + rh_02.getHeight();
        int n5 = 0;
        for (int i = n3; i < n4; ++i) {
            for (int j = n; j < n2; ++j) {
                short s;
                if (!rh_02.T(j, i) || (s = sArray[n5++]) == -1) continue;
                arrayList.clear();
                aaa_0.brC().b(j, i, arrayList, abd.ccY);
                for (DisplayedScreenElement displayedScreenElement : arrayList) {
                    Entity entity = displayedScreenElement.brl();
                    if (!(entity instanceof EntitySprite)) continue;
                    EntitySprite entitySprite = (EntitySprite)entity;
                    if (entitySprite.aKq() < (float)aci_12.cuQ) {
                        aci_12.cuQ = GC.B(entitySprite.aKq());
                    }
                    if (entitySprite.aKs() > (float)aci_12.cuR) {
                        aci_12.cuR = GC.C(entitySprite.aKs());
                    }
                    if (entitySprite.aKr() < (float)aci_12.cuS) {
                        aci_12.cuS = GC.B(entitySprite.aKr());
                    }
                    if (!(entitySprite.aKp() > (float)aci_12.cuT)) continue;
                    aci_12.cuT = GC.C(entitySprite.aKp());
                }
            }
        }
        return aci_12;
    }
}

