/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Renamed from aEs
 */
public final class aes_1 {
    private static final int dFI = -1;
    private static final int dFJ = 16384;
    private static final int dFK = 0;
    private static final int[] dFL = new int[]{0, 0};
    private static final String dFM = "\t\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0012\u0000\u0001\u0002\u0001\u0000\u0001\u0003\u001e\u0000\u0001\u0000\u001a\u0000\u0001\u0001\uffa3\u0000";
    private static final char[] dFN = aes_1.hs("\t\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0012\u0000\u0001\u0002\u0001\u0000\u0001\u0003\u001e\u0000\u0001\u0000\u001a\u0000\u0001\u0001\uffa3\u0000");
    private static final int[] dFO = aes_1.bZu();
    private static final String dFP = "\u0002\u0001\u0002\u0002\u0001\u0001\u0003\u0000\u0001\u0003\u0001\u0001\u0001\u0003\u0001\u0000\u0002\u0003";
    private static final int[] dFQ = aes_1.bZv();
    private static final String dFR = "\u0000\u0000\u0000\u0004\u0000\b\u0000\f\u0000\u0010\u0000\b\u0000\u0014\u0000\u0018\u0000\u0004\u0000\u001c\u0000\u0010\u0000 \u0000\f\u0000\u0018";
    private static final int[] dFS = aes_1.bZw();
    private static final String dFT = "\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0002\u0001\u0006\u0001\u0000\u0005\u0002\u0004\u0000\u0001\u0005\u0001\u0007\u0001\b\u0001\t\u0001\u0005\u0001\n\u0001\u0005\u0001\u000b\u0001\b\u0001\f\u0001\b\u0001\r\u0001\u0005\u0001\u0007\u0001\b\u0001\u000b\u0001\b\u0001\f\u0001\b\u0001\u000e";
    private static final int dFU = 0;
    private static final int dFV = 1;
    private static final int dFW = 2;
    private static final String[] dFX = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] dFY = aes_1.bZx();
    private static final String dFZ = "\u0003\u0001\u0001\t\u0001\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0001\t\u0001\u0001";
    private Reader dGa;
    private int dGb;
    private int dGc = 0;
    private char[] dGd = new char[16384];
    private int dGe;
    private int dGf;
    private int dGg;
    private int dGh;
    private int dGi;
    private int dGj;
    private int dGk;
    private boolean dGl = true;
    private boolean dGm;

    private static int[] bZu() {
        int[] nArray = new int[14];
        int n = 0;
        n = aes_1.a(dFP, n, nArray);
        return nArray;
    }

    private static int a(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c2 = string.charAt(n2++);
            do {
                nArray[n3++] = c2;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static int[] bZv() {
        int[] nArray = new int[14];
        int n = 0;
        n = aes_1.b(dFR, n, nArray);
        return nArray;
    }

    private static int b(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++) << 16;
            nArray[n3++] = n5 | string.charAt(n2++);
        }
        return n3;
    }

    private static int[] bZw() {
        int[] nArray = new int[36];
        int n = 0;
        n = aes_1.c(dFT, n, nArray);
        return nArray;
    }

    private static int c(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            int n6 = string.charAt(n2++);
            do {
                nArray[n3++] = --n6;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static int[] bZx() {
        int[] nArray = new int[14];
        int n = 0;
        n = aes_1.d(dFZ, n, nArray);
        return nArray;
    }

    private static int d(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c2 = string.charAt(n2++);
            do {
                nArray[n3++] = c2;
            } while (--n5 > 0);
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void main(String[] stringArray) {
        try {
            String string;
            InputStream inputStream;
            Object object;
            if (stringArray.length > 0) {
                object = new File(stringArray[0]);
                if (!((File)object).exists()) throw new IOException("Could not find " + stringArray[0]);
                if (!((File)object).canRead()) throw new IOException("Could not open " + stringArray[0]);
                inputStream = new FileInputStream((File)object);
            } else {
                inputStream = System.in;
            }
            object = new aes_1(inputStream);
            while ((string = ((aes_1)object).bZy()) != null) {
                System.out.println(string);
            }
            return;
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    public String bZy() {
        return this.bDO();
    }

    private static String hr(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == '\\' && i < string.length()) {
                ++i;
            }
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    aes_1(Reader reader) {
        this.dGa = reader;
    }

    aes_1(InputStream inputStream) {
        this(new InputStreamReader(inputStream));
    }

    private static char[] hs(String string) {
        char[] cArray = new char[65536];
        int n = 0;
        int n2 = 0;
        while (n < 26) {
            int n3 = string.charAt(n++);
            char c2 = string.charAt(n++);
            do {
                cArray[n2++] = c2;
            } while (--n3 > 0);
        }
        return cArray;
    }

    private boolean bZz() {
        int n;
        if (this.dGg > 0) {
            System.arraycopy(this.dGd, this.dGg, this.dGd, 0, this.dGh - this.dGg);
            this.dGh -= this.dGg;
            this.dGf -= this.dGg;
            this.dGe -= this.dGg;
            this.dGg = 0;
        }
        if (this.dGf >= this.dGd.length) {
            char[] cArray = new char[this.dGf * 2];
            System.arraycopy(this.dGd, 0, cArray, 0, this.dGd.length);
            this.dGd = cArray;
        }
        if ((n = this.dGa.read(this.dGd, this.dGh, this.dGd.length - this.dGh)) > 0) {
            this.dGh += n;
            return false;
        }
        if (n == 0) {
            int n2 = this.dGa.read();
            if (n2 == -1) {
                return true;
            }
            this.dGd[this.dGh++] = (char)n2;
            return false;
        }
        return true;
    }

    private void bZA() {
        this.dGm = true;
        this.dGh = this.dGg;
        if (this.dGa != null) {
            this.dGa.close();
        }
    }

    private void a(Reader reader) {
        this.dGa = reader;
        this.dGl = true;
        this.dGm = false;
        this.dGg = 0;
        this.dGh = 0;
        this.dGe = 0;
        this.dGf = 0;
        this.dGk = 0;
        this.dGj = 0;
        this.dGi = 0;
        this.dGc = 0;
    }

    private int bZB() {
        return this.dGc;
    }

    private void xk(int n) {
        this.dGc = n;
    }

    private String bZC() {
        return new String(this.dGd, this.dGg, this.dGe - this.dGg);
    }

    private char xl(int n) {
        return this.dGd[this.dGg + n];
    }

    private int bZD() {
        return this.dGe - this.dGg;
    }

    private void xm(int n) {
        String string;
        try {
            string = dFX[n];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            string = dFX[0];
        }
        throw new Error(string);
    }

    private void xn(int n) {
        if (n > this.bZD()) {
            this.xm(2);
        }
        this.dGe -= n;
    }

    private String bDO() {
        int n = this.dGh;
        char[] cArray = this.dGd;
        char[] cArray2 = dFN;
        int[] nArray = dFS;
        int[] nArray2 = dFQ;
        int[] nArray3 = dFY;
        block7: while (true) {
            int n2;
            int n3 = this.dGe;
            int n4 = -1;
            this.dGf = this.dGg = n3;
            int n5 = this.dGg;
            this.dGb = dFL[this.dGc];
            while (true) {
                int n6;
                if (n5 < n) {
                    n2 = cArray[n5++];
                } else {
                    if (this.dGm) {
                        n2 = -1;
                        break;
                    }
                    this.dGf = n5;
                    this.dGe = n3;
                    n6 = this.bZz();
                    n5 = this.dGf;
                    n3 = this.dGe;
                    cArray = this.dGd;
                    n = this.dGh;
                    if (n6 != 0) {
                        n2 = -1;
                        break;
                    }
                    n2 = cArray[n5++];
                }
                n6 = nArray[nArray2[this.dGb] + cArray2[n2]];
                if (n6 == -1) break;
                this.dGb = n6;
                int n7 = nArray3[this.dGb];
                if ((n7 & 1) != 1) continue;
                n4 = this.dGb;
                n3 = n5;
                if ((n7 & 8) == 8) break;
            }
            this.dGe = n3;
            switch (n4 < 0 ? n4 : dFO[n4]) {
                case 3: {
                    return aes_1.hr(this.bZC().substring(1, this.bZC().length() - 1));
                }
                case 4: {
                    continue block7;
                }
                case 2: 
                case 5: {
                    continue block7;
                }
                case 1: {
                    return aes_1.hr(this.bZC());
                }
                case 6: {
                    continue block7;
                }
            }
            if (n2 == -1 && this.dGg == this.dGf) {
                this.dGm = true;
                return null;
            }
            this.xm(1);
        }
    }
}

