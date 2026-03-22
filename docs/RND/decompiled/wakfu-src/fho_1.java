/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*
 * Renamed from fHO
 */
public class fho_1 {
    private static final int uzq = 10;
    private static final int uzr = 30;
    private final fch_1 uzs;
    private final HashMap<String, ArrayList<fes_2>> uzt = new HashMap();
    private final HashMap<String, Stack<fes_2>> uzu = new HashMap();

    public fho_1(fch_1 fch_12) {
        this.uzs = fch_12;
    }

    public static int uS(int n) {
        return fyw_0.gqw().bmB().bAE() + n;
    }

    public static int uT(int n) {
        return fyw_0.gqw().bmB().bAF() + n;
    }

    public void clean() {
    }

    public void e(fes_2 fes_22, String string) {
        ArrayList<fes_2> arrayList = this.uzt.get(string);
        if (arrayList != null) {
            if (!arrayList.contains(fes_22)) {
                arrayList.add(fes_22);
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(fes_22);
            this.uzt.put(string, arrayList);
        }
    }

    public void f(fes_2 fes_22, String string) {
        ArrayList<fes_2> arrayList = this.uzt.get(string);
        if (arrayList != null) {
            arrayList.remove(fes_22);
            if (arrayList.size() <= 0) {
                this.uzt.remove(string);
            }
        }
    }

    public void g(fes_2 fes_22, String string) {
        Stack<fes_2> stack = this.uzu.get(string);
        if (stack != null) {
            if (stack.contains(fes_22)) {
                stack.remove(fes_22);
            }
            stack.push(fes_22);
        } else {
            stack = new Stack();
            stack.push(fes_22);
            this.uzu.put(string, stack);
        }
    }

    public void h(fes_2 fes_22, String string) {
        Stack<fes_2> stack = this.uzu.get(string);
        if (stack != null) {
            stack.remove(fes_22);
            if (stack.size() <= 0) {
                this.uzu.remove(string);
            }
        }
    }

    public Point b(fes_2 fes_22, fes_2 fes_23) {
        int n = fes_22.getDisplayX();
        int n2 = fes_22.getDisplayY();
        fhp_2 fhp_22 = new fhp_2(n + fes_22.getWidth() + 10, n2, fes_23.getWidth(), fes_23.getHeight(), null);
        boolean bl = fhp_22.x + fhp_22.width <= this.uzs.getWidth() ? this.a(fhp_22, fes_23) : false;
        if (!bl) {
            fhp_22 = new fhp_2(n, n2 + fes_22.getHeight() + 10, fes_23.getWidth(), fes_23.getHeight(), null);
            bl = fhp_22.y + fhp_22.height <= this.uzs.getHeight() ? this.a(fhp_22, fes_23) : false;
        }
        if (!bl) {
            fhp_22 = new fhp_2(n - fes_23.getWidth() - 10, n2, fes_23.getWidth(), fes_23.getHeight(), null);
            bl = fhp_22.x > 0 ? this.a(fhp_22, fes_23) : false;
        }
        if (!bl) {
            fhp_22 = new fhp_2(n, n2 - fes_23.getHeight() - 10, fes_23.getWidth(), fes_23.getHeight(), null);
            bl = fhp_22.y > 0 ? this.a(fhp_22, fes_23) : false;
        }
        if (bl) {
            return new Point(fhp_22.x, fhp_22.y);
        }
        return null;
    }

    public Point u(fes_2 fes_22) {
        fes_2 fes_23 = this.s(fes_22);
        if (fes_23 != null) {
            int n = fes_23.getDisplayX();
            int n2 = fes_23.getDisplayY();
            fhp_2 fhp_22 = new fhp_2(n + 30, n2 - (fes_22.getHeight() - fes_23.getHeight()) - 30, fes_22.getWidth(), fes_22.getHeight(), null);
            if (fhp_22.y <= 0) {
                fhp_22.y = 0;
            }
            if (fhp_22.x + fhp_22.width > this.uzs.getWidth()) {
                fhp_22.x = this.uzs.getWidth() - fes_22.getWidth();
            }
            return new Point(fhp_22.x, fhp_22.y);
        }
        return fes_22.getPosition();
    }

    public boolean a(fhp_2 fhp_22, fes_2 fes_22) {
        faw_2 faw_22 = this.uzs.getLayeredContainer().getContainerFromWidget(fes_22);
        if (faw_22 == null) {
            return false;
        }
        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fes_2 fes_23 = arrayList.get(i);
            if (fes_23 == fes_22 || !this.v(fes_23) || fes_23.getWidth() > 1000 && fes_23.getHeight() > 700 && fes_23.getX() == 0 && fes_23.getY() == 0 || !this.c(fes_23.getX(), fes_23.getY(), fes_23.getWidth(), fes_23.getHeight(), (int)fhp_22.getX(), (int)fhp_22.getY(), (int)fhp_22.getWidth(), (int)fhp_22.getHeight())) continue;
            return false;
        }
        return true;
    }

    private boolean c(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n7 <= 0 || n8 <= 0 || n3 <= 0 || n4 <= 0) {
            return false;
        }
        n8 += n6;
        n3 += n;
        n4 += n2;
        return !((n7 += n5) >= n5 && n7 <= n || n8 >= n6 && n8 <= n2 || n3 >= n && n3 <= n5 || n4 >= n2 && n4 <= n6);
    }

    public boolean v(fes_2 fes_22) {
        if (fes_22.getElementMap() != null) {
            String string = fes_22.getElementMap().getId();
            for (String string2 : this.uzt.keySet()) {
                if (!string.startsWith(string2)) continue;
                return this.uzt.get(string2).contains(fes_22);
            }
        }
        return false;
    }

    public fes_2 s(fhv_1 fhv_12) {
        if (fhv_12.getElementMap() != null) {
            String string = fhv_12.getElementMap().getId();
            for (String string2 : this.uzu.keySet()) {
                if (!string.startsWith(string2) || this.uzu.get(string2).size() <= 1) continue;
                Stack<fes_2> stack = this.uzu.get(string2);
                for (fes_2 fes_22 : stack) {
                    if (fes_22 != fhv_12) continue;
                    int n = stack.indexOf(fes_22) - 1;
                    return n < 0 ? null : (fes_2)stack.get(n);
                }
            }
        }
        return null;
    }

    public void b(String string, fes_2 fes_22) {
        ArrayList<fes_2> arrayList = this.uzt.get(string);
        if (arrayList == null) {
            return;
        }
        if (fes_22 != null) {
            this.a(arrayList, fes_22);
        }
    }

    private void a(ArrayList<fes_2> arrayList, fes_2 fes_22) {
        int n = fes_22.getHeight();
        int n2 = fes_22.getWidth();
        if (n == 0) {
            n = fes_22.getPrefSize().height;
        }
        if (n2 == 0) {
            n2 = fes_22.getPrefSize().width;
        }
        fhp_2[] fhp_2Array = this.d(fes_22.getX(), fes_22.getY(), n2, n, this.uzs.getWidth(), this.uzs.getHeight());
        int n3 = 0;
        int n4 = arrayList.size();
        for (fhp_2 fhp_22 : fhp_2Array) {
            if (n3 >= n4) break;
            n3 += this.a(fhp_22, arrayList, n3);
        }
        if (n3 < n4) {
            for (int i = n3; i < n4; ++i) {
                fes_2 fes_23 = arrayList.get(i);
                if (fes_23 == fes_22) continue;
                fes_23.setPosition(this.u(fes_23));
            }
        }
    }

    private int a(fhp_2 fhp_22, ArrayList<fes_2> arrayList, int n) {
        int n2;
        if (arrayList.size() == 0 || n < 0 || n >= arrayList.size()) {
            return 0;
        }
        int n3 = 0;
        fes_2 fes_22 = null;
        int n4 = arrayList.size();
        for (n2 = n; n2 < n4; ++n2) {
            fes_2 fes_23 = arrayList.get(n2);
            if (fes_23.getWidth() != 0 && fes_23.getHeight() != 0 && fes_23.isVisible()) {
                fes_22 = fes_23;
                break;
            }
            ++n3;
            ++n;
        }
        if (fes_22 == null) {
            return n3;
        }
        n2 = fhp_22.abG(fes_22.getWidth());
        n4 = fhp_22.abH(fes_22.getHeight());
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MAX_VALUE;
        while (fhp_22.abI(n2)) {
            while (fhp_22.abJ(n4)) {
                int n7;
                int n8;
                if (this.d((int)fhp_22.getX(), (int)fhp_22.getY(), (int)fhp_22.getWidth(), (int)fhp_22.getHeight(), n2, n4, fes_22.getWidth(), fes_22.getHeight())) {
                    fes_22.setPosition(n2, n4);
                    ++n3;
                    n4 += fhp_22.abL(fes_22.getHeight());
                    n8 = arrayList.size();
                    for (n7 = ++n; n7 < n8; ++n7) {
                        fes_2 fes_24 = arrayList.get(n7);
                        if (fes_24.getWidth() != 0 && fes_24.getHeight() != 0 && fes_24.isVisible()) {
                            fes_22 = fes_24;
                            break;
                        }
                        ++n3;
                        ++n;
                    }
                    if (n != arrayList.size()) continue;
                    return n3;
                }
                int n9 = n2 < 0 ? Math.abs(n2) : (n7 = n2 + fes_22.getWidth() > this.uzs.getWidth() ? n2 + fes_22.getWidth() - this.uzs.getWidth() : -1);
                int n10 = n4 < 0 ? Math.abs(n4) : (n8 = n4 + fes_22.getHeight() > this.uzs.getHeight() ? n4 + fes_22.getHeight() - this.uzs.getHeight() : -1);
                if (n7 == -1 || n8 == -1 || n7 >= Integer.MAX_VALUE || n8 >= Integer.MAX_VALUE) break;
                ++n3;
                break;
            }
            n4 = fhp_22.abH(fes_22.getHeight());
            n2 += fhp_22.abK(fes_22.getWidth());
        }
        return n3;
    }

    private boolean d(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return this.b(n, n2, n3, n4, n5, n6, n7, n8) && this.R(n5, n6, n7, n8);
    }

    private boolean b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return this.Q(n, n3, n5, n7) && this.P(n2, n4, n6, n8);
    }

    private boolean P(int n, int n2, int n3, int n4) {
        return n3 < n + n2 && n3 + n4 > n;
    }

    private boolean Q(int n, int n2, int n3, int n4) {
        return n3 < n + n2 && n3 + n4 > n;
    }

    private boolean R(int n, int n2, int n3, int n4) {
        return n >= 0 && n2 >= 0 && n + n3 < this.uzs.getWidth() && n2 + n4 < this.uzs.getHeight();
    }

    private fhp_2[] d(int n, int n2, int n3, int n4, int n5, int n6) {
        fhp_2[] fhp_2Array = new fhp_2[]{new fhp_2(n, n2 + n4, n3, n6 - n2 - n4, fzx_0.tLr), new fhp_2(n, 0, n3, n2, fzx_0.tLq), new fhp_2(0, n2, n, n4, fzx_0.tLs), new fhp_2(n + n3, n2, n5 - n - n3, n4, fzx_0.tLt)};
        Arrays.sort(fhp_2Array, fhq_1.uzw);
        return fhp_2Array;
    }
}

