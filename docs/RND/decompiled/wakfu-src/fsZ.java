/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fsZ
extends fsX {
    private static final Logger teT = Logger.getLogger(fsZ.class);
    private final int teU;
    private final int teV;

    public fsZ(fsd_0 fsd_02, int n, int n2) {
        super(fsd_02);
        this.teV = n;
        this.teU = n2;
    }

    public int cov() {
        return this.teU;
    }

    public int oP() {
        return this.teV;
    }

    @Override
    public final fsY glC() {
        return fsY.teP;
    }
}

