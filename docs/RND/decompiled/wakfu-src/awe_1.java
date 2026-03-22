/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.texture.Texture
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.texture.Texture;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/*
 * Renamed from awe
 */
class awe_1 {
    int djG = 0;
    final FloatBuffer djH;
    final FloatBuffer djI;
    boolean djJ;
    int djK;
    int djL;
    final /* synthetic */ avu_2 djM;

    awe_1(avu_2 avu_22) {
        this.djM = avu_22;
        GL gL = GLU.getCurrentGL();
        this.djI = Buffers.newDirectFloatBuffer((int)1200);
        this.djH = Buffers.newDirectFloatBuffer((int)800);
        boolean bl = this.djJ = avu_22.bNK() && avu_22.m(gL);
        if (this.djJ) {
            try {
                int[] nArray = new int[2];
                gL.glGenBuffers(2, IntBuffer.wrap(nArray));
                this.djK = nArray[0];
                this.djL = nArray[1];
                gL.glBindBuffer(34962, this.djK);
                gL.glBufferData(34962, 4800L, null, 35040);
                gL.glBindBuffer(34962, this.djL);
                gL.glBufferData(34962, 3200L, null, 35040);
            }
            catch (Exception exception) {
                avu_22.djg = false;
                this.djJ = false;
            }
        }
    }

    public void bc(float f2, float f3) {
        this.djH.put(f2);
        this.djH.put(f3);
    }

    public void z(float f2, float f3, float f4) {
        this.djI.put(f2);
        this.djI.put(f3);
        this.djI.put(f4);
        ++this.djG;
        if (this.djG >= 400) {
            this.bNS();
        }
    }

    void bNS() {
        if (this.djM.djf) {
            this.bNT();
        } else {
            this.bNU();
        }
    }

    private void bNT() {
        if (this.djG > 0) {
            GL2 gL2 = GLU.getCurrentGL().getGL2();
            TextureRenderer textureRenderer = this.djM.bNF();
            Texture texture = textureRenderer.getTexture();
            this.djI.rewind();
            this.djH.rewind();
            gL2.glEnableClientState(32884);
            if (this.djJ) {
                gL2.glBindBuffer(34962, this.djK);
                gL2.glBufferSubData(34962, 0L, (long)(this.djG * 12), (Buffer)this.djI);
                gL2.glVertexPointer(3, 5126, 0, 0L);
            } else {
                gL2.glVertexPointer(3, 5126, 0, (Buffer)this.djI);
            }
            gL2.glEnableClientState(32888);
            if (this.djJ) {
                gL2.glBindBuffer(34962, this.djL);
                gL2.glBufferSubData(34962, 0L, (long)(this.djG * 8), (Buffer)this.djH);
                gL2.glTexCoordPointer(2, 5126, 0, 0L);
            } else {
                gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.djH);
            }
            gL2.glDrawArrays(7, 0, this.djG);
            this.djI.rewind();
            this.djH.rewind();
            this.djG = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bNU() {
        if (this.djG > 0) {
            TextureRenderer textureRenderer = this.djM.bNF();
            Texture texture = textureRenderer.getTexture();
            GL2 gL2 = GLU.getCurrentGL().getGL2();
            gL2.glBegin(7);
            try {
                int n = this.djG / 4;
                this.djI.rewind();
                this.djH.rewind();
                for (int i = 0; i < n; ++i) {
                    gL2.glTexCoord2f(this.djH.get(), this.djH.get());
                    gL2.glVertex3f(this.djI.get(), this.djI.get(), this.djI.get());
                    gL2.glTexCoord2f(this.djH.get(), this.djH.get());
                    gL2.glVertex3f(this.djI.get(), this.djI.get(), this.djI.get());
                    gL2.glTexCoord2f(this.djH.get(), this.djH.get());
                    gL2.glVertex3f(this.djI.get(), this.djI.get(), this.djI.get());
                    gL2.glTexCoord2f(this.djH.get(), this.djH.get());
                    gL2.glVertex3f(this.djI.get(), this.djI.get(), this.djI.get());
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            finally {
                gL2.glEnd();
                this.djI.rewind();
                this.djH.rewind();
                this.djG = 0;
            }
        }
    }
}

