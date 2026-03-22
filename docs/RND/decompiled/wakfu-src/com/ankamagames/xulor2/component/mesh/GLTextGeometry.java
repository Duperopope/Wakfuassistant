/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 */
package com.ankamagames.xulor2.component.mesh;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry$ObjectFactory;
import com.jogamp.opengl.GL;

public final class GLTextGeometry
extends Geometry {
    public static final GLTextGeometry$ObjectFactory uqC = new GLTextGeometry$ObjectFactory();
    public static final boolean uqD = true;
    private static final int uqE = 400;
    private fgx_1 ugI;
    private long uqF = 0L;
    private boolean uqG = false;
    private boolean uqH = false;
    private boolean uqI = false;
    private axb_2 ncL = null;
    private long htu = 0L;
    VertexBufferPCT deN;

    GLTextGeometry() {
    }

    public void setTextBuilder(fgx_1 fgx_12) {
        this.ugI = fgx_12;
    }

    public void b(fs_0 fs_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(apl_1 apl_12) {
        assert (false) : "Currently not implemented";
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        assert (false) : "Currently not implemented";
    }

    public boolean isBrightenColor() {
        return this.uqH;
    }

    public void setBrightenColor(boolean bl) {
        this.uqH = bl;
    }

    public boolean isDarkenColor() {
        return this.uqI;
    }

    public void setDarkenColor(boolean bl) {
        this.uqI = bl;
    }

    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
    }

    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public void va(long l) {
        this.htu = l;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void b(art_1 var1_1) {
        var2_2 = var1_1.bIq();
        var3_3 = ava_2.bMH();
        var4_4 = fmt_1.gEy().gEC();
        var5_5 = this.ugI.guX();
        var6_6 = this.ugI.gyn();
        var7_7 = var6_6.size();
        var8_8 = this.ugI.getOrientedHeight();
        var9_9 = this.ugI.gyE();
        var10_10 = fyw_0.gqw().gqD();
        var11_11 = var10_10.getScale();
        var12_12 = (int)((float)(var5_5.getScreenY() + var5_5.getAppearance().getBottomInset()) * var11_11);
        var13_13 = this.ugI.gyR();
        v0 = var15_14 = var13_13 > 0L && this.htu != -1L ? this.vb(var13_13) : -1;
        if (var15_14 != -1 && var15_14 >= this.ugI.gyb().getTextBuilder().gyj() && this.htu != -1L) {
            this.ugI.gyb().eUJ();
            this.htu = -1L;
        }
        var16_15 = 0;
        block12: for (var17_16 = this.ugI.gyq(); var17_16 < var7_7 && (var19_18 = (var18_17 = var6_6.get(var17_16)).getY() - var9_9 + var8_8) + var18_17.getHeight() > 0; ++var17_16) {
            if (var4_4 != null) {
                var20_19 = GC.A((float)var19_18 * var11_11);
                if (var20_19 + var12_12 >= var4_4.getY() + var4_4.getHeight()) continue;
                if (var20_19 + var18_17.getHeight() + var12_12 <= var4_4.getY()) break;
            }
            var20_20 = var18_17.gxT() > 0 ? (float)(this.ugI.getSize().width - var18_17.getWidth()) / (float)var18_17.gxT() : 0.0f;
            var21_21 = 0.0f;
            var22_22 = var18_17.gxY();
            var23_24 = 0;
            var24_25 = var22_22.size();
            while (var23_24 < var24_25) {
                var25_26 = var22_22.get(var23_24);
                switch (ffg_1.uqL[var25_26.gyV().ordinal()]) {
                    case 1: {
                        var26_28 = (fge_2)var25_26;
                        var27_29 = var26_28.getPixmap();
                        if (var27_29 != null && var27_29.bHg() != null) {
                            var28_31 = GC.A((float)(var18_17.getX() + var26_28.getX()) + var21_21);
                            var29_33 = var26_28.getWidth();
                            var30_35 = var26_28.bwO();
                            switch (ffg_1.uqK[this.ugI.gyf().ordinal()]) {
                                case 1: {
                                    v1 = var18_17.getHeight() - var30_35;
                                    break;
                                }
                                case 2: {
                                    v1 = (var18_17.getHeight() - var30_35) / 2;
                                    break;
                                }
                                default: {
                                    v1 = var31_37 = 0;
                                }
                            }
                            if (this.ncL != null) {
                                var2_2.glColor4f(this.ncL.aIU(), this.ncL.aIV(), this.ncL.aIW(), this.ncL.aIX());
                            } else {
                                var2_2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            }
                            var3_3.a((GL)var2_2, (ati_2)var27_29.bHg());
                            var3_3.h(var2_2);
                            var2_2.glBegin(7);
                            var2_2.glTexCoord2f(var27_29.aAs, var27_29.aAt);
                            var2_2.glVertex2i(var28_31, var19_18 + var31_37);
                            var2_2.glTexCoord2f(var27_29.aAu, var27_29.aAt);
                            var2_2.glVertex2i(var28_31 + var29_33, var19_18 + var31_37);
                            var2_2.glTexCoord2f(var27_29.aAu, var27_29.aAr);
                            var2_2.glVertex2i(var28_31 + var29_33, var19_18 + var30_35 + var31_37);
                            var2_2.glTexCoord2f(var27_29.aAs, var27_29.aAr);
                            var2_2.glVertex2i(var28_31, var19_18 + var30_35 + var31_37);
                            var2_2.glEnd();
                            if (var16_15 + 1 > var15_14 && var15_14 != -1) break block12;
                            ++var16_15;
                        }
                        ** GOTO lbl131
                    }
                    case 2: {
                        var26_28 = (fgf_2)var25_26;
                        var27_30 = false;
                        var28_32 = var26_28.getText();
                        if (var28_32.length() + var16_15 > var15_14 && var15_14 != -1) {
                            var27_30 = true;
                        }
                        var29_34 = var26_28.gzc();
                        var30_36 = var26_28.gze();
                        var31_37 = var26_28.gzf();
                        var32_38 = var26_28.gzg();
                        if (var30_36 == null) {
                            var30_36 = this.ugI.gyd();
                        }
                        if (var29_34 == null) {
                            var29_34 = this.ugI.gyc();
                        }
                        if (var29_34 != null && var30_36 != null && var26_28.getWidth() != 0 && var26_28.getHeight() != 0) {
                            var33_39 = GC.A((float)(var18_17.getX() + var26_28.getX()) + var21_21);
                            var21_21 += (float)var26_28.gxT() * var20_20;
                            if (this.uqH) {
                                var30_36 = var30_36.brighter().brighter();
                            }
                            if (this.uqI) {
                                var30_36 = var30_36.darker();
                            }
                            var34_40 = (float)var30_36.getAlpha() / 255.0f;
                            var35_41 = (float)var30_36.getRed() / 255.0f;
                            var36_42 = (float)var30_36.getGreen() / 255.0f;
                            var37_43 = (float)var30_36.getBlue() / 255.0f;
                            if (this.ncL != null) {
                                var35_41 *= this.ncL.aIU();
                                var36_42 *= this.ncL.aIV();
                                var37_43 *= this.ncL.aIW();
                                var34_40 *= this.ncL.aIX();
                            }
                            switch (ffg_1.uqK[this.ugI.gyf().ordinal()]) {
                                case 1: {
                                    var38_44 = var18_17.getHeight() - var29_34.gk(var26_28.getText());
                                    break;
                                }
                                case 2: {
                                    var38_44 = (var18_17.getHeight() - var29_34.gk(var26_28.getText())) / 2;
                                    break;
                                }
                                default: {
                                    var38_44 = 0;
                                }
                            }
                            var29_34.bNA();
                            var29_34.c(var35_41, var36_42, var37_43, var34_40);
                            var29_34.a(var26_28.gza(), var33_39, var27_30 != false ? var15_14 - var16_15 : var28_32.length(), var19_18 + var18_17.gxS() + var38_44, 1.0f, var20_20);
                            var29_34.bNB();
                            if (var31_37 != 0) {
                                var3_3.db(false);
                                var3_3.cN(1.0f);
                                var3_3.h(var2_2);
                                var2_2.glColor4f(var35_41, var36_42, var37_43, var34_40);
                                var2_2.glBegin(1);
                                var2_2.glVertex2i(var33_39, var19_18);
                                var39_45 = GC.A((float)var26_28.getWidth() + (float)var26_28.gxT() * var20_20);
                                var2_2.glVertex2i(var33_39 + var39_45, var19_18);
                                var2_2.glEnd();
                            }
                            if (var32_38) {
                                var3_3.db(false);
                                var3_3.cN(1.0f);
                                var3_3.h(var2_2);
                                var2_2.glColor4f(var35_41, var36_42, var37_43, var34_40);
                                var2_2.glBegin(1);
                                var2_2.glVertex2i(var33_39, var19_18 + var18_17.getHeight() / 2);
                                var39_45 = GC.A((float)var26_28.getWidth() + (float)var26_28.gxT() * var20_20);
                                var2_2.glVertex2i(var33_39 + var39_45, var19_18 + var18_17.getHeight() / 2);
                                var2_2.glEnd();
                            }
                        }
                        var16_15 += var28_32.length();
                        if (var27_30) break block12;
                    }
lbl131:
                    // 3 sources

                    default: {
                        ++var23_24;
                        break;
                    }
                }
            }
            var23_23 = var18_17.gxQ();
            if (var23_23 == null) continue;
            var24_25 = var18_17.getX() + var23_23.getX();
            var25_27 = var23_23.getWidth();
            if (var23_23.gzh()) {
                if (System.currentTimeMillis() - this.uqF >= 400L) {
                    this.uqG = this.uqG == false;
                    this.uqF = System.currentTimeMillis();
                }
            } else {
                this.uqG = true;
            }
            if (!this.uqG) continue;
            var3_3.db(false);
            var3_3.a(auw_2.dfO, auw_2.dfH);
            var3_3.h(var2_2);
            var2_2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            var2_2.glBegin(7);
            var2_2.glVertex2i(var24_25, var19_18);
            var2_2.glVertex2i(var24_25 + var25_27, var19_18);
            var2_2.glVertex2i(var24_25 + var25_27, var19_18 + var18_17.getHeight());
            var2_2.glVertex2i(var24_25, var19_18 + var18_17.getHeight());
            var2_2.glEnd();
        }
        var3_3.reset();
        var3_3.h(var2_2);
    }

    private int vb(long l) {
        long l2 = System.currentTimeMillis();
        if (this.htu == 0L) {
            this.htu = l2;
        }
        long l3 = l2 - this.htu;
        return (int)(l3 / l);
    }

    public void gwC() {
        this.htu = 0L;
    }

    @Override
    public void brr() {
        this.htu = 0L;
        this.uqF = 0L;
        this.uqG = false;
        this.uqH = false;
        this.uqI = false;
    }

    @Override
    public void brs() {
        this.ugI = null;
        this.ncL = null;
    }
}

