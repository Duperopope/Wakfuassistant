/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import org.apache.log4j.Logger;

/*
 * Renamed from awS
 */
public final class aws_2 {
    protected static final Logger dns = Logger.getLogger(aws_2.class);
    public static final byte dnt = 1;
    private boolean dnu = false;
    private byte[] ayE;
    private int brs;
    private int brt;

    public aws_2(int n, int n2, byte[] byArray) {
        this.brs = n;
        this.brt = n2;
        this.ayE = byArray;
    }

    public aws_2(BufferedImage bufferedImage, boolean bl) {
        this.a(bufferedImage, bl);
    }

    public aws_2(apl_1 apl_12) {
        this.r(apl_12);
    }

    public BufferedImage bPQ() {
        return axe_2.a(this.brs, this.brt, this.ayE, axf_2.doP);
    }

    private void a(BufferedImage bufferedImage, boolean bl) {
        if (bufferedImage != null) {
            this.brs = bufferedImage.getWidth();
            this.brt = bufferedImage.getHeight();
            if (bl) {
                if (bufferedImage.getType() != 3) {
                    bufferedImage = axe_2.h(bufferedImage);
                } else if (bufferedImage.getType() != 2) {
                    bufferedImage = axe_2.g(bufferedImage);
                }
            } else if (bufferedImage.getType() != 2) {
                bufferedImage = axe_2.g(bufferedImage);
            }
            this.dnu = bufferedImage.isAlphaPremultiplied();
            DataBufferInt dataBufferInt = (DataBufferInt)bufferedImage.getData().getDataBuffer();
            this.ayE = new byte[this.brs * this.brt * 4];
            for (int i = 0; i < dataBufferInt.getSize(); ++i) {
                int n = 4 * i;
                int n2 = dataBufferInt.getElem(i);
                this.ayE[n] = (byte)(n2 >> 16 & 0xFF);
                this.ayE[n + 1] = (byte)(n2 >> 8 & 0xFF);
                this.ayE[n + 2] = (byte)(n2 & 0xFF);
                this.ayE[n + 3] = (byte)(n2 >> 24 & 0xFF);
            }
        } else {
            this.brs = 0;
            this.brt = 0;
            this.ayE = null;
        }
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public int getHeight() {
        return this.brt;
    }

    public int getWidth() {
        return this.brs;
    }

    public String toString() {
        return "AlphaBitmapData (" + this.brs + "x" + this.brt + ") @" + Integer.toHexString(super.hashCode());
    }

    public void a(fs_0 fs_02) {
        fs_02.w((short)1);
        fs_02.ay(this.dnu);
        fs_02.mQ(this.brs);
        fs_02.mQ(this.brt);
        if (this.ayE != null) {
            fs_02.cr(this.ayE.length);
            fs_02.di(this.ayE);
        } else {
            fs_02.cr(0L);
        }
    }

    public void r(apl_1 apl_12) {
        short s = apl_12.bFR();
        if (s != 1) {
            dns.error((Object)"Incorrect version exception", (Throwable)new Exception("Version incorrecte:" + s + " courante:1"));
        }
        this.dnu = apl_12.bFS();
        this.brs = apl_12.bFO();
        this.brt = apl_12.bFO();
        int n = (int)apl_12.bFP();
        if (n > 0) {
            this.ayE = apl_12.mv(n);
        }
    }

    public void bPR() {
        if (this.ayE != null && !this.dnu) {
            this.dnu = true;
            for (int i = 0; i < this.ayE.length; i += 4) {
                byte by = this.ayE[i + 3];
                this.ayE[i] = (byte)(this.ayE[i] * by / 255);
                this.ayE[i + 1] = (byte)(this.ayE[i + 1] * by / 255);
                this.ayE[i + 2] = (byte)(this.ayE[i + 2] * by / 255);
            }
        }
    }

    public void bPS() {
        if (this.ayE != null && this.dnu) {
            this.dnu = false;
            for (int i = 0; i < this.ayE.length; i += 4) {
                byte by = this.ayE[i + 3];
                if (by != 0) {
                    this.ayE[i] = (byte)(this.ayE[i] * 255 / by);
                    this.ayE[i + 1] = (byte)(this.ayE[i + 1] * 255 / by);
                    this.ayE[i + 2] = (byte)(this.ayE[i + 2] * 255 / by);
                    continue;
                }
                this.ayE[i] = -1;
                this.ayE[i + 1] = -1;
                this.ayE[i + 2] = -1;
            }
        }
    }

    public boolean bPT() {
        return this.dnu;
    }

    public float ch(int n, int n2) {
        if (n >= this.brs || n2 >= this.brt || this.ayE == null) {
            return 0.0f;
        }
        byte by = this.ayE[4 * (n + n2 * this.brs) + 3];
        return (float)by / 255.0f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aws_2) {
            aws_2 aws_22 = (aws_2)object;
            if (this.getWidth() != aws_22.getWidth() || this.getHeight() != aws_22.getHeight()) {
                return false;
            }
            byte[] byArray = this.aKU();
            byte[] byArray2 = aws_22.aKU();
            for (int i = 0; i < byArray.length; ++i) {
                if (byArray[i] == byArray2[i]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "Pas d'insertion possible en tant que clef dans une HashMap/HashTable";
        return super.hashCode();
    }
}

