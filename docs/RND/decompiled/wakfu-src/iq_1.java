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
 * Renamed from iQ
 */
public final class iq_1
extends GeneratedMessageV3
implements it_2 {
    private static final long zU = 0L;
    int an;
    public static final int zV = 1;
    long zW;
    public static final int zX = 2;
    int zY;
    public static final int zZ = 3;
    int Aa;
    public static final int Ab = 4;
    long Ac;
    public static final int Ad = 5;
    int oq;
    private byte Y = (byte)-1;
    private static final iq_1 Ae = new iq_1();
    @Deprecated
    public static final Parser<iq_1> Af = new ir_1();

    iq_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iq_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iq_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iq_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.an |= 1;
                        this.zW = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 16: {
                        this.an |= 2;
                        this.zY = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Aa = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Ac = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.oq = codedInputStream.readInt32();
                        continue block15;
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

    public static final Descriptors.Descriptor Rv() {
        return ih_2.wD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wE.ensureFieldAccessorsInitialized(iq_1.class, is_2.class);
    }

    @Override
    public boolean Rw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Rx() {
        return this.zW;
    }

    @Override
    public boolean Ry() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Rz() {
        return this.zY;
    }

    @Override
    public boolean RA() {
        return (this.an & 4) != 0;
    }

    @Override
    public int RB() {
        return this.Aa;
    }

    @Override
    public boolean RC() {
        return (this.an & 8) != 0;
    }

    @Override
    public long RD() {
        return this.Ac;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.zW);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.zY);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.Aa);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.Ac);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.oq);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.zW);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.zY);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.Aa);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.Ac);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.oq);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iq_1)) {
            return super.equals(object);
        }
        iq_1 iq_12 = (iq_1)object;
        if (this.Rw() != iq_12.Rw()) {
            return false;
        }
        if (this.Rw() && this.Rx() != iq_12.Rx()) {
            return false;
        }
        if (this.Ry() != iq_12.Ry()) {
            return false;
        }
        if (this.Ry() && this.Rz() != iq_12.Rz()) {
            return false;
        }
        if (this.RA() != iq_12.RA()) {
            return false;
        }
        if (this.RA() && this.RB() != iq_12.RB()) {
            return false;
        }
        if (this.RC() != iq_12.RC()) {
            return false;
        }
        if (this.RC() && this.RD() != iq_12.RD()) {
            return false;
        }
        if (this.xS() != iq_12.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != iq_12.xT()) {
            return false;
        }
        return this.unknownFields.equals((Object)iq_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iq_1.Rv().hashCode();
        if (this.Rw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Rx());
        }
        if (this.Ry()) {
            n = 37 * n + 2;
            n = 53 * n + this.Rz();
        }
        if (this.RA()) {
            n = 37 * n + 3;
            n = 53 * n + this.RB();
        }
        if (this.RC()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.RD());
        }
        if (this.xS()) {
            n = 37 * n + 5;
            n = 53 * n + this.xT();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iq_1 bj(ByteBuffer byteBuffer) {
        return (iq_1)Af.parseFrom(byteBuffer);
    }

    public static iq_1 bf(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)Af.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iq_1 cb(ByteString byteString) {
        return (iq_1)Af.parseFrom(byteString);
    }

    public static iq_1 bf(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)Af.parseFrom(byteString, extensionRegistryLite);
    }

    public static iq_1 bg(byte[] byArray) {
        return (iq_1)Af.parseFrom(byArray);
    }

    public static iq_1 bf(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)Af.parseFrom(byArray, extensionRegistryLite);
    }

    public static iq_1 dk(InputStream inputStream) {
        return (iq_1)GeneratedMessageV3.parseWithIOException(Af, (InputStream)inputStream);
    }

    public static iq_1 dk(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)GeneratedMessageV3.parseWithIOException(Af, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_1 dl(InputStream inputStream) {
        return (iq_1)GeneratedMessageV3.parseDelimitedWithIOException(Af, (InputStream)inputStream);
    }

    public static iq_1 dl(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)GeneratedMessageV3.parseDelimitedWithIOException(Af, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_1 bf(CodedInputStream codedInputStream) {
        return (iq_1)GeneratedMessageV3.parseWithIOException(Af, (CodedInputStream)codedInputStream);
    }

    public static iq_1 fp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_1)GeneratedMessageV3.parseWithIOException(Af, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public is_2 RE() {
        return iq_1.RF();
    }

    public static is_2 RF() {
        return Ae.RG();
    }

    public static is_2 c(iq_1 iq_12) {
        return Ae.RG().e(iq_12);
    }

    public is_2 RG() {
        return this == Ae ? new is_2() : new is_2().e(this);
    }

    protected is_2 bf(GeneratedMessageV3.BuilderParent builderParent) {
        is_2 is_22 = new is_2(builderParent);
        return is_22;
    }

    public static iq_1 RH() {
        return Ae;
    }

    public static Parser<iq_1> z() {
        return Af;
    }

    public Parser<iq_1> getParserForType() {
        return Af;
    }

    public iq_1 RI() {
        return Ae;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bf(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.RG();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.RE();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.RG();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.RE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.RI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.RI();
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(iq_1 iq_12) {
        return iq_12.unknownFields;
    }
}

