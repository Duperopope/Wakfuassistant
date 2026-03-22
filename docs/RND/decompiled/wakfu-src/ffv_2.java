/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from fFv
 */
public class ffv_2 {
    public final fsn_1 upS;
    public final EntitySprite upT;
    public final EntitySprite upU;
    private byte upV = 0;

    public ffv_2(fsn_1 fsn_12, EntitySprite entitySprite, EntitySprite entitySprite2) {
        this.upS = fsn_12;
        this.upT = entitySprite;
        this.upU = entitySprite2;
    }

    public Object getValue() {
        return this.upS.getValue();
    }

    public void bGY() {
        this.upT.bGY();
        this.upU.bGY();
        this.upV = (byte)(this.upV + 1);
    }

    public void bsI() {
        if (this.upV > 0) {
            this.upT.bsI();
            this.upU.bsI();
        }
        this.upV = (byte)(this.upV - 1);
    }
}

