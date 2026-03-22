/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;
import org.apache.log4j.Logger;

public class aeS {
    private static final Logger conn = Logger.getLogger(aeS.class);
    public static final byte coo = 1;
    public static final byte cop = 2;
    private static final short coq = 16;
    private static final short cor = 32;
    private static final short cos = 64;
    private static final short cot = 128;
    private static final short cou = 15;
    protected final aeR cov;
    private final int cow;
    private final short cox;
    private final short coy;
    private final short coz;
    private final short coA;
    private final short coB;
    private final short coC;
    private final int coD;
    private final byte coE;
    private final byte coF;
    private final byte coG;
    private final byte coH;
    private final TextureCoords coI;
    private final byte coJ;
    private byte coK;

    public aeS(int n, short s, short s2, short s3, short s4, short s5, short s6, int n2, boolean bl, byte by, byte by2, boolean bl2, boolean bl3, boolean bl4, byte by3, byte by4, byte by5, aeR aeR2, byte by6) {
        this.cow = n;
        this.cox = s;
        this.coy = s2;
        this.coB = s3;
        this.coC = s4;
        this.coz = s5;
        this.coA = s6;
        this.coD = n2;
        this.coE = by2;
        assert (by <= 15);
        byte by7 = by;
        by7 = (byte)(by7 | (bl ? 16 : 0));
        by7 = (byte)(by7 | (bl2 ? 32 : 0));
        by7 = (byte)(by7 | (bl3 ? 64 : 0));
        this.coJ = by7 = (byte)(by7 | (bl4 ? 128 : 0));
        this.coF = by3;
        this.coG = by4;
        this.coH = by5;
        this.cov = aeR2;
        this.coI = this.cov == null ? aeS.f(this.coz, this.coA, this.bwW()) : null;
        this.coK = by6;
    }

    aeS(DataInput dataInput) {
        this.cow = dataInput.readInt();
        this.cox = dataInput.readShort();
        this.coy = dataInput.readShort();
        this.coB = dataInput.readShort();
        this.coC = dataInput.readShort();
        this.coz = dataInput.readShort();
        this.coA = dataInput.readShort();
        this.coD = dataInput.readInt();
        this.coJ = dataInput.readByte();
        this.coE = dataInput.readByte();
        this.coF = dataInput.readByte();
        this.coG = dataInput.readByte();
        this.coH = dataInput.readByte();
        boolean bl = this.bwW();
        this.cov = aeW.a(dataInput, bl);
        this.coI = this.cov == null ? aeS.f(this.coz, this.coA, bl) : null;
        this.coK = dataInput.readByte();
    }

    public void b(DataOutput dataOutput) {
        dataOutput.writeInt(this.cow);
        dataOutput.writeShort(this.cox);
        dataOutput.writeShort(this.coy);
        dataOutput.writeShort(this.coB);
        dataOutput.writeShort(this.coC);
        dataOutput.writeShort(this.coz);
        dataOutput.writeShort(this.coA);
        dataOutput.writeInt(this.coD);
        dataOutput.writeByte(this.coJ);
        dataOutput.writeByte(this.coE);
        dataOutput.writeByte(this.coF);
        dataOutput.writeByte(this.coG);
        dataOutput.writeByte(this.coH);
        if (this.cov == null) {
            dataOutput.writeByte(0);
        } else {
            this.cov.a(dataOutput);
        }
        dataOutput.writeByte(this.coK);
    }

    public int d() {
        return this.cow;
    }

    public int bwS() {
        return this.cox;
    }

    public int bwT() {
        return this.coy;
    }

    public int bwU() {
        return this.coB;
    }

    public int bwV() {
        return this.coC;
    }

    public int aVt() {
        return this.coD;
    }

    public boolean bwW() {
        return (this.coJ & 0x10) == 16;
    }

    public byte bwX() {
        return (byte)(this.coJ & 0xF);
    }

    public int bwY() {
        return this.coE;
    }

    public boolean bwZ() {
        return (this.coJ & 0x20) == 32;
    }

    public byte bxa() {
        return this.coK;
    }

    public boolean bxb() {
        return (this.coJ & 0x40) == 64;
    }

    public boolean bxc() {
        return (this.coJ & 0x80) == 128;
    }

    public byte brR() {
        return this.coF;
    }

    public byte bsX() {
        return this.coG;
    }

    public byte bxd() {
        return this.coH;
    }

    public boolean bss() {
        return this.cov != null;
    }

    public float aRI() {
        return (float)this.coA / (float)this.coC;
    }

    public float aRH() {
        return (float)this.coz / (float)this.coB;
    }

    public TextureCoords ax(short s) {
        if (this.coI != null) {
            assert (this.cov == null);
            return this.coI;
        }
        return ((aeW)this.cov).ax(s);
    }

    private static TextureCoords f(int n, int n2, boolean bl) {
        float f2 = GC.mV(n);
        float f3 = (float)GC.mV(n2) - 0.5f;
        float f4 = (float)n / f2;
        float f5 = (float)n2 / f3;
        if (bl) {
            return new TextureCoords(f4, f5, 0.0f, 0.0f);
        }
        return new TextureCoords(0.0f, f5, f4, 0.0f);
    }

    public static aeS a(int n, boolean bl, boolean bl2) {
        return new aeS(n, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, bl, false, bl2, 0, 0, 0, null, 0);
    }
}

