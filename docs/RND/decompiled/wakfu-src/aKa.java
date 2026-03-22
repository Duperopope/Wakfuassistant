/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.util.List;

public class aKa
extends ajy_0 {
    aKa(bsj_0 bsj_02, aKc aKc2, boolean bl) {
        super(bsj_02, aKc2, bl);
    }

    @Override
    public void a(afV afV2, List<DisplayedScreenElement> list) {
        super.a(afV2, list);
        this.ecI.w(list);
        this.ecI.cir().forEach(entity -> afV2.b((Entity)entity, true));
        list.stream().filter(displayedScreenElement -> !this.ecI.a((acx_0)displayedScreenElement)).forEach(displayedScreenElement -> {
            afV2.a(displayedScreenElement.brl(), true);
            Entity3D entity3D = this.ecI.h((DisplayedScreenElement)displayedScreenElement);
            if (entity3D == null) {
                return;
            }
            afV2.a(entity3D, true);
        });
    }
}

