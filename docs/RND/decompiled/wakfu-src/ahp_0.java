/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ahp
 */
public class ahp_0 {
    private static final Logger cwV = Logger.getLogger(ahp_0.class);
    private static final String cwW = ".png";
    private static final String cwX = "BorderTopDark";
    private static final String cwY = "BtnCloseDark";
    private static final String cwZ = "BtnMaximizeDark";
    private static final String cxa = "BtnMinimizeDark";
    private static final String cxb = "BtnRestoreDark";
    private static final List<String> cxc = List.of("BtnCloseDark", "BtnMinimizeDark", "BtnMaximizeDark", "BtnRestoreDark");
    private static final int cxd = 3;
    private static final int cxe = 4;
    private static final int cxf = 2;
    private final String cxg;
    @Nullable
    private final String cxh;
    private final ImageIcon[] cxi;
    private final ImageIcon[] cxj;
    private final ImageIcon[] cxk;
    private final ImageIcon[] cxl;
    private final ImageIcon[] cxm;
    private final Insets cxn;
    @NotNull
    private ahq_0 cxo = ahq_0.cxp;

    public static List<String> bAc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("BorderTopDark.png");
        for (String string : cxc) {
            arrayList.add(string + cwW);
        }
        arrayList.sort(String::compareTo);
        return arrayList;
    }

    public ahp_0(String string, @Nullable String string2) {
        this.cxg = string;
        this.cxh = string2;
        this.cxi = this.o(cwX, false);
        this.cxj = this.o(cwY, true);
        this.cxk = this.o(cwZ, false);
        this.cxl = this.o(cxa, false);
        this.cxm = this.o(cxb, false);
        this.cxn = new Insets(this.cxi[0].getIconHeight(), 0, 0, 0);
    }

    private ImageIcon[] o(@NotNull String string, boolean bl) {
        ImageIcon imageIcon = this.eP(string);
        Image image = imageIcon.getImage();
        int n = bl ? 4 : 3;
        int n2 = imageIcon.getIconWidth();
        int n3 = imageIcon.getIconHeight();
        int n4 = (n3 - (n - 1) * 2) / n;
        int n5 = 0;
        ImageIcon[] imageIconArray = new ImageIcon[4];
        for (int i = 0; i < n; ++i) {
            BufferedImage bufferedImage = new BufferedImage(n2, n4, 2);
            bufferedImage.getGraphics().drawImage(image, 0, 0, n2, n4, 0, n5, n2, n5 + n4, null);
            ImageIcon imageIcon2 = new ImageIcon();
            imageIcon2.setImage(bufferedImage);
            imageIconArray[i] = imageIcon2;
            n5 += n4 + 2;
        }
        if (!bl) {
            imageIconArray[ahq_0.cxs.cxt] = imageIconArray[ahq_0.cxr.cxt];
        }
        return imageIconArray;
    }

    @NotNull
    private ImageIcon eP(@NotNull String string) {
        ImageIcon imageIcon;
        URL uRL;
        if (!BH.aU(this.cxh)) {
            try {
                uRL = fo_0.bA(this.cxh + string + cwW);
                imageIcon = new ImageIcon(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                imageIcon = new ImageIcon(this.cxh + string + cwW);
            }
            if (imageIcon.getImageLoadStatus() == 8) {
                return imageIcon;
            }
        }
        try {
            uRL = fo_0.bA(this.cxg + string + cwW);
            imageIcon = new ImageIcon(uRL);
        }
        catch (MalformedURLException malformedURLException) {
            imageIcon = new ImageIcon(this.cxg + string + cwW);
        }
        if (imageIcon.getImageLoadStatus() != 8) {
            cwV.error((Object)("Skin image not present : " + this.cxg + string));
        }
        return imageIcon;
    }

    public void a(@NotNull ahq_0 ahq_02) {
        this.cxo = ahq_02;
    }

    public Image bAd() {
        return this.cxi[this.cxo.cxt].getImage();
    }

    public ImageIcon bAe() {
        return this.cxj[this.cxo.cxt];
    }

    public ImageIcon bAf() {
        return this.cxj[ahq_0.cxq.cxt];
    }

    public ImageIcon bAg() {
        return this.cxj[ahq_0.cxr.cxt];
    }

    public ImageIcon bAh() {
        return this.cxk[this.cxo.cxt];
    }

    public ImageIcon bAi() {
        return this.cxk[ahq_0.cxq.cxt];
    }

    public ImageIcon bAj() {
        return this.cxk[ahq_0.cxr.cxt];
    }

    public ImageIcon bAk() {
        return this.cxl[this.cxo.cxt];
    }

    public ImageIcon bAl() {
        return this.cxl[ahq_0.cxq.cxt];
    }

    public ImageIcon bAm() {
        return this.cxl[ahq_0.cxr.cxt];
    }

    public ImageIcon bAn() {
        return this.cxm[this.cxo.cxt];
    }

    public ImageIcon bAo() {
        return this.cxm[ahq_0.cxq.cxt];
    }

    public ImageIcon bAp() {
        return this.cxm[ahq_0.cxr.cxt];
    }

    public Insets bAq() {
        return this.cxn;
    }
}

