/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from oB
 */
final class ob_1 {
    private int[] QU = null;
    private int QV = 0;
    private int Rl = 0;
    private int Rm = 0;
    private int QW = 0;
    private int QX = 0;
    private long QY = 0L;
    private long QZ = 0L;
    private int[] Ra = null;
    private byte Rb = 0;
    private byte Rn = 0;
    private byte Rc = 0;
    private final ArrayList<oa_1> Ro = new ArrayList(0);
    private byte Re = 0;
    private int Rf = 0;
    final /* synthetic */ oy_1 Rp;

    ob_1(oy_1 oy_12) {
        this.Rp = oy_12;
    }

    public void avW() {
        this.Rp.QU = this.QU;
        this.Rp.QV = this.QV;
        this.Rp.QW = this.QW;
        this.Rp.QX = this.QX;
        this.Rp.QY = this.QY;
        this.Rp.QZ = this.QZ;
        this.Rp.Ra = this.Ra;
        this.Rp.Rb = this.Rb;
        this.Rp.Rc = this.Rc;
        this.Rp.Rd.clear();
        this.Rp.Rd.ensureCapacity(this.Ro.size());
        this.Rp.Rd.addAll(this.Ro);
        this.Rp.Re = this.Re;
        this.Rp.Rf = this.Rf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.QU = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.QU[n] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        return true;
    }

    private boolean cy(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.QU = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.QU[n] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        return true;
    }

    private boolean cz(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.QU = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.QU[n] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rn = byteBuffer.get();
        return true;
    }

    private boolean cA(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.QU = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.QU[n] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rn = byteBuffer.get();
        this.Rc = byteBuffer.get();
        return true;
    }

    private boolean cB(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.QU = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.QU[n] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rc = byteBuffer.get();
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.QU = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.QU[n2] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.Rl = byteBuffer.getInt();
        this.Rm = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Ra = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Ra[n] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rc = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.Ro.clear();
        this.Ro.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            oa_1 oa_12 = new oa_1();
            boolean bl = oa_12.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.Ro.add(oa_12);
        }
        return true;
    }

    private boolean cD(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.QU = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.QU[n2] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Ra = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Ra[n] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rc = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.Ro.clear();
        this.Ro.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            oa_1 oa_12 = new oa_1();
            boolean bl = oa_12.b(byteBuffer, 10054000);
            if (!bl) {
                return false;
            }
            this.Ro.add(oa_12);
        }
        return true;
    }

    private boolean cE(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.QU = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.QU[n2] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        this.QZ = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Ra = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Ra[n] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rc = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.Ro.clear();
        this.Ro.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            oa_1 oa_12 = new oa_1();
            boolean bl = oa_12.b(byteBuffer, 10057001);
            if (!bl) {
                return false;
            }
            this.Ro.add(oa_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10035003) {
            boolean bl = this.cy(byteBuffer);
            return bl;
        }
        if (n < 10041001) {
            boolean bl = this.cz(byteBuffer);
            return bl;
        }
        if (n < 10044001) {
            boolean bl = this.cA(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cB(byteBuffer);
            return bl;
        }
        if (n < 10054000) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10057001) {
            boolean bl = this.cD(byteBuffer);
            return bl;
        }
        if (n < 10081000) {
            boolean bl = this.cE(byteBuffer);
            return bl;
        }
        return false;
    }
}

