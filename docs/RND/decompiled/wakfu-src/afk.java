/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class afk
implements afl,
apa_1,
apb_1 {
    protected static final Logger cpY = Logger.getLogger(afk.class);
    private String cpZ;
    private ByteBuffer cqa;

    @Override
    public void ex(String string) {
        InputStream inputStream = null;
        try {
            URL uRL = fo_0.bA(string);
            inputStream = uRL.openStream();
        }
        catch (Exception exception) {
            File file = new File(string);
            inputStream = new FileInputStream(file);
        }
        this.gQ(new BufferedInputStream(inputStream));
    }

    public boolean gQ(InputStream inputStream) {
        int n = inputStream.available();
        if (n == 0) {
            inputStream.close();
            return true;
        }
        byte[] byArray = new byte[n];
        this.cqa = ByteBuffer.allocate(n);
        this.cqa.order(ByteOrder.BIG_ENDIAN);
        int n2 = inputStream.read(byArray);
        while (n2 != -1) {
            this.cqa.put(byArray, 0, n2);
            n2 = inputStream.read(byArray);
        }
        this.cqa.rewind();
        this.a(this, new ape_1[0]);
        this.cqa.clear();
        inputStream.close();
        this.close();
        return true;
    }

    public boolean bxv() {
        return this.cqa.get() != 0;
    }

    public int bxw() {
        return this.cqa.getInt();
    }

    public long bxx() {
        return this.cqa.getLong();
    }

    public float aIB() {
        return this.cqa.getFloat();
    }

    public short aIz() {
        return this.cqa.getShort();
    }

    public byte aIy() {
        return this.cqa.get();
    }

    public String aIC() {
        int n = this.bxw();
        byte[] byArray = new byte[n];
        this.cqa.get(byArray);
        return BH.dc(byArray);
    }

    public int[] bxy() {
        int[] nArray;
        int n = this.bxw();
        try {
            nArray = new int[n];
        }
        catch (OutOfMemoryError outOfMemoryError) {
            cpY.fatal((Object)("Taille du tableau allou\u00e9 : " + n), (Throwable)outOfMemoryError);
            throw outOfMemoryError;
        }
        for (int i = 0; i < n; ++i) {
            nArray[i] = this.bxw();
        }
        return nArray;
    }

    public long[] bxz() {
        long[] lArray;
        int n = this.bxw();
        try {
            lArray = new long[n];
        }
        catch (OutOfMemoryError outOfMemoryError) {
            cpY.fatal((Object)("Taille du tableau allou\u00e9 : " + n));
            throw outOfMemoryError;
        }
        for (int i = 0; i < n; ++i) {
            lArray[i] = this.bxx();
        }
        return lArray;
    }

    public float[] bxA() {
        int n = this.bxw();
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            fArray[i] = this.aIB();
        }
        return fArray;
    }

    public byte[] bxB() {
        int n = this.bxw();
        byte[] byArray = new byte[n];
        for (int i = 0; i < n; ++i) {
            byArray[i] = this.aIy();
        }
        return byArray;
    }

    @Override
    public void close() {
    }

    public String bxC() {
        return this.cpZ;
    }

    public void ey(String string) {
        this.cpZ = string;
    }

    public apb_1 bxD() {
        return null;
    }

    @Override
    public apd_1 ez(String string) {
        return null;
    }

    @Override
    public ArrayList<apd_1> eA(String string) {
        return null;
    }

    @Override
    public void bxE() {
    }

    @Override
    public void a(apc_1 apc_12) {
    }

    @Override
    public void eB(String string) {
    }

    @Override
    public void bxF() {
    }

    @Override
    public void bxG() {
    }

    @Override
    public void eC(String string) {
    }

    @Override
    public boolean eD(String string) {
        return false;
    }

    public void a(apb_1 apb_12) {
    }
}

