/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.jetbrains.annotations.Nullable;

public class fmO
extends flx_0 {
    private final eUw sHi;
    private final exP sHj;
    private final exP sHk;
    @Nullable
    private final foG sHl;
    private final Collection<? extends exP> sHm;

    public fmO(fjm fjm2, eUw eUw2, exP exP2, exP exP3, @Nullable foG foG2, Collection<? extends exP> collection) {
        super(fjm2);
        this.sHi = eUw2;
        this.sHj = exP2;
        this.sHk = exP3;
        this.sHl = foG2;
        this.sHm = collection;
    }

    @Nullable
    public foG gdx() {
        return this.sHl;
    }

    public eUw gdy() {
        return this.sHi;
    }

    public exP gdB() {
        return this.sHj;
    }

    public exP gdC() {
        return this.sHk;
    }

    public Collection<? extends exP> gdD() {
        return this.sHm;
    }

    @Override
    public fly_0 gdl() {
        return fly_0.sEN;
    }
}

