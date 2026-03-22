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
 * Renamed from iq
 */
public final class iq_2
extends GeneratedMessageV3
implements iv_1 {
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
    private static final iq_2 yv = new iq_2();
    @Deprecated
    public static final Parser<iq_2> yw = new ir_2();

    iq_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iq_2() {
        this.yk = -1;
        this.ym = true;
        this.yu = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iq_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iq_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        it_1 it_12 = it_1.ex(n2);
                        if (it_12 == null) {
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
        return ih_2.wL;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wM.ensureFieldAccessorsInitialized(iq_2.class, is_1.class);
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
    public it_1 Or() {
        it_1 it_12 = it_1.ex(this.yu);
        return it_12 == null ? it_1.yx : it_12;
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
        if (!(object instanceof iq_2)) {
            return super.equals(object);
        }
        iq_2 iq_22 = (iq_2)object;
        if (this.Oc() != iq_22.Oc()) {
            return false;
        }
        if (this.Oc() && this.Od() != iq_22.Od()) {
            return false;
        }
        if (this.Oe() != iq_22.Oe()) {
            return false;
        }
        if (this.Oe() && this.Of() != iq_22.Of()) {
            return false;
        }
        if (this.Og() != iq_22.Og()) {
            return false;
        }
        if (this.Og() && this.Oh() != iq_22.Oh()) {
            return false;
        }
        if (this.Oi() != iq_22.Oi()) {
            return false;
        }
        if (this.Oi() && this.Oj() != iq_22.Oj()) {
            return false;
        }
        if (this.Ok() != iq_22.Ok()) {
            return false;
        }
        if (this.Ok() && this.Ol() != iq_22.Ol()) {
            return false;
        }
        if (this.Om() != iq_22.Om()) {
            return false;
        }
        if (this.Om() && this.On() != iq_22.On()) {
            return false;
        }
        if (this.Oo() != iq_22.Oo()) {
            return false;
        }
        if (this.Oo() && this.Op() != iq_22.Op()) {
            return false;
        }
        if (this.Oq() != iq_22.Oq()) {
            return false;
        }
        if (this.Oq() && this.yu != iq_22.yu) {
            return false;
        }
        return this.unknownFields.equals((Object)iq_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iq_2.Ob().hashCode();
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

    public static iq_2 bd(ByteBuffer byteBuffer) {
        return (iq_2)yw.parseFrom(byteBuffer);
    }

    public static iq_2 aZ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)yw.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iq_2 bV(ByteString byteString) {
        return (iq_2)yw.parseFrom(byteString);
    }

    public static iq_2 aZ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)yw.parseFrom(byteString, extensionRegistryLite);
    }

    public static iq_2 ba(byte[] byArray) {
        return (iq_2)yw.parseFrom(byArray);
    }

    public static iq_2 aZ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)yw.parseFrom(byArray, extensionRegistryLite);
    }

    public static iq_2 cY(InputStream inputStream) {
        return (iq_2)GeneratedMessageV3.parseWithIOException(yw, (InputStream)inputStream);
    }

    public static iq_2 cY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)GeneratedMessageV3.parseWithIOException(yw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_2 cZ(InputStream inputStream) {
        return (iq_2)GeneratedMessageV3.parseDelimitedWithIOException(yw, (InputStream)inputStream);
    }

    public static iq_2 cZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)GeneratedMessageV3.parseDelimitedWithIOException(yw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_2 aZ(CodedInputStream codedInputStream) {
        return (iq_2)GeneratedMessageV3.parseWithIOException(yw, (CodedInputStream)codedInputStream);
    }

    public static iq_2 eX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_2)GeneratedMessageV3.parseWithIOException(yw, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public is_1 Os() {
        return iq_2.Ot();
    }

    public static is_1 Ot() {
        return yv.Ou();
    }

    public static is_1 a(iq_2 iq_22) {
        return yv.Ou().c(iq_22);
    }

    public is_1 Ou() {
        return this == yv ? new is_1() : new is_1().c(this);
    }

    protected is_1 aZ(GeneratedMessageV3.BuilderParent builderParent) {
        is_1 is_12 = new is_1(builderParent);
        return is_12;
    }

    public static iq_2 Ov() {
        return yv;
    }

    public static Parser<iq_2> z() {
        return yw;
    }

    public Parser<iq_2> getParserForType() {
        return yw;
    }

    public iq_2 Ow() {
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

    static /* synthetic */ UnknownFieldSet b(iq_2 iq_22) {
        return iq_22.unknownFields;
    }
}

