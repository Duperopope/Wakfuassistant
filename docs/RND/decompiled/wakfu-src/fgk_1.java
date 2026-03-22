/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

/*
 * Renamed from fGk
 */
public class fgk_1
extends fgi_1<EntitySprite> {
    private static final Logger usL = Logger.getLogger(fgk_1.class);

    protected EntitySprite gxv() {
        return (EntitySprite)EntitySprite.cXk.bSK();
    }

    @Override
    protected void dZp() {
        fgk_1.m(this.gxt());
    }

    public static void m(Entity entity) {
        awp_1 awp_12 = new awp_1();
        awp_12.a(new ach_1(acp_1.dAW, -0.7853982f));
        awp_12.B(0.5f * GC.aGm, GC.aGm, 1.0f);
        awp_1 awp_13 = new awp_1();
        awp_13.a(new ach_1(acp_1.dAU, -1.0471976f));
        entity.bIS().a(awp_12);
        entity.bIS().a(awp_13);
    }

    @Override
    public void j(awk_1 awk_12) {
        ((EntitySprite)this.gxt()).b(awk_12);
    }

    @Override
    public void a(fft_1 fft_12) {
        awg_1 awg_12 = fft_12.gwV();
        if (awg_12 == null) {
            return;
        }
        int n = fft_12.gwT();
        int n2 = fft_12.gwS();
        fff_1.a(-n / 2, n2 / 2, n, n2, awg_12, fft_12.gwX(), (EntitySprite)this.gxt());
        ((EntitySprite)this.gxt()).bJm().c(auw_2.dfI, auw_2.dfM);
    }

    @Override
    protected /* synthetic */ Entity dZq() {
        return this.gxv();
    }
}

