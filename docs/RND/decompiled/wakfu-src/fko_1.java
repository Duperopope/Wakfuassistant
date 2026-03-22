/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fKo
 */
public abstract class fko_1
extends fkp_2
implements fkx_1 {
    protected boolean dGB;

    @Override
    public boolean isDirty() {
        return this.dGB;
    }

    @Override
    public abstract fkx_2 getMesh();

    @Override
    public abstract Entity getEntity();

    @Override
    public void b(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.getMesh().a(dimension, insets, insets2, insets3);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.dGB = false;
    }
}

