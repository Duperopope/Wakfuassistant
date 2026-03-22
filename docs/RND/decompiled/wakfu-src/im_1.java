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
 * Renamed from iM
 */
public final class im_1
extends GeneratedMessageV3
implements ip_2 {
    private static final long zp = 0L;
    int an;
    public static final int zq = 1;
    long wX;
    public static final int zr = 2;
    long zs;
    public static final int zt = 3;
    int zu;
    public static final int zv = 4;
    int wR;
    public static final int zw = 5;
    im_2 zx;
    public static final int zy = 6;
    long zz;
    public static final int zA = 7;
    long zB;
    public static final int zC = 8;
    ii_1 zD;
    public static final int zE = 9;
    int zF;
    public static final int zG = 10;
    long zH;
    public static final int zI = 11;
    ia_2 zJ;
    public static final int zK = 12;
    iq_1 zL;
    public static final int zM = 13;
    iq_2 zN;
    private byte Y = (byte)-1;
    private static final im_1 zO = new im_1();
    @Deprecated
    public static final Parser<im_1> zP = new in_1();

    im_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private im_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new im_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    im_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block23: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block23;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wX = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 16: {
                        this.an |= 2;
                        this.zs = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 24: {
                        this.an |= 4;
                        this.zu = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 32: {
                        this.an |= 8;
                        this.wR = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 42: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x10) != 0) {
                            builder2 = this.zx.NQ();
                        }
                        this.zx = (im_2)codedInputStream.readMessage(im_2.yd, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.c(this.zx);
                            this.zx = builder2.NW();
                        }
                        this.an |= 0x10;
                        continue block23;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.zz = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.zB = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 66: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x80) != 0) {
                            builder2 = this.zD.MS();
                        }
                        this.zD = (ii_1)codedInputStream.readMessage(ii_1.xQ, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.c(this.zD);
                            this.zD = builder2.MY();
                        }
                        this.an |= 0x80;
                        continue block23;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.zF = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.zH = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 90: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x400) != 0) {
                            builder2 = this.zJ.Ps();
                        }
                        this.zJ = (ia_2)codedInputStream.readMessage(ia_2.zb, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.c(this.zJ);
                            this.zJ = builder2.Py();
                        }
                        this.an |= 0x400;
                        continue block23;
                    }
                    case 98: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x800) != 0) {
                            builder2 = this.zL.RG();
                        }
                        this.zL = (iq_1)codedInputStream.readMessage(iq_1.Af, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.zL);
                            this.zL = builder2.RM();
                        }
                        this.an |= 0x800;
                        continue block23;
                    }
                    case 106: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x1000) != 0) {
                            builder2 = this.zN.Ou();
                        }
                        this.zN = (iq_2)codedInputStream.readMessage(iq_2.yw, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.c(this.zN);
                            this.zN = builder2.OA();
                        }
                        this.an |= 0x1000;
                        continue block23;
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

    public static final Descriptors.Descriptor Qo() {
        return ih_2.wv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.ww.ensureFieldAccessorsInitialized(im_1.class, io_1.class);
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    @Override
    public boolean Qp() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Qq() {
        return this.zs;
    }

    @Override
    public boolean Qr() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Qs() {
        return this.zu;
    }

    @Override
    public boolean LP() {
        return (this.an & 8) != 0;
    }

    @Override
    public int getValue() {
        return this.wR;
    }

    @Override
    public boolean LW() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public im_2 Qt() {
        return this.zx == null ? im_2.NR() : this.zx;
    }

    @Override
    public ip_1 Qu() {
        return this.zx == null ? im_2.NR() : this.zx;
    }

    @Override
    public boolean Qv() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Qw() {
        return this.zz;
    }

    @Override
    public boolean Qx() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long Qy() {
        return this.zB;
    }

    @Override
    public boolean Qz() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public ii_1 QA() {
        return this.zD == null ? ii_1.MT() : this.zD;
    }

    @Override
    public il_1 QB() {
        return this.zD == null ? ii_1.MT() : this.zD;
    }

    @Override
    public boolean QC() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int QD() {
        return this.zF;
    }

    @Override
    public boolean QE() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long QF() {
        return this.zH;
    }

    @Override
    public boolean QG() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public ia_2 QH() {
        return this.zJ == null ? ia_2.Pt() : this.zJ;
    }

    @Override
    public id_2 QI() {
        return this.zJ == null ? ia_2.Pt() : this.zJ;
    }

    @Override
    public boolean QJ() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public iq_1 QK() {
        return this.zL == null ? iq_1.RH() : this.zL;
    }

    @Override
    public it_2 QL() {
        return this.zL == null ? iq_1.RH() : this.zL;
    }

    @Override
    public boolean QM() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public iq_2 QN() {
        return this.zN == null ? iq_2.Ov() : this.zN;
    }

    @Override
    public iv_1 QO() {
        return this.zN == null ? iq_2.Ov() : this.zN;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.LU()) {
            this.Y = 0;
            return false;
        }
        if (!this.Qp()) {
            this.Y = 0;
            return false;
        }
        if (!this.Qr()) {
            this.Y = 0;
            return false;
        }
        if (!this.LP()) {
            this.Y = 0;
            return false;
        }
        if (this.LW() && !this.Qt().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.Qz() && !this.QA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.QG() && !this.QH().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.QM() && !this.QN().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wX);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.zs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.zu);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.wR);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeMessage(5, (MessageLite)this.Qt());
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(6, this.zz);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(7, this.zB);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeMessage(8, (MessageLite)this.QA());
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.zF);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt64(10, this.zH);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeMessage(11, (MessageLite)this.QH());
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeMessage(12, (MessageLite)this.QK());
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeMessage(13, (MessageLite)this.QN());
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wX);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.zs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.zu);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.wR);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.Qt());
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.zz);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.zB);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.QA());
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.zF);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.zH);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeMessageSize((int)11, (MessageLite)this.QH());
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeMessageSize((int)12, (MessageLite)this.QK());
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeMessageSize((int)13, (MessageLite)this.QN());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof im_1)) {
            return super.equals(object);
        }
        im_1 im_12 = (im_1)object;
        if (this.LU() != im_12.LU()) {
            return false;
        }
        if (this.LU() && this.LV() != im_12.LV()) {
            return false;
        }
        if (this.Qp() != im_12.Qp()) {
            return false;
        }
        if (this.Qp() && this.Qq() != im_12.Qq()) {
            return false;
        }
        if (this.Qr() != im_12.Qr()) {
            return false;
        }
        if (this.Qr() && this.Qs() != im_12.Qs()) {
            return false;
        }
        if (this.LP() != im_12.LP()) {
            return false;
        }
        if (this.LP() && this.getValue() != im_12.getValue()) {
            return false;
        }
        if (this.LW() != im_12.LW()) {
            return false;
        }
        if (this.LW() && !this.Qt().equals(im_12.Qt())) {
            return false;
        }
        if (this.Qv() != im_12.Qv()) {
            return false;
        }
        if (this.Qv() && this.Qw() != im_12.Qw()) {
            return false;
        }
        if (this.Qx() != im_12.Qx()) {
            return false;
        }
        if (this.Qx() && this.Qy() != im_12.Qy()) {
            return false;
        }
        if (this.Qz() != im_12.Qz()) {
            return false;
        }
        if (this.Qz() && !this.QA().equals(im_12.QA())) {
            return false;
        }
        if (this.QC() != im_12.QC()) {
            return false;
        }
        if (this.QC() && this.QD() != im_12.QD()) {
            return false;
        }
        if (this.QE() != im_12.QE()) {
            return false;
        }
        if (this.QE() && this.QF() != im_12.QF()) {
            return false;
        }
        if (this.QG() != im_12.QG()) {
            return false;
        }
        if (this.QG() && !this.QH().equals(im_12.QH())) {
            return false;
        }
        if (this.QJ() != im_12.QJ()) {
            return false;
        }
        if (this.QJ() && !this.QK().equals(im_12.QK())) {
            return false;
        }
        if (this.QM() != im_12.QM()) {
            return false;
        }
        if (this.QM() && !this.QN().equals(im_12.QN())) {
            return false;
        }
        return this.unknownFields.equals((Object)im_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + im_1.Qo().hashCode();
        if (this.LU()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.LV());
        }
        if (this.Qp()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.Qq());
        }
        if (this.Qr()) {
            n = 37 * n + 3;
            n = 53 * n + this.Qs();
        }
        if (this.LP()) {
            n = 37 * n + 4;
            n = 53 * n + this.getValue();
        }
        if (this.LW()) {
            n = 37 * n + 5;
            n = 53 * n + this.Qt().hashCode();
        }
        if (this.Qv()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.Qw());
        }
        if (this.Qx()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.Qy());
        }
        if (this.Qz()) {
            n = 37 * n + 8;
            n = 53 * n + this.QA().hashCode();
        }
        if (this.QC()) {
            n = 37 * n + 9;
            n = 53 * n + this.QD();
        }
        if (this.QE()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.QF());
        }
        if (this.QG()) {
            n = 37 * n + 11;
            n = 53 * n + this.QH().hashCode();
        }
        if (this.QJ()) {
            n = 37 * n + 12;
            n = 53 * n + this.QK().hashCode();
        }
        if (this.QM()) {
            n = 37 * n + 13;
            n = 53 * n + this.QN().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static im_1 bi(ByteBuffer byteBuffer) {
        return (im_1)zP.parseFrom(byteBuffer);
    }

    public static im_1 be(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)zP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static im_1 ca(ByteString byteString) {
        return (im_1)zP.parseFrom(byteString);
    }

    public static im_1 be(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)zP.parseFrom(byteString, extensionRegistryLite);
    }

    public static im_1 bf(byte[] byArray) {
        return (im_1)zP.parseFrom(byArray);
    }

    public static im_1 be(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)zP.parseFrom(byArray, extensionRegistryLite);
    }

    public static im_1 di(InputStream inputStream) {
        return (im_1)GeneratedMessageV3.parseWithIOException(zP, (InputStream)inputStream);
    }

    public static im_1 di(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)GeneratedMessageV3.parseWithIOException(zP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static im_1 dj(InputStream inputStream) {
        return (im_1)GeneratedMessageV3.parseDelimitedWithIOException(zP, (InputStream)inputStream);
    }

    public static im_1 dj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)GeneratedMessageV3.parseDelimitedWithIOException(zP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static im_1 be(CodedInputStream codedInputStream) {
        return (im_1)GeneratedMessageV3.parseWithIOException(zP, (CodedInputStream)codedInputStream);
    }

    public static im_1 fm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_1)GeneratedMessageV3.parseWithIOException(zP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public io_1 QP() {
        return im_1.QQ();
    }

    public static io_1 QQ() {
        return zO.QR();
    }

    public static io_1 a(im_1 im_12) {
        return zO.QR().c(im_12);
    }

    public io_1 QR() {
        return this == zO ? new io_1() : new io_1().c(this);
    }

    protected io_1 be(GeneratedMessageV3.BuilderParent builderParent) {
        io_1 io_12 = new io_1(builderParent);
        return io_12;
    }

    public static im_1 QS() {
        return zO;
    }

    public static Parser<im_1> z() {
        return zP;
    }

    public Parser<im_1> getParserForType() {
        return zP;
    }

    public im_1 QT() {
        return zO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.be(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.QR();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.QP();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.QR();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.QP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.QT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.QT();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(im_1 im_12) {
        return im_12.unknownFields;
    }
}

