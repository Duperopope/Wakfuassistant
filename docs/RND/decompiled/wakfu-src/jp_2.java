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
 * Renamed from jP
 */
public final class jp_2
extends GeneratedMessageV3
implements js_2 {
    private static final long Dg = 0L;
    int an;
    public static final int Dh = 1;
    long AH;
    public static final int Di = 2;
    long Dj;
    public static final int Dk = 3;
    int Dl;
    public static final int Dm = 4;
    long Dn;
    public static final int Do = 5;
    long jT;
    public static final int Dp = 6;
    boolean Dq;
    public static final int Dr = 7;
    ByteString Ds;
    public static final int Dt = 8;
    ByteString Du;
    public static final int Dv = 9;
    int oq;
    public static final int Dw = 10;
    int Dx;
    public static final int Dy = 11;
    volatile Object bs;
    public static final int Dz = 12;
    long DA;
    public static final int DB = 13;
    ByteString DC;
    public static final int DD = 14;
    ByteString DE;
    private byte Y = (byte)-1;
    private static final jp_2 DF = new jp_2();
    @Deprecated
    public static final Parser<jp_2> DG = new jq_2();

    jp_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jp_2() {
        this.Ds = ByteString.EMPTY;
        this.Du = ByteString.EMPTY;
        this.bs = "";
        this.DC = ByteString.EMPTY;
        this.DE = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jp_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jp_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.AH = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Dj = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Dl = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Dn = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.jT = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.Dq = codedInputStream.readBool();
                        continue block24;
                    }
                    case 58: {
                        this.an |= 0x40;
                        this.Ds = codedInputStream.readBytes();
                        continue block24;
                    }
                    case 66: {
                        this.an |= 0x80;
                        this.Du = codedInputStream.readBytes();
                        continue block24;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.oq = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.Dx = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 90: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x400;
                        this.bs = byteString;
                        continue block24;
                    }
                    case 96: {
                        this.an |= 0x800;
                        this.DA = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 106: {
                        this.an |= 0x1000;
                        this.DC = codedInputStream.readBytes();
                        continue block24;
                    }
                    case 114: {
                        this.an |= 0x2000;
                        this.DE = codedInputStream.readBytes();
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

    public static final Descriptors.Descriptor Xg() {
        return jk_2.CU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CV.ensureFieldAccessorsInitialized(jp_2.class, jr_2.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    @Override
    public boolean Xh() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    @Override
    public boolean Xj() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Xk() {
        return this.Dl;
    }

    @Override
    public boolean Xl() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Xm() {
        return this.Dn;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    @Override
    public boolean Xn() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean Xo() {
        return this.Dq;
    }

    @Override
    public boolean Xp() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public ByteString Xq() {
        return this.Ds;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public ByteString Xr() {
        return this.Du;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public boolean Xs() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Xt() {
        return this.Dx;
    }

    @Override
    public boolean wq() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Xu() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public long Xv() {
        return this.DA;
    }

    @Override
    public boolean Xw() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public ByteString Xx() {
        return this.DC;
    }

    @Override
    public boolean Xy() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public ByteString Xz() {
        return this.DE;
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
        if (!this.Xh()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xj()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xl()) {
            this.Y = 0;
            return false;
        }
        if (!this.pe()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xn()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xp()) {
            this.Y = 0;
            return false;
        }
        if (!this.sX()) {
            this.Y = 0;
            return false;
        }
        if (!this.xS()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xs()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xu()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xw()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xy()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.AH);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Dj);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.Dl);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.Dn);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(5, this.jT);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeBool(6, this.Dq);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeBytes(7, this.Ds);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeBytes(8, this.Du);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.oq);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(10, this.Dx);
        }
        if ((this.an & 0x400) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)11, (Object)this.bs);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt64(12, this.DA);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeBytes(13, this.DC);
        }
        if ((this.an & 0x2000) != 0) {
            codedOutputStream.writeBytes(14, this.DE);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.AH);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Dj);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.Dl);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.Dn);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.jT);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.Dq);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeBytesSize((int)7, (ByteString)this.Ds);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeBytesSize((int)8, (ByteString)this.Du);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.oq);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.Dx);
        }
        if ((this.an & 0x400) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)11, (Object)this.bs);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt64Size((int)12, (long)this.DA);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeBytesSize((int)13, (ByteString)this.DC);
        }
        if ((this.an & 0x2000) != 0) {
            n += CodedOutputStream.computeBytesSize((int)14, (ByteString)this.DE);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jp_2)) {
            return super.equals(object);
        }
        jp_2 jp_22 = (jp_2)object;
        if (this.oN() != jp_22.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != jp_22.Sn()) {
            return false;
        }
        if (this.Xh() != jp_22.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != jp_22.Xi()) {
            return false;
        }
        if (this.Xj() != jp_22.Xj()) {
            return false;
        }
        if (this.Xj() && this.Xk() != jp_22.Xk()) {
            return false;
        }
        if (this.Xl() != jp_22.Xl()) {
            return false;
        }
        if (this.Xl() && this.Xm() != jp_22.Xm()) {
            return false;
        }
        if (this.pe() != jp_22.pe()) {
            return false;
        }
        if (this.pe() && this.pf() != jp_22.pf()) {
            return false;
        }
        if (this.Xn() != jp_22.Xn()) {
            return false;
        }
        if (this.Xn() && this.Xo() != jp_22.Xo()) {
            return false;
        }
        if (this.Xp() != jp_22.Xp()) {
            return false;
        }
        if (this.Xp() && !this.Xq().equals((Object)jp_22.Xq())) {
            return false;
        }
        if (this.sX() != jp_22.sX()) {
            return false;
        }
        if (this.sX() && !this.Xr().equals((Object)jp_22.Xr())) {
            return false;
        }
        if (this.xS() != jp_22.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != jp_22.xT()) {
            return false;
        }
        if (this.Xs() != jp_22.Xs()) {
            return false;
        }
        if (this.Xs() && this.Xt() != jp_22.Xt()) {
            return false;
        }
        if (this.wq() != jp_22.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(jp_22.getName())) {
            return false;
        }
        if (this.Xu() != jp_22.Xu()) {
            return false;
        }
        if (this.Xu() && this.Xv() != jp_22.Xv()) {
            return false;
        }
        if (this.Xw() != jp_22.Xw()) {
            return false;
        }
        if (this.Xw() && !this.Xx().equals((Object)jp_22.Xx())) {
            return false;
        }
        if (this.Xy() != jp_22.Xy()) {
            return false;
        }
        if (this.Xy() && !this.Xz().equals((Object)jp_22.Xz())) {
            return false;
        }
        return this.unknownFields.equals((Object)jp_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jp_2.Xg().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.Xh()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        if (this.Xj()) {
            n = 37 * n + 3;
            n = 53 * n + this.Xk();
        }
        if (this.Xl()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.Xm());
        }
        if (this.pe()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.pf());
        }
        if (this.Xn()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.Xo());
        }
        if (this.Xp()) {
            n = 37 * n + 7;
            n = 53 * n + this.Xq().hashCode();
        }
        if (this.sX()) {
            n = 37 * n + 8;
            n = 53 * n + this.Xr().hashCode();
        }
        if (this.xS()) {
            n = 37 * n + 9;
            n = 53 * n + this.xT();
        }
        if (this.Xs()) {
            n = 37 * n + 10;
            n = 53 * n + this.Xt();
        }
        if (this.wq()) {
            n = 37 * n + 11;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Xu()) {
            n = 37 * n + 12;
            n = 53 * n + Internal.hashLong((long)this.Xv());
        }
        if (this.Xw()) {
            n = 37 * n + 13;
            n = 53 * n + this.Xx().hashCode();
        }
        if (this.Xy()) {
            n = 37 * n + 14;
            n = 53 * n + this.Xz().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jp_2 bv(ByteBuffer byteBuffer) {
        return (jp_2)DG.parseFrom(byteBuffer);
    }

    public static jp_2 br(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)DG.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jp_2 co(ByteString byteString) {
        return (jp_2)DG.parseFrom(byteString);
    }

    public static jp_2 br(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)DG.parseFrom(byteString, extensionRegistryLite);
    }

    public static jp_2 bs(byte[] byArray) {
        return (jp_2)DG.parseFrom(byArray);
    }

    public static jp_2 br(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)DG.parseFrom(byArray, extensionRegistryLite);
    }

    public static jp_2 dI(InputStream inputStream) {
        return (jp_2)GeneratedMessageV3.parseWithIOException(DG, (InputStream)inputStream);
    }

    public static jp_2 dI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)GeneratedMessageV3.parseWithIOException(DG, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jp_2 dJ(InputStream inputStream) {
        return (jp_2)GeneratedMessageV3.parseDelimitedWithIOException(DG, (InputStream)inputStream);
    }

    public static jp_2 dJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)GeneratedMessageV3.parseDelimitedWithIOException(DG, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jp_2 br(CodedInputStream codedInputStream) {
        return (jp_2)GeneratedMessageV3.parseWithIOException(DG, (CodedInputStream)codedInputStream);
    }

    public static jp_2 fZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_2)GeneratedMessageV3.parseWithIOException(DG, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jr_2 XA() {
        return jp_2.XB();
    }

    public static jr_2 XB() {
        return DF.XC();
    }

    public static jr_2 a(jp_2 jp_22) {
        return DF.XC().c(jp_22);
    }

    public jr_2 XC() {
        return this == DF ? new jr_2() : new jr_2().c(this);
    }

    protected jr_2 br(GeneratedMessageV3.BuilderParent builderParent) {
        jr_2 jr_22 = new jr_2(builderParent);
        return jr_22;
    }

    public static jp_2 XD() {
        return DF;
    }

    public static Parser<jp_2> z() {
        return DG;
    }

    public Parser<jp_2> getParserForType() {
        return DG;
    }

    public jp_2 XE() {
        return DF;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.br(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.XC();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.XA();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.XC();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.XA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.XE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.XE();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jp_2 jp_22) {
        return jp_22.unknownFields;
    }
}

