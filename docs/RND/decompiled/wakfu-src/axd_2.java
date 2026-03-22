/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;

/*
 * Renamed from axd
 */
class axd_2 {
    private final BufferedImage doJ;
    private int doK;
    private short doL;
    private byte doM;

    axd_2(BufferedImage bufferedImage) {
        this.doJ = bufferedImage;
    }

    public void bQy() {
        switch (this.doJ.getType()) {
            case 2: 
            case 3: 
            case 6: 
            case 7: {
                this.doK = 6408;
                this.doL = (short)32;
                this.doM = (byte)17;
                break;
            }
            case 4: 
            case 5: {
                this.doK = 6407;
                this.doL = (short)24;
                this.doM = (byte)2;
                break;
            }
            default: {
                this.doK = 6407;
                this.doL = (short)24;
                this.doM = 1;
            }
        }
    }

    public int bQz() {
        return this.doK;
    }

    public short bQA() {
        return this.doL;
    }

    public byte bQB() {
        return this.doM;
    }

    public String toString() {
        return "ImageInfos{m_image=" + String.valueOf(this.doJ) + ", m_gl=" + this.doK + ", m_bitDepth=" + this.doL + ", m_layer=" + this.doM + "}";
    }
}

