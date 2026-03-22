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

/*
 * Renamed from jh
 */
public final class jh_1
extends GeneratedMessageV3
implements jk_1 {
    private static final long Bl = 0L;
    int an;
    public static final int Bm = 1;
    long Bn;
    public static final int Bo = 2;
    long Bp;
    public static final int Bq = 3;
    int Br;
    public static final int Bs = 4;
    int Bt;
    public static final int Bu = 5;
    jl_1 Bv;
    public static final int Bw = 6;
    jl_1 Bx;
    public static final int By = 7;
    long Bz;
    public static final int BA = 8;
    int BB;
    public static final int BC = 9;
    int va;
    public static final int BD = 10;
    int BE;
    public static final int BF = 11;
    int BG;
    public static final int BH = 12;
    int BI;
    public static final int BJ = 13;
    int BK;
    public static final int BL = 14;
    long BM;
    private byte Y = (byte)-1;
    private static final jh_1 BN = new jh_1();
    @Deprecated
    public static final Parser<jh_1> BO = new ji_1();

    jh_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jh_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jh_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jh_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block24: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block24;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Bn = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Bp = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Br = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Bt = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 42: {
                        jn_1 jn_12 = null;
                        if ((this.an & 0x10) != 0) {
                            jn_12 = this.Bv.UK();
                        }
                        this.Bv = (jl_1)codedInputStream.readMessage(jl_1.BZ, extensionRegistryLite);
                        if (jn_12 != null) {
                            jn_12.g(this.Bv);
                            this.Bv = jn_12.UQ();
                        }
                        this.an |= 0x10;
                        continue block24;
                    }
                    case 50: {
                        jn_1 jn_12 = null;
                        if ((this.an & 0x20) != 0) {
                            jn_12 = this.Bx.UK();
                        }
                        this.Bx = (jl_1)codedInputStream.readMessage(jl_1.BZ, extensionRegistryLite);
                        if (jn_12 != null) {
                            jn_12.g(this.Bx);
                            this.Bx = jn_12.UQ();
                        }
                        this.an |= 0x20;
                        continue block24;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.Bz = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.BB = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.va = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.BE = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.BG = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 96: {
                        this.an |= 0x800;
                        this.BI = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 104: {
                        this.an |= 0x1000;
                        this.BK = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 112: {
                        this.an |= 0x2000;
                        this.BM = codedInputStream.readInt64();
                        continue block24;
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

    public static final Descriptors.Descriptor Tv() {
        return iu_2.Ag;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ah.ensureFieldAccessorsInitialized(jh_1.class, jj_1.class);
    }

    @Override
    public boolean Tw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Tx() {
        return this.Bn;
    }

    @Override
    public boolean Ty() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Tz() {
        return this.Bp;
    }

    @Override
    public boolean TA() {
        return (this.an & 4) != 0;
    }

    @Override
    public int TB() {
        return this.Br;
    }

    @Override
    public boolean TC() {
        return (this.an & 8) != 0;
    }

    @Override
    public int TD() {
        return this.Bt;
    }

    @Override
    public boolean TE() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public jl_1 TF() {
        return this.Bv == null ? jl_1.UL() : this.Bv;
    }

    @Override
    public jo_1 TG() {
        return this.Bv == null ? jl_1.UL() : this.Bv;
    }

    @Override
    public boolean TH() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public jl_1 TI() {
        return this.Bx == null ? jl_1.UL() : this.Bx;
    }

    @Override
    public jo_1 TJ() {
        return this.Bx == null ? jl_1.UL() : this.Bx;
    }

    @Override
    public boolean TK() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long TL() {
        return this.Bz;
    }

    @Override
    public boolean TM() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int TN() {
        return this.BB;
    }

    @Override
    public boolean IT() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int IU() {
        return this.va;
    }

    @Override
    public boolean TO() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int TP() {
        return this.BE;
    }

    @Override
    public boolean TQ() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int TR() {
        return this.BG;
    }

    @Override
    public boolean TS() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int TT() {
        return this.BI;
    }

    @Override
    public boolean TU() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public int TV() {
        return this.BK;
    }

    @Override
    public boolean TW() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public long TX() {
        return this.BM;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Tw()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ty()) {
            this.Y = 0;
            return false;
        }
        if (!this.TA()) {
            this.Y = 0;
            return false;
        }
        if (!this.TC()) {
            this.Y = 0;
            return false;
        }
        if (!this.TE()) {
            this.Y = 0;
            return false;
        }
        if (!this.TH()) {
            this.Y = 0;
            return false;
        }
        if (!this.TK()) {
            this.Y = 0;
            return false;
        }
        if (!this.TM()) {
            this.Y = 0;
            return false;
        }
        if (!this.TW()) {
            this.Y = 0;
            return false;
        }
        if (!this.TF().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (!this.TI().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.Bn);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Bp);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.Br);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.Bt);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeMessage(5, (MessageLite)this.TF());
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeMessage(6, (MessageLite)this.TI());
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(7, this.Bz);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.BB);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.va);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(10, this.BE);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.BG);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt32(12, this.BI);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeInt32(13, this.BK);
        }
        if ((this.an & 0x2000) != 0) {
            codedOutputStream.writeInt64(14, this.BM);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.Bn);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Bp);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.Br);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.Bt);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.TF());
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.TI());
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.Bz);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.BB);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.va);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.BE);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.BG);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.BI);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)13, (int)this.BK);
        }
        if ((this.an & 0x2000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)14, (long)this.BM);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jh_1)) {
            return super.equals(object);
        }
        jh_1 jh_12 = (jh_1)object;
        if (this.Tw() != jh_12.Tw()) {
            return false;
        }
        if (this.Tw() && this.Tx() != jh_12.Tx()) {
            return false;
        }
        if (this.Ty() != jh_12.Ty()) {
            return false;
        }
        if (this.Ty() && this.Tz() != jh_12.Tz()) {
            return false;
        }
        if (this.TA() != jh_12.TA()) {
            return false;
        }
        if (this.TA() && this.TB() != jh_12.TB()) {
            return false;
        }
        if (this.TC() != jh_12.TC()) {
            return false;
        }
        if (this.TC() && this.TD() != jh_12.TD()) {
            return false;
        }
        if (this.TE() != jh_12.TE()) {
            return false;
        }
        if (this.TE() && !this.TF().equals(jh_12.TF())) {
            return false;
        }
        if (this.TH() != jh_12.TH()) {
            return false;
        }
        if (this.TH() && !this.TI().equals(jh_12.TI())) {
            return false;
        }
        if (this.TK() != jh_12.TK()) {
            return false;
        }
        if (this.TK() && this.TL() != jh_12.TL()) {
            return false;
        }
        if (this.TM() != jh_12.TM()) {
            return false;
        }
        if (this.TM() && this.TN() != jh_12.TN()) {
            return false;
        }
        if (this.IT() != jh_12.IT()) {
            return false;
        }
        if (this.IT() && this.IU() != jh_12.IU()) {
            return false;
        }
        if (this.TO() != jh_12.TO()) {
            return false;
        }
        if (this.TO() && this.TP() != jh_12.TP()) {
            return false;
        }
        if (this.TQ() != jh_12.TQ()) {
            return false;
        }
        if (this.TQ() && this.TR() != jh_12.TR()) {
            return false;
        }
        if (this.TS() != jh_12.TS()) {
            return false;
        }
        if (this.TS() && this.TT() != jh_12.TT()) {
            return false;
        }
        if (this.TU() != jh_12.TU()) {
            return false;
        }
        if (this.TU() && this.TV() != jh_12.TV()) {
            return false;
        }
        if (this.TW() != jh_12.TW()) {
            return false;
        }
        if (this.TW() && this.TX() != jh_12.TX()) {
            return false;
        }
        return this.unknownFields.equals((Object)jh_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jh_1.Tv().hashCode();
        if (this.Tw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Tx());
        }
        if (this.Ty()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.Tz());
        }
        if (this.TA()) {
            n = 37 * n + 3;
            n = 53 * n + this.TB();
        }
        if (this.TC()) {
            n = 37 * n + 4;
            n = 53 * n + this.TD();
        }
        if (this.TE()) {
            n = 37 * n + 5;
            n = 53 * n + this.TF().hashCode();
        }
        if (this.TH()) {
            n = 37 * n + 6;
            n = 53 * n + this.TI().hashCode();
        }
        if (this.TK()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.TL());
        }
        if (this.TM()) {
            n = 37 * n + 8;
            n = 53 * n + this.TN();
        }
        if (this.IT()) {
            n = 37 * n + 9;
            n = 53 * n + this.IU();
        }
        if (this.TO()) {
            n = 37 * n + 10;
            n = 53 * n + this.TP();
        }
        if (this.TQ()) {
            n = 37 * n + 11;
            n = 53 * n + this.TR();
        }
        if (this.TS()) {
            n = 37 * n + 12;
            n = 53 * n + this.TT();
        }
        if (this.TU()) {
            n = 37 * n + 13;
            n = 53 * n + this.TV();
        }
        if (this.TW()) {
            n = 37 * n + 14;
            n = 53 * n + Internal.hashLong((long)this.TX());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jh_1 bn(ByteBuffer byteBuffer) {
        return (jh_1)BO.parseFrom(byteBuffer);
    }

    public static jh_1 bj(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)BO.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jh_1 cg(ByteString byteString) {
        return (jh_1)BO.parseFrom(byteString);
    }

    public static jh_1 bj(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)BO.parseFrom(byteString, extensionRegistryLite);
    }

    public static jh_1 bk(byte[] byArray) {
        return (jh_1)BO.parseFrom(byArray);
    }

    public static jh_1 bj(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)BO.parseFrom(byArray, extensionRegistryLite);
    }

    public static jh_1 ds(InputStream inputStream) {
        return (jh_1)GeneratedMessageV3.parseWithIOException(BO, (InputStream)inputStream);
    }

    public static jh_1 ds(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)GeneratedMessageV3.parseWithIOException(BO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jh_1 dt(InputStream inputStream) {
        return (jh_1)GeneratedMessageV3.parseDelimitedWithIOException(BO, (InputStream)inputStream);
    }

    public static jh_1 dt(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)GeneratedMessageV3.parseDelimitedWithIOException(BO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jh_1 bj(CodedInputStream codedInputStream) {
        return (jh_1)GeneratedMessageV3.parseWithIOException(BO, (CodedInputStream)codedInputStream);
    }

    public static jh_1 fB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jh_1)GeneratedMessageV3.parseWithIOException(BO, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jj_1 TY() {
        return jh_1.TZ();
    }

    public static jj_1 TZ() {
        return BN.Ua();
    }

    public static jj_1 a(jh_1 jh_12) {
        return BN.Ua().c(jh_12);
    }

    public jj_1 Ua() {
        return this == BN ? new jj_1() : new jj_1().c(this);
    }

    protected jj_1 bj(GeneratedMessageV3.BuilderParent builderParent) {
        jj_1 jj_12 = new jj_1(builderParent);
        return jj_12;
    }

    public static jh_1 Ub() {
        return BN;
    }

    public static Parser<jh_1> z() {
        return BO;
    }

    public Parser<jh_1> getParserForType() {
        return BO;
    }

    public jh_1 Uc() {
        return BN;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bj(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ua();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.TY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ua();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.TY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Uc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Uc();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jh_1 jh_12) {
        return jh_12.unknownFields;
    }
}

