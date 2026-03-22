/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fjU
extends fjz_0 {
    private static final Logger szY = Logger.getLogger(fjU.class);
    public static final fja_0 szZ = new fjV();
    private int epK;
    private int[] szV;

    public fjU() {
        super(fjb_0.szb);
    }

    public void Ck(int n) {
        this.epK = n;
    }

    public void T(int[] nArray) {
        this.szV = nArray;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szY.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.g(this.epK, this.szV);
    }

    @Override
    public boolean h(fjm fjm2) {
        return false;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.epK);
        if (this.szV != null) {
            int n = this.szV.length;
            for (int i = 0; i < n; ++i) {
                byteBuffer.putInt(this.szV[i]);
            }
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.epK = byteBuffer.getInt();
        int n = byteBuffer.remaining();
        if (n % 4 != 0) {
            szY.error((Object)"Impossible de d\u00e9s\u00e9rialiser une nationActionRequest. Nombre d'octets restants non valides pour former des entiers... pas multiple de 4.");
            return false;
        }
        int n2 = n / 4;
        this.szV = new int[n2];
        for (int i = 0; i < n2; ++i) {
            this.szV[i] = byteBuffer.getInt();
        }
        return true;
    }

    @Override
    public int DN() {
        if (this.szV == null) {
            return 4;
        }
        return 4 + 4 * this.szV.length;
    }

    @Override
    public void clear() {
        this.szV = null;
        this.epQ = -1;
        this.epK = -1;
    }
}

