/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;

/*
 * Renamed from fGg
 */
class fgg_1
extends ArrayList<EntitySprite> {
    fgg_1() {
    }

    @Override
    public void clear() {
        for (EntitySprite entitySprite : this) {
            entitySprite.bsI();
        }
        super.clear();
    }

    public void setAlpha(float f2) {
        for (EntitySprite entitySprite : this) {
            entitySprite.c(f2, f2, f2, f2);
        }
    }
}

