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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jp
 */
public final class jp_1
extends GeneratedMessageV3
implements jw_1 {
    private static final long Cc = 0L;
    public static final int Cd = 1;
    List<js_1> Ce;
    private byte Y = (byte)-1;
    private static final jp_1 Cf = new jp_1();
    @Deprecated
    public static final Parser<jp_1> Cg = new jq_1();

    jp_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jp_1() {
        this.Ce = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jp_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jp_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.Ce = new ArrayList<js_1>();
                            bl |= true;
                        }
                        this.Ce.add((js_1)codedInputStream.readMessage(js_1.Cm, extensionRegistryLite));
                        continue block11;
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
            if (bl & true) {
                this.Ce = Collections.unmodifiableList(this.Ce);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Vd() {
        return iu_2.As;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.At.ensureFieldAccessorsInitialized(jp_1.class, jr_1.class);
    }

    @Override
    public List<js_1> Ve() {
        return this.Ce;
    }

    @Override
    public List<? extends jv_1> Vf() {
        return this.Ce;
    }

    @Override
    public int Vg() {
        return this.Ce.size();
    }

    @Override
    public js_1 fv(int n) {
        return this.Ce.get(n);
    }

    @Override
    public jv_1 fw(int n) {
        return this.Ce.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.fv(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.Ce.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.Ce.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.Ce.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.Ce.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jp_1)) {
            return super.equals(object);
        }
        jp_1 jp_12 = (jp_1)object;
        if (!this.Ve().equals(jp_12.Ve())) {
            return false;
        }
        return this.unknownFields.equals((Object)jp_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jp_1.Vd().hashCode();
        if (this.Vg() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Ve().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jp_1 bp(ByteBuffer byteBuffer) {
        return (jp_1)Cg.parseFrom(byteBuffer);
    }

    public static jp_1 bl(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)Cg.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jp_1 ci(ByteString byteString) {
        return (jp_1)Cg.parseFrom(byteString);
    }

    public static jp_1 bl(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)Cg.parseFrom(byteString, extensionRegistryLite);
    }

    public static jp_1 bm(byte[] byArray) {
        return (jp_1)Cg.parseFrom(byArray);
    }

    public static jp_1 bl(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)Cg.parseFrom(byArray, extensionRegistryLite);
    }

    public static jp_1 dw(InputStream inputStream) {
        return (jp_1)GeneratedMessageV3.parseWithIOException(Cg, (InputStream)inputStream);
    }

    public static jp_1 dw(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)GeneratedMessageV3.parseWithIOException(Cg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jp_1 dx(InputStream inputStream) {
        return (jp_1)GeneratedMessageV3.parseDelimitedWithIOException(Cg, (InputStream)inputStream);
    }

    public static jp_1 dx(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)GeneratedMessageV3.parseDelimitedWithIOException(Cg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jp_1 bl(CodedInputStream codedInputStream) {
        return (jp_1)GeneratedMessageV3.parseWithIOException(Cg, (CodedInputStream)codedInputStream);
    }

    public static jp_1 fH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jp_1)GeneratedMessageV3.parseWithIOException(Cg, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jr_1 Vh() {
        return jp_1.Vi();
    }

    public static jr_1 Vi() {
        return Cf.Vj();
    }

    public static jr_1 a(jp_1 jp_12) {
        return Cf.Vj().c(jp_12);
    }

    public jr_1 Vj() {
        return this == Cf ? new jr_1() : new jr_1().c(this);
    }

    protected jr_1 bl(GeneratedMessageV3.BuilderParent builderParent) {
        jr_1 jr_12 = new jr_1(builderParent);
        return jr_12;
    }

    public static jp_1 Vk() {
        return Cf;
    }

    public static Parser<jp_1> z() {
        return Cg;
    }

    public Parser<jp_1> getParserForType() {
        return Cg;
    }

    public jp_1 Vl() {
        return Cf;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bl(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Vj();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Vh();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Vj();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Vh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Vl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Vl();
    }

    static /* synthetic */ boolean aq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ar() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jp_1 jp_12) {
        return jp_12.unknownFields;
    }
}

