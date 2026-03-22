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

public final class iq
extends GeneratedMessageV3
implements iv {
    private static final long ye = 0L;
    int an;
    public static final int yf = 1;
    boolean yg;
    public static final int yh = 2;
    boolean yi;
    public static final int yj = 4;
    int yk;
    public static final int yl = 5;
    boolean ym;
    public static final int yn = 6;
    int yo;
    public static final int yp = 7;
    boolean yq;
    public static final int yr = 8;
    boolean ys;
    public static final int yt = 9;
    int yu;
    private byte Y = (byte)-1;
    private static final iq yv = new iq();
    @Deprecated
    public static final Parser<iq> yw = new ir();

    iq(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iq() {
        this.yk = -1;
        this.ym = true;
        this.yu = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iq();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block18: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block18;
                    }
                    case 8: {
                        this.an |= 1;
                        this.yg = codedInputStream.readBool();
                        continue block18;
                    }
                    case 16: {
                        this.an |= 2;
                        this.yi = codedInputStream.readBool();
                        continue block18;
                    }
                    case 32: {
                        this.an |= 4;
                        this.yk = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 40: {
                        this.an |= 8;
                        this.ym = codedInputStream.readBool();
                        continue block18;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.yo = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 56: {
                        this.an |= 0x20;
                        this.yq = codedInputStream.readBool();
                        continue block18;
                    }
                    case 64: {
                        this.an |= 0x40;
                        this.ys = codedInputStream.readBool();
                        continue block18;
                    }
                    case 72: {
                        int n2 = codedInputStream.readEnum();
                        it it2 = it.ex(n2);
                        if (it2 == null) {
                            builder.mergeVarintField(9, n2);
                            continue block18;
                        }
                        this.an |= 0x80;
                        this.yu = n2;
                        continue block18;
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

    public static final Descriptors.Descriptor Ob() {
        return ih.wL;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih.wM.ensureFieldAccessorsInitialized(iq.class, is.class);
    }

    @Override
    public boolean Oc() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean Od() {
        return this.yg;
    }

    @Override
    public boolean Oe() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean Of() {
        return this.yi;
    }

    @Override
    public boolean Og() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Oh() {
        return this.yk;
    }

    @Override
    public boolean Oi() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean Oj() {
        return this.ym;
    }

    @Override
    public boolean Ok() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int Ol() {
        return this.yo;
    }

    @Override
    public boolean Om() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean On() {
        return this.yq;
    }

    @Override
    public boolean Oo() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public boolean Op() {
        return this.ys;
    }

    @Override
    public boolean Oq() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public it Or() {
        it it2 = it.ex(this.yu);
        return it2 == null ? it.yx : it2;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Oc()) {
            this.Y = 0;
            return false;
        }
        if (!this.Oe()) {
            this.Y = 0;
            return false;
        }
        if (!this.Og()) {
            this.Y = 0;
            return false;
        }
        if (!this.Oi()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ok()) {
            this.Y = 0;
            return false;
        }
        if (!this.Om()) {
            this.Y = 0;
            return false;
        }
        if (!this.Oo()) {
            this.Y = 0;
            return false;
        }
        if (!this.Oq()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(1, this.yg);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(2, this.yi);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(4, this.yk);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(5, this.ym);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(6, this.yo);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeBool(7, this.yq);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeBool(8, this.ys);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeEnum(9, this.yu);
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
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.yg);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.yi);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.yk);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.ym);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.yo);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeBoolSize((int)7, (boolean)this.yq);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeBoolSize((int)8, (boolean)this.ys);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeEnumSize((int)9, (int)this.yu);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iq)) {
            return super.equals(object);
        }
        iq iq2 = (iq)object;
        if (this.Oc() != iq2.Oc()) {
            return false;
        }
        if (this.Oc() && this.Od() != iq2.Od()) {
            return false;
        }
        if (this.Oe() != iq2.Oe()) {
            return false;
        }
        if (this.Oe() && this.Of() != iq2.Of()) {
            return false;
        }
        if (this.Og() != iq2.Og()) {
            return false;
        }
        if (this.Og() && this.Oh() != iq2.Oh()) {
            return false;
        }
        if (this.Oi() != iq2.Oi()) {
            return false;
        }
        if (this.Oi() && this.Oj() != iq2.Oj()) {
            return false;
        }
        if (this.Ok() != iq2.Ok()) {
            return false;
        }
        if (this.Ok() && this.Ol() != iq2.Ol()) {
            return false;
        }
        if (this.Om() != iq2.Om()) {
            return false;
        }
        if (this.Om() && this.On() != iq2.On()) {
            return false;
        }
        if (this.Oo() != iq2.Oo()) {
            return false;
        }
        if (this.Oo() && this.Op() != iq2.Op()) {
            return false;
        }
        if (this.Oq() != iq2.Oq()) {
            return false;
        }
        if (this.Oq() && this.yu != iq2.yu) {
            return false;
        }
        return this.unknownFields.equals((Object)iq2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iq.Ob().hashCode();
        if (this.Oc()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.Od());
        }
        if (this.Oe()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.Of());
        }
        if (this.Og()) {
            n = 37 * n + 4;
            n = 53 * n + this.Oh();
        }
        if (this.Oi()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.Oj());
        }
        if (this.Ok()) {
            n = 37 * n + 6;
            n = 53 * n + this.Ol();
        }
        if (this.Om()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashBoolean((boolean)this.On());
        }
        if (this.Oo()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashBoolean((boolean)this.Op());
        }
        if (this.Oq()) {
            n = 37 * n + 9;
            n = 53 * n + this.yu;
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iq bd(ByteBuffer byteBuffer) {
        return (iq)yw.parseFrom(byteBuffer);
    }

    public static iq aZ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)yw.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iq bV(ByteString byteString) {
        return (iq)yw.parseFrom(byteString);
    }

    public static iq aZ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)yw.parseFrom(byteString, extensionRegistryLite);
    }

    public static iq ba(byte[] byArray) {
        return (iq)yw.parseFrom(byArray);
    }

    public static iq aZ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)yw.parseFrom(byArray, extensionRegistryLite);
    }

    public static iq cY(InputStream inputStream) {
        return (iq)GeneratedMessageV3.parseWithIOException(yw, (InputStream)inputStream);
    }

    public static iq cY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)GeneratedMessageV3.parseWithIOException(yw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq cZ(InputStream inputStream) {
        return (iq)GeneratedMessageV3.parseDelimitedWithIOException(yw, (InputStream)inputStream);
    }

    public static iq cZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)GeneratedMessageV3.parseDelimitedWithIOException(yw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq aZ(CodedInputStream codedInputStream) {
        return (iq)GeneratedMessageV3.parseWithIOException(yw, (CodedInputStream)codedInputStream);
    }

    public static iq eX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq)GeneratedMessageV3.parseWithIOException(yw, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public is Os() {
        return iq.Ot();
    }

    public static is Ot() {
        return yv.Ou();
    }

    public static is a(iq iq2) {
        return yv.Ou().c(iq2);
    }

    public is Ou() {
        return this == yv ? new is() : new is().c(this);
    }

    protected is aZ(GeneratedMessageV3.BuilderParent builderParent) {
        is is2 = new is(builderParent);
        return is2;
    }

    public static iq Ov() {
        return yv;
    }

    public static Parser<iq> z() {
        return yw;
    }

    public Parser<iq> getParserForType() {
        return yw;
    }

    public iq Ow() {
        return yv;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aZ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ou();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Os();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ou();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Os();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ow();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ow();
    }

    static /* synthetic */ boolean ar() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iq iq2) {
        return iq2.unknownFields;
    }
}
