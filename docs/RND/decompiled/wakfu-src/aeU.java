/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.set.hash.TShortHashSet;
import java.io.DataOutput;

public class aeU
extends aeR {
    final short coO;
    final short coP;
    final short coQ;
    final short coR;
    final short[] coS;
    final int coT;
    final short[] coU;

    public aeU(int n, short s, short s2, short s3, short s4, short[] sArray, short[] sArray2) {
        this.coT = n;
        this.coO = s;
        this.coP = s2;
        this.coQ = s3;
        this.coR = s4;
        this.coU = sArray;
        this.coS = sArray2;
    }

    @Override
    public int aRz() {
        return this.coT;
    }

    @Override
    public String toString() {
        return "dur\u00e9e: " + this.coT + "ms  images: " + this.coU.length;
    }

    public short[] aRy() {
        return this.coS;
    }

    public short[] aRA() {
        return this.coU;
    }

    @Override
    public void a(DataOutput dataOutput) {
        if (this.coU == null || this.coU.length <= 1) {
            dataOutput.writeByte(0);
        } else {
            int n;
            int n2 = this.coU.length;
            dataOutput.writeByte(n2);
            dataOutput.writeInt(this.coT);
            dataOutput.writeShort(this.coO);
            dataOutput.writeShort(this.coP);
            dataOutput.writeShort(this.coQ);
            dataOutput.writeShort(this.coR);
            for (n = 0; n < n2; ++n) {
                dataOutput.writeShort(this.coU[n]);
            }
            assert (this.coS.length == 2 * n2);
            for (n = 0; n < this.coS.length; ++n) {
                dataOutput.writeShort(this.coS[n]);
            }
        }
    }

    public short aRu() {
        return this.coO;
    }

    public short aRv() {
        return this.coP;
    }

    public short aRw() {
        return this.coQ;
    }

    public short aRx() {
        return this.coR;
    }

    public static aeU a(short s, short s2, short[] sArray, short[] sArray2) {
        short s3;
        if (sArray.length <= 1 || sArray2.length <= 2) {
            throw new RuntimeException("pas une animation");
        }
        if (sArray.length * 2 != sArray2.length) {
            throw new RuntimeException("valeurs incorrectes");
        }
        int n = 0;
        for (int i = 0; i < sArray.length; ++i) {
            n += sArray[i];
        }
        TShortHashSet tShortHashSet = new TShortHashSet();
        TShortHashSet tShortHashSet2 = new TShortHashSet();
        for (s3 = 0; s3 < sArray2.length; s3 += 2) {
            tShortHashSet.add(sArray2[s3]);
            tShortHashSet2.add(sArray2[s3 + 1]);
        }
        s3 = (short)(s / tShortHashSet.size());
        short s4 = (short)(s2 / tShortHashSet2.size());
        return new aeU(n, s3, s4, s, s2, sArray, sArray2);
    }

    public static aeU b(short s, short s2, short[] sArray, short[] sArray2) {
        short s3;
        if (sArray.length <= 1 || sArray2.length <= 2) {
            throw new RuntimeException("pas une animation");
        }
        if (sArray.length * 2 != sArray2.length) {
            throw new RuntimeException("valeurs incorrectes");
        }
        int n = 0;
        for (int i = 0; i < sArray.length; ++i) {
            n += sArray[i];
        }
        TShortHashSet tShortHashSet = new TShortHashSet();
        TShortHashSet tShortHashSet2 = new TShortHashSet();
        for (s3 = 0; s3 < sArray2.length; s3 += 2) {
            tShortHashSet.add(sArray2[s3]);
            tShortHashSet2.add(sArray2[s3 + 1]);
        }
        s3 = (short)(s * tShortHashSet.size());
        short s4 = (short)(s2 * tShortHashSet2.size());
        return new aeU(n, s, s2, s3, s4, sArray, sArray2);
    }
}

