/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fsW
extends fsX {
    private static final Logger teH = Logger.getLogger(fsW.class);
    private final fsX teI;

    public fsW(fsd_0 fsd_02, fsX fsX2) {
        super(fsd_02);
        this.teI = fsX2;
    }

    public fsX glD() {
        return this.teI;
    }

    @Override
    public boolean b(fsX fsX2) {
        if (this == fsX2) {
            return true;
        }
        if (fsX2 == null || this.getClass() != fsX2.getClass()) {
            return false;
        }
        fsW fsW2 = (fsW)fsX2;
        return this.teJ.equals(fsW2.teJ);
    }

    public String toString() {
        return "BuildingDependency{m_item=" + String.valueOf(this.teJ) + ", m_constructionError=" + String.valueOf(this.teI) + "}";
    }

    @Override
    public final fsY glC() {
        return fsY.teO;
    }
}

