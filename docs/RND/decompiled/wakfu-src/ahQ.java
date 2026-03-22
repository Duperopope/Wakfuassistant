/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.cg.CgGL;

public class ahQ {
    public static void main(String[] stringArray) {
        System.setProperty("sun.awt.noerasebackground", "true");
        System.setProperty("sun.java2d.noddraw", "true");
        System.setProperty("jogl.disable.openglarbcontext", "true");
        System.setProperty("jogamp.gluegen.UseTempJarCache", "true");
        System.out.println("Test case start");
        System.out.println("GLProfile");
        GLProfile.getDefault();
        System.out.println("CgCL");
        CgGL cgGL = new CgGL();
        System.out.println("create context");
        CgGL.cgCreateContext();
        System.out.println("GLDevice");
        GLProfile.getDefaultDevice();
        System.out.println("AWT workspace");
        new ahu(new ahe_0());
        System.out.println("Test ended");
    }
}

