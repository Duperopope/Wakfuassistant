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
 * Renamed from Mk
 */
public final class mk_2
extends GeneratedMessageV3
implements mn_2 {
    private static final long aRX = 0L;
    int an;
    public static final int aRY = 1;
    long aRZ;
    public static final int aSa = 2;
    ByteString aSb;
    private byte Y = (byte)-1;
    private static final mk_2 aSc = new mk_2();
    @Deprecated
    public static final Parser<mk_2> aSd = new ml_2();

    mk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mk_2() {
        this.aSb = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mk_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.aRZ = codedInputStream.readSInt64();
                        continue block12;
                    }
                    case 18: {
                        this.an |= 2;
                        this.aSb = codedInputStream.readBytes();
                        continue block12;
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

    public static final Descriptors.Descriptor aUn() {
        return mj_2.aRV;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mj_2.aRW.ensureFieldAccessorsInitialized(mk_2.class, mm_2.class);
    }

    @Override
    public boolean aUo() {
        return (this.an & 1) != 0;
    }

    @Override
    public long aUp() {
        return this.aRZ;
    }

    @Override
    public boolean aUq() {
        return (this.an & 2) != 0;
    }

    @Override
    public ByteString aUr() {
        return this.aSb;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aUo()) {
            this.Y = 0;
            return false;
        }
        if (!this.aUq()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeSInt64(1, this.aRZ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBytes(2, this.aSb);
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
            n += CodedOutputStream.computeSInt64Size((int)1, (long)this.aRZ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.aSb);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mk_2)) {
            return super.equals(object);
        }
        mk_2 mk_22 = (mk_2)object;
        if (this.aUo() != mk_22.aUo()) {
            return false;
        }
        if (this.aUo() && this.aUp() != mk_22.aUp()) {
            return false;
        }
        if (this.aUq() != mk_22.aUq()) {
            return false;
        }
        if (this.aUq() && !this.aUr().equals((Object)mk_22.aUr())) {
            return false;
        }
        return this.unknownFields.equals((Object)mk_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mk_2.aUn().hashCode();
        if (this.aUo()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.aUp());
        }
        if (this.aUq()) {
            n = 37 * n + 2;
            n = 53 * n + this.aUr().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mk_2 eH(ByteBuffer byteBuffer) {
        return (mk_2)aSd.parseFrom(byteBuffer);
    }

    public static mk_2 cT(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)aSd.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mk_2 eC(ByteString byteString) {
        return (mk_2)aSd.parseFrom(byteString);
    }

    public static mk_2 cT(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)aSd.parseFrom(byteString, extensionRegistryLite);
    }

    public static mk_2 dm(byte[] byArray) {
        return (mk_2)aSd.parseFrom(byArray);
    }

    public static mk_2 cT(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)aSd.parseFrom(byArray, extensionRegistryLite);
    }

    public static mk_2 gO(InputStream inputStream) {
        return (mk_2)GeneratedMessageV3.parseWithIOException(aSd, (InputStream)inputStream);
    }

    public static mk_2 gM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)GeneratedMessageV3.parseWithIOException(aSd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mk_2 gP(InputStream inputStream) {
        return (mk_2)GeneratedMessageV3.parseDelimitedWithIOException(aSd, (InputStream)inputStream);
    }

    public static mk_2 gN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)GeneratedMessageV3.parseDelimitedWithIOException(aSd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mk_2 cT(CodedInputStream codedInputStream) {
        return (mk_2)GeneratedMessageV3.parseWithIOException(aSd, (CodedInputStream)codedInputStream);
    }

    public static mk_2 kF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mk_2)GeneratedMessageV3.parseWithIOException(aSd, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mm_2 aUs() {
        return mk_2.aUt();
    }

    public static mm_2 aUt() {
        return aSc.aUu();
    }

    public static mm_2 a(mk_2 mk_22) {
        return aSc.aUu().c(mk_22);
    }

    public mm_2 aUu() {
        return this == aSc ? new mm_2() : new mm_2().c(this);
    }

    protected mm_2 cT(GeneratedMessageV3.BuilderParent builderParent) {
        mm_2 mm_22 = new mm_2(builderParent);
        return mm_22;
    }

    public static mk_2 aUv() {
        return aSc;
    }

    public static Parser<mk_2> z() {
        return aSd;
    }

    public Parser<mk_2> getParserForType() {
        return aSd;
    }

    public mk_2 aUw() {
        return aSc;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cT(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aUu();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aUs();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aUu();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aUs();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aUw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aUw();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mk_2 mk_22) {
        return mk_22.unknownFields;
    }
}

