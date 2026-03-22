/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from avy
 */
public abstract class avy_1
extends ava_1 {
    @Override
    public boolean bMV() {
        return CgGL.cgGLIsProfileSupported((int)this.bNb());
    }

    public abstract int bNb();
}

