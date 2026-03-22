/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;

public abstract class aeR {
    aeR() {
    }

    public abstract void a(DataOutput var1);

    public abstract int aRz();

    public abstract String toString();

    static TextureCoords[] a(short[] sArray, short s, short s2, int n, int n2, boolean bl) {
        assert (n > 0);
        assert (n2 > 0);
        float f2 = GC.mV(n);
        float f3 = (float)GC.mV(n2) - 0.5f;
        float f4 = (float)s / f2;
        float f5 = (float)s2 / f3;
        TextureCoords[] textureCoordsArray = new TextureCoords[sArray.length / 2];
        for (int i = 0; i < textureCoordsArray.length; ++i) {
            float f6 = ((float)sArray[i * 2] + 0.5f) / f2;
            float f7 = ((float)sArray[i * 2 + 1] + 0.5f) / f3;
            textureCoordsArray[i] = bl ? new TextureCoords(f4 + f6, f5 + f7, f6, f7) : new TextureCoords(f6, f5 + f7, f4 + f6, f7);
        }
        return textureCoordsArray;
    }

    static aeR a(boolean bl, DataInput dataInput, boolean bl2) {
        int n = dataInput.readByte() & 0xFF;
        if (n == 0) {
            return null;
        }
        int n2 = dataInput.readInt();
        short s = dataInput.readShort();
        short s2 = dataInput.readShort();
        short s3 = dataInput.readShort();
        short s4 = dataInput.readShort();
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            sArray[i] = dataInput.readShort();
        }
        short[] sArray2 = new short[n * 2];
        for (int i = 0; i < n * 2; ++i) {
            sArray2[i] = dataInput.readShort();
        }
        if (bl) {
            return new aeU(n2, s, s2, s3, s4, sArray, sArray2);
        }
        TextureCoords[] textureCoordsArray = aeR.a(sArray2, s, s2, s3, s4, bl2);
        return new aeW(n2, sArray, textureCoordsArray);
    }
}

