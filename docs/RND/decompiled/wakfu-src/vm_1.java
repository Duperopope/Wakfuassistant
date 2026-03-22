/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vm
 */
final class vm_1 {
    private long ZC = 0L;
    private int aaQ = 0;
    private short aaa = 0;
    private vr_1 afg = null;
    private vk_1 aeF = null;
    private vt_2 aeG = null;
    private vf_2 afh = null;
    private vp_2 aeH = null;
    private vn_1 afi = null;
    private vb_1 aeI = null;
    private uz_2 aeJ = null;
    private vd_2 aeK = null;
    private vh_2 aeL = null;
    private vj_1 aeM = null;
    final /* synthetic */ uy_1 afj;

    vm_1(uy_1 uy_12) {
        this.afj = uy_12;
    }

    public void avW() {
        this.afj.ZC = this.ZC;
        this.afj.aaQ = this.aaQ;
        this.afj.aaa = this.aaa;
        this.afj.aeF = this.aeF;
        this.afj.aeG = this.aeG;
        this.afj.aeH = this.aeH;
        this.afj.aeI = this.aeI;
        this.afj.aeJ = this.aeJ;
        this.afj.aeK = this.aeK;
        this.afj.aeL = this.aeL;
        this.afj.aeM = this.aeM;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afg = new vr_1();
            boolean bl3 = this.afg.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.afg = null;
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afg = new vr_1();
            bl = this.afg.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeF = new vk_1();
            boolean bl5 = this.aeF.b(byteBuffer, 313);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl4 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afg = new vr_1();
            bl2 = this.afg.b(byteBuffer, 314);
            if (!bl2) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl5 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeF = new vk_1();
            bl = this.aeF.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl6 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeG = new vt_2();
            boolean bl7 = this.aeG.b(byteBuffer, 314);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl4 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afg = new vr_1();
            bl2 = this.afg.b(byteBuffer, 315);
            if (!bl2) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl5 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeF = new vk_1();
            bl = this.aeF.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl6 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeG = new vt_2();
            boolean bl7 = this.aeG.b(byteBuffer, 315);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.afg = new vr_1();
            bl3 = this.afg.b(byteBuffer, 10003);
            if (!bl3) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeF = new vk_1();
            bl2 = this.aeF.b(byteBuffer, 10003);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeG = new vt_2();
            bl = this.aeG.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afh = new vf_2();
            boolean bl9 = this.afh.b(byteBuffer, 10003);
            if (!bl9) {
                return false;
            }
        } else {
            this.afh = null;
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.afg = new vr_1();
            bl3 = this.afg.b(byteBuffer, 10023);
            if (!bl3) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeF = new vk_1();
            bl2 = this.aeF.b(byteBuffer, 10023);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeG = new vt_2();
            bl = this.aeG.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeH = new vp_2();
            boolean bl9 = this.aeH.b(byteBuffer, 10023);
            if (!bl9) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl6 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.afg = new vr_1();
            bl4 = this.afg.b(byteBuffer, 10028000);
            if (!bl4) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl7 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeF = new vk_1();
            bl3 = this.aeF.b(byteBuffer, 10028000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl8 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeG = new vt_2();
            bl2 = this.aeG.b(byteBuffer, 10028000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl9 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeH = new vp_2();
            bl = this.aeH.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl10 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afi = new vn_1();
            boolean bl11 = this.afi.b(byteBuffer, 10028000);
            if (!bl11) {
                return false;
            }
        } else {
            this.afi = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl7 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afg = new vr_1();
            bl5 = this.afg.b(byteBuffer, 10029000);
            if (!bl5) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl8 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeF = new vk_1();
            bl4 = this.aeF.b(byteBuffer, 10029000);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl9 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeG = new vt_2();
            bl3 = this.aeG.b(byteBuffer, 10029000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl10 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeH = new vp_2();
            bl2 = this.aeH.b(byteBuffer, 10029000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl11 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afi = new vn_1();
            bl = this.afi.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl12 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeI = new vb_1();
            boolean bl13 = this.aeI.b(byteBuffer, 10029000);
            if (!bl13) {
                return false;
            }
        } else {
            this.aeI = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.afg = new vr_1();
            bl6 = this.afg.b(byteBuffer, 10032003);
            if (!bl6) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeF = new vk_1();
            bl5 = this.aeF.b(byteBuffer, 10032003);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeG = new vt_2();
            bl4 = this.aeG.b(byteBuffer, 10032003);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeH = new vp_2();
            bl3 = this.aeH.b(byteBuffer, 10032003);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afi = new vn_1();
            bl2 = this.afi.b(byteBuffer, 10032003);
            if (!bl2) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeI = new vb_1();
            bl = this.aeI.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeJ = new uz_2();
            boolean bl15 = this.aeJ.b(byteBuffer, 10032003);
            if (!bl15) {
                return false;
            }
        } else {
            this.aeJ = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.afg = new vr_1();
            bl6 = this.afg.b(byteBuffer, 10035004);
            if (!bl6) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeF = new vk_1();
            bl5 = this.aeF.b(byteBuffer, 10035004);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeG = new vt_2();
            bl4 = this.aeG.b(byteBuffer, 10035004);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeH = new vp_2();
            bl3 = this.aeH.b(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afi = new vn_1();
            bl2 = this.afi.b(byteBuffer, 10035004);
            if (!bl2) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeI = new vb_1();
            bl = this.aeI.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeJ = new uz_2();
            boolean bl15 = this.aeJ.b(byteBuffer, 10035004);
            if (!bl15) {
                return false;
            }
        } else {
            this.aeJ = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.afg = new vr_1();
            bl6 = this.afg.b(byteBuffer, 10035007);
            if (!bl6) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeF = new vk_1();
            bl5 = this.aeF.b(byteBuffer, 10035007);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeG = new vt_2();
            bl4 = this.aeG.b(byteBuffer, 10035007);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeH = new vp_2();
            bl3 = this.aeH.b(byteBuffer, 10035007);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afi = new vn_1();
            bl2 = this.afi.b(byteBuffer, 10035007);
            if (!bl2) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeI = new vb_1();
            bl = this.aeI.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeJ = new uz_2();
            boolean bl15 = this.aeJ.b(byteBuffer, 10035007);
            if (!bl15) {
                return false;
            }
        } else {
            this.aeJ = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.afg = new vr_1();
            bl7 = this.afg.b(byteBuffer, 10036004);
            if (!bl7) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeF = new vk_1();
            bl6 = this.aeF.b(byteBuffer, 10036004);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeG = new vt_2();
            bl5 = this.aeG.b(byteBuffer, 10036004);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeH = new vp_2();
            bl4 = this.aeH.b(byteBuffer, 10036004);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.afi = new vn_1();
            bl3 = this.afi.b(byteBuffer, 10036004);
            if (!bl3) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeI = new vb_1();
            bl2 = this.aeI.b(byteBuffer, 10036004);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeJ = new uz_2();
            bl = this.aeJ.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeK = new vd_2();
            boolean bl17 = this.aeK.b(byteBuffer, 10036004);
            if (!bl17) {
                return false;
            }
        } else {
            this.aeK = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.afg = new vr_1();
            bl8 = this.afg.b(byteBuffer, 10037001);
            if (!bl8) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeF = new vk_1();
            bl7 = this.aeF.b(byteBuffer, 10037001);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeG = new vt_2();
            bl6 = this.aeG.b(byteBuffer, 10037001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeH = new vp_2();
            bl5 = this.aeH.b(byteBuffer, 10037001);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.afi = new vn_1();
            bl4 = this.afi.b(byteBuffer, 10037001);
            if (!bl4) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeI = new vb_1();
            bl3 = this.aeI.b(byteBuffer, 10037001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeJ = new uz_2();
            bl2 = this.aeJ.b(byteBuffer, 10037001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeK = new vd_2();
            bl = this.aeK.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeL = new vh_2();
            boolean bl19 = this.aeL.b(byteBuffer, 10037001);
            if (!bl19) {
                return false;
            }
        } else {
            this.aeL = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl11 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.afg = new vr_1();
            bl9 = this.afg.b(byteBuffer, 10040005);
            if (!bl9) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl12 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aeF = new vk_1();
            bl8 = this.aeF.b(byteBuffer, 10040005);
            if (!bl8) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl13 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeG = new vt_2();
            bl7 = this.aeG.b(byteBuffer, 10040005);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl14 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeH = new vp_2();
            bl6 = this.aeH.b(byteBuffer, 10040005);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl15 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afi = new vn_1();
            bl5 = this.afi.b(byteBuffer, 10040005);
            if (!bl5) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl16 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10040005);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl17 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10040005);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl18 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10040005);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl19 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl20 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl21 = this.aeM.b(byteBuffer, 10040005);
            if (!bl21) {
                return false;
            }
        } else {
            this.aeM = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl11 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.afg = new vr_1();
            bl9 = this.afg.b(byteBuffer, 10045010);
            if (!bl9) {
                return false;
            }
        } else {
            this.afg = null;
        }
        boolean bl12 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aeF = new vk_1();
            bl8 = this.aeF.b(byteBuffer, 10045010);
            if (!bl8) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl13 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeG = new vt_2();
            bl7 = this.aeG.b(byteBuffer, 10045010);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl14 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeH = new vp_2();
            bl6 = this.aeH.b(byteBuffer, 10045010);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl15 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afi = new vn_1();
            bl5 = this.afi.b(byteBuffer, 10045010);
            if (!bl5) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl16 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10045010);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl17 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10045010);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl18 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10045010);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl19 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl20 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl21 = this.aeM.b(byteBuffer, 10045010);
            if (!bl21) {
                return false;
            }
        } else {
            this.aeM = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aeF = new vk_1();
            bl8 = this.aeF.b(byteBuffer, 10048000);
            if (!bl8) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeG = new vt_2();
            bl7 = this.aeG.b(byteBuffer, 10048000);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeH = new vp_2();
            bl6 = this.aeH.b(byteBuffer, 10048000);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afi = new vn_1();
            bl5 = this.afi.b(byteBuffer, 10048000);
            if (!bl5) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10048000);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10048000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10048000);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl19 = this.aeM.b(byteBuffer, 10048000);
            if (!bl19) {
                return false;
            }
        } else {
            this.aeM = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aeF = new vk_1();
            bl8 = this.aeF.b(byteBuffer, 10055001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeG = new vt_2();
            bl7 = this.aeG.b(byteBuffer, 10055001);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeH = new vp_2();
            bl6 = this.aeH.b(byteBuffer, 10055001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afi = new vn_1();
            bl5 = this.afi.b(byteBuffer, 10055001);
            if (!bl5) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10055001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10055001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10055001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl19 = this.aeM.b(byteBuffer, 10055001);
            if (!bl19) {
                return false;
            }
        } else {
            this.aeM = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aeF = new vk_1();
            bl8 = this.aeF.b(byteBuffer, 10064001);
            if (!bl8) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeG = new vt_2();
            bl7 = this.aeG.b(byteBuffer, 10064001);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeH = new vp_2();
            bl6 = this.aeH.b(byteBuffer, 10064001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.afi = new vn_1();
            bl5 = this.afi.b(byteBuffer, 10064001);
            if (!bl5) {
                return false;
            }
        } else {
            this.afi = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10064001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10064001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10064001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl19 = this.aeM.b(byteBuffer, 10064001);
            if (!bl19) {
                return false;
            }
        } else {
            this.aeM = null;
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
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeF = new vk_1();
            bl7 = this.aeF.b(byteBuffer, 10066001);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeG = new vt_2();
            bl6 = this.aeG.b(byteBuffer, 10066001);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeH = new vp_2();
            bl5 = this.aeH.b(byteBuffer, 10066001);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.b(byteBuffer, 10066001);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.b(byteBuffer, 10066001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.b(byteBuffer, 10066001);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl17 = this.aeM.b(byteBuffer, 10066001);
            if (!bl17) {
                return false;
            }
        } else {
            this.aeM = null;
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

