/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.List;

public class aga {
    public static final aga csK = new aga();

    protected aga() {
    }

    public void clear() {
    }

    public boolean d(Entity entity, boolean bl) {
        return true;
    }

    public boolean e(ZC zC) {
        return true;
    }

    public void a(afV afV2, List<DisplayedScreenElement> list) {
        for (DisplayedScreenElement displayedScreenElement : list) {
            afV2.a(displayedScreenElement.brl(), true);
        }
    }
}

