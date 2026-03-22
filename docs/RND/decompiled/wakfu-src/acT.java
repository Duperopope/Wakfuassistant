/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

public class acT
extends avc_2 {
    private final boolean chT;

    public acT(boolean bl) {
        this.chT = bl;
    }

    @Override
    public void c(GL2 gL2) {
        ave_2 ave_22 = new ave_2();
        ave_22.cb(true);
        ave_22.uJ(0);
        if (this.chT) {
            ave_22.G(514, 1, 1);
        } else {
            ave_22.G(517, 1, 1);
        }
        ave_22.uK(7680);
        avd_2.bMO().a((GL)gL2, ave_22);
    }
}

