/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;

public class aeW
extends aeR {
    private final TextureCoords[] coY;
    final int coZ;
    final short[] cpa;

    aeW(int n, short[] sArray, TextureCoords[] textureCoordsArray) {
        this.coZ = n;
        this.cpa = sArray;
        this.coY = textureCoordsArray;
    }

    @Override
    public void a(DataOutput dataOutput) {
        throw new UnsupportedOperationException("utiliser la classe ElementAnimData.Export");
    }

    public TextureCoords ax(short s) {
        int n = (s & 0xFFFF) % this.coZ;
        for (int i = 0; i < this.cpa.length; ++i) {
            if ((n -= this.cpa[i]) >= 0) continue;
            return this.coY[i];
        }
        return this.coY[0];
    }

    @Override
    public int aRz() {
        return this.coZ;
    }

    @Override
    public String toString() {
        return "dur\u00e9e: " + this.coZ + "ms  images: " + this.cpa.length;
    }

    public static aeW a(aeU aeU2) {
        TextureCoords[] textureCoordsArray = aeW.a(aeU2.coS, aeU2.coO, aeU2.coP, aeU2.coQ, aeU2.coR, false);
        return new aeW(aeU2.coT, aeU2.coU, textureCoordsArray);
    }

    public static aeW a(DataInput dataInput, boolean bl) {
        return (aeW)aeR.a(false, dataInput, bl);
    }
}

