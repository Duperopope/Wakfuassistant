/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;

/*
 * Renamed from arD
 */
public abstract class ard_2
implements Runnable {
    private final Anm cUJ;

    protected ard_2(Anm anm) {
        this.cUJ = anm;
        anm.a(this);
    }

    public final void bHP() {
        this.cUJ.b(this);
    }
}

