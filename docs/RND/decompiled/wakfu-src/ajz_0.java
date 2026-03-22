/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.List;

/*
 * Renamed from aJZ
 */
public class ajz_0
extends ajy_0 {
    ajz_0(bsj_0 bsj_02, aKc aKc2, boolean bl) {
        super(bsj_02, aKc2, bl);
    }

    @Override
    public void a(afV afV2, List<DisplayedScreenElement> list) {
        super.a(afV2, list);
        this.ecI.w(list);
        this.ecI.ciq().forEach(entity -> afV2.b((Entity)entity, true));
        if (this.ecK) {
            list.stream().filter(displayedScreenElement -> !this.ecI.b((acx_0)displayedScreenElement)).filter(displayedScreenElement -> !this.ecI.S(displayedScreenElement.bcC(), displayedScreenElement.bcD())).forEach(displayedScreenElement -> afV2.a(displayedScreenElement.brl(), true));
        }
    }
}

