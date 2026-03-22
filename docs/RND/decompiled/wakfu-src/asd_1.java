/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from asD
 */
public abstract class asd_1
extends asq_1 {
    protected asb_1[] cZp;

    protected asd_1(String string) {
        super(string);
    }

    public final void b(art_1 art_12, Entity entity) {
        int n = this.cZp.length;
        for (int i = 0; i < n; ++i) {
            this.cZp[i].a(art_12, entity);
        }
    }

    public final void bJU() {
        int n = this.cZp.length;
        for (int i = 0; i < n; ++i) {
            this.cZp[i].reset();
        }
    }
}

