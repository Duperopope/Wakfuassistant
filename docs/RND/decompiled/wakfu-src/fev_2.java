/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from fEV
 */
public class fev_2 {
    private final feu_1 uob = new feu_1();
    private final float[] uoc = new float[4];
    private float aPY;
    private float aPZ;

    public awk_1 b(int n, int n2, String string) {
        BufferedImage bufferedImage = new BufferedImage(n, n2, 1);
        this.c(bufferedImage, true);
        axc_2 axc_22 = axc_2.a(bufferedImage);
        awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), axc_22, true);
        axc_22.bsI();
        return awk_12;
    }

    public awk_1 a(int n, int n2, String string, float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
        BufferedImage bufferedImage = new BufferedImage(n, n2, 1);
        this.c(bufferedImage, false);
        axc_2 axc_22 = axc_2.a(bufferedImage);
        awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), axc_22, false);
        axc_22.bsI();
        return awk_12;
    }

    private void c(BufferedImage bufferedImage, boolean bl) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n3 = n * n2;
        int[] nArray = new int[n3];
        float f2 = 1.0f / (float)(n - 1);
        float f3 = 1.0f / (float)(n2 - 1);
        int n4 = 0;
        float f4 = 0.0f;
        int n5 = 0;
        while (n5 < n2) {
            if (bl) {
                float f5 = 0.0f;
                var13_15 = 0;
                while (var13_15 < n) {
                    nArray[n4] = this.bH(f5, f4);
                    ++var13_15;
                    f5 += f2;
                    ++n4;
                }
            } else {
                int n6 = this.fE(f4);
                var13_15 = 0;
                while (var13_15 < n) {
                    nArray[n4] = n6;
                    ++var13_15;
                    ++n4;
                }
            }
            ++n5;
            f4 += f3;
        }
        bufferedImage.setRGB(0, 0, n, n2, nArray, 0, n);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(bufferedImage, 0, 0, n, n2, null);
        graphics2D.setXORMode(Color.WHITE);
        graphics2D.setColor(Color.BLACK);
        graphics2D.setPaintMode();
        graphics2D.dispose();
    }

    int bH(float f2, float f3) {
        this.uoc[0] = f2;
        this.uoc[1] = 1.0f - f3;
        this.uoc[2] = this.uob.aaL(2);
        this.uoc[3] = 0.0f;
        return this.uob.ad(this.uoc);
    }

    int fE(float f2) {
        this.uoc[0] = this.aPY;
        this.uoc[1] = this.aPZ;
        this.uoc[2] = 1.0f - f2;
        this.uoc[3] = 0.0f;
        return this.uob.ad(this.uoc);
    }
}

