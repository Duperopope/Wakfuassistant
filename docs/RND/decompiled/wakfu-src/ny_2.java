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
 * Renamed from nY
 */
public final class ny_2
extends GeneratedMessageV3
implements of_2 {
    private static final long PI = 0L;
    int an;
    public static final int PJ = 1;
    int dL;
    public static final int PK = 2;
    int HC;
    public static final int PL = 3;
    int PM;
    public static final int PN = 4;
    og_2 PO;
    public static final int PP = 5;
    og_2 PQ;
    public static final int PR = 6;
    long PS;
    public static final int PT = 7;
    int PU;
    public static final int PV = 8;
    int mj;
    public static final int PW = 9;
    int PX;
    public static final int PY = 10;
    long PZ;
    public static final int Qa = 11;
    int Qb;
    public static final int Qc = 12;
    int Qd;
    private byte Y = (byte)-1;
    private static final ny_2 Qe = new ny_2();
    @Deprecated
    public static final Parser<ny_2> Qf = new nz_2();

    ny_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ny_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ny_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ny_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block22: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block22;
                    }
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 16: {
                        this.an |= 2;
                        this.HC = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 24: {
                        this.an |= 4;
                        this.PM = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 34: {
                        oi_2 oi_22 = null;
                        if ((this.an & 8) != 0) {
                            oi_22 = this.PO.auK();
                        }
                        this.PO = (og_2)codedInputStream.readMessage(og_2.Qu, extensionRegistryLite);
                        if (oi_22 != null) {
                            oi_22.g(this.PO);
                            this.PO = oi_22.auR();
                        }
                        this.an |= 8;
                        continue block22;
                    }
                    case 42: {
                        oi_2 oi_22 = null;
                        if ((this.an & 0x10) != 0) {
                            oi_22 = this.PQ.auK();
                        }
                        this.PQ = (og_2)codedInputStream.readMessage(og_2.Qu, extensionRegistryLite);
                        if (oi_22 != null) {
                            oi_22.g(this.PQ);
                            this.PQ = oi_22.auR();
                        }
                        this.an |= 0x10;
                        continue block22;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.PS = codedInputStream.readInt64();
                        continue block22;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.PU = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.mj = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.PX = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.PZ = codedInputStream.readInt64();
                        continue block22;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.Qb = codedInputStream.readInt32();
                        continue block22;
                    }
                    case 96: {
                        this.an |= 0x800;
                        this.Qd = codedInputStream.readInt32();
                        continue block22;
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

    public static final Descriptors.Descriptor atr() {
        return nx_2.PE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PF.ensureFieldAccessorsInitialized(ny_2.class, oa_2.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    @Override
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public int aeV() {
        return this.HC;
    }

    @Override
    public boolean ats() {
        return (this.an & 4) != 0;
    }

    @Override
    public int att() {
        return this.PM;
    }

    @Override
    public boolean atu() {
        return (this.an & 8) != 0;
    }

    @Override
    public og_2 atv() {
        return this.PO == null ? og_2.auL() : this.PO;
    }

    @Override
    public oj_2 atw() {
        return this.PO == null ? og_2.auL() : this.PO;
    }

    @Override
    public boolean atx() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public og_2 aty() {
        return this.PQ == null ? og_2.auL() : this.PQ;
    }

    @Override
    public oj_2 atz() {
        return this.PQ == null ? og_2.auL() : this.PQ;
    }

    @Override
    public boolean aps() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long atA() {
        return this.PS;
    }

    @Override
    public boolean atB() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int atC() {
        return this.PU;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public boolean Xh() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int atD() {
        return this.PX;
    }

    @Override
    public boolean atE() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long atF() {
        return this.PZ;
    }

    @Override
    public boolean atG() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int atH() {
        return this.Qb;
    }

    @Override
    public boolean atI() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int atJ() {
        return this.Qd;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.aeU()) {
            this.Y = 0;
            return false;
        }
        if (!this.ats()) {
            this.Y = 0;
            return false;
        }
        if (!this.atu()) {
            this.Y = 0;
            return false;
        }
        if (!this.atx()) {
            this.Y = 0;
            return false;
        }
        if (!this.aps()) {
            this.Y = 0;
            return false;
        }
        if (!this.atv().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (!this.aty().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.HC);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.PM);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeMessage(4, (MessageLite)this.atv());
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeMessage(5, (MessageLite)this.aty());
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(6, this.PS);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(7, this.PU);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.mj);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.PX);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt64(10, this.PZ);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.Qb);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt32(12, this.Qd);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.HC);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.PM);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.atv());
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.aty());
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.PS);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.PU);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.mj);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.PX);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.PZ);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.Qb);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.Qd);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ny_2)) {
            return super.equals(object);
        }
        ny_2 ny_22 = (ny_2)object;
        if (this.oN() != ny_22.oN()) {
            return false;
        }
        if (this.oN() && this.d() != ny_22.d()) {
            return false;
        }
        if (this.aeU() != ny_22.aeU()) {
            return false;
        }
        if (this.aeU() && this.aeV() != ny_22.aeV()) {
            return false;
        }
        if (this.ats() != ny_22.ats()) {
            return false;
        }
        if (this.ats() && this.att() != ny_22.att()) {
            return false;
        }
        if (this.atu() != ny_22.atu()) {
            return false;
        }
        if (this.atu() && !this.atv().equals(ny_22.atv())) {
            return false;
        }
        if (this.atx() != ny_22.atx()) {
            return false;
        }
        if (this.atx() && !this.aty().equals(ny_22.aty())) {
            return false;
        }
        if (this.aps() != ny_22.aps()) {
            return false;
        }
        if (this.aps() && this.atA() != ny_22.atA()) {
            return false;
        }
        if (this.atB() != ny_22.atB()) {
            return false;
        }
        if (this.atB() && this.atC() != ny_22.atC()) {
            return false;
        }
        if (this.tK() != ny_22.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != ny_22.tL()) {
            return false;
        }
        if (this.Xh() != ny_22.Xh()) {
            return false;
        }
        if (this.Xh() && this.atD() != ny_22.atD()) {
            return false;
        }
        if (this.atE() != ny_22.atE()) {
            return false;
        }
        if (this.atE() && this.atF() != ny_22.atF()) {
            return false;
        }
        if (this.atG() != ny_22.atG()) {
            return false;
        }
        if (this.atG() && this.atH() != ny_22.atH()) {
            return false;
        }
        if (this.atI() != ny_22.atI()) {
            return false;
        }
        if (this.atI() && this.atJ() != ny_22.atJ()) {
            return false;
        }
        return this.unknownFields.equals((Object)ny_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ny_2.atr().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        if (this.aeU()) {
            n = 37 * n + 2;
            n = 53 * n + this.aeV();
        }
        if (this.ats()) {
            n = 37 * n + 3;
            n = 53 * n + this.att();
        }
        if (this.atu()) {
            n = 37 * n + 4;
            n = 53 * n + this.atv().hashCode();
        }
        if (this.atx()) {
            n = 37 * n + 5;
            n = 53 * n + this.aty().hashCode();
        }
        if (this.aps()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.atA());
        }
        if (this.atB()) {
            n = 37 * n + 7;
            n = 53 * n + this.atC();
        }
        if (this.tK()) {
            n = 37 * n + 8;
            n = 53 * n + this.tL();
        }
        if (this.Xh()) {
            n = 37 * n + 9;
            n = 53 * n + this.atD();
        }
        if (this.atE()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.atF());
        }
        if (this.atG()) {
            n = 37 * n + 11;
            n = 53 * n + this.atH();
        }
        if (this.atI()) {
            n = 37 * n + 12;
            n = 53 * n + this.atJ();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ny_2 cq(ByteBuffer byteBuffer) {
        return (ny_2)Qf.parseFrom(byteBuffer);
    }

    public static ny_2 cm(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)Qf.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ny_2 dN(ByteString byteString) {
        return (ny_2)Qf.parseFrom(byteString);
    }

    public static ny_2 cm(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)Qf.parseFrom(byteString, extensionRegistryLite);
    }

    public static ny_2 co(byte[] byArray) {
        return (ny_2)Qf.parseFrom(byArray);
    }

    public static ny_2 cm(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)Qf.parseFrom(byArray, extensionRegistryLite);
    }

    public static ny_2 fy(InputStream inputStream) {
        return (ny_2)GeneratedMessageV3.parseWithIOException(Qf, (InputStream)inputStream);
    }

    public static ny_2 fy(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)GeneratedMessageV3.parseWithIOException(Qf, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ny_2 fz(InputStream inputStream) {
        return (ny_2)GeneratedMessageV3.parseDelimitedWithIOException(Qf, (InputStream)inputStream);
    }

    public static ny_2 fz(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)GeneratedMessageV3.parseDelimitedWithIOException(Qf, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ny_2 cm(CodedInputStream codedInputStream) {
        return (ny_2)GeneratedMessageV3.parseWithIOException(Qf, (CodedInputStream)codedInputStream);
    }

    public static ny_2 iK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ny_2)GeneratedMessageV3.parseWithIOException(Qf, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oa_2 atK() {
        return ny_2.atL();
    }

    public static oa_2 atL() {
        return Qe.atM();
    }

    public static oa_2 a(ny_2 ny_22) {
        return Qe.atM().c(ny_22);
    }

    public oa_2 atM() {
        return this == Qe ? new oa_2() : new oa_2().c(this);
    }

    protected oa_2 cm(GeneratedMessageV3.BuilderParent builderParent) {
        oa_2 oa_22 = new oa_2(builderParent);
        return oa_22;
    }

    public static ny_2 atN() {
        return Qe;
    }

    public static Parser<ny_2> z() {
        return Qf;
    }

    public Parser<ny_2> getParserForType() {
        return Qf;
    }

    public ny_2 atO() {
        return Qe;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cm(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.atM();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.atK();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.atM();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.atK();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.atO();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.atO();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ny_2 ny_22) {
        return ny_22.unknownFields;
    }
}

