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

public final class mt
extends GeneratedMessageV3
implements mw {
    private static final long KQ = 0L;
    int an;
    public static final int KR = 1;
    long wq;
    public static final int KS = 2;
    int HC;
    public static final int KT = 3;
    long nW;
    public static final int KU = 4;
    long KV;
    public static final int KW = 5;
    int KX;
    public static final int KY = 6;
    long sN;
    public static final int KZ = 7;
    kW Fc;
    private byte Y = (byte)-1;
    private static final mt La = new mt();
    @Deprecated
    public static final Parser<mt> Lb = new mu();

    mt(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mt() {
        this.HC = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mt();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block17: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block17;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wq = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        mx mx2 = mx.ih(n2);
                        if (mx2 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block17;
                        }
                        this.an |= 2;
                        this.HC = n2;
                        continue block17;
                    }
                    case 24: {
                        this.an |= 4;
                        this.nW = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 32: {
                        this.an |= 8;
                        this.KV = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.KX = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.sN = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 58: {
                        kY kY2 = null;
                        if ((this.an & 0x40) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 0x40;
                        continue block17;
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

    public static final Descriptors.Descriptor alF() {
        return ms.KO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ms.KP.ensureFieldAccessorsInitialized(mt.class, mv.class);
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
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public mx alG() {
        mx mx2 = mx.ih(this.HC);
        return mx2 == null ? mx.Lc : mx2;
    }

    @Override
    public boolean xk() {
        return (this.an & 4) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean alH() {
        return (this.an & 8) != 0;
    }

    @Override
    public long alI() {
        return this.KV;
    }

    @Override
    public boolean alJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int alK() {
        return this.KX;
    }

    @Override
    public boolean EZ() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Fa() {
        return this.sN;
    }

    @Override
    public boolean aaz() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Lw()) {
            this.Y = 0;
            return false;
        }
        if (!this.aeU()) {
            this.Y = 0;
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.alH()) {
            this.Y = 0;
            return false;
        }
        if (!this.alJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.EZ()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaA().isInitialized()) {
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
            codedOutputStream.writeEnum(2, this.HC);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.nW);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.KV);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.KX);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(6, this.sN);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeMessage(7, (MessageLite)this.aaA());
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
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.HC);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.nW);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.KV);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.KX);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.sN);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.aaA());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mt)) {
            return super.equals(object);
        }
        mt mt2 = (mt)object;
        if (this.Lw() != mt2.Lw()) {
            return false;
        }
        if (this.Lw() && this.Lx() != mt2.Lx()) {
            return false;
        }
        if (this.aeU() != mt2.aeU()) {
            return false;
        }
        if (this.aeU() && this.HC != mt2.HC) {
            return false;
        }
        if (this.xk() != mt2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != mt2.xl()) {
            return false;
        }
        if (this.alH() != mt2.alH()) {
            return false;
        }
        if (this.alH() && this.alI() != mt2.alI()) {
            return false;
        }
        if (this.alJ() != mt2.alJ()) {
            return false;
        }
        if (this.alJ() && this.alK() != mt2.alK()) {
            return false;
        }
        if (this.EZ() != mt2.EZ()) {
            return false;
        }
        if (this.EZ() && this.Fa() != mt2.Fa()) {
            return false;
        }
        if (this.aaz() != mt2.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(mt2.aaA())) {
            return false;
        }
        return this.unknownFields.equals((Object)mt2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mt.alF().hashCode();
        if (this.Lw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Lx());
        }
        if (this.aeU()) {
            n = 37 * n + 2;
            n = 53 * n + this.HC;
        }
        if (this.xk()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.alH()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.alI());
        }
        if (this.alJ()) {
            n = 37 * n + 5;
            n = 53 * n + this.alK();
        }
        if (this.EZ()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.Fa());
        }
        if (this.aaz()) {
            n = 37 * n + 7;
            n = 53 * n + this.aaA().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mt cb(ByteBuffer byteBuffer) {
        return (mt)Lb.parseFrom(byteBuffer);
    }

    public static mt bX(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)Lb.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mt dl(ByteString byteString) {
        return (mt)Lb.parseFrom(byteString);
    }

    public static mt bX(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)Lb.parseFrom(byteString, extensionRegistryLite);
    }

    public static mt bY(byte[] byArray) {
        return (mt)Lb.parseFrom(byArray);
    }

    public static mt bX(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)Lb.parseFrom(byArray, extensionRegistryLite);
    }

    public static mt eU(InputStream inputStream) {
        return (mt)GeneratedMessageV3.parseWithIOException(Lb, (InputStream)inputStream);
    }

    public static mt eU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)GeneratedMessageV3.parseWithIOException(Lb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mt eV(InputStream inputStream) {
        return (mt)GeneratedMessageV3.parseDelimitedWithIOException(Lb, (InputStream)inputStream);
    }

    public static mt eV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)GeneratedMessageV3.parseDelimitedWithIOException(Lb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mt bX(CodedInputStream codedInputStream) {
        return (mt)GeneratedMessageV3.parseWithIOException(Lb, (CodedInputStream)codedInputStream);
    }

    public static mt hR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mt)GeneratedMessageV3.parseWithIOException(Lb, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mv alL() {
        return mt.alM();
    }

    public static mv alM() {
        return La.alN();
    }

    public static mv a(mt mt2) {
        return La.alN().c(mt2);
    }

    public mv alN() {
        return this == La ? new mv() : new mv().c(this);
    }

    protected mv bX(GeneratedMessageV3.BuilderParent builderParent) {
        mv mv2 = new mv(builderParent);
        return mv2;
    }

    public static mt alO() {
        return La;
    }

    public static Parser<mt> z() {
        return Lb;
    }

    public Parser<mt> getParserForType() {
        return Lb;
    }

    public mt alP() {
        return La;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bX(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.alN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.alL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.alN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.alL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alP();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mt mt2) {
        return mt2.unknownFields;
    }
}
