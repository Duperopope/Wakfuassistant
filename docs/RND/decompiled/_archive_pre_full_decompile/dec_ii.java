Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 *  iE
 *  iH
 *  iK
 *  iL
 *  ih
 *  ij
 *  ik
 *  il
 *  zk
 *  zn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ii
extends GeneratedMessageV3
implements il {
    private static final long wN = 0L;
    int an;
    public static final int wO = 1;
    ByteString wP;
    public static final int wQ = 10;
    int wR;
    public static final int wS = 11;
    int wT;
    public static final int wU = 12;
    int wV;
    public static final int wW = 13;
    long wX;
    public static final int wY = 14;
    int mj;
    public static final int wZ = 15;
    iI xa;
    public static final int xb = 16;
    int xc;
    public static final int xd = 17;
    boolean xe;
    public static final int xf = 18;
    boolean xg;
    public static final int xh = 19;
    int xi;
    public static final int xj = 20;
    int xk;
    public static final int xl = 21;
    long xm;
    public static final int xn = 22;
    long xo;
    public static final int xp = 23;
    iI xq;
    public static final int xr = 24;
    float xs;
    public static final int xt = 25;
    int xu;
    public static final int xv = 30;
    boolean xw;
    public static final int xx = 31;
    boolean xy;
    public static final int xz = 32;
    boolean xA;
    public static final int xB = 33;
    boolean xC;
    public static final int xD = 34;
    boolean xE;
    public static final int xF = 35;
    boolean xG;
    public static final int xH = 38;
    boolean xI;
    public static final int xJ = 50;
    long xK;
    public static final int xL = 70;
    iE xM;
    public static final int xN = 71;
    zk xO;
    private byte Y = (byte)-1;
    private static final ii xP = new ii();
    @Deprecated
    public static final Parser<ii> xQ = new ij();

    ii(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ii() {
        this.wP = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ii();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ii(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block37: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block37;
                    }
                    case 10: {
                        this.an |= 1;
                        this.wP = codedInputStream.readBytes();
                        continue block37;
                    }
                    case 80: {
                        this.an |= 2;
                        this.wR = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 88: {
                        this.an |= 4;
                        this.wT = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 96: {
                        this.an |= 8;
                        this.wV = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 104: {
                        this.an |= 0x10;
                        this.wX = codedInputStream.readInt64();
                        continue block37;
                    }
                    case 112: {
                        this.an |= 0x20;
                        this.mj = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 122: {
                        iK iK2 = null;
                        if ((this.an & 0x40) != 0) {
                            iK2 = this.xa.Qd();
                        }
                        this.xa = (iI)codedInputStream.readMessage(iI.zo, extensionRegistryLite);
                        if (iK2 != null) {
                            iK2.h(this.xa);
                            this.xa = iK2.Qj();
                        }
                        this.an |= 0x40;
                        continue block37;
                    }
                    case 128: {
                        this.an |= 0x80;
                        this.xc = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 136: {
                        this.an |= 0x100;
                        this.xe = codedInputStream.readBool();
                        continue block37;
                    }
                    case 144: {
                        this.an |= 0x200;
                        this.xg = codedInputStream.readBool();
                        continue block37;
                    }
                    case 152: {
                        this.an |= 0x400;
                        this.xi = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 160: {
                        this.an |= 0x800;
                        this.xk = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 168: {
                        this.an |= 0x1000;
                        this.xm = codedInputStream.readInt64();
                        continue block37;
                    }
                    case 176: {
                        this.an |= 0x2000;
                        this.xo = codedInputStream.readInt64();
                        continue block37;
                    }
                    case 186: {
                        iK iK2 = null;
                        if ((this.an & 0x4000) != 0) {
                            iK2 = this.xq.Qd();
                        }
                        this.xq = (iI)codedInputStream.readMessage(iI.zo, extensionRegistryLite);
                        if (iK2 != null) {
                            iK2.h(this.xq);
                            this.xq = iK2.Qj();
                        }
                        this.an |= 0x4000;
                        continue block37;
                    }
                    case 197: {
                        this.an |= 0x8000;
                        this.xs = codedInputStream.readFloat();
                        continue block37;
                    }
                    case 200: {
                        this.an |= 0x10000;
                        this.xu = codedInputStream.readInt32();
                        continue block37;
                    }
                    case 240: {
                        this.an |= 0x20000;
                        this.xw = codedInputStream.readBool();
                        continue block37;
                    }
                    case 248: {
                        this.an |= 0x40000;
                        this.xy = codedInputStream.readBool();
                        continue block37;
                    }
                    case 256: {
                        this.an |= 0x80000;
                        this.xA = codedInputStream.readBool();
                        continue block37;
                    }
                    case 264: {
                        this.an |= 0x100000;
                        this.xC = codedInputStream.readBool();
                        continue block37;
                    }
                    case 272: {
                        this.an |= 0x200000;
                        this.xE = codedInputStream.readBool();
                        continue block37;
                    }
                    case 280: {
                        this.an |= 0x400000;
                        this.xG = codedInputStream.readBool();
                        continue block37;
                    }
                    case 304: {
                        this.an |= 0x800000;
                        this.xI = codedInputStream.readBool();
                        continue block37;
                    }
                    case 400: {
                        this.an |= 0x1000000;
                        this.xK = codedInputStream.readInt64();
                        continue block37;
                    }
                    case 562: {
                        iK iK2 = null;
                        if ((this.an & 0x2000000) != 0) {
                            iK2 = this.xM.PN();
                        }
                        this.xM = (iE)codedInputStream.readMessage(iE.zh, extensionRegistryLite);
                        if (iK2 != null) {
                            iK2.e(this.xM);
                            this.xM = iK2.PT();
                        }
                        this.an |= 0x2000000;
                        continue block37;
                    }
                    case 570: {
                        iK iK2 = null;
                        if ((this.an & 0x4000000) != 0) {
                            iK2 = this.xO.axU();
                        }
                        this.xO = (zk)codedInputStream.readMessage(zk.anI, extensionRegistryLite);
                        if (iK2 != null) {
                            iK2.e(this.xO);
                            this.xO = iK2.aya();
                        }
                        this.an |= 0x4000000;
                        continue block37;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor LM() {
        return ih.wF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih.wG.ensureFieldAccessorsInitialized(ii.class, ik.class);
    }

    public boolean LN() {
        return (this.an & 1) != 0;
    }

    public ByteString LO() {
        return this.wP;
    }

    public boolean LP() {
        return (this.an & 2) != 0;
    }

    public int getValue() {
        return this.wR;
    }

    public boolean LQ() {
        return (this.an & 4) != 0;
    }

    public int LR() {
        return this.wT;
    }

    public boolean LS() {
        return (this.an & 8) != 0;
    }

    public int LT() {
        return this.wV;
    }

    public boolean LU() {
        return (this.an & 0x10) != 0;
    }

    public long LV() {
        return this.wX;
    }

    public boolean tK() {
        return (this.an & 0x20) != 0;
    }

    public int tL() {
        return this.mj;
    }

    public boolean LW() {
        return (this.an & 0x40) != 0;
    }

    public iI LX() {
        return this.xa == null ? iI.Qe() : this.xa;
    }

    public iL LY() {
        return this.xa == null ? iI.Qe() : this.xa;
    }

    public boolean LZ() {
        return (this.an & 0x80) != 0;
    }

    public int Ma() {
        return this.xc;
    }

    public boolean Mb() {
        return (this.an & 0x100) != 0;
    }

    public boolean Mc() {
        return this.xe;
    }

    public boolean Md() {
        return (this.an & 0x200) != 0;
    }

    public boolean Me() {
        return this.xg;
    }

    public boolean Mf() {
        return (this.an & 0x400) != 0;
    }

    public int Mg() {
        return this.xi;
    }

    public boolean Mh() {
        return (this.an & 0x800) != 0;
    }

    public int Mi() {
        return this.xk;
    }

    public boolean Mj() {
        return (this.an & 0x1000) != 0;
    }

    public long Mk() {
        return this.xm;
    }

    public boolean Ml() {
        return (this.an & 0x2000) != 0;
    }

    public long Mm() {
        return this.xo;
    }

    public boolean Mn() {
        return (this.an & 0x4000) != 0;
    }

    public iI Mo() {
        return this.xq == null ? iI.Qe() : this.xq;
    }

    public iL Mp() {
        return this.xq == null ? iI.Qe() : this.xq;
    }

    public boolean Mq() {
        return (this.an & 0x8000) != 0;
    }

    public float Mr() {
        return this.xs;
    }

    public boolean Ms() {
        return (this.an & 0x10000) != 0;
    }

    public int Mt() {
        return this.xu;
    }

    public boolean Mu() {
        return (this.an & 0x20000) != 0;
    }

    public boolean Mv() {
        return this.xw;
    }

    public boolean Mw() {
        return (this.an & 0x40000) != 0;
    }

    public boolean Mx() {
        return this.xy;
    }

    public boolean My() {
        return (this.an & 0x80000) != 0;
    }

    public boolean Mz() {
        return this.xA;
    }

    public boolean MA() {
        return (this.an & 0x100000) != 0;
    }

    public boolean MB() {
        return this.xC;
    }

    public boolean MC() {
        return (this.an & 0x200000) != 0;
    }

    public boolean MD() {
        return this.xE;
    }

    public boolean ME() {
        return (this.an & 0x400000) != 0;
    }

    public boolean MF() {
        return this.xG;
    }

    public boolean MG() {
        return (this.an & 0x800000) != 0;
    }

    public boolean MH() {
        return this.xI;
    }

    public boolean MI() {
        return (this.an & 0x1000000) != 0;
    }

    public long MJ() {
        return this.xK;
    }

    public boolean MK() {
        return (this.an & 0x2000000) != 0;
    }

    public iE ML() {
        return this.xM == null ? iE.PO() : this.xM;
    }

    public iH MM() {
        return this.xM == null ? iE.PO() : this.xM;
    }

    public boolean MN() {
        return (this.an & 0x4000000) != 0;
    }

    public zk MO() {
        return this.xO == null ? zk.axV() : this.xO;
    }

    public zn MP() {
        return this.xO == null ? zk.axV() : this.xO;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (this.LW() && !((ii)this.LX()).isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.Mn() && !((ii)this.Mo()).isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.MK() && !this.ML().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.MN() && !this.MO().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBytes(1, this.wP);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(10, this.wR);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(11, this.wT);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(12, this.wV);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(13, this.wX);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(14, this.mj);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeMessage(15, (MessageLite)this.LX());
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(16, this.xc);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeBool(17, this.xe);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeBool(18, this.xg);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(19, this.xi);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt32(20, this.xk);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeInt64(21, this.xm);
        }
        if ((this.an & 0x2000) != 0) {
            codedOutputStream.writeInt64(22, this.xo);
        }
        if ((this.an & 0x4000) != 0) {
            codedOutputStream.writeMessage(23, (MessageLite)this.Mo());
        }
        if ((this.an & 0x8000) != 0) {
            codedOutputStream.writeFloat(24, this.xs);
        }
        if ((this.an & 0x10000) != 0) {
            codedOutputStream.writeInt32(25, this.xu);
        }
        if ((this.an & 0x20000) != 0) {
            codedOutputStream.writeBool(30, this.xw);
        }
        if ((this.an & 0x40000) != 0) {
            codedOutputStream.writeBool(31, this.xy);
        }
        if ((this.an & 0x80000) != 0) {
            codedOutputStream.writeBool(32, this.xA);
        }
        if ((this.an & 0x100000) != 0) {
            codedOutputStream.writeBool(33, this.xC);
        }
        if ((this.an & 0x200000) != 0) {
            codedOutputStream.writeBool(34, this.xE);
        }
        if ((this.an & 0x400000) != 0) {
            codedOutputStream.writeBool(35, this.xG);
        }
        if ((this.an & 0x800000) != 0) {
            codedOutputStream.writeBool(38, this.xI);
        }
        if ((this.an & 0x1000000) != 0) {
            codedOutputStream.writeInt64(50, this.xK);
        }
        if ((this.an & 0x2000000) != 0) {
            codedOutputStream.writeMessage(70, (MessageLite)this.ML());
        }
        if ((this.an & 0x4000000) != 0) {
            codedOutputStream.writeMessage(71, (MessageLite)this.MO());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.wP);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.wR);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.wT);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.wV);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)13, (long)this.wX);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.mj);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeMessageSize((int)15, (MessageLite)this.LX());
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.xc);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeBoolSize((int)17, (boolean)this.xe);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeBoolSize((int)18, (boolean)this.xg);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)19, (int)this.xi);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt32Size((int)20, (int)this.xk);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)21, (long)this.xm);
        }
        if ((this.an & 0x2000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)22, (long)this.xo);
        }
        if ((this.an & 0x4000) != 0) {
            n += CodedOutputStream.computeMessageSize((int)23, (MessageLite)this.Mo());
        }
        if ((this.an & 0x8000) != 0) {
            n += CodedOutputStream.computeFloatSize((int)24, (float)this.xs);
        }
        if ((this.an & 0x10000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)25, (int)this.xu);
        }
        if ((this.an & 0x20000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)30, (boolean)this.xw);
        }
        if ((this.an & 0x40000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)31, (boolean)this.xy);
        }
        if ((this.an & 0x80000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)32, (boolean)this.xA);
        }
        if ((this.an & 0x100000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)33, (boolean)this.xC);
        }
        if ((this.an & 0x200000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)34, (boolean)this.xE);
        }
        if ((this.an & 0x400000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)35, (boolean)this.xG);
        }
        if ((this.an & 0x800000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)38, (boolean)this.xI);
        }
        if ((this.an & 0x1000000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)50, (long)this.xK);
        }
        if ((this.an & 0x2000000) != 0) {
            n += CodedOutputStream.computeMessageSize((int)70, (MessageLite)this.ML());
        }
        if ((this.an & 0x4000000) != 0) {
            n += CodedOutputStream.computeMessageSize((int)71, (MessageLite)this.MO());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ii)) {
            return super.equals(object);
        }
        ii ii2 = (ii)((Object)object);
        if (this.LN() != ii2.LN()) {
            return false;
        }
        if (this.LN() && !this.LO().equals((Object)ii2.LO())) {
            return false;
        }
        if (this.LP() != ii2.LP()) {
            return false;
        }
        if (this.LP() && this.getValue() != ii2.getValue()) {
            return false;
        }
        if (this.LQ() != ii2.LQ()) {
            return false;
        }
        if (this.LQ() && this.LR() != ii2.LR()) {
            return false;
        }
        if (this.LS() != ii2.LS()) {
            return false;
        }
        if (this.LS() && this.LT() != ii2.LT()) {
            return false;
        }
        if (this.LU() != ii2.LU()) {
            return false;
        }
        if (this.LU() && this.LV() != ii2.LV()) {
            return false;
        }
        if (this.tK() != ii2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != ii2.tL()) {
            return false;
        }
        if (this.LW() != ii2.LW()) {
            return false;
        }
        if (this.LW() && !((ii)this.LX()).equals((Object)ii2.LX())) {
            return false;
        }
        if (this.LZ() != ii2.LZ()) {
            return false;
        }
        if (this.LZ() && this.Ma() != ii2.Ma()) {
            return false;
        }
        if (this.Mb() != ii2.Mb()) {
            return false;
        }
        if (this.Mb() && this.Mc() != ii2.Mc()) {
            return false;
        }
        if (this.Md() != ii2.Md()) {
            return false;
        }
        if (this.Md() && this.Me() != ii2.Me()) {
            return false;
        }
        if (this.Mf() != ii2.Mf()) {
            return false;
        }
        if (this.Mf() && this.Mg() != ii2.Mg()) {
            return false;
        }
        if (this.Mh() != ii2.Mh()) {
            return false;
        }
        if (this.Mh() && this.Mi() != ii2.Mi()) {
            return false;
        }
        if (this.Mj() != ii2.Mj()) {
            return false;
        }
        if (this.Mj() && this.Mk() != ii2.Mk()) {
            return false;
        }
        if (this.Ml() != ii2.Ml()) {
            return false;
        }
        if (this.Ml() && this.Mm() != ii2.Mm()) {
            return false;
        }
        if (this.Mn() != ii2.Mn()) {
            return false;
        }
        if (this.Mn() && !((ii)this.Mo()).equals((Object)ii2.Mo())) {
            return false;
        }
        if (this.Mq() != ii2.Mq()) {
            return false;
        }
        if (this.Mq() && Float.floatToIntBits(this.Mr()) != Float.floatToIntBits(ii2.Mr())) {
            return false;
        }
        if (this.Ms() != ii2.Ms()) {
            return false;
        }
        if (this.Ms() && this.Mt() != ii2.Mt()) {
            return false;
        }
        if (this.Mu() != ii2.Mu()) {
            return false;
        }
        if (this.Mu() && this.Mv() != ii2.Mv()) {
            return false;
        }
        if (this.Mw() != ii2.Mw()) {
            return false;
        }
        if (this.Mw() && this.Mx() != ii2.Mx()) {
            return false;
        }
        if (this.My() != ii2.My()) {
            return false;
        }
        if (this.My() && this.Mz() != ii2.Mz()) {
            return false;
        }
        if (this.MA() != ii2.MA()) {
            return false;
        }
        if (this.MA() && this.MB() != ii2.MB()) {
            return false;
        }
        if (this.MC() != ii2.MC()) {
            return false;
        }
        if (this.MC() && this.MD() != ii2.MD()) {
            return false;
        }
        if (this.ME() != ii2.ME()) {
            return false;
        }
        if (this.ME() && this.MF() != ii2.MF()) {
            return false;
        }
        if (this.MG() != ii2.MG()) {
            return false;
        }
        if (this.MG() && this.MH() != ii2.MH()) {
            return false;
        }
        if (this.MI() != ii2.MI()) {
            return false;
        }
        if (this.MI() && this.MJ() != ii2.MJ()) {
            return false;
        }
        if (this.MK() != ii2.MK()) {
            return false;
        }
        if (this.MK() && !this.ML().equals((Object)ii2.ML())) {
            return false;
        }
        if (this.MN() != ii2.MN()) {
            return false;
        }
        if (this.MN() && !this.MO().equals((Object)ii2.MO())) {
            return false;
        }
        return this.unknownFields.equals((Object)ii2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ii.LM().hashCode();
        if (this.LN()) {
            n = 37 * n + 1;
            n = 53 * n + this.LO().hashCode();
        }
        if (this.LP()) {
            n = 37 * n + 10;
            n = 53 * n + this.getValue();
        }
        if (this.LQ()) {
            n = 37 * n + 11;
            n = 53 * n + this.LR();
        }
        if (this.LS()) {
            n = 37 * n + 12;
            n = 53 * n + this.LT();
        }
        if (this.LU()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashLong((long)this.LV());
        }
        if (this.tK()) {
            n = 37 * n + 14;
            n = 53 * n + this.tL();
        }
        if (this.LW()) {
            n = 37 * n + 15;
            n = 53 * n + ((ii)this.LX()).hashCode();
        }
        if (this.LZ()) {
            n = 37 * n + 16;
            n = 53 * n + this.Ma();
        }
        if (this.Mb()) {
            n = 37 * n + 17;
            n = 53 * n + Internal.hashBoolean((boolean)this.Mc());
        }
        if (this.Md()) {
            n = 37 * n + 18;
            n = 53 * n + Internal.hashBoolean((boolean)this.Me());
        }
        if (this.Mf()) {
            n = 37 * n + 19;
            n = 53 * n + this.Mg();
        }
        if (this.Mh()) {
            n = 37 * n + 20;
            n = 53 * n + this.Mi();
        }
        if (this.Mj()) {
            n = 37 * n + 21;
            n = 53 * n + Internal.hashLong((long)this.Mk());
        }
        if (this.Ml()) {
            n = 37 * n + 22;
            n = 53 * n + Internal.hashLong((long)this.Mm());
        }
        if (this.Mn()) {
            n = 37 * n + 23;
            n = 53 * n + ((ii)this.Mo()).hashCode();
        }
        if (this.Mq()) {
            n = 37 * n + 24;
            n = 53 * n + Float.floatToIntBits(this.Mr());
        }
        if (this.Ms()) {
            n = 37 * n + 25;
            n = 53 * n + this.Mt();
        }
        if (this.Mu()) {
            n = 37 * n + 30;
            n = 53 * n + Internal.hashBoolean((boolean)this.Mv());
        }
        if (this.Mw()) {
            n = 37 * n + 31;
            n = 53 * n + Internal.hashBoolean((boolean)this.Mx());
        }
        if (this.My()) {
            n = 37 * n + 32;
            n = 53 * n + Internal.hashBoolean((boolean)this.Mz());
        }
        if (this.MA()) {
            n = 37 * n + 33;
            n = 53 * n + Internal.hashBoolean((boolean)this.MB());
        }
        if (this.MC()) {
            n = 37 * n + 34;
            n = 53 * n + Internal.hashBoolean((boolean)this.MD());
        }
        if (this.ME()) {
            n = 37 * n + 35;
            n = 53 * n + Internal.hashBoolean((boolean)this.MF());
        }
        if (this.MG()) {
            n = 37 * n + 38;
            n = 53 * n + Internal.hashBoolean((boolean)this.MH());
        }
        if (this.MI()) {
            n = 37 * n + 50;
            n = 53 * n + Internal.hashLong((long)this.MJ());
        }
        if (this.MK()) {
            n = 37 * n + 70;
            n = 53 * n + this.ML().hashCode();
        }
        if (this.MN()) {
            n = 37 * n + 71;
            n = 53 * n + this.MO().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ii bb(ByteBuffer byteBuffer) {
        return (ii)((Object)xQ.parseFrom(byteBuffer));
    }

    public static ii aX(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)((Object)xQ.parseFrom(byteBuffer, extensionRegistryLite));
    }

    public static ii bS(ByteString byteString) {
        return (ii)((Object)xQ.parseFrom(byteString));
    }

    public static ii aX(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)((Object)xQ.parseFrom(byteString, extensionRegistryLite));
    }

    public static ii aY(byte[] byArray) {
        return (ii)((Object)xQ.parseFrom(byArray));
    }

    public static ii aX(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)((Object)xQ.parseFrom(byArray, extensionRegistryLite));
    }

    public static ii cU(InputStream inputStream) {
        return (ii)GeneratedMessageV3.parseWithIOException(xQ, (InputStream)inputStream);
    }

    public static ii cU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)GeneratedMessageV3.parseWithIOException(xQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ii cV(InputStream inputStream) {
        return (ii)GeneratedMessageV3.parseDelimitedWithIOException(xQ, (InputStream)inputStream);
    }

    public static ii cV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)GeneratedMessageV3.parseDelimitedWithIOException(xQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ii aX(CodedInputStream codedInputStream) {
        return (ii)GeneratedMessageV3.parseWithIOException(xQ, (CodedInputStream)codedInputStream);
    }

    public static ii eR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii)GeneratedMessageV3.parseWithIOException(xQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ik MQ() {
        return ii.MR();
    }

    public static ik MR() {
        return xP.MS();
    }

    public static ik a(ii ii2) {
        return xP.MS().c(ii2);
    }

    public ik MS() {
        return this == xP ? new ik() : new ik().c(this);
    }

    protected ik aX(GeneratedMessageV3.BuilderParent builderParent) {
        ik ik2 = new ik(builderParent);
        return ik2;
    }

    public static ii MT() {
        return xP;
    }

    public static Parser<ii> z() {
        return xQ;
    }

    public Parser<ii> getParserForType() {
        return xQ;
    }

    public ii MU() {
        return xP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aX(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.MS();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.MQ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.MS();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.MQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.MU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.MU();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ii ii2) {
        return ii2.unknownFields;
    }
}

