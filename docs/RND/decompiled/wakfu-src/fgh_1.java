/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import org.apache.log4j.Logger;

/*
 * Renamed from fGh
 */
public class fgh_1
extends fgi_1<Entity3D> {
    private static final Logger usD = Logger.getLogger(fgh_1.class);

    protected Entity3D bpj() {
        return (Entity3D)Entity3D.cXb.bSK();
    }

    @Override
    protected void dZp() {
        fgk_1.m(this.gxt());
    }

    @Override
    public void a(fft_1 fft_12) {
        Entity3D entity3D = (Entity3D)this.gxt();
        entity3D.clear();
        awg_1 awg_12 = fft_12.gwV();
        if (awg_12 == null) {
            return;
        }
        int n = fft_12.gwT();
        int n2 = fft_12.gwS();
        fff_1.a(-n / 2, n2 / 2, n, n2, awg_12, fft_12.gwX(), entity3D);
        for (int i = 0; i < entity3D.bJf(); ++i) {
            entity3D.uh(i).c(auw_2.dfI, auw_2.dfM);
        }
    }

    @Override
    protected /* synthetic */ Entity dZq() {
        return this.bpj();
    }
}

