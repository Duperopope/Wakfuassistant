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
 * Renamed from by
 */
public final class by_2
extends GeneratedMessageV3
implements bb_2 {
    private static final long gR = 0L;
    public static final int gS = 1;
    long fG;
    private byte Y = (byte)-1;
    private static final by_2 gT = new by_2();
    static final Parser<by_2> gU = new bz_1();

    by_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private by_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new by_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    by_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor jb() {
        return ae_1.eI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eJ.ensureFieldAccessorsInitialized(by_2.class, ba_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
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
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof by_2)) {
            return super.equals(object);
        }
        by_2 by_22 = (by_2)object;
        if (this.fD() != by_22.fD()) {
            return false;
        }
        return this.unknownFields.equals((Object)by_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + by_2.jb().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static by_2 B(ByteBuffer byteBuffer) {
        return (by_2)gU.parseFrom(byteBuffer);
    }

    public static by_2 B(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)gU.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static by_2 ad(ByteString byteString) {
        return (by_2)gU.parseFrom(byteString);
    }

    public static by_2 B(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)gU.parseFrom(byteString, extensionRegistryLite);
    }

    public static by_2 B(byte[] byArray) {
        return (by_2)gU.parseFrom(byArray);
    }

    public static by_2 B(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)gU.parseFrom(byArray, extensionRegistryLite);
    }

    public static by_2 ac(InputStream inputStream) {
        return (by_2)GeneratedMessageV3.parseWithIOException(gU, (InputStream)inputStream);
    }

    public static by_2 ac(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)GeneratedMessageV3.parseWithIOException(gU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static by_2 ad(InputStream inputStream) {
        return (by_2)GeneratedMessageV3.parseDelimitedWithIOException(gU, (InputStream)inputStream);
    }

    public static by_2 ad(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)GeneratedMessageV3.parseDelimitedWithIOException(gU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static by_2 B(CodedInputStream codedInputStream) {
        return (by_2)GeneratedMessageV3.parseWithIOException(gU, (CodedInputStream)codedInputStream);
    }

    public static by_2 aD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (by_2)GeneratedMessageV3.parseWithIOException(gU, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ba_1 jc() {
        return by_2.jd();
    }

    public static ba_1 jd() {
        return gT.je();
    }

    public static ba_1 a(by_2 by_22) {
        return gT.je().c(by_22);
    }

    public ba_1 je() {
        return this == gT ? new ba_1() : new ba_1().c(this);
    }

    protected ba_1 B(GeneratedMessageV3.BuilderParent builderParent) {
        ba_1 ba_12 = new ba_1(builderParent);
        return ba_12;
    }

    public static by_2 jf() {
        return gT;
    }

    public static Parser<by_2> z() {
        return gU;
    }

    public Parser<by_2> getParserForType() {
        return gU;
    }

    public by_2 jg() {
        return gT;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.B(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.je();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.jc();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.je();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.jc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jg();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jg();
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(by_2 by_22) {
        return by_22.unknownFields;
    }
}

