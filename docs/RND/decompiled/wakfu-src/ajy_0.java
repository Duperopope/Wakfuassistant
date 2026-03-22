/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aJY
 */
public abstract class ajy_0
extends aga {
    protected final rh_0 ecG;
    protected final int ecH;
    protected final aKb ecI;
    protected final List<Entity> ecJ = new ArrayList<Entity>();
    protected final boolean ecK;

    ajy_0(bsj_0 bsj_02, aKc aKc2, boolean bl) {
        this.ecG = bsj_02.bag();
        this.ecH = bsj_02.d();
        this.ecI = new aKb(this.ecG, aKc2);
        this.ecK = bl;
    }

    @Override
    public void clear() {
        super.clear();
        this.ecI.clear();
    }

    @Override
    public boolean d(Entity entity, boolean bl) {
        boolean bl2 = this.ecG.T(GC.A(entity.cWN), GC.A(entity.cWO));
        if (!bl2) {
            return this.ecK;
        }
        if (this.ecJ.contains(entity)) {
            return entity.cWP <= (float)this.ecG.bdJ() && entity.cWP + entity.cej >= (float)this.ecG.bdI();
        }
        return true;
    }

    @Override
    public boolean e(ZC zC) {
        return zC.bqo() == this.ecH;
    }

    protected void v(List<DisplayedScreenElement> list) {
        this.ecJ.clear();
        list.forEach(displayedScreenElement -> this.ecJ.add(displayedScreenElement.brl()));
    }

    @Override
    public void a(afV afV2, List<DisplayedScreenElement> list) {
        this.v(list);
    }

    public aKb cip() {
        return this.ecI;
    }
}

