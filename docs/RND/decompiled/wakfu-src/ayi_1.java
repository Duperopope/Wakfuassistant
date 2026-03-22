/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ayi
 */
public class ayi_1 {
    protected static final Logger dsm = Logger.getLogger(ayi_1.class);
    protected boolean[][] dsn;
    protected int dso;
    protected int dsp;
    protected int bjW;
    protected int bjX;
    protected boolean awS;
    static final char dsq = 'X';
    static final char dsr = '-';
    static final char dss = ' ';

    protected ayi_1() {
    }

    protected ayi_1(int n) {
        this.vq(n);
    }

    protected ayi_1(int n, int n2) {
        this.co(n, n2);
    }

    protected ayi_1(boolean[][] blArray) {
        this.dso = blArray.length;
        if (this.dso > 0) {
            this.dsp = blArray[0].length;
            this.dsn = blArray;
        }
    }

    public ayi_1(int n, int n2, List<int[]> list) {
        this.co(n, n2);
        this.u(list);
    }

    protected void vq(int n) {
        this.dso = 2 * n + 1;
        this.dsp = 2 * n + 1;
        this.bjW = n;
        this.bjX = n;
        this.dsn = new boolean[this.dso][this.dsp];
    }

    protected void co(int n, int n2) {
        this.dso = 2 * n + 1;
        this.dsp = 2 * n2 + 1;
        this.bjW = n;
        this.bjX = n2;
        this.dsn = new boolean[this.dso][this.dsp];
    }

    public void a(ayi_1 ayi_12) {
        this.dsn = (boolean[][])ayi_12.dsn.clone();
        for (int i = 0; i < this.dso; ++i) {
            this.dsn[i] = (boolean[])ayi_12.dsn[i].clone();
        }
        this.dso = ayi_12.dso;
        this.dsp = ayi_12.dsp;
        this.bjW = ayi_12.bjW;
        this.bjX = ayi_12.bjX;
        this.awS = ayi_12.awS;
    }

    public int bgv() {
        return this.bjW;
    }

    public int bgu() {
        return this.bjX;
    }

    public void bRR() {
        this.bjW = this.dso / 2;
        this.bjX = this.dsp / 2;
    }

    public void cp(int n, int n2) {
        this.bjW = n;
        this.bjX = n2;
    }

    public boolean cq(int n, int n2) {
        return this.dsn[n][n2];
    }

    public void a(boolean[][] blArray) {
        this.dsn = blArray;
        this.awS = false;
    }

    public void u(List<int[]> list) {
        for (int[] nArray : list) {
            this.dsn[nArray[0] + this.dso][nArray[1] + this.dsp] = true;
        }
    }

    public int bRS() {
        return this.dso;
    }

    public int bRT() {
        return this.dsp;
    }

    public void a(int n, int n2, ayj_1 ayj_12, ayj_1 ayj_13) {
        block44: {
            block46: {
                float f2;
                boolean[] blArray;
                int n3;
                block45: {
                    boolean[][] blArray2 = null;
                    n3 = 0;
                    if (n != this.dso) {
                        float f3 = (float)this.dso / (float)n;
                        blArray2 = this.dsn;
                        this.dsn = new boolean[n][];
                        if (n < this.dso) {
                            switch (ayj_12.ordinal()) {
                                case 0: 
                                case 1: 
                                case 2: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.dsn[n3] = blArray2[n3];
                                    }
                                    break;
                                }
                                case 3: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.dsn[n3] = blArray2[Math.round((float)n3 * f3)];
                                    }
                                    break;
                                }
                            }
                        } else {
                            switch (ayj_12.ordinal()) {
                                case 0: {
                                    for (n3 = 0; n3 < this.dso; ++n3) {
                                        this.dsn[n3] = blArray2[n3];
                                    }
                                    for (n3 = this.dso; n3 < n; ++n3) {
                                        this.dsn[n3] = new boolean[n2];
                                    }
                                    break;
                                }
                                case 1: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.dsn[n3] = blArray2[n3 % this.dso];
                                    }
                                    break;
                                }
                                case 3: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.dsn[n3] = blArray2[(int)((float)n3 * f3)];
                                    }
                                    break;
                                }
                                case 2: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.dsn[n3] = n3 / this.dso % 2 == 0 ? blArray2[n3 % this.dso] : blArray2[this.dso - n3 % this.dso - 1];
                                    }
                                    break;
                                }
                            }
                        }
                        this.dso = n;
                    }
                    if (n2 == this.dsp) break block44;
                    blArray = null;
                    f2 = (float)this.dsp / (float)n2;
                    if (n2 >= this.dsp) break block45;
                    switch (ayj_13.ordinal()) {
                        case 0: 
                        case 1: 
                        case 2: {
                            for (int i = 0; i < this.dso; ++i) {
                                blArray = this.dsn[i];
                                this.dsn[i] = new boolean[n2];
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.dsn[i][n3] = blArray[n3];
                                }
                            }
                            break block46;
                        }
                        case 3: {
                            for (int i = 0; i < this.dso; ++i) {
                                blArray = this.dsn[i];
                                this.dsn[i] = new boolean[n2];
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.dsn[i][n3] = blArray[(int)((float)n3 * f2)];
                                }
                            }
                            break;
                        }
                    }
                    break block46;
                }
                switch (ayj_13.ordinal()) {
                    case 0: {
                        for (int i = 0; i < this.dso; ++i) {
                            blArray = this.dsn[i];
                            this.dsn[i] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.dsn[i][n3] = blArray[n3];
                            }
                        }
                        break;
                    }
                    case 1: {
                        for (int i = 0; i < this.dso; ++i) {
                            blArray = this.dsn[i];
                            this.dsn[i] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.dsn[i][n3] = blArray[n3 % this.dsp];
                            }
                        }
                        break;
                    }
                    case 3: {
                        for (int i = 0; i < this.dso; ++i) {
                            blArray = this.dsn[i];
                            this.dsn[i] = new boolean[n2];
                            try {
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.dsn[i][n3] = blArray[(int)((float)n3 * f2)];
                                }
                                continue;
                            }
                            catch (Exception exception) {
                                dsm.info((Object)((int)((float)n3 * f2)));
                            }
                        }
                        break;
                    }
                    case 2: {
                        for (int i = 0; i < this.dso; ++i) {
                            blArray = this.dsn[i];
                            this.dsn[i] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.dsn[i][n3] = n3 / this.dso % 2 == 0 ? blArray[n3 % this.dsp] : blArray[this.dsp - n3 % this.dsp - 1];
                            }
                        }
                        break;
                    }
                }
            }
            this.dsp = n2;
        }
        this.awS = false;
    }

    public void bIE() {
        if (!this.awS) {
            int n;
            int n2;
            int n3;
            this.awS = true;
            boolean bl = false;
            int n4 = this.dso;
            boolean bl2 = false;
            int n5 = this.dsp;
            boolean bl3 = false;
            for (n3 = 0; n3 < this.dso; ++n3) {
            }
            for (n3 = 0; n3 < this.dso; ++n3) {
                bl3 = true;
                for (n2 = 0; n2 < this.dsp; ++n2) {
                    if (!this.dsn[n3][n2]) continue;
                    bl3 = false;
                }
            }
            this.bjW += 0;
            this.bjX += 0;
            n2 = n4 - 0;
            int n6 = n5 - 0;
            boolean[][] blArray = this.dsn;
            for (n = 0; n < this.dso; ++n) {
                blArray[n] = this.dsn[n];
            }
            this.dso = n2;
            this.dsp = n6;
            this.dsn = new boolean[this.dso][];
            for (n = 0; n < this.dso; ++n) {
                this.dsn[n] = new boolean[this.dsp];
                for (int i = 0; i < this.dsp; ++i) {
                    this.dsn[n][i] = blArray[n + 0][i + 0];
                }
            }
        }
    }

    public void a(ayi_1 ayi_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.bjW - ayi_12.bjW;
        n2 += this.bjX - ayi_12.bjX;
        for (int i = 0; i < ayi_12.dso; ++i) {
            n3 = i + n;
            if (n3 < 0 || n3 >= this.dso) continue;
            for (int j = 0; j < ayi_12.dsp; ++j) {
                n4 = j + n2;
                if (n4 < 0 || n4 >= this.dsp) continue;
                boolean[] blArray = this.dsn[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] | ayi_12.dsn[i][j];
            }
        }
    }

    public void b(ayi_1 ayi_12) {
        this.a(ayi_12, 0, 0);
    }

    public void b(ayi_1 ayi_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.bjW - ayi_12.bjW;
        n2 += this.bjX - ayi_12.bjX;
        for (int i = 0; i < ayi_12.dso; ++i) {
            n3 = i + n;
            if (n3 < 0 || n3 >= this.dso) continue;
            for (int j = 0; j < ayi_12.dsp; ++j) {
                n4 = j + n2;
                if (n4 < 0 || n4 >= this.dsp) continue;
                boolean[] blArray = this.dsn[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] | ayi_12.dsn[i][j];
            }
        }
    }

    public void c(ayi_1 ayi_12) {
        this.b(ayi_12, 0, 0);
    }

    public void c(ayi_1 ayi_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.bjW - ayi_12.bjW;
        n2 += this.bjX - ayi_12.bjX;
        for (int i = 0; i < ayi_12.dso; ++i) {
            n3 = i + n;
            if (n3 < 0 || n3 >= this.dso) continue;
            for (int j = 0; j < ayi_12.dsp; ++j) {
                n4 = j + n2;
                if (n4 < 0 || n4 >= this.dsp) continue;
                boolean[] blArray = this.dsn[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] & ayi_12.dsn[i][j];
            }
        }
        this.awS = false;
    }

    public void d(ayi_1 ayi_12) {
        this.c(ayi_12, 0, 0);
    }

    public void d(ayi_1 ayi_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.bjW - ayi_12.bjW;
        n2 += this.bjX - ayi_12.bjX;
        for (int i = 0; i < ayi_12.dso; ++i) {
            n3 = i + n;
            if (n3 < 0 || n3 >= this.dso) continue;
            for (int j = 0; j < ayi_12.dsp; ++j) {
                n4 = j + n2;
                if (n4 < 0 || n4 >= this.dsp) continue;
                boolean[] blArray = this.dsn[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] & !ayi_12.dsn[i][j];
            }
        }
        this.awS = false;
    }

    public void e(ayi_1 ayi_12) {
        this.d(ayi_12, 0, 0);
    }

    public void bRU() {
        for (int i = 0; i < this.dso; ++i) {
            for (int j = 0; j < this.dsp; ++j) {
                this.dsn[i][j] = !this.dsn[i][j];
            }
        }
    }

    public void clear() {
        for (int i = 0; i < this.dso; ++i) {
            for (int j = 0; j < this.dsp; ++j) {
                this.dsn[i][j] = false;
            }
        }
        this.awS = false;
    }

    public void bRV() {
        this.bjW = this.dso - this.bjW - 1;
        for (int i = 0; i < this.dso / 2; ++i) {
            boolean[] blArray = this.dsn[i];
            this.dsn[i] = this.dsn[this.dso - i - 1];
            this.dsn[this.dso - i - 1] = blArray;
        }
    }

    public void bRW() {
        this.bjX = this.dsp - this.bjX - 1;
        for (int i = 0; i < this.dso; ++i) {
            for (int j = 0; j < this.dsp / 2; ++j) {
                boolean bl = this.dsn[i][j];
                this.dsn[i][j] = this.dsn[i][this.dsp - 1 - j];
                this.dsn[i][this.dsp - 1 - j] = bl;
            }
        }
    }

    public void bRX() {
        this.bRV();
        this.bRW();
    }

    public void bRY() {
        boolean[][] blArray = this.dsn;
        int n = this.dso;
        this.dso = this.dsp;
        this.dsp = n;
        int n2 = this.dsp - 1;
        n = this.bjW;
        this.bjW = this.bjX;
        this.bjX = n2 - n;
        this.dsn = new boolean[this.dso][];
        for (int i = 0; i < this.dso; ++i) {
            this.dsn[i] = new boolean[this.dsp];
            for (int j = 0; j < this.dsp; ++j) {
                this.dsn[i][j] = blArray[n2 - j][i];
            }
        }
    }

    public void bRZ() {
        this.bRX();
    }

    public void bSa() {
        boolean[][] blArray = this.dsn;
        int n = this.dso;
        this.dso = this.dsp;
        this.dsp = n;
        int n2 = this.dso - 1;
        n = this.bjW;
        this.bjW = n2 - this.bjX;
        this.bjX = n;
        this.dsn = new boolean[this.dso][];
        for (int i = 0; i < this.dso; ++i) {
            this.dsn[i] = new boolean[this.dsp];
            for (int j = 0; j < this.dsp; ++j) {
                this.dsn[i][j] = blArray[j][n2 - i];
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.bjW < 0 ? this.bjW : 0;
        int n2 = this.bjW >= this.dso ? this.bjW + 1 : this.dso;
        int n3 = this.bjX < 0 ? this.bjX : 0;
        int n4 = this.bjX >= this.dsp ? this.bjX + 1 : this.dsp;
        for (int i = n3; i < n4; ++i) {
            for (int j = n; j < n2; ++j) {
                if (j == this.bjW && i == this.bjX) {
                    stringBuilder.append("(");
                    if (j < 0 || j >= this.dso || i < 0 || i >= this.dsp) {
                        stringBuilder.append(' ');
                    } else {
                        stringBuilder.append(this.dsn[j][i] ? (char)'X' : '-');
                    }
                    stringBuilder.append(")");
                    continue;
                }
                stringBuilder.append(" ");
                if (j < 0 || j >= this.dso || i < 0 || i >= this.dsp) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append(this.dsn[j][i] ? (char)'X' : '-');
                }
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

