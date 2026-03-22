/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bVH
 */
public class bvh_2
extends agj_2 {
    protected static final Logger lso = Logger.getLogger(bvh_2.class);
    private final Integer lsp;

    public bvh_2(int n) {
        this.lsp = n;
    }

    @Override
    public short aIi() {
        return 2;
    }

    @Override
    public afp_2 cbr() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.lsp.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof bvh_2 && ((bvh_2)object).lsp.equals(this.lsp);
    }
}

