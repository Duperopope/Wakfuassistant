/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

/*
 * Renamed from awT
 */
public class awt_2 {
    public static aws_2 a(apl_1 apl_12, int n) {
        byte[] byArray = apl_12.mv(n);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return new aws_2(ImageIO.read(byteArrayInputStream), true);
    }

    public static aws_2 s(apl_1 apl_12) {
        int n = apl_12.bFO();
        int n2 = apl_12.bFO();
        int n3 = (int)apl_12.bFP();
        byte[] byArray = null;
        if (n3 > 0) {
            byArray = apl_12.mv(n3);
        }
        return new aws_2(n, n2, byArray);
    }
}

