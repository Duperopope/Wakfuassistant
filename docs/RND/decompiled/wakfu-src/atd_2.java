/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGpass
 *  com.jogamp.opengl.cg.CgGL
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.cg.CGpass;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from atd
 */
public class atd_2
extends asb_1 {
    private static CGpass dbf;
    private final CGpass dbg;

    public atd_2(CGpass cGpass) {
        this.dbg = cGpass;
    }

    @Override
    public final void a(art_1 art_12, Entity entity) {
        if (dbf != this.dbg) {
            this.reset();
            CgGL.cgSetPassState((CGpass)this.dbg);
            dbf = this.dbg;
        }
        entity.d(art_12);
    }

    @Override
    public final void reset() {
        if (dbf == null) {
            return;
        }
        CgGL.cgResetPassState((CGpass)dbf);
        ava_2.bMH().reset();
        dbf = null;
    }
}

