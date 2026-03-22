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

public final class mk
extends GeneratedMessageV3
implements mn {
    private static final long Kw = 0L;
    int an;
    public static final int Kx = 1;
    int uI;
    public static final int Ky = 2;
    int jq;
    public static final int Kz = 3;
    int KA;
    private byte Y = (byte)-1;
    private static final mk KB = new mk();
    @Deprecated
    public static final Parser<mk> KC = new ml();

    mk(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mk() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mk();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.uI = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.jq = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.KA = codedInputStream.readInt32();
                        continue block13;
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

    public static final Descriptors.Descriptor akY() {
        return mb_0.JP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JQ.ensureFieldAccessorsInitialized(mk.class, mm_0.class);
    }

    @Override
    public boolean Im() {
        return (this.an & 1) != 0;
    }

    @Override
    public int In() {
        return this.uI;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean akZ() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ala() {
        return this.KA;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Im()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (!this.akZ()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.uI);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.jq);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.KA);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.uI);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.jq);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.KA);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mk)) {
            return super.equals(object);
        }
        mk mk2 = (mk)object;
        if (this.Im() != mk2.Im()) {
            return false;
        }
        if (this.Im() && this.In() != mk2.In()) {
            return false;
        }
        if (this.oO() != mk2.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != mk2.oP()) {
            return false;
        }
        if (this.akZ() != mk2.akZ()) {
            return false;
        }
        if (this.akZ() && this.ala() != mk2.ala()) {
            return false;
        }
        return this.unknownFields.equals((Object)mk2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mk.akY().hashCode();
        if (this.Im()) {
            n = 37 * n + 1;
            n = 53 * n + this.In();
        }
        if (this.oO()) {
            n = 37 * n + 2;
            n = 53 * n + this.oP();
        }
        if (this.akZ()) {
            n = 37 * n + 3;
            n = 53 * n + this.ala();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mk bZ(ByteBuffer byteBuffer) {
        return (mk)KC.parseFrom(byteBuffer);
    }

    public static mk bV(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)KC.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mk di(ByteString byteString) {
        return (mk)KC.parseFrom(byteString);
    }

    public static mk bV(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)KC.parseFrom(byteString, extensionRegistryLite);
    }

    public static mk bW(byte[] byArray) {
        return (mk)KC.parseFrom(byArray);
    }

    public static mk bV(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)KC.parseFrom(byArray, extensionRegistryLite);
    }

    public static mk eQ(InputStream inputStream) {
        return (mk)GeneratedMessageV3.parseWithIOException(KC, (InputStream)inputStream);
    }

    public static mk eQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)GeneratedMessageV3.parseWithIOException(KC, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mk eR(InputStream inputStream) {
        return (mk)GeneratedMessageV3.parseDelimitedWithIOException(KC, (InputStream)inputStream);
    }

    public static mk eR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)GeneratedMessageV3.parseDelimitedWithIOException(KC, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mk bV(CodedInputStream codedInputStream) {
        return (mk)GeneratedMessageV3.parseWithIOException(KC, (CodedInputStream)codedInputStream);
    }

    public static mk hL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk)GeneratedMessageV3.parseWithIOException(KC, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mm_0 alb() {
        return mk.alc();
    }

    public static mm_0 alc() {
        return KB.ald();
    }

    public static mm_0 c(mk mk2) {
        return KB.ald().e(mk2);
    }

    public mm_0 ald() {
        return this == KB ? new mm_0() : new mm_0().e(this);
    }

    protected mm_0 bV(GeneratedMessageV3.BuilderParent builderParent) {
        mm_0 mm_02 = new mm_0(builderParent);
        return mm_02;
    }

    public static mk ale() {
        return KB;
    }

    public static Parser<mk> z() {
        return KC;
    }

    public Parser<mk> getParserForType() {
        return KC;
    }

    public mk alf() {
        return KB;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bV(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ald();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.alb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ald();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.alb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alf();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(mk mk2) {
        return mk2.unknownFields;
    }
}

