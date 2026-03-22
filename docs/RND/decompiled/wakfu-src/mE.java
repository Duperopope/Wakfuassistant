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
 *  com.google.protobuf.Internal$IntList
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
import java.util.List;

public final class mE
extends GeneratedMessageV3
implements mh_0 {
    private static final long LA = 0L;
    int an;
    public static final int LB = 1;
    long wq;
    public static final int LC = 2;
    int qB;
    public static final int LD = 3;
    long LE;
    public static final int LF = 4;
    volatile Object LG;
    public static final int LH = 5;
    int LI;
    public static final int LJ = 6;
    int LK;
    public static final int LL = 7;
    long Kf;
    public static final int LM = 8;
    int jq;
    public static final int LN = 9;
    int Kh;
    public static final int LO = 10;
    long Kj;
    public static final int LP = 11;
    int LQ;
    public static final int LR = 12;
    Internal.IntList LS;
    public static final int LT = 13;
    boolean LU;
    public static final int LV = 14;
    int LW;
    public static final int LX = 15;
    int LY;
    private byte Y = (byte)-1;
    private static final mE LZ = new mE();
    @Deprecated
    public static final Parser<mE> Ma = new mF();

    mE(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mE() {
        this.LG = "";
        this.LK = -1;
        this.LS = mE.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mE();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block26: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block26;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wq = codedInputStream.readInt64();
                        continue block26;
                    }
                    case 16: {
                        this.an |= 2;
                        this.qB = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 24: {
                        this.an |= 4;
                        this.LE = codedInputStream.readInt64();
                        continue block26;
                    }
                    case 34: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 8;
                        this.LG = byteString;
                        continue block26;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.LI = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.LK = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.Kf = codedInputStream.readInt64();
                        continue block26;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.jq = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.Kh = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.Kj = codedInputStream.readInt64();
                        continue block26;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.LQ = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 96: {
                        if ((n & 0x800) == 0) {
                            this.LS = mE.newIntList();
                            n |= 0x800;
                        }
                        this.LS.addInt(codedInputStream.readInt32());
                        continue block26;
                    }
                    case 98: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 0x800) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.LS = mE.newIntList();
                            n |= 0x800;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.LS.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block26;
                    }
                    case 104: {
                        this.an |= 0x800;
                        this.LU = codedInputStream.readBool();
                        continue block26;
                    }
                    case 112: {
                        this.an |= 0x1000;
                        this.LW = codedInputStream.readInt32();
                        continue block26;
                    }
                    case 120: {
                        this.an |= 0x2000;
                        this.LY = codedInputStream.readInt32();
                        continue block26;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
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
            if ((n & 0x800) != 0) {
                this.LS.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor amz() {
        return md_0.Ly;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return md_0.Lz.ensureFieldAccessorsInitialized(mE.class, mg_0.class);
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    @Override
    public boolean AJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    @Override
    public boolean amA() {
        return (this.an & 4) != 0;
    }

    @Override
    public long amB() {
        return this.LE;
    }

    @Override
    public boolean amC() {
        return (this.an & 8) != 0;
    }

    @Override
    public String amD() {
        Object object = this.LG;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.LG = string;
        }
        return string;
    }

    @Override
    public ByteString amE() {
        Object object = this.LG;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.LG = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean amF() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int amG() {
        return this.LI;
    }

    @Override
    public boolean amH() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int amI() {
        return this.LK;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    @Override
    public boolean oO() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean ake() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int akf() {
        return this.Kh;
    }

    @Override
    public boolean akg() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long akh() {
        return this.Kj;
    }

    @Override
    public boolean amJ() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int amK() {
        return this.LQ;
    }

    @Override
    public List<Integer> amL() {
        return this.LS;
    }

    @Override
    public int amM() {
        return this.LS.size();
    }

    @Override
    public int ip(int n) {
        return this.LS.getInt(n);
    }

    @Override
    public boolean amN() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public boolean amO() {
        return this.LU;
    }

    @Override
    public boolean amP() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public int amQ() {
        return this.LW;
    }

    @Override
    public boolean amR() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public int amS() {
        return this.LY;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.AJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.amA()) {
            this.Y = 0;
            return false;
        }
        if (!this.amC()) {
            this.Y = 0;
            return false;
        }
        if (!this.akc()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (!this.ake()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wq);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.qB);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.LE);
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.LG);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.LI);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(6, this.LK);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(7, this.Kf);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.jq);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.Kh);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt64(10, this.Kj);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.LQ);
        }
        for (int i = 0; i < this.LS.size(); ++i) {
            codedOutputStream.writeInt32(12, this.LS.getInt(i));
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeBool(13, this.LU);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeInt32(14, this.LW);
        }
        if ((this.an & 0x2000) != 0) {
            codedOutputStream.writeInt32(15, this.LY);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wq);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.qB);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.LE);
        }
        if ((this.an & 8) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.LG);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.LI);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.LK);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.Kf);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.jq);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.Kh);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.Kj);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.LQ);
        }
        int n2 = 0;
        for (int i = 0; i < this.LS.size(); ++i) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.LS.getInt(i));
        }
        n += n2;
        n += 1 * this.amL().size();
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeBoolSize((int)13, (boolean)this.LU);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.LW);
        }
        if ((this.an & 0x2000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.LY);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mE)) {
            return super.equals(object);
        }
        mE mE2 = (mE)object;
        if (this.Lw() != mE2.Lw()) {
            return false;
        }
        if (this.Lw() && this.Lx() != mE2.Lx()) {
            return false;
        }
        if (this.AJ() != mE2.AJ()) {
            return false;
        }
        if (this.AJ() && this.AK() != mE2.AK()) {
            return false;
        }
        if (this.amA() != mE2.amA()) {
            return false;
        }
        if (this.amA() && this.amB() != mE2.amB()) {
            return false;
        }
        if (this.amC() != mE2.amC()) {
            return false;
        }
        if (this.amC() && !this.amD().equals(mE2.amD())) {
            return false;
        }
        if (this.amF() != mE2.amF()) {
            return false;
        }
        if (this.amF() && this.amG() != mE2.amG()) {
            return false;
        }
        if (this.amH() != mE2.amH()) {
            return false;
        }
        if (this.amH() && this.amI() != mE2.amI()) {
            return false;
        }
        if (this.akc() != mE2.akc()) {
            return false;
        }
        if (this.akc() && this.akd() != mE2.akd()) {
            return false;
        }
        if (this.oO() != mE2.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != mE2.oP()) {
            return false;
        }
        if (this.ake() != mE2.ake()) {
            return false;
        }
        if (this.ake() && this.akf() != mE2.akf()) {
            return false;
        }
        if (this.akg() != mE2.akg()) {
            return false;
        }
        if (this.akg() && this.akh() != mE2.akh()) {
            return false;
        }
        if (this.amJ() != mE2.amJ()) {
            return false;
        }
        if (this.amJ() && this.amK() != mE2.amK()) {
            return false;
        }
        if (!this.amL().equals(mE2.amL())) {
            return false;
        }
        if (this.amN() != mE2.amN()) {
            return false;
        }
        if (this.amN() && this.amO() != mE2.amO()) {
            return false;
        }
        if (this.amP() != mE2.amP()) {
            return false;
        }
        if (this.amP() && this.amQ() != mE2.amQ()) {
            return false;
        }
        if (this.amR() != mE2.amR()) {
            return false;
        }
        if (this.amR() && this.amS() != mE2.amS()) {
            return false;
        }
        return this.unknownFields.equals((Object)mE2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mE.amz().hashCode();
        if (this.Lw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Lx());
        }
        if (this.AJ()) {
            n = 37 * n + 2;
            n = 53 * n + this.AK();
        }
        if (this.amA()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.amB());
        }
        if (this.amC()) {
            n = 37 * n + 4;
            n = 53 * n + this.amD().hashCode();
        }
        if (this.amF()) {
            n = 37 * n + 5;
            n = 53 * n + this.amG();
        }
        if (this.amH()) {
            n = 37 * n + 6;
            n = 53 * n + this.amI();
        }
        if (this.akc()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.akd());
        }
        if (this.oO()) {
            n = 37 * n + 8;
            n = 53 * n + this.oP();
        }
        if (this.ake()) {
            n = 37 * n + 9;
            n = 53 * n + this.akf();
        }
        if (this.akg()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.akh());
        }
        if (this.amJ()) {
            n = 37 * n + 11;
            n = 53 * n + this.amK();
        }
        if (this.amM() > 0) {
            n = 37 * n + 12;
            n = 53 * n + this.amL().hashCode();
        }
        if (this.amN()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashBoolean((boolean)this.amO());
        }
        if (this.amP()) {
            n = 37 * n + 14;
            n = 53 * n + this.amQ();
        }
        if (this.amR()) {
            n = 37 * n + 15;
            n = 53 * n + this.amS();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mE cd(ByteBuffer byteBuffer) {
        return (mE)Ma.parseFrom(byteBuffer);
    }

    public static mE bZ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)Ma.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mE dn(ByteString byteString) {
        return (mE)Ma.parseFrom(byteString);
    }

    public static mE bZ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)Ma.parseFrom(byteString, extensionRegistryLite);
    }

    public static mE ca(byte[] byArray) {
        return (mE)Ma.parseFrom(byArray);
    }

    public static mE bZ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)Ma.parseFrom(byArray, extensionRegistryLite);
    }

    public static mE eY(InputStream inputStream) {
        return (mE)GeneratedMessageV3.parseWithIOException(Ma, (InputStream)inputStream);
    }

    public static mE eY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseWithIOException(Ma, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mE eZ(InputStream inputStream) {
        return (mE)GeneratedMessageV3.parseDelimitedWithIOException(Ma, (InputStream)inputStream);
    }

    public static mE eZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseDelimitedWithIOException(Ma, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mE bZ(CodedInputStream codedInputStream) {
        return (mE)GeneratedMessageV3.parseWithIOException(Ma, (CodedInputStream)codedInputStream);
    }

    public static mE hX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseWithIOException(Ma, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mg_0 amT() {
        return mE.amU();
    }

    public static mg_0 amU() {
        return LZ.amV();
    }

    public static mg_0 a(mE mE2) {
        return LZ.amV().c(mE2);
    }

    public mg_0 amV() {
        return this == LZ ? new mg_0() : new mg_0().c(this);
    }

    protected mg_0 bZ(GeneratedMessageV3.BuilderParent builderParent) {
        mg_0 mg_02 = new mg_0(builderParent);
        return mg_02;
    }

    public static mE amW() {
        return LZ;
    }

    public static Parser<mE> z() {
        return Ma;
    }

    public Parser<mE> getParserForType() {
        return Ma;
    }

    public mE amX() {
        return LZ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bZ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.amV();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.amT();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.amV();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.amT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.amX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.amX();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList amY() {
        return mE.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet b(mE mE2) {
        return mE2.unknownFields;
    }

    static /* synthetic */ Internal.IntList Ac() {
        return mE.emptyIntList();
    }

    static /* synthetic */ Internal.IntList b(Internal.IntList intList) {
        return mE.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ad() {
        return mE.emptyIntList();
    }
}

