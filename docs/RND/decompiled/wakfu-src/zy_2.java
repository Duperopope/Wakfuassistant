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
 * Renamed from zy
 */
public final class zy_2
extends GeneratedMessageV3
implements zb_2 {
    private static final long aop = 0L;
    int an;
    public static final int aoq = 1;
    int aor;
    public static final int aos = 2;
    int aot;
    public static final int aou = 3;
    int jq;
    public static final int aov = 4;
    boolean kO;
    private byte Y = (byte)-1;
    private static final zy_2 aow = new zy_2();
    @Deprecated
    public static final Parser<zy_2> aox = new zz_2();

    zy_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zy_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zy_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zy_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.aor = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.aot = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.jq = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.kO = codedInputStream.readBool();
                        continue block14;
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

    public static final Descriptors.Descriptor azr() {
        return zp_2.anO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anP.ensureFieldAccessorsInitialized(zy_2.class, za_2.class);
    }

    @Override
    public boolean azs() {
        return (this.an & 1) != 0;
    }

    @Override
    public int azt() {
        return this.aor;
    }

    @Override
    public boolean azu() {
        return (this.an & 2) != 0;
    }

    @Override
    public int azv() {
        return this.aot;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean rn() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.azs()) {
            this.Y = 0;
            return false;
        }
        if (!this.azu()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (!this.rn()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.aor);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.aot);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.jq);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(4, this.kO);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.aor);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.aot);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.jq);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.kO);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zy_2)) {
            return super.equals(object);
        }
        zy_2 zy_22 = (zy_2)object;
        if (this.azs() != zy_22.azs()) {
            return false;
        }
        if (this.azs() && this.azt() != zy_22.azt()) {
            return false;
        }
        if (this.azu() != zy_22.azu()) {
            return false;
        }
        if (this.azu() && this.azv() != zy_22.azv()) {
            return false;
        }
        if (this.oO() != zy_22.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != zy_22.oP()) {
            return false;
        }
        if (this.rn() != zy_22.rn()) {
            return false;
        }
        if (this.rn() && this.getEnabled() != zy_22.getEnabled()) {
            return false;
        }
        return this.unknownFields.equals((Object)zy_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zy_2.azr().hashCode();
        if (this.azs()) {
            n = 37 * n + 1;
            n = 53 * n + this.azt();
        }
        if (this.azu()) {
            n = 37 * n + 2;
            n = 53 * n + this.azv();
        }
        if (this.oO()) {
            n = 37 * n + 3;
            n = 53 * n + this.oP();
        }
        if (this.rn()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.getEnabled());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zy_2 em(ByteBuffer byteBuffer) {
        return (zy_2)aox.parseFrom(byteBuffer);
    }

    public static zy_2 cA(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)aox.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zy_2 eb(ByteString byteString) {
        return (zy_2)aox.parseFrom(byteString);
    }

    public static zy_2 cA(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)aox.parseFrom(byteString, extensionRegistryLite);
    }

    public static zy_2 cC(byte[] byArray) {
        return (zy_2)aox.parseFrom(byArray);
    }

    public static zy_2 cA(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)aox.parseFrom(byArray, extensionRegistryLite);
    }

    public static zy_2 ga(InputStream inputStream) {
        return (zy_2)GeneratedMessageV3.parseWithIOException(aox, (InputStream)inputStream);
    }

    public static zy_2 ga(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)GeneratedMessageV3.parseWithIOException(aox, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zy_2 gb(InputStream inputStream) {
        return (zy_2)GeneratedMessageV3.parseDelimitedWithIOException(aox, (InputStream)inputStream);
    }

    public static zy_2 gb(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)GeneratedMessageV3.parseDelimitedWithIOException(aox, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zy_2 cA(CodedInputStream codedInputStream) {
        return (zy_2)GeneratedMessageV3.parseWithIOException(aox, (CodedInputStream)codedInputStream);
    }

    public static zy_2 jA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zy_2)GeneratedMessageV3.parseWithIOException(aox, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public za_2 azw() {
        return zy_2.azx();
    }

    public static za_2 azx() {
        return aow.azy();
    }

    public static za_2 c(zy_2 zy_22) {
        return aow.azy().e(zy_22);
    }

    public za_2 azy() {
        return this == aow ? new za_2() : new za_2().e(this);
    }

    protected za_2 cA(GeneratedMessageV3.BuilderParent builderParent) {
        za_2 za_22 = new za_2(builderParent);
        return za_22;
    }

    public static zy_2 azz() {
        return aow;
    }

    public static Parser<zy_2> z() {
        return aox;
    }

    public Parser<zy_2> getParserForType() {
        return aox;
    }

    public zy_2 azA() {
        return aow;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cA(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.azy();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.azw();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.azy();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.azw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azA();
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(zy_2 zy_22) {
        return zy_22.unknownFields;
    }
}

