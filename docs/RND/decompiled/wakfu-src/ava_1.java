/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import org.apache.log4j.Logger;

/*
 * Renamed from avA
 */
public abstract class ava_1
implements avi_2 {
    protected static final Logger dhT = Logger.getLogger(ava_1.class);
    protected GL dhU;

    @Override
    public void aPg() {
        this.dhU = aru_2.cVG.bIv().bIq();
    }

    @Override
    public void bmX() {
        this.dhU = null;
    }
}

