/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGpass
 *  com.jogamp.opengl.cg.CGtechnique
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CGpass;
import com.jogamp.opengl.cg.CGtechnique;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from ate
 */
public class ate_2
extends asd_1 {
    public ate_2(CGtechnique cGtechnique) {
        super(CgGL.cgGetTechniqueName((CGtechnique)cGtechnique));
        this.cZp = new asb_1[ate_2.a(cGtechnique)];
        int n = 0;
        CGpass cGpass = CgGL.cgGetFirstPass((CGtechnique)cGtechnique);
        while (cGpass != null) {
            this.cZp[n++] = new atd_2(cGpass);
            cGpass = CgGL.cgGetNextPass((CGpass)cGpass);
        }
    }

    private static int a(CGtechnique cGtechnique) {
        int n = 0;
        CGpass cGpass = CgGL.cgGetFirstPass((CGtechnique)cGtechnique);
        while (cGpass != null) {
            ++n;
            cGpass = CgGL.cgGetNextPass((CGpass)cGpass);
        }
        return n;
    }
}

