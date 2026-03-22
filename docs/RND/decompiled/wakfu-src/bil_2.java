/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

/*
 * Renamed from bIL
 */
public class bil_2
extends fgi_1<EntityGroup> {
    private static final Logger kic = Logger.getLogger(bil_2.class);
    private EntityGroup kid;
    private EntitySprite kie;
    private awg_1 kif;
    private axb_2 kib;

    protected EntityGroup dZn() {
        this.kie = (EntitySprite)EntitySprite.cXk.bSK();
        this.kie.cWR = this;
        this.kid = (EntityGroup)EntityGroup.cXh.bSK();
        this.kid.cWR = this;
        EntityGroup entityGroup = (EntityGroup)EntityGroup.cXh.bSK();
        entityGroup.g(this.kie);
        entityGroup.g(this.kid);
        return entityGroup;
    }

    public EntityGroup dZo() {
        return this.kid;
    }

    @Override
    protected void dZp() {
        fgk_1.m(this.kie);
    }

    @Override
    public void a(fft_1 fft_12) {
        if (this.kib != null) {
            fff_1.a(0, 0, this.kif.getWidth(), this.kif.getHeight(), this.kif, fft_12.gwX(), this.kie);
            int n = fft_12.gwT();
            int n2 = fft_12.gwS();
            this.kie.e(n2 / 2, -n / 2, (int)(1.7f * (float)n), (int)(1.7f * (float)n2));
            this.kie.bJm().c(auw_2.dfI, auw_2.dfM);
        }
    }

    @Override
    public void clear() {
        super.clear();
        this.kid = null;
        this.kie = null;
    }

    public void a(awg_1 awg_12, axb_2 axb_22) {
        this.kif = awg_12;
        this.kib = axb_22;
    }

    @Override
    protected /* synthetic */ Entity dZq() {
        return this.dZn();
    }
}

