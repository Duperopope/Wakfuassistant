/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wW
 */
final class ww_2 {
    private int aif = 0;
    private wv_1 aig = null;
    private wl_1 aih = null;
    private wm_2 aii = null;
    private wx_1 aij = null;
    private wt_1 aik = null;
    private xh_1 ail = null;
    private xc_2 aim = null;
    private xd_1 ain = null;
    private xj_1 aio = null;
    private xb_2 aip = null;
    private wr_1 aiq = null;
    private wz_1 air = null;
    private wo_1 ais = null;
    final /* synthetic */ wk_2 aiV;

    ww_2(wk_2 wk_22) {
        this.aiV = wk_22;
    }

    public void avW() {
        this.aiV.aif = this.aif;
        this.aiV.aig = this.aig;
        this.aiV.aih = this.aih;
        this.aiV.aii = this.aii;
        this.aiV.aij = this.aij;
        this.aiV.aik = this.aik;
        this.aiV.ail = this.ail;
        this.aiV.aim = this.aim;
        this.aiV.ain = this.ain;
        this.aiV.aio = this.aio;
        this.aiV.aip = this.aip;
        this.aiV.aiq = this.aiq;
        this.aiV.air = this.air;
        this.aiV.ais = this.ais;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 1);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 1);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 1);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 1);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 1);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 1);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 1);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 1);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 1);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 1);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 1);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 313);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 313);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 313);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 313);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 313);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 313);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 313);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 313);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 313);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 313);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 313);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 313);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 314);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 314);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 314);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 314);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 314);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 314);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 314);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 314);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 314);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 314);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 314);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 314);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 315);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 315);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 315);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 315);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 315);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 315);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 315);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 315);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 315);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 315);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 315);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 315);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10003);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10003);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10003);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10003);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10003);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10003);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10003);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10003);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10003);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10003);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10003);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10003);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10023);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10023);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10023);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10023);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10023);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10023);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10023);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10023);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10023);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10023);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10023);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10023);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10028000);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10028000);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10028000);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10028000);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10028000);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10028000);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10028000);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10028000);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10028000);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10028000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10028000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10028000);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10029000);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10029000);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10029000);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10029000);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10029000);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10029000);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10029000);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10029000);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10029000);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10029000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10029000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10029000);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10032003);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10032003);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10032003);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10032003);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10032003);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10032003);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10032003);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10032003);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10032003);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10032003);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10032003);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10032003);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10035004);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10035004);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10035004);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10035004);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10035004);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10035004);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10035004);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10035004);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10035004);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10035004);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10035004);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10035007);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10035007);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10035007);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10035007);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10035007);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10035007);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10035007);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10035007);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10035007);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10035007);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10035007);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10035007);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10036004);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10036004);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10036004);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10036004);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10036004);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10036004);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10036004);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10036004);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10036004);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10036004);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10036004);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10036004);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10037001);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10037001);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10037001);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10037001);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10037001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10037001);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10037001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10037001);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10037001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10037001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10037001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10037001);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10040005);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10040005);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10040005);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10040005);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10040005);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10040005);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10040005);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10040005);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10040005);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10040005);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10040005);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10040005);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10045010);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10045010);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10045010);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10045010);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10045010);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10045010);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10045010);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10045010);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10045010);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10045010);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10045010);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10045010);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10048000);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10048000);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10048000);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10048000);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10048000);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10048000);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10048000);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10048000);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10048000);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10048000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10048000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10048000);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10055001);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10055001);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10055001);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10055001);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10055001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10055001);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10055001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10055001);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10055001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10055001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10055001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10055001);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10064001);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10064001);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10064001);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10064001);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10064001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10064001);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10064001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10064001);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10064001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10064001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10064001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10064001);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.b(byteBuffer, 10066001);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.b(byteBuffer, 10066001);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.b(byteBuffer, 10066001);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.b(byteBuffer, 10066001);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.b(byteBuffer, 10066001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.b(byteBuffer, 10066001);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.b(byteBuffer, 10066001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.b(byteBuffer, 10066001);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.b(byteBuffer, 10066001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.b(byteBuffer, 10066001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.b(byteBuffer, 10066001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.b(byteBuffer, 10066001);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 314) {
            boolean bl = this.cG(byteBuffer);
            return bl;
        }
        if (n < 315) {
            boolean bl = this.cH(byteBuffer);
            return bl;
        }
        if (n < 10003) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.cM(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.cN(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.cO(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.cQ(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.cR(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.cS(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.cT(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cU(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        return false;
    }
}

