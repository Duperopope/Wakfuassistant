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
 * Renamed from bW
 */
public final class bw_2
extends GeneratedMessageV3
implements cj_2 {
    private static final long hw = 0L;
    public static final int hx = 1;
    long fG;
    public static final int hy = 2;
    volatile Object bs;
    public static final int hz = 3;
    volatile Object bu;
    private byte Y = (byte)-1;
    private static final bw_2 hA = new bw_2();
    static final Parser<bw_2> hB = new bx_2();

    bw_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bw_2() {
        this.bs = "";
        this.bu = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bw_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bw_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bs = string;
                        continue block13;
                    }
                    case 26: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bu = string;
                        continue block13;
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

    public static final Descriptors.Descriptor kL() {
        return ae_1.fo;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fp.ensureFieldAccessorsInitialized(bw_2.class, by_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bs = string;
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
    public String getTag() {
        Object object = this.bu;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bu = string;
        return string;
    }

    @Override
    public ByteString bX() {
        Object object = this.bu;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bu = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bu)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bu);
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bu)) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bu);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bw_2)) {
            return super.equals(object);
        }
        bw_2 bw_22 = (bw_2)object;
        if (this.fD() != bw_22.fD()) {
            return false;
        }
        if (!this.getName().equals(bw_22.getName())) {
            return false;
        }
        if (!this.getTag().equals(bw_22.getTag())) {
            return false;
        }
        return this.unknownFields.equals((Object)bw_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bw_2.kL().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.getName().hashCode();
        n = 37 * n + 3;
        n = 53 * n + this.getTag().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bw_2 H(ByteBuffer byteBuffer) {
        return (bw_2)hB.parseFrom(byteBuffer);
    }

    public static bw_2 H(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)hB.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bw_2 aj(ByteString byteString) {
        return (bw_2)hB.parseFrom(byteString);
    }

    public static bw_2 H(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)hB.parseFrom(byteString, extensionRegistryLite);
    }

    public static bw_2 H(byte[] byArray) {
        return (bw_2)hB.parseFrom(byArray);
    }

    public static bw_2 H(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)hB.parseFrom(byArray, extensionRegistryLite);
    }

    public static bw_2 ao(InputStream inputStream) {
        return (bw_2)GeneratedMessageV3.parseWithIOException(hB, (InputStream)inputStream);
    }

    public static bw_2 ao(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)GeneratedMessageV3.parseWithIOException(hB, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bw_2 ap(InputStream inputStream) {
        return (bw_2)GeneratedMessageV3.parseDelimitedWithIOException(hB, (InputStream)inputStream);
    }

    public static bw_2 ap(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)GeneratedMessageV3.parseDelimitedWithIOException(hB, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bw_2 H(CodedInputStream codedInputStream) {
        return (bw_2)GeneratedMessageV3.parseWithIOException(hB, (CodedInputStream)codedInputStream);
    }

    public static bw_2 aV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bw_2)GeneratedMessageV3.parseWithIOException(hB, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public by_1 kM() {
        return bw_2.kN();
    }

    public static by_1 kN() {
        return hA.kO();
    }

    public static by_1 i(bw_2 bw_22) {
        return hA.kO().k(bw_22);
    }

    public by_1 kO() {
        return this == hA ? new by_1() : new by_1().k(this);
    }

    protected by_1 H(GeneratedMessageV3.BuilderParent builderParent) {
        by_1 by_12 = new by_1(builderParent);
        return by_12;
    }

    public static bw_2 kP() {
        return hA;
    }

    public static Parser<bw_2> z() {
        return hB;
    }

    public Parser<bw_2> getParserForType() {
        return hB;
    }

    public bw_2 kQ() {
        return hA;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.H(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.kO();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.kM();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.kO();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.kM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kQ();
    }

    static /* synthetic */ boolean kR() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet j(bw_2 bw_22) {
        return bw_22.unknownFields;
    }

    static /* synthetic */ void ak(ByteString byteString) {
        bw_2.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void al(ByteString byteString) {
        bw_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

