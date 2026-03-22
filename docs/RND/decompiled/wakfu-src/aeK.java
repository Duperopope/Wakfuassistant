/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;

class aeK
implements axl_1 {
    static final /* synthetic */ boolean cnY;
    final /* synthetic */ String cnZ;
    final /* synthetic */ aeL coa;
    final /* synthetic */ aeJ cob;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aeK(aeJ aeJ2, String string, aeL aeL2) {
        this.cob = aeJ2;
        this.cnZ = string;
        this.coa = aeL2;
    }

    @Override
    public boolean bwM() {
        if (this.cob.cnW) {
            this.cob.bwL();
            return false;
        }
        if (!this.cob.bwK()) {
            return true;
        }
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        int n = this.a((GL)gL2);
        byte[] byArray = this.a(n, atg_22, this.cnZ);
        if (!cnY && this.coa == null) {
            throw new AssertionError();
        }
        this.coa.du(byArray);
        gL2.glDeleteTextures(1, new int[]{n}, 0);
        this.cob.bwL();
        return false;
    }

    private int a(GL gL) {
        gL.glEnable(3553);
        int[] nArray = new int[1];
        int n = this.cob.cnS.bwN();
        int n2 = this.cob.cnS.bwO();
        ati_2.a(gL, n, n2, nArray, true);
        return nArray[0];
    }

    private byte[] a(int n, atg_2 atg_22, String string) {
        GL2 gL2 = atg_22.bIq();
        int n2 = this.cob.cnS.bwN();
        int n3 = this.cob.cnS.bwO();
        float f2 = this.cob.cnS.a(this.cob.bVk);
        float f3 = this.cob.cnS.b(this.cob.bVk);
        float f4 = this.cob.cnS.c(this.cob.bVk);
        float[] fArray = new float[4];
        gL2.glGetFloatv(3106, fArray, 0);
        ava_2.bMH().h(gL2);
        gL2.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        atg_22.dbl.uu(0);
        ava_2 ava_22 = ava_2.bMH();
        ava_22.a(gL2, auy_2.dfX, Matrix44.dAe);
        ava_22.a(gL2, auy_2.dfW, Matrix44.dAe);
        axv_1 axv_12 = new axv_1(0, 0, n2, n3);
        ava_22.a(gL2, axv_12);
        ava_22.reset();
        ast_1.bJG().bJJ();
        avd_2.bMO().j((GL)gL2);
        ava_22.a(gL2, auy_2.dfY, Matrix44.dAe);
        atg_22.b(Matrix44.dAe);
        this.cob.cnV.c(1.0f, 1.0f, 1.0f, 1.0f);
        awp_1 awp_12 = new awp_1();
        ((awn_1)awp_12).B(f2, f2, 1.0f);
        ((awn_1)awp_12).A(f3, f4, 0.0f);
        this.cob.cnV.a(avc_2.dgN);
        this.cob.cnV.b(avc_2.dgN);
        this.cob.bVk.a(0, this.cob.cnV, 0);
        ava_22.cY(2.0f);
        this.cob.cnV.bIS().a(awp_12);
        this.cob.cnV.d(atg_22);
        ava_22.db(true);
        gL2.glBindTexture(3553, n);
        gL2.glCopyTexImage2D(3553, 0, 6408, 0, 0, n2, n3, 0);
        byte[] byArray = new byte[n2 * n3 * 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        gL2.glGetTexImage(3553, 0, 6408, 5121, (Buffer)byteBuffer);
        BufferedImage bufferedImage = axe_2.a(n2, n3, byArray, axf_2.doP);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedImage bufferedImage2 = axe_2.b(bufferedImage, true);
            ImageIO.write((RenderedImage)bufferedImage2, string, byteArrayOutputStream);
        }
        catch (IOException iOException) {
            aeJ.cnT.error((Object)iOException);
        }
        ava_22.reset();
        gL2.glClearColor(fArray[0], fArray[1], fArray[2], fArray[3]);
        return byteArrayOutputStream.toByteArray();
    }

    static {
        cnY = !aeJ.class.desiredAssertionStatus();
    }
}

