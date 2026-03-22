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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class dR
extends GeneratedMessageV3
implements dU {
    private static final long lo = 0L;
    int an;
    public static final int lp = 1;
    int lq;
    public static final int lr = 2;
    int ls;
    public static final int lt = 3;
    int lu;
    public static final int lv = 4;
    int lw;
    public static final int lx = 5;
    int ly;
    public static final int lz = 6;
    int lA;
    public static final int lB = 7;
    int lC;
    public static final int lD = 8;
    int lE;
    public static final int lF = 9;
    int lG;
    public static final int lH = 10;
    int lI;
    public static final int lJ = 11;
    int lK;
    public static final int lL = 12;
    int lM;
    public static final int lN = 13;
    int lO;
    public static final int lP = 14;
    int lQ;
    public static final int lR = 15;
    int lS;
    public static final int lT = 16;
    int lU;
    private byte Y = (byte)-1;
    private static final dR lV = new dR();
    @Deprecated
    public static final Parser<dR> lW = new dS();

    dR(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dR() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dR();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block26: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block26;
                    }
                    case 8: {
                        this.an |= 1;
                        this.lq = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 16: {
                        this.an |= 2;
                        this.ls = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 24: {
                        this.an |= 4;
                        this.lu = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 32: {
                        this.an |= 8;
                        this.lw = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.ly = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.lA = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.lC = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.lE = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.lG = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.lI = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.lK = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 96: {
                        this.an |= 0x800;
                        this.lM = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 104: {
                        this.an |= 0x1000;
                        this.lO = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 112: {
                        this.an |= 0x2000;
                        this.lQ = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 120: {
                        this.an |= 0x4000;
                        this.lS = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 128: {
                        this.an |= 0x8000;
                        this.lU = codedInputStream.readInt32();
                        continue block26;
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

    public static final Descriptors.Descriptor sA() {
        return dQ.lm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dQ.ln.ensureFieldAccessorsInitialized(dR.class, dT.class);
    }

    @Override
    public boolean sB() {
        return (this.an & 1) != 0;
    }

    @Override
    public int sC() {
        return this.lq;
    }

    @Override
    public boolean sD() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sE() {
        return this.ls;
    }

    @Override
    public boolean sF() {
        return (this.an & 4) != 0;
    }

    @Override
    public int sG() {
        return this.lu;
    }

    @Override
    public boolean sH() {
        return (this.an & 8) != 0;
    }

    @Override
    public int sI() {
        return this.lw;
    }

    @Override
    public boolean sJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int sK() {
        return this.ly;
    }

    @Override
    public boolean sL() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int sM() {
        return this.lA;
    }

    @Override
    public boolean sN() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int sO() {
        return this.lC;
    }

    @Override
    public boolean sP() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int sQ() {
        return this.lE;
    }

    @Override
    public boolean sR() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int sS() {
        return this.lG;
    }

    @Override
    public boolean sT() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int sU() {
        return this.lI;
    }

    @Override
    public boolean sV() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int sW() {
        return this.lK;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    @Override
    @Deprecated
    public boolean sZ() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    @Deprecated
    public int ta() {
        return this.lO;
    }

    @Override
    public boolean tb() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public int tc() {
        return this.lQ;
    }

    @Override
    public boolean td() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public int te() {
        return this.lS;
    }

    @Override
    public boolean tf() {
        return (this.an & 0x8000) != 0;
    }

    @Override
    public int tg() {
        return this.lU;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.sB()) {
            this.Y = 0;
            return false;
        }
        if (!this.sD()) {
            this.Y = 0;
            return false;
        }
        if (!this.sF()) {
            this.Y = 0;
            return false;
        }
        if (!this.sH()) {
            this.Y = 0;
            return false;
        }
        if (!this.sJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.sL()) {
            this.Y = 0;
            return false;
        }
        if (!this.sN()) {
            this.Y = 0;
            return false;
        }
        if (!this.sP()) {
            this.Y = 0;
            return false;
        }
        if (!this.sR()) {
            this.Y = 0;
            return false;
        }
        if (!this.sT()) {
            this.Y = 0;
            return false;
        }
        if (!this.sV()) {
            this.Y = 0;
            return false;
        }
        if (!this.sX()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.lq);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.ls);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.lu);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.lw);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.ly);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(6, this.lA);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(7, this.lC);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.lE);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.lG);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(10, this.lI);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.lK);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt32(12, this.lM);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeInt32(13, this.lO);
        }
        if ((this.an & 0x2000) != 0) {
            codedOutputStream.writeInt32(14, this.lQ);
        }
        if ((this.an & 0x4000) != 0) {
            codedOutputStream.writeInt32(15, this.lS);
        }
        if ((this.an & 0x8000) != 0) {
            codedOutputStream.writeInt32(16, this.lU);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.lq);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.ls);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.lu);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.lw);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.ly);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.lA);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.lC);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.lE);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.lG);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.lI);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.lK);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.lM);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)13, (int)this.lO);
        }
        if ((this.an & 0x2000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.lQ);
        }
        if ((this.an & 0x4000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.lS);
        }
        if ((this.an & 0x8000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.lU);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dR)) {
            return super.equals(object);
        }
        dR dR2 = (dR)object;
        if (this.sB() != dR2.sB()) {
            return false;
        }
        if (this.sB() && this.sC() != dR2.sC()) {
            return false;
        }
        if (this.sD() != dR2.sD()) {
            return false;
        }
        if (this.sD() && this.sE() != dR2.sE()) {
            return false;
        }
        if (this.sF() != dR2.sF()) {
            return false;
        }
        if (this.sF() && this.sG() != dR2.sG()) {
            return false;
        }
        if (this.sH() != dR2.sH()) {
            return false;
        }
        if (this.sH() && this.sI() != dR2.sI()) {
            return false;
        }
        if (this.sJ() != dR2.sJ()) {
            return false;
        }
        if (this.sJ() && this.sK() != dR2.sK()) {
            return false;
        }
        if (this.sL() != dR2.sL()) {
            return false;
        }
        if (this.sL() && this.sM() != dR2.sM()) {
            return false;
        }
        if (this.sN() != dR2.sN()) {
            return false;
        }
        if (this.sN() && this.sO() != dR2.sO()) {
            return false;
        }
        if (this.sP() != dR2.sP()) {
            return false;
        }
        if (this.sP() && this.sQ() != dR2.sQ()) {
            return false;
        }
        if (this.sR() != dR2.sR()) {
            return false;
        }
        if (this.sR() && this.sS() != dR2.sS()) {
            return false;
        }
        if (this.sT() != dR2.sT()) {
            return false;
        }
        if (this.sT() && this.sU() != dR2.sU()) {
            return false;
        }
        if (this.sV() != dR2.sV()) {
            return false;
        }
        if (this.sV() && this.sW() != dR2.sW()) {
            return false;
        }
        if (this.sX() != dR2.sX()) {
            return false;
        }
        if (this.sX() && this.sY() != dR2.sY()) {
            return false;
        }
        if (this.sZ() != dR2.sZ()) {
            return false;
        }
        if (this.sZ() && this.ta() != dR2.ta()) {
            return false;
        }
        if (this.tb() != dR2.tb()) {
            return false;
        }
        if (this.tb() && this.tc() != dR2.tc()) {
            return false;
        }
        if (this.td() != dR2.td()) {
            return false;
        }
        if (this.td() && this.te() != dR2.te()) {
            return false;
        }
        if (this.tf() != dR2.tf()) {
            return false;
        }
        if (this.tf() && this.tg() != dR2.tg()) {
            return false;
        }
        return this.unknownFields.equals((Object)dR2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dR.sA().hashCode();
        if (this.sB()) {
            n = 37 * n + 1;
            n = 53 * n + this.sC();
        }
        if (this.sD()) {
            n = 37 * n + 2;
            n = 53 * n + this.sE();
        }
        if (this.sF()) {
            n = 37 * n + 3;
            n = 53 * n + this.sG();
        }
        if (this.sH()) {
            n = 37 * n + 4;
            n = 53 * n + this.sI();
        }
        if (this.sJ()) {
            n = 37 * n + 5;
            n = 53 * n + this.sK();
        }
        if (this.sL()) {
            n = 37 * n + 6;
            n = 53 * n + this.sM();
        }
        if (this.sN()) {
            n = 37 * n + 7;
            n = 53 * n + this.sO();
        }
        if (this.sP()) {
            n = 37 * n + 8;
            n = 53 * n + this.sQ();
        }
        if (this.sR()) {
            n = 37 * n + 9;
            n = 53 * n + this.sS();
        }
        if (this.sT()) {
            n = 37 * n + 10;
            n = 53 * n + this.sU();
        }
        if (this.sV()) {
            n = 37 * n + 11;
            n = 53 * n + this.sW();
        }
        if (this.sX()) {
            n = 37 * n + 12;
            n = 53 * n + this.sY();
        }
        if (this.sZ()) {
            n = 37 * n + 13;
            n = 53 * n + this.ta();
        }
        if (this.tb()) {
            n = 37 * n + 14;
            n = 53 * n + this.tc();
        }
        if (this.td()) {
            n = 37 * n + 15;
            n = 53 * n + this.te();
        }
        if (this.tf()) {
            n = 37 * n + 16;
            n = 53 * n + this.tg();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dR ad(ByteBuffer byteBuffer) {
        return (dR)lW.parseFrom(byteBuffer);
    }

    public static dR ad(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)lW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dR aL(ByteString byteString) {
        return (dR)lW.parseFrom(byteString);
    }

    public static dR ad(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)lW.parseFrom(byteString, extensionRegistryLite);
    }

    public static dR ad(byte[] byArray) {
        return (dR)lW.parseFrom(byArray);
    }

    public static dR ad(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)lW.parseFrom(byArray, extensionRegistryLite);
    }

    public static dR bg(InputStream inputStream) {
        return (dR)GeneratedMessageV3.parseWithIOException(lW, (InputStream)inputStream);
    }

    public static dR bg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)GeneratedMessageV3.parseWithIOException(lW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dR bh(InputStream inputStream) {
        return (dR)GeneratedMessageV3.parseDelimitedWithIOException(lW, (InputStream)inputStream);
    }

    public static dR bh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)GeneratedMessageV3.parseDelimitedWithIOException(lW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dR ad(CodedInputStream codedInputStream) {
        return (dR)GeneratedMessageV3.parseWithIOException(lW, (CodedInputStream)codedInputStream);
    }

    public static dR cj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dR)GeneratedMessageV3.parseWithIOException(lW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dT th() {
        return dR.ti();
    }

    public static dT ti() {
        return lV.tj();
    }

    public static dT a(dR dR2) {
        return lV.tj().c(dR2);
    }

    public dT tj() {
        return this == lV ? new dT() : new dT().c(this);
    }

    protected dT ad(GeneratedMessageV3.BuilderParent builderParent) {
        dT dT2 = new dT(builderParent);
        return dT2;
    }

    public static dR tk() {
        return lV;
    }

    public static Parser<dR> z() {
        return lW;
    }

    public Parser<dR> getParserForType() {
        return lW;
    }

    public dR tl() {
        return lV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ad(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.tj();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.th();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.tj();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.th();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.tl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.tl();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dR dR2) {
        return dR2.unknownFields;
    }
}

